package com.bobmowzie.mowziesmobs.common.animation;

import com.bobmowzie.mowziesmobs.common.entity.MMEntityBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;

import java.util.List;

public class AnimFWNAttack extends AnimBasicAttack
{
    private float arc;

    public AnimFWNAttack(MMEntityBase entity, int id, int duration, String sound, float knockback, float range, float arc)
    {
        super(entity, id, duration, sound, "", knockback, range, 0, 0);
        this.arc = arc;
    }

    public void startExecuting()
    {
        super.startExecuting();
        entity.playSound("mowziesmobs:wroughtnautPreSwing1", 1.5F, 1F);
    }

    public void updateTask()
    {
        entity.motionX = 0;
        entity.motionZ = 0;
        if (entity.getAnimTick() < (duration / 2 + 2) && entityTarget != null)
            entity.getLookHelper().setLookPositionWithEntity(entityTarget, 30F, 30F);

        if (entity.getAnimTick() == 6) entity.playSound("mowziesmobs:wroughtnautCreak", 0.5F, 1F);

        if (entity.getAnimTick() == (duration / 2)) entity.playSound(attackSound, 1.2F, 1);

        if (entity.getAnimTick() == (duration / 2 + 2))
        {
            entity.playSound("mowziesmobs:wroughtnautSwing1", 1.5F, 1F);
            List<EntityLivingBase> entitiesHit = entity.getEntityLivingBaseNearby(range, 3, range, range);
            float damage = (float) entity.getAttack();
            boolean hit = false;
            for (EntityLivingBase entityHit : entitiesHit)
            {
                float entityHitAngle = (float) ((Math.atan2(entityHit.posZ - entity.posZ, entityHit.posX - entity.posX) * (180 / Math.PI) - 90) % 360);
                float entityAttackingAngle = entity.renderYawOffset % 360;
                if (entityHitAngle < 0) entityHitAngle += 360;
                if (entityAttackingAngle < 0) entityAttackingAngle += 360;
                float entityRelativeAngle = entityHitAngle - entityAttackingAngle;
                float entityHitDistance = (float) Math.sqrt((entityHit.posZ - entity.posZ) * (entityHit.posZ - entity.posZ) + (entityHit.posX - entity.posX) * (entityHit.posX - entity.posX));
                if (entityHitDistance <= range && (entityRelativeAngle <= arc / 2 && entityRelativeAngle >= -arc / 2) || (entityRelativeAngle >= 360 - arc / 2 || entityRelativeAngle <= -360 + arc / 2))
                {
                    entityHit.attackEntityFrom(DamageSource.causeMobDamage(entity), damage);
                    entityHit.motionX *= knockback;
                    entityHit.motionZ *= knockback;
                    hit = true;
                }
            }
            if (hit) entity.playSound("minecraft:random.anvil_land", 1, 0.5F);
        }
    }
}
