package com.bobmowzie.mowziesmobs;

import com.bobmowzie.mowziesmobs.client.ClientProxy;
import com.bobmowzie.mowziesmobs.client.MMModels;
import com.bobmowzie.mowziesmobs.client.gui.GuiBarakoTrade;
import com.bobmowzie.mowziesmobs.client.gui.GuiBarakoayaTrade;
import com.bobmowzie.mowziesmobs.client.model.tools.MowzieGeoBuilder;
import com.bobmowzie.mowziesmobs.client.particle.ParticleHandler;
import com.bobmowzie.mowziesmobs.client.render.entity.*;
import com.bobmowzie.mowziesmobs.server.ServerEventHandler;
import com.bobmowzie.mowziesmobs.server.ServerProxy;
import com.bobmowzie.mowziesmobs.server.advancement.AdvancementHandler;
import com.bobmowzie.mowziesmobs.server.block.BlockHandler;
import com.bobmowzie.mowziesmobs.server.capability.AbilityCapability;
import com.bobmowzie.mowziesmobs.server.capability.CapabilityHandler;
import com.bobmowzie.mowziesmobs.server.creativetab.CreativeTabHandler;
import com.bobmowzie.mowziesmobs.server.entity.EntityHandler;
import com.bobmowzie.mowziesmobs.server.entity.barakoa.*;
import com.bobmowzie.mowziesmobs.server.entity.effects.EntityBoulder;
import com.bobmowzie.mowziesmobs.server.entity.foliaath.EntityBabyFoliaath;
import com.bobmowzie.mowziesmobs.server.entity.foliaath.EntityFoliaath;
import com.bobmowzie.mowziesmobs.server.entity.frostmaw.EntityFrostmaw;
import com.bobmowzie.mowziesmobs.server.entity.grottol.EntityGrottol;
import com.bobmowzie.mowziesmobs.server.entity.lantern.EntityLantern;
import com.bobmowzie.mowziesmobs.server.entity.naga.EntityNaga;
import com.bobmowzie.mowziesmobs.server.entity.sculptor.EntitySculptor;
import com.bobmowzie.mowziesmobs.server.entity.wroughtnaut.EntityWroughtnaut;
import com.bobmowzie.mowziesmobs.server.inventory.ContainerHandler;
import com.bobmowzie.mowziesmobs.server.item.ItemHandler;
import com.bobmowzie.mowziesmobs.server.loot.LootTableHandler;
import com.bobmowzie.mowziesmobs.server.sound.MMSounds;
import com.bobmowzie.mowziesmobs.server.world.feature.ConfiguredFeatureHandler;
import com.bobmowzie.mowziesmobs.server.world.spawn.SpawnHandler;
import com.bobmowzie.mowziesmobs.server.world.feature.FeatureHandler;
import jdk.nashorn.internal.ir.Block;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.entity.EntityType;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.network.simple.SimpleChannel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;

@Mod(MowziesMobs.MODID)
@Mod.EventBusSubscriber(modid = MowziesMobs.MODID)
public final class MowziesMobs {
    public static final String MODID = "mowziesmobs";
    public static final Logger LOGGER = LogManager.getLogger();
    public static ServerProxy PROXY;

    public static SimpleChannel NETWORK;

    public MowziesMobs() {
        MowzieGeoBuilder.registerGeoBuilder(MODID, new MowzieGeoBuilder());
        GeckoLib.initialize();

        PROXY = DistExecutor.runForDist(() -> ClientProxy::new, () -> ServerProxy::new);
        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        CreativeTabHandler.INSTANCE.onInit();
        MMSounds.REG.register(bus);
        BlockHandler.REG.register(bus);
        ParticleHandler.REG.register(bus);
        FeatureHandler.REG.register(bus);

        PROXY.init(bus);
        bus.<FMLCommonSetupEvent>addListener(this::init);
        bus.<FMLClientSetupEvent>addListener(this::init);
        bus.<ModelRegistryEvent>addListener(this::init);
        bus.<FMLLoadCompleteEvent>addListener(this::init);

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new ServerEventHandler());
        MinecraftForge.EVENT_BUS.register(new AbilityCapability.AbilityEventHandler());
    }

    public void init(final FMLCommonSetupEvent event) {
        CapabilityHandler.register();
        SpawnHandler.registerSpawnPlacementTypes();
        PROXY.initNetwork();
        AdvancementHandler.preInit();
        LootTableHandler.init();

        event.enqueueWork(() -> {
            FeatureHandler.setupStructures();
            ConfiguredFeatureHandler.registerConfiguredStructures();
        });
    }

    private void init(FMLLoadCompleteEvent event) {
        ItemHandler.initializeAttributes();
        ItemHandler.initializeDispenserBehaviors();
        BlockHandler.init();
        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        PROXY.onLateInit(bus);
    }

    @SubscribeEvent
    public void onBiomeLoading(BiomeLoadingEvent event) {
        SpawnHandler.onBiomeLoading(event);
        ConfiguredFeatureHandler.onBiomeLoading(event);
    }

    @SubscribeEvent
    public void onWorldLoad(final WorldEvent.Load event) {
        FeatureHandler.addDimensionalSpacing(event);
    }

    private void init(ModelRegistryEvent modelRegistryEvent) {
        for (String item : MMModels.HAND_MODEL_ITEMS) {
            ModelLoader.addSpecialModel(new ModelResourceLocation(MowziesMobs.MODID + ":" + item + "_in_hand", "inventory"));
        }
        for (MaskType type : MaskType.values()) {
            ModelLoader.addSpecialModel(new ModelResourceLocation(MowziesMobs.MODID + ":barakoa_mask_" + type.name + "_frame", "inventory"));
        }
    }

    private void init(final FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.BABY_FOLIAATH, RenderFoliaathBaby::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.FOLIAATH, RenderFoliaath::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.WROUGHTNAUT, RenderWroughtnaut::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.BARAKO, RenderBarako::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.BARAKOANA, RenderBarakoa::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.BARAKOAN_TO_BARAKOANA, RenderBarakoa::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.BARAKOA_VILLAGER, RenderBarakoa::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.BARAKOAN_TO_PLAYER, RenderBarakoa::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.BARAKOAYA_TO_PLAYER, RenderBarakoa::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.BARAKOAYA, RenderBarakoa::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.FROSTMAW, RenderFrostmaw::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.GROTTOL, RenderGrottol::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.LANTERN, RenderLantern::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.NAGA, RenderNaga::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.SCULPTOR, RenderSculptor::new);

        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.DART, RenderDart::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.SUNSTRIKE, RenderSunstrike::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.SOLAR_BEAM, RenderSolarBeam::new);
        for (EntityType<EntityBoulder> boulderType : EntityHandler.BOULDERS) {
            RenderingRegistry.registerEntityRenderingHandler(boulderType, RenderBoulder::new);
        }
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.AXE_ATTACK, RenderAxeAttack::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.POISON_BALL, RenderPoisonBall::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.ICE_BALL, RenderIceBall::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.ICE_BREATH, RenderNothing::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.FROZEN_CONTROLLER, RenderNothing::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.SUPER_NOVA, RenderSuperNova::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.FALLING_BLOCK, RenderFallingBlock::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.BLOCK_SWAPPER, RenderNothing::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.CAMERA_SHAKE, RenderNothing::new);

        ScreenManager.registerFactory(ContainerHandler.CONTAINER_BARAKOAYA_TRADE, GuiBarakoayaTrade::new);
        ScreenManager.registerFactory(ContainerHandler.CONTAINER_BARAKO_TRADE, GuiBarakoTrade::new);
    }
}
