package com.bobmowzie.mowziesmobs.client.model.entity;

import com.bobmowzie.mowziesmobs.client.model.tools.SocketModelRenderer;
import com.bobmowzie.mowziesmobs.server.entity.naga.EntityNaga;
import net.ilexiconn.llibrary.LLibrary;
import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.minecraft.entity.Entity;

/**
 * Created by Josh on 9/9/2018.
 */

public class ModelNaga extends AdvancedModelBase{
    public AdvancedModelRenderer root;
    public AdvancedModelRenderer body;
    public AdvancedModelRenderer neck;
    public SocketModelRenderer tail1;
    public AdvancedModelRenderer spike1joint;
    public AdvancedModelRenderer spike2joint;
    public AdvancedModelRenderer spike3joint;
    public AdvancedModelRenderer shoulder1_L;
    public AdvancedModelRenderer shoulder1_R;
    public AdvancedModelRenderer backFin1;
    public AdvancedModelRenderer backFin1Reversed;
    public AdvancedModelRenderer headjoint;
    public AdvancedModelRenderer head;
    public AdvancedModelRenderer jaw;
    public AdvancedModelRenderer underHead;
    public AdvancedModelRenderer teethUpper;
    public AdvancedModelRenderer eyebrowJoint_R;
    public AdvancedModelRenderer eyebrowJoint_L;
    public AdvancedModelRenderer teethLower;
    public AdvancedModelRenderer eyebrow_R;
    public AdvancedModelRenderer eyebrow_L;
    public SocketModelRenderer tail2;
    public AdvancedModelRenderer spike4joint;
    public AdvancedModelRenderer backFin2;
    public AdvancedModelRenderer backFin2Reversed;
    public SocketModelRenderer tail3;
    public AdvancedModelRenderer spike5joint;
    public AdvancedModelRenderer backWing_L;
    public AdvancedModelRenderer backWing_R;
    public AdvancedModelRenderer backWing_LReversed;
    public AdvancedModelRenderer backWing_RReversed;
    public AdvancedModelRenderer backFin3;
    public AdvancedModelRenderer backFin3Reversed;
    public SocketModelRenderer tail4;
    public SocketModelRenderer tail5;
    public SocketModelRenderer tail6;
    public SocketModelRenderer tailFin;
    public SocketModelRenderer tailFinReversed;
    public AdvancedModelRenderer spike5;
    public AdvancedModelRenderer spike4;
    public AdvancedModelRenderer spike1;
    public AdvancedModelRenderer spike2;
    public AdvancedModelRenderer spike3;
    public AdvancedModelRenderer spike3Bottom;
    public AdvancedModelRenderer upperArmJoint_L;
    public AdvancedModelRenderer upperArm_L;
    public AdvancedModelRenderer lowerArmJoint_L;
    public AdvancedModelRenderer wingWebbing6_L;
    public AdvancedModelRenderer wingWebbing6_LReversed;
    public AdvancedModelRenderer lowerArm_L;
    public AdvancedModelRenderer handJoint_L;
    public AdvancedModelRenderer wingWebbing5_L;
    public AdvancedModelRenderer wingWebbing5_LReversed;
    public AdvancedModelRenderer hand_L;
    public AdvancedModelRenderer wingFrame1_L;
    public AdvancedModelRenderer wingFrame2_L;
    public AdvancedModelRenderer wingFrame3_L;
    public AdvancedModelRenderer wingFrame4_L;
    public AdvancedModelRenderer wingClaw_L;
    public AdvancedModelRenderer wingWebbing1_L;
    public AdvancedModelRenderer wingWebbing2_L;
    public AdvancedModelRenderer wingWebbing3_L;
    public AdvancedModelRenderer wingWebbing4_L;
    public AdvancedModelRenderer wingWebbing1_LReversed;
    public AdvancedModelRenderer wingWebbing2_LReversed;
    public AdvancedModelRenderer wingWebbing3_LReversed;
    public AdvancedModelRenderer wingWebbing4_LReversed;
    public AdvancedModelRenderer upperArmJoint_R;
    public AdvancedModelRenderer upperArm_R;
    public AdvancedModelRenderer lowerArmJoint_R;
    public AdvancedModelRenderer wingWebbing6_R;
    public AdvancedModelRenderer wingWebbing6_RReversed;
    public AdvancedModelRenderer lowerArm_R;
    public AdvancedModelRenderer handJoint_R;
    public AdvancedModelRenderer wingWebbing5_R;
    public AdvancedModelRenderer wingWebbing5_RReversed;
    public AdvancedModelRenderer hand_R;
    public AdvancedModelRenderer wingFrame1_R;
    public AdvancedModelRenderer wingFrame2_R;
    public AdvancedModelRenderer wingFrame3_R;
    public AdvancedModelRenderer wingFrame4_R;
    public AdvancedModelRenderer wingClaw_R;
    public AdvancedModelRenderer wingWebbing1_R;
    public AdvancedModelRenderer wingWebbing2_R;
    public AdvancedModelRenderer wingWebbing3_R;
    public AdvancedModelRenderer wingWebbing4_R;
    public AdvancedModelRenderer wingWebbing1_RReversed;
    public AdvancedModelRenderer wingWebbing2_RReversed;
    public AdvancedModelRenderer wingWebbing3_RReversed;
    public AdvancedModelRenderer wingWebbing4_RReversed;
    public AdvancedModelRenderer wingFolder;

    public SocketModelRenderer tailEnd;

    public SocketModelRenderer[] tailOriginal;
    public SocketModelRenderer[] tailDynamic;

    private ModelAnimator animator;

    public ModelNaga() {
        animator = ModelAnimator.create();

        this.textureWidth = 256;
        this.textureHeight = 256;
        this.eyebrow_L = new AdvancedModelRenderer(this, 63, 0);
        this.eyebrow_L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eyebrow_L.addBox(-3.5F, 0.0F, 0.0F, 9, 7, 3, 0.0F);
        this.setRotateAngle(eyebrow_L, 0.0F, 0.0F, 0.12217304763960307F);
        this.spike4 = new AdvancedModelRenderer(this, 45, 52);
        this.spike4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spike4.addBox(0.0F, 0.0F, 0.0F, 11, 6, 11, 0.0F);
        this.setRotateAngle(spike4, 0.0F, -0.7853981633974483F, 0.0F);
        this.spike3joint = new AdvancedModelRenderer(this, 0, 0);
        this.spike3joint.setRotationPoint(0.0F, 1.0F, 4.0F);
        this.spike3joint.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.setRotateAngle(spike3joint, 0.5235987755982988F, 0.0F, 0.0F);
        this.headjoint = new AdvancedModelRenderer(this, 0, 0);
        this.headjoint.setRotationPoint(0.0F, 1.0F, -13.0F);
        this.headjoint.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.setRotateAngle(headjoint, 0.4363323129985824F, 0.0F, 0.0F);
        this.body = new AdvancedModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, -9.0F, -9.0F);
        this.body.addBox(-10.5F, -4.0F, -3.0F, 21, 13, 21, 0.0F);
        this.spike2 = new AdvancedModelRenderer(this, 0, 54);
        this.spike2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spike2.addBox(0.0F, 0.0F, 0.0F, 15, 4, 15, 0.0F);
        this.setRotateAngle(spike2, 0.0F, -0.7853981633974483F, 0.0F);
        this.lowerArmJoint_R = new AdvancedModelRenderer(this, 0, 0);
        this.lowerArmJoint_R.setRotationPoint(-15.0F, 0.0F, -0.5F);
        this.lowerArmJoint_R.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.spike1 = new AdvancedModelRenderer(this, 0, 54);
        this.spike1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spike1.addBox(0.0F, 0.0F, 0.0F, 15, 4, 15, 0.0F);
        this.setRotateAngle(spike1, 0.0F, -0.7853981633974483F, 0.0F);
        this.wingWebbing5_L = new AdvancedModelRenderer(this, 193, 128);
        this.wingWebbing5_L.setRotationPoint(12.0F, 0.0F, 1.0F);
        this.wingWebbing5_L.addBox(-12.0F, 0.0F, 0.0F, 20, 0, 23, 0.0F);
        this.wingWebbing5_LReversed = new AdvancedModelRenderer(this, 193, 128);
        this.wingWebbing5_LReversed.setRotationPoint(0.0F, -0.004F, 0.0F);
        this.wingWebbing5_LReversed.addBox(-12.0F, 0.0F, 0.0F, 20, 0, 23, 0.0F);
        wingWebbing5_LReversed.setScale(1, -1, 1);
        this.tail5 = new SocketModelRenderer(this, 162, 30);
        this.tail5.setRotationPoint(0.0F, 0.0F, 14.0F);
        this.tail5.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 13, 0.0F);
        this.tail3 = new SocketModelRenderer(this, 0, 34);
        this.tail3.setRotationPoint(0.0F, 0.0F, 15.0F);
        this.tail3.addBox(-5.5F, -2.5F, 0.0F, 11, 4, 16, 0.0F);
        this.wingWebbing2_L = new AdvancedModelRenderer(this, 20, 98);
        this.wingWebbing2_L.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.wingWebbing2_L.addBox(0.0F, 0.0F, -15.0F, 50, 0, 30, 0.0F);
        this.setRotateAngle(wingWebbing2_L, 0.0F, -0.30543261909900765F, 0.0F);
        this.wingWebbing2_LReversed = new AdvancedModelRenderer(this, 20, 98);
        this.wingWebbing2_LReversed.setRotationPoint(0.0F, -0.004F, 0.0F);
        this.wingWebbing2_LReversed.addBox(0.0F, 0.0F, -15.0F, 50, 0, 30, 0.0F);
        wingWebbing2_LReversed.setScale(1, -1, 1);
        this.root = new AdvancedModelRenderer(this, 0, 0);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.root.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.wingFrame1_L = new AdvancedModelRenderer(this, 50, 91);
        this.wingFrame1_L.setRotationPoint(11.0F, 0.0F, -0.5F);
        this.wingFrame1_L.addBox(0.0F, -1.5F, -1.5F, 53, 3, 3, 0.0F);
        this.hand_R = new AdvancedModelRenderer(this, 222, 0);
        this.hand_R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hand_R.addBox(-11.0F, -2.0F, -2.0F, 11, 4, 4, 0.0F);
        this.lowerArm_R = new AdvancedModelRenderer(this, 102, 83);
        this.lowerArm_R.mirror = true;
        this.lowerArm_R.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.lowerArm_R.addBox(-22.0F, -2.0F, -2.0F, 22, 4, 4, 0.0F);
        this.head = new AdvancedModelRenderer(this, 68, 23);
        this.head.setRotationPoint(0.0F, -2.0F, -1.0F);
        this.head.addBox(-8.0F, -3.7F, -8.0F, 16, 6, 16, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.7853981633974483F, 0.0F);
        this.eyebrowJoint_L = new AdvancedModelRenderer(this, 0, 0);
        this.eyebrowJoint_L.setRotationPoint(4.95F, -5.0F, -7.36F);
        this.eyebrowJoint_L.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.setRotateAngle(eyebrowJoint_L, 1.0344566476570392F, -0.3179989897133668F, -0.5363396791378574F);
        this.upperArm_L = new AdvancedModelRenderer(this, 106, 74);
        this.upperArm_L.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.upperArm_L.addBox(-2.0F, -2.0F, -3.0F, 18, 4, 5, 0.0F);
        this.wingFrame2_L = new AdvancedModelRenderer(this, 0, 79);
        this.wingFrame2_L.setRotationPoint(7.0F, 0.0F, 0.0F);
        this.wingFrame2_L.addBox(0.0F, -1.5F, -1.5F, 50, 3, 3, 0.0F);
        this.setRotateAngle(wingFrame2_L, 0.0F, -0.6108652381980153F, 0.0F);
        this.eyebrow_R = new AdvancedModelRenderer(this, 63, 0);
        this.eyebrow_R.mirror = true;
        this.eyebrow_R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eyebrow_R.addBox(-5.5F, 0.0F, 0.0F, 9, 7, 3, 0.0F);
        this.setRotateAngle(eyebrow_R, 0.0F, 0.0F, -0.12217304763960307F);
        this.wingWebbing3_R = new AdvancedModelRenderer(this, 144, 71);
        this.wingWebbing3_R.mirror = true;
        this.wingWebbing3_R.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.wingWebbing3_R.addBox(-43.0F, 0.0F, -13.0F, 43, 0, 26, 0.0F);
        this.setRotateAngle(wingWebbing3_R, 0.0F, 0.30543261909900765F, 0.0F);
        this.wingWebbing3_RReversed = new AdvancedModelRenderer(this, 144, 71);
        this.wingWebbing3_RReversed.mirror = true;
        this.wingWebbing3_RReversed.setRotationPoint(0.0F, -0.004F, 0.0F);
        this.wingWebbing3_RReversed.addBox(-43.0F, 0.0F, -13.0F, 43, 0, 26, 0.0F);
        wingWebbing3_RReversed.setScale(1, -1, 1);
        this.wingWebbing3_L = new AdvancedModelRenderer(this, 144, 71);
        this.wingWebbing3_L.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.wingWebbing3_L.addBox(0.0F, 0.0F, -13.0F, 43, 0, 26, 0.0F);
        this.setRotateAngle(wingWebbing3_L, 0.0F, -0.30543261909900765F, 0.0F);
        this.wingWebbing3_LReversed = new AdvancedModelRenderer(this, 144, 71);
        this.wingWebbing3_LReversed.setRotationPoint(0.0F, -0.004F, 0.0F);
        this.wingWebbing3_LReversed.addBox(0.0F, 0.0F, -13.0F, 43, 0, 26, 0.0F);
        wingWebbing3_LReversed.setScale(1, -1, 1);
        this.handJoint_R = new AdvancedModelRenderer(this, 0, 0);
        this.handJoint_R.setRotationPoint(-20.0F, 0.0F, 0.0F);
        this.handJoint_R.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.spike5 = new AdvancedModelRenderer(this, 38, 36);
        this.spike5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spike5.addBox(0.0F, 0.0F, 0.0F, 9, 4, 9, 0.0F);
        this.setRotateAngle(spike5, 0.0F, -0.7853981633974483F, 0.0F);
        this.shoulder1_L = new AdvancedModelRenderer(this, 189, 0);
        this.shoulder1_L.setRotationPoint(8.0F, -2.0F, -1.0F);
        this.shoulder1_L.addBox(-2.0F, -3.0F, -7.0F, 12, 6, 9, 0.0F);
        this.setRotateAngle(shoulder1_L, 0.0F, -0.5235987755982988F, 0.0F);
        this.spike5joint = new AdvancedModelRenderer(this, 0, 0);
        this.spike5joint.setRotationPoint(0.0F, 0.0F, -4.05F);
        this.spike5joint.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.setRotateAngle(spike5joint, 0.5235987755982988F, 0.0F, 0.0F);
        this.wingWebbing1_R = new AdvancedModelRenderer(this, 119, 97);
        this.wingWebbing1_R.mirror = true;
        this.wingWebbing1_R.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.wingWebbing1_R.addBox(-53.0F, 0.0F, -16.0F, 53, 0, 31, 0.0F);
        this.setRotateAngle(wingWebbing1_R, 0.0F, 0.30543261909900765F, 0.0F);
        this.wingWebbing1_RReversed = new AdvancedModelRenderer(this, 119, 97);
        this.wingWebbing1_RReversed.mirror = true;
        this.wingWebbing1_RReversed.setRotationPoint(0.0F, -0.004F, 0.0F);
        this.wingWebbing1_RReversed.addBox(-53.0F, 0.0F, -16.0F, 53, 0, 31, 0.0F);
        wingWebbing1_RReversed.setScale(1, -1, 1);
        this.upperArmJoint_L = new AdvancedModelRenderer(this, 0, 0);
        this.upperArmJoint_L.setRotationPoint(9.0F, -1.0F, -1.0F);
        this.upperArmJoint_L.addBox(-2.0F, 0.0F, -3.0F, 0, 0, 0, 0.0F);
        this.setRotateAngle(upperArmJoint_L, 0.0F, 0.5235987755982988F, 0.0F);
        this.tail1 = new SocketModelRenderer(this, 140, 0);
        this.tail1.setRotationPoint(0.0F, 1.5F, 17.0F);
        this.tail1.addBox(-7.5F, -4.5F, -3.0F, 15, 9, 19, 0.0F);
        this.wingWebbing5_R = new AdvancedModelRenderer(this, 193, 128);
        this.wingWebbing5_R.mirror = true;
        this.wingWebbing5_R.setRotationPoint(-12.0F, 0.0F, 1.0F);
        this.wingWebbing5_R.addBox(-8.0F, 0.0F, 0.0F, 20, 0, 23, 0.0F);
        this.wingWebbing5_RReversed = new AdvancedModelRenderer(this, 193, 128);
        this.wingWebbing5_RReversed.mirror = true;
        this.wingWebbing5_RReversed.setRotationPoint(0.0F, -0.004F, 0.0F);
        this.wingWebbing5_RReversed.addBox(-8.0F, 0.0F, 0.0F, 20, 0, 23, 0.0F);
        wingWebbing5_RReversed.setScale(1, -1, 1);
        this.backFin3 = new AdvancedModelRenderer(this, 170, 123);
        this.backFin3.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.backFin3.addBox(0.0F, -9.0F, -3.0F, 0, 9, 19, 0.0F);
        this.backFin3Reversed = new AdvancedModelRenderer(this, 170, 123);
        this.backFin3Reversed.setRotationPoint(0.001F, 0.0F, 0.0F);
        this.backFin3Reversed.addBox(0.0F, -9.0F, -3.0F, 0, 9, 19, 0.0F);
        backFin3Reversed.setScale(-1, 1, 1);
        this.handJoint_L = new AdvancedModelRenderer(this, 0, 0);
        this.handJoint_L.setRotationPoint(20.0F, 0.0F, 0.0F);
        this.handJoint_L.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.wingWebbing4_L = new AdvancedModelRenderer(this, 159, 36);
        this.wingWebbing4_L.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.wingWebbing4_L.addBox(0.0F, 0.0F, -22.0F, 31, 0, 35, 0.0F);
        this.setRotateAngle(wingWebbing4_L, 0.0F, -0.6544984694978736F, 0.0F);
        this.wingWebbing4_LReversed = new AdvancedModelRenderer(this, 159, 36);
        this.wingWebbing4_LReversed.setRotationPoint(0.0F, -0.004F, 0.0F);
        this.wingWebbing4_LReversed.addBox(0.0F, 0.0F, -22.0F, 31, 0, 35, 0.0F);
        wingWebbing4_LReversed.setScale(1, -1, 1);
        this.wingFrame3_L = new AdvancedModelRenderer(this, 0, 73);
        this.wingFrame3_L.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.wingFrame3_L.addBox(0.0F, -1.5F, -1.5F, 43, 3, 3, 0.0F);
        this.setRotateAngle(wingFrame3_L, 0.0F, -1.2217304763960306F, 0.0F);
        this.wingWebbing1_L = new AdvancedModelRenderer(this, 119, 97);
        this.wingWebbing1_L.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.wingWebbing1_L.addBox(0.0F, 0.0F, -16.0F, 53, 0, 31, 0.0F);
        this.setRotateAngle(wingWebbing1_L, 0.0F, -0.30543261909900765F, 0.0F);
        this.wingWebbing1_LReversed = new AdvancedModelRenderer(this, 119, 97);
        this.wingWebbing1_LReversed.setRotationPoint(0.0F, -0.004F, 0.0F);
        this.wingWebbing1_LReversed.addBox(0.0F, 0.0F, -16.0F, 53, 0, 31, 0.0F);
        wingWebbing1_LReversed.setScale(1, -1, 1);
        this.wingClaw_R = new AdvancedModelRenderer(this, 231, 8);
        this.wingClaw_R.mirror = true;
        this.wingClaw_R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.wingClaw_R.addBox(-9.0F, -2.0F, -2.0F, 9, 3, 3, 0.0F);
        this.setRotateAngle(wingClaw_R, 0.0F, -0.5235987755982988F, 0.0F);
        this.eyebrowJoint_R = new AdvancedModelRenderer(this, 0, 0);
        this.eyebrowJoint_R.setRotationPoint(-4.95F, -5.0F, -7.36F);
        this.eyebrowJoint_R.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.setRotateAngle(eyebrowJoint_R, 1.0344566476570392F, 0.3179989897133668F, 0.5363396791378574F);
        this.wingFrame2_R = new AdvancedModelRenderer(this, 0, 79);
        this.wingFrame2_R.mirror = true;
        this.wingFrame2_R.setRotationPoint(-7.0F, 0.0F, 0.0F);
        this.wingFrame2_R.addBox(-50.0F, -1.5F, -1.5F, 50, 3, 3, 0.0F);
        this.setRotateAngle(wingFrame2_R, 0.0F, 0.6108652381980153F, 0.0F);
        this.wingWebbing2_R = new AdvancedModelRenderer(this, 20, 98);
        this.wingWebbing2_R.mirror = true;
        this.wingWebbing2_R.setRotationPoint(1.5F, 0.0F, 0.0F);
        this.wingWebbing2_R.addBox(-50.0F, 0.0F, -15.0F, 50, 0, 30, 0.0F);
        this.setRotateAngle(wingWebbing2_R, 0.0F, 0.30543261909900765F, 0.0F);
        this.wingWebbing2_RReversed = new AdvancedModelRenderer(this, 20, 98);
        this.wingWebbing2_RReversed.mirror = true;
        this.wingWebbing2_RReversed.setRotationPoint(0.0F, -0.004F, 0.0F);
        this.wingWebbing2_RReversed.addBox(-50.0F, 0.0F, -15.0F, 50, 0, 30, 0.0F);
        wingWebbing2_RReversed.setScale(1, -1, 1);
        this.jaw = new AdvancedModelRenderer(this, 116, 62);
        this.jaw.setRotationPoint(0.0F, -1.34F, -4.38F);
        this.jaw.addBox(-4.5F, 0.16F, -9.37F, 9, 4, 8, 0.0F);
        this.setRotateAngle(jaw, -0.17453292519943295F, 0.0F, -0.005235987755982988F);
        this.neck = new AdvancedModelRenderer(this, 84, 0);
        this.neck.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.neck.addBox(-6.5F, -4.0F, -12.2F, 13, 8, 15, 0.0F);
        this.setRotateAngle(neck, 0.17453292519943295F, 0.0F, 0.0F);
        this.spike3Bottom = new AdvancedModelRenderer(this, 78, 45);
        this.spike3Bottom.setRotationPoint(0.0F, 2.69F, 5.66F);
        this.spike3Bottom.addBox(0.0F, 0.0F, 0.0F, 11, 4, 11, 0.0F);
        this.setRotateAngle(spike3Bottom, 0.0F, -0.7853981633974483F, 0.0F);
        this.teethLower = new AdvancedModelRenderer(this, 125, 0);
        this.teethLower.setRotationPoint(0.0F, 0.14F, -9.4F);
        this.teethLower.addBox(-4.5F, -6.0F, 0.0F, 9, 6, 7, 0.0F);
        this.setRotateAngle(teethLower, -0.5009094953223726F, 0.0F, 0.0F);
        this.lowerArm_L = new AdvancedModelRenderer(this, 102, 83);
        this.lowerArm_L.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.lowerArm_L.addBox(0.0F, -2.0F, -2.0F, 22, 4, 4, 0.0F);
        this.shoulder1_R = new AdvancedModelRenderer(this, 189, 0);
        this.shoulder1_R.mirror = true;
        this.shoulder1_R.setRotationPoint(-8.0F, -2.0F, -1.0F);
        this.shoulder1_R.addBox(-10.0F, -3.0F, -7.0F, 12, 6, 9, 0.0F);
        this.setRotateAngle(shoulder1_R, 0.0F, 0.5235987755982988F, 0.0F);
        this.wingFrame1_R = new AdvancedModelRenderer(this, 50, 91);
        this.wingFrame1_R.mirror = true;
        this.wingFrame1_R.setRotationPoint(-11.0F, 0.0F, -0.5F);
        this.wingFrame1_R.addBox(-53.0F, -1.5F, -1.5F, 53, 3, 3, 0.0F);
        this.teethUpper = new AdvancedModelRenderer(this, 171, 56);
        this.teethUpper.setRotationPoint(0.0F, 0.3F, -6.65F);
        this.teethUpper.addBox(-4.0F, -4.0F, -3.0F, 8, 8, 3, 0.0F);
        this.setRotateAngle(teethUpper, 1.5707963267948966F, 0.7853981633974483F, 0.0F);
        this.backWing_R = new AdvancedModelRenderer(this, 35, 128);
        this.backWing_R.mirror = true;
        this.backWing_R.setRotationPoint(-4.0F, 0.0F, 4.0F);
        this.backWing_R.addBox(-30.0F, 0.0F, 0.0F, 30, 0, 25, 0.0F);
        this.setRotateAngle(backWing_R, 0.0F, 0.5235987755982988F, 0.0F);
        this.backWing_RReversed = new AdvancedModelRenderer(this, 35, 128);
        this.backWing_RReversed.mirror = true;
        this.backWing_RReversed.setRotationPoint(0.0F, -0.004F, 0.0F);
        this.backWing_RReversed.addBox(-30.0F, 0.0F, 0.0F, 30, 0, 25, 0.0F);
        backWing_RReversed.setScale(1, -1, 1);
        this.tailFin = new SocketModelRenderer(this, -30, 128);
        this.tailFin.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tailFin.addBox(-5.0F, 0.0F, -5.0F, 30, 0, 30, 0.0F);
        this.setRotateAngle(tailFin, 0.0F, -0.7853981633974483F, 0.0F);
        this.tailFinReversed = new SocketModelRenderer(this, -30, 128);
        this.tailFinReversed.setRotationPoint(0.0F, -0.004F, 0.0F);
        this.tailFinReversed.addBox(-5.0F, 0.0F, -5.0F, 30, 0, 30, 0.0F);
        tailFinReversed.setScale(1, -1, 1);
        this.lowerArmJoint_L = new AdvancedModelRenderer(this, 0, 0);
        this.lowerArmJoint_L.setRotationPoint(15.0F, 0.0F, -0.5F);
        this.lowerArmJoint_L.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.wingFrame4_L = new AdvancedModelRenderer(this, 0, 85);
        this.wingFrame4_L.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.wingFrame4_L.addBox(0.0F, -1.5F, -1.5F, 38, 3, 3, 0.0F);
        this.setRotateAngle(wingFrame4_L, 0.0F, -1.8325957145940461F, 0.0F);
        this.underHead = new AdvancedModelRenderer(this, 122, 51);
        this.underHead.setRotationPoint(0.0F, -1.82F, -1.59F);
        this.underHead.addBox(-4.5F, 1.12F, -4.03F, 9, 4, 7, 0.0F);
        this.setRotateAngle(underHead, -0.17453292519943295F, 0.0F, 0.0F);
        this.backFin2 = new AdvancedModelRenderer(this, 170, 109);
        this.backFin2.setRotationPoint(0.0F, -4.5F, 0.0F);
        this.backFin2.addBox(0.0F, -14.0F, -3.0F, 0, 14, 19, 0.0F);
        this.backFin2Reversed = new AdvancedModelRenderer(this, 170, 109);
        this.backFin2Reversed.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backFin2Reversed.addBox(0.0F, -14.0F, -3.0F, 0, 14, 19, 0.0F);
        backFin2Reversed.setScale(-1, 1, 1);
        this.tail2 = new SocketModelRenderer(this, 115, 28);
        this.tail2.setRotationPoint(0.0F, -1.0F, 15.0F);
        this.tail2.addBox(-6.5F, -3.0F, -1.0F, 13, 6, 17, 0.0F);
        this.hand_L = new AdvancedModelRenderer(this, 222, 0);
        this.hand_L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hand_L.addBox(0.0F, -2.0F, -2.0F, 11, 4, 4, 0.0F);
        this.spike4joint = new AdvancedModelRenderer(this, 0, 0);
        this.spike4joint.setRotationPoint(0.0F, -1.0F, 0.55F);
        this.spike4joint.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.setRotateAngle(spike4joint, 0.5235987755982988F, 0.0F, 0.0F);
        this.upperArmJoint_R = new AdvancedModelRenderer(this, 0, 0);
        this.upperArmJoint_R.setRotationPoint(-9.0F, -1.0F, -1.0F);
        this.upperArmJoint_R.addBox(-2.0F, 0.0F, -3.0F, 0, 0, 0, 0.0F);
        this.setRotateAngle(upperArmJoint_R, 0.0F, -0.5235987755982988F, 0.0F);
        this.spike1joint = new AdvancedModelRenderer(this, 0, 0);
        this.spike1joint.setRotationPoint(0.0F, 1.0F, -12.0F);
        this.spike1joint.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.setRotateAngle(spike1joint, 0.5235987755982988F, 0.0F, 0.0F);
        this.backFin1 = new AdvancedModelRenderer(this, 120, 103);
        this.backFin1.setRotationPoint(0.0F, -4.0F, -3.0F);
        this.backFin1.addBox(0.0F, -15.0F, -4.0F, 0, 15, 25, 0.0F);
        this.backFin1Reversed = new AdvancedModelRenderer(this, 120, 103);
        this.backFin1Reversed.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backFin1Reversed.addBox(0.0F, -15.0F, -4.0F, 0, 15, 25, 0.0F);
        backFin1Reversed.setScale(-1, 1, 1);
        this.wingWebbing4_R = new AdvancedModelRenderer(this, 159, 36);
        this.wingWebbing4_R.mirror = true;
        this.wingWebbing4_R.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.wingWebbing4_R.addBox(-31.0F, 0.0F, -22.0F, 31, 0, 35, 0.0F);
        this.setRotateAngle(wingWebbing4_R, 0.0F, 0.6544984694978736F, 0.0F);
        this.wingWebbing4_RReversed = new AdvancedModelRenderer(this, 159, 36);
        this.wingWebbing4_RReversed.mirror = true;
        this.wingWebbing4_RReversed.setRotationPoint(0.0F, -0.004F, 0.0F);
        this.wingWebbing4_RReversed.addBox(-31.0F, 0.0F, -22.0F, 31, 0, 35, 0.0F);
        wingWebbing4_RReversed.setScale(1, -1, 1);
        this.upperArm_R = new AdvancedModelRenderer(this, 106, 74);
        this.upperArm_R.mirror = true;
        this.upperArm_R.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.upperArm_R.addBox(-16.0F, -2.0F, -3.0F, 18, 4, 5, 0.0F);
        this.backWing_L = new AdvancedModelRenderer(this, 35, 128);
        this.backWing_L.setRotationPoint(4.0F, 0.0F, 4.0F);
        this.backWing_L.addBox(0.0F, 0.0F, 0.0F, 30, 0, 25, 0.0F);
        this.setRotateAngle(backWing_L, 0.0F, -0.5235987755982988F, 0.0F);
        this.backWing_LReversed = new AdvancedModelRenderer(this, 35, 128);
        this.backWing_LReversed.setRotationPoint(0.0F, -0.004F, 0.0F);
        this.backWing_LReversed.addBox(0.0F, 0.0F, 0.0F, 30, 0, 25, 0.0F);
        backWing_LReversed.setScale(1, -1, 1);
        this.spike3 = new AdvancedModelRenderer(this, 0, 54);
        this.spike3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spike3.addBox(0.0F, 0.0F, 0.0F, 15, 4, 15, 0.0F);
        this.setRotateAngle(spike3, 0.0F, -0.7853981633974483F, 0.0F);
        this.wingWebbing6_R = new AdvancedModelRenderer(this, -24, 94);
        this.wingWebbing6_R.mirror = true;
        this.wingWebbing6_R.setRotationPoint(-0.5F, 0.0F, -2.0F);
        this.wingWebbing6_R.addBox(-14.5F, 0.0F, 0.0F, 25, 0, 24, 0.0F);
        this.wingWebbing6_RReversed = new AdvancedModelRenderer(this, -24, 94);
        this.wingWebbing6_RReversed.mirror = true;
        this.wingWebbing6_RReversed.setRotationPoint(0.0F, -0.004F, 0.0F);
        this.wingWebbing6_RReversed.addBox(-14.5F, 0.0F, 0.0F, 25, 0, 24, 0.0F);
        wingWebbing6_RReversed.setScale(1, -1, 1);
        this.spike2joint = new AdvancedModelRenderer(this, 0, 0);
        this.spike2joint.setRotationPoint(0.0F, 1.0F, -4.0F);
        this.spike2joint.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.setRotateAngle(spike2joint, 0.5235987755982988F, 0.0F, 0.0F);
        this.wingWebbing6_L = new AdvancedModelRenderer(this, -24, 94);
        this.wingWebbing6_L.setRotationPoint(0.5F, 0.0F, -2.0F);
        this.wingWebbing6_L.addBox(-10.5F, 0.0F, 0.0F, 25, 0, 24, 0.0F);
        this.wingWebbing6_LReversed = new AdvancedModelRenderer(this, -24, 94);
        this.wingWebbing6_LReversed.setRotationPoint(0.0F, -0.004F, 0.0F);
        this.wingWebbing6_LReversed.addBox(-10.5F, 0.0F, 0.0F, 25, 0, 24, 0.0F);
        wingWebbing6_LReversed.setScale(1, -1, 1);
        this.tail6 = new SocketModelRenderer(this, 0, 0);
        this.tail6.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.tail6.addBox(-1.5F, -1.0F, 0.0F, 0, 0, 0, 0.0F);
        this.wingClaw_L = new AdvancedModelRenderer(this, 231, 8);
        this.wingClaw_L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.wingClaw_L.addBox(0.0F, -2.0F, -2.0F, 9, 3, 3, 0.0F);
        this.setRotateAngle(wingClaw_L, 0.0F, 0.5235987755982988F, 0.0F);
        this.wingFrame4_R = new AdvancedModelRenderer(this, 0, 85);
        this.wingFrame4_R.mirror = true;
        this.wingFrame4_R.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.wingFrame4_R.addBox(-38.0F, -1.5F, -1.5F, 38, 3, 3, 0.0F);
        this.setRotateAngle(wingFrame4_R, 0.0F, 1.8325957145940461F, 0.0F);
        this.tail4 = new SocketModelRenderer(this, 142, 52);
        this.tail4.setRotationPoint(0.0F, -0.5F, 15.0F);
        this.tail4.addBox(-3.5F, -1.5F, 0.0F, 7, 3, 15, 0.0F);
        this.wingFrame3_R = new AdvancedModelRenderer(this, 0, 73);
        this.wingFrame3_R.mirror = true;
        this.wingFrame3_R.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.wingFrame3_R.addBox(-43.0F, -1.5F, -1.5F, 43, 3, 3, 0.0F);
        this.setRotateAngle(wingFrame3_R, 0.0F, 1.2217304763960306F, 0.0F);
        this.wingFolder = new AdvancedModelRenderer(this, 0, 0);
        this.tailEnd = new SocketModelRenderer(this, 0, 0);
        this.tailEnd.setRotationPoint(0, 0, 5);
        this.eyebrowJoint_L.addChild(this.eyebrow_L);
        this.spike4joint.addChild(this.spike4);
        this.body.addChild(this.spike3joint);
        this.neck.addChild(this.headjoint);
        this.root.addChild(this.body);
        this.spike2joint.addChild(this.spike2);
        this.upperArm_R.addChild(this.lowerArmJoint_R);
        this.spike1joint.addChild(this.spike1);
        this.lowerArm_L.addChild(this.wingWebbing5_L);
        this.tail4.addChild(this.tail5);
        this.tail2.addChild(this.tail3);
        this.wingFrame2_L.addChild(this.wingWebbing2_L);
        this.hand_L.addChild(this.wingFrame1_L);
        this.handJoint_R.addChild(this.hand_R);
        this.lowerArmJoint_R.addChild(this.lowerArm_R);
        this.headjoint.addChild(this.head);
        this.headjoint.addChild(this.eyebrowJoint_L);
        this.upperArmJoint_L.addChild(this.upperArm_L);
        this.hand_L.addChild(this.wingFrame2_L);
        this.eyebrowJoint_R.addChild(this.eyebrow_R);
        this.wingFrame3_R.addChild(this.wingWebbing3_R);
        this.wingFrame3_L.addChild(this.wingWebbing3_L);
        this.lowerArm_R.addChild(this.handJoint_R);
        this.spike5joint.addChild(this.spike5);
        this.body.addChild(this.shoulder1_L);
        this.tail2.addChild(this.spike5joint);
        this.wingFrame1_R.addChild(this.wingWebbing1_R);
        this.shoulder1_L.addChild(this.upperArmJoint_L);
        this.body.addChild(this.tail1);
        this.lowerArm_R.addChild(this.wingWebbing5_R);
        this.tail2.addChild(this.backFin3);
        this.lowerArm_L.addChild(this.handJoint_L);
        this.wingFrame4_L.addChild(this.wingWebbing4_L);
        this.hand_L.addChild(this.wingFrame3_L);
        this.wingFrame1_L.addChild(this.wingWebbing1_L);
        this.hand_R.addChild(this.wingClaw_R);
        this.headjoint.addChild(this.eyebrowJoint_R);
        this.hand_R.addChild(this.wingFrame2_R);
        this.wingFrame2_R.addChild(this.wingWebbing2_R);
        this.headjoint.addChild(this.jaw);
        this.body.addChild(this.neck);
        this.spike3joint.addChild(this.spike3Bottom);
        this.jaw.addChild(this.teethLower);
        this.lowerArmJoint_L.addChild(this.lowerArm_L);
        this.body.addChild(this.shoulder1_R);
        this.hand_R.addChild(this.wingFrame1_R);
        this.headjoint.addChild(this.teethUpper);
        this.tail2.addChild(this.backWing_R);
        this.tail6.addChild(this.tailFin);
        this.upperArm_L.addChild(this.lowerArmJoint_L);
        this.hand_L.addChild(this.wingFrame4_L);
        this.headjoint.addChild(this.underHead);
        this.tail1.addChild(this.backFin2);
        this.tail1.addChild(this.tail2);
        this.handJoint_L.addChild(this.hand_L);
        this.tail1.addChild(this.spike4joint);
        this.shoulder1_R.addChild(this.upperArmJoint_R);
        this.body.addChild(this.spike1joint);
        this.body.addChild(this.backFin1);
        this.wingFrame4_R.addChild(this.wingWebbing4_R);
        this.upperArmJoint_R.addChild(this.upperArm_R);
        this.tail2.addChild(this.backWing_L);
        this.spike3joint.addChild(this.spike3);
        this.upperArm_R.addChild(this.wingWebbing6_R);
        this.body.addChild(this.spike2joint);
        this.upperArm_L.addChild(this.wingWebbing6_L);
        this.tail5.addChild(this.tail6);
        this.hand_L.addChild(this.wingClaw_L);
        this.hand_R.addChild(this.wingFrame4_R);
        this.tail3.addChild(this.tail4);
        this.hand_R.addChild(this.wingFrame3_R);
        this.tail6.addChild(this.tailEnd);
        this.backFin3.addChild(this.backFin3Reversed);
        this.backFin2.addChild(this.backFin2Reversed);
        this.backFin1.addChild(this.backFin1Reversed);
        this.backWing_L.addChild(backWing_LReversed);
        this.backWing_R.addChild(backWing_RReversed);
        this.wingWebbing1_L.addChild(wingWebbing1_LReversed);
        this.wingWebbing2_L.addChild(wingWebbing2_LReversed);
        this.wingWebbing3_L.addChild(wingWebbing3_LReversed);
        this.wingWebbing4_L.addChild(wingWebbing4_LReversed);
        this.wingWebbing5_L.addChild(wingWebbing5_LReversed);
        this.wingWebbing6_L.addChild(wingWebbing6_LReversed);
        this.wingWebbing1_R.addChild(wingWebbing1_RReversed);
        this.wingWebbing2_R.addChild(wingWebbing2_RReversed);
        this.wingWebbing3_R.addChild(wingWebbing3_RReversed);
        this.wingWebbing4_R.addChild(wingWebbing4_RReversed);
        this.wingWebbing6_R.addChild(wingWebbing6_RReversed);
        this.wingWebbing5_R.addChild(wingWebbing5_RReversed);
        this.tailFin.addChild(tailFinReversed);

        updateDefaultPose();

        tailOriginal = new SocketModelRenderer[]{tail1, tail2, tail3, tail4, tail5, tailEnd};
        tailDynamic = new SocketModelRenderer[tailOriginal.length];
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((EntityNaga)entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
//        System.out.println(tailDynamic[0].rotationPointY);
        if (((EntityNaga)entity).dc != null) ((EntityNaga)entity).dc.render(f5, tailDynamic);
        for (int i = 0; i < tailOriginal.length; i++) {
            tailOriginal[i].isHidden = true;
        }
        //System.out.println(tailDynamic.length);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
        resetToDefaultPose();
        EntityNaga naga = (EntityNaga) entityIn;

        modelCorrections();

        float partial = LLibrary.PROXY.getPartialTicks();
        float frame = entityIn.ticksExisted + partial;

        if (naga.movement == EntityNaga.EnumNagaMovement.HOVERING) {
            float globalSpeed = 0.27f;
            float globalDegree = 1f;

            wingFolder.rotationPointX = globalDegree * (0.9f * (float) (0.5 * Math.cos(frame * globalSpeed + 1.4) + 0.5) + 0.05f);
            wingFolder.rotationPointY = globalDegree * (0.9f * (float) (0.5 * Math.cos(frame * globalSpeed + 1.4) + 0.5) + 0.05f);

            flap(shoulder1_R, globalSpeed, 0.8f * globalDegree, false, 0, 0, frame, 1);
            flap(lowerArmJoint_R, globalSpeed, 0.7f * globalDegree, false, -0.6f, 0, frame, 1);
            flap(handJoint_R, globalSpeed, 0.6f * globalDegree, false, -1.2f, 0, frame, 1);

            flap(shoulder1_L, globalSpeed, 0.8f * globalDegree, true, 0, 0, frame, 1);
            flap(lowerArmJoint_L, globalSpeed, 0.7f * globalDegree, true, -0.6f, 0, frame, 1);
            flap(handJoint_L, globalSpeed, 0.6f * globalDegree, true, -1.2f, 0, frame, 1);

            flap(backWing_R, globalSpeed, 0.8f * globalDegree, false, -1.5f, -0.2f, frame, 1);
            flap(backWing_L, globalSpeed, 0.8f * globalDegree, true, -1.5f, -0.2f, frame, 1);

            bob(root, globalSpeed, 10 * globalDegree, false, frame - 0.5f, 1);

            body.rotateAngleX += 0.1f * globalDegree;
            neck.rotateAngleX += 0.1f * globalDegree;
            headjoint.rotateAngleX += 0.1f * globalDegree;
        }
        else if (naga.movement == EntityNaga.EnumNagaMovement.GLIDING) {
            float dx = (float) (naga.motionX);
            float dy = (float) (naga.motionY);
            float dz = (float) (naga.motionZ);
            float pitch = -(float)Math.asin(dy/Math.sqrt(dx * dx + dy * dy + dz * dz));
            root.rotateAngleX += pitch;
            neck.rotateAngleX -= pitch/2;
            head.rotateAngleX -= pitch/2;
            shoulder1_L.rotateAngleX -= Math.min(pitch, 0);
            shoulder1_R.rotateAngleX -= Math.min(pitch, 0);

            wingFolder.rotationPointX += Math.max(Math.min(pitch * 2, 0.8), 0.1);
            wingFolder.rotationPointY += Math.max(Math.min(pitch * 2, 0.8), 0.1);

        }

//        root.rotateAngleZ -= Math.toRadians((naga.rotationYaw - naga.prevRotationYaw) * (LLibrary.PROXY.getPartialTicks()));

        naga.dc.updateChain(LLibrary.PROXY.getPartialTicks(), tailOriginal, tailDynamic, 0.5f, 0.4f, 0.5f, 0.98f, 20, true);
        //naga.dc.updateChain(LLibrary.PROXY.getPartialTicks(), tailOriginal, tailDynamic, 0.2f, 0f, 1f, 0.99f, 40, false);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityNaga naga = (EntityNaga) entity;
        animator.update(naga);
        setRotationAngles(f, f1, f2, f3, f4, f5, naga);

        float frame = naga.frame + LLibrary.PROXY.getPartialTicks();

        if (naga.getAnimation() == EntityNaga.FLAP_ANIMATION) {
            float globalSpeed = 0.27f;
            float globalDegree = 1.1f;

            animator.setAnimation(EntityNaga.FLAP_ANIMATION);
            animator.startKeyframe(25);
            animator.rotate(wingFolder, 1, 0, 0);
            animator.endKeyframe();
            animator.resetKeyframe(0);

            float flapFrame = (float) ((wingFolder.rotateAngleX * Math.PI * 2f / globalSpeed) - (Math.PI * 0.5 / globalSpeed));
            globalDegree *= 1 - Math.pow(Math.sin(wingFolder.rotateAngleX * Math.PI - Math.PI/2), 8);

            wingFolder.rotationPointX += globalDegree * (0.9f * (float) (0.5 * Math.cos(flapFrame * globalSpeed + 1.4) + 0.5) + 0.05f);
            wingFolder.rotationPointY += globalDegree * (0.9f * (float) (0.5 * Math.cos(flapFrame * globalSpeed + 1.4) + 0.5) + 0.05f);

            flap(shoulder1_R, globalSpeed, 0.8f * globalDegree, false, 0, 0, flapFrame, 1);
            flap(lowerArmJoint_R, globalSpeed, 0.7f * globalDegree, false, -0.6f, 0, flapFrame, 1);
            flap(handJoint_R, globalSpeed, 0.6f * globalDegree, false, -1.2f, 0, flapFrame, 1);

            flap(shoulder1_L, globalSpeed, 0.8f * globalDegree, true, 0, 0, flapFrame, 1);
            flap(lowerArmJoint_L, globalSpeed, 0.7f * globalDegree, true, -0.6f, 0, flapFrame, 1);
            flap(handJoint_L, globalSpeed, 0.6f * globalDegree, true, -1.2f, 0, flapFrame, 1);

            flap(backWing_R, globalSpeed, 1f * globalDegree, false, -0.5f, -0.2f, flapFrame, 1);
            flap(backWing_L, globalSpeed, 1f * globalDegree, true, -0.5f, -0.2f, flapFrame, 1);
        }

        jawControls();
        wingFoldControls();
        computeWingWebbing();
    }

    private void jawControls() {
        teethUpper.setScale(1, 1, 0.5f + 0.5f * Math.min(jaw.rotateAngleX, 1));
        underHead.setScale(1, 1, 1f - 0.2f * Math.min(jaw.rotateAngleX, 1));
        underHead.rotationPointZ += 1.2 * Math.min(jaw.rotateAngleX, 1);
    }

    private void wingFoldControls() {
        shoulder1_R.rotateAngleY += 0.8 * wingFolder.rotationPointX;
        upperArm_R.rotateAngleY += 0.3 * wingFolder.rotationPointX;
        lowerArm_R.rotateAngleY -= 2.7 * wingFolder.rotationPointX;
        hand_R.rotateAngleY += 1.8 * wingFolder.rotationPointX;
        wingFrame1_R.rotateAngleY += 0.8 * wingFolder.rotationPointX;
        wingFrame2_R.rotateAngleY += 0.3 * wingFolder.rotationPointX;
        wingFrame3_R.rotateAngleY -= 0.2 * wingFolder.rotationPointX;
        wingFrame4_R.rotateAngleY -= 0.7 * wingFolder.rotationPointX;

        shoulder1_L.rotateAngleY -= 0.8 * wingFolder.rotationPointY;
        upperArm_L.rotateAngleY -= 0.3 * wingFolder.rotationPointY;
        lowerArm_L.rotateAngleY += 2.7 * wingFolder.rotationPointY;
        hand_L.rotateAngleY -= 1.8 * wingFolder.rotationPointY;
        wingFrame1_L.rotateAngleY -= 0.8 * wingFolder.rotationPointY;
        wingFrame2_L.rotateAngleY -= 0.3 * wingFolder.rotationPointY;
        wingFrame3_L.rotateAngleY += 0.2 * wingFolder.rotationPointY;
        wingFrame4_L.rotateAngleY += 0.7 * wingFolder.rotationPointY;
    }

    private void modelCorrections() {
        backWing_R.rotationPointX -= 2;
        backWing_L.rotationPointX += 2;
        teethLower.setScale(1.01f, 1.01f, 1.01f);
        spike2joint.scaleChildren = true;
        spike2joint.setScale(0.99f, 1, 1);
        spike2joint.rotationPointY += 0.28;
        spike2joint.rotationPointZ -= 0.15;
        spike3joint.scaleChildren = true;
        spike3joint.setScale(0.99f, 1, 1);
        spike3joint.rotationPointY += 0.28;
        spike3joint.rotationPointZ -= 0.15;
        spike3Bottom.setScale(1, 1.8f, 1);
        spike4joint.scaleChildren = true;
        spike4joint.setScale(0.993f, 1, 1);
        spike4joint.rotationPointY += 0.35;
        spike4joint.rotationPointZ += 0.7;
        spike4.setScale(1, 1f, 1);
        spike5joint.scaleChildren = true;
        spike5joint.setScale(1.02f, 1, 1);
        spike5joint.rotationPointY += 0.15;
        spike5joint.rotationPointZ -= 0.42;
        tail1.setScale(1.03f, 1, 1);
//        root.rotationPointY += 28;

        backFin1.rotationPointX += 0.001;
        backFin1Reversed.rotationPointX -= 0.002;
        backFin2.rotationPointX += 0.0005;
        backFin2Reversed.rotationPointX -= 0.001;
    }

    private void computeWingWebbing() {
        wingWebbing1_L.scaleChildren = true;
        wingWebbing2_L.scaleChildren = true;
        wingWebbing3_L.scaleChildren = true;
        wingWebbing4_L.scaleChildren = true;
        wingWebbing5_L.scaleChildren = true;
        wingWebbing6_L.scaleChildren = true;
        wingWebbing1_R.scaleChildren = true;
        wingWebbing2_R.scaleChildren = true;
        wingWebbing3_R.scaleChildren = true;
        wingWebbing4_R.scaleChildren = true;
        wingWebbing6_R.scaleChildren = true;
        wingWebbing5_R.scaleChildren = true;
        float webbing1LScale = (float) ((wingFrame1_L.rotateAngleY - wingFrame2_L.rotateAngleY)/(Math.toRadians(35)));
        webbing1LScale = 0.8f * webbing1LScale + 0.2f;
        float webbing1LRot = (float) (-(wingFrame1_L.rotateAngleY - (wingFrame2_L.rotateAngleY + Math.toRadians(35)))/2);
        wingWebbing1_L.rotateAngleY += webbing1LRot;
        wingWebbing1_L.setScale(1 - webbing1LScale * 0.07f, 1, webbing1LScale);
        float webbing2LScale = (float) ((wingFrame2_L.rotateAngleY - wingFrame3_L.rotateAngleY)/(Math.toRadians(35)));
        webbing2LScale = 0.8f * webbing2LScale + 0.2f;
        float webbing2LRot = (float) (-(wingFrame2_L.rotateAngleY - (wingFrame3_L.rotateAngleY + Math.toRadians(35)))/2);
        wingWebbing2_L.rotateAngleY += webbing2LRot;
        wingWebbing2_L.setScale(1 - webbing2LScale * 0.07f, 1, webbing2LScale);
        float webbing3LScale = (float) ((wingFrame3_L.rotateAngleY - wingFrame4_L.rotateAngleY)/(Math.toRadians(35)));
        webbing3LScale = 0.8f * webbing3LScale + 0.2f;
        float webbing3LRot = (float) (-(wingFrame3_L.rotateAngleY - (wingFrame4_L.rotateAngleY + Math.toRadians(35)))/2);
        wingWebbing3_L.rotateAngleY += webbing3LRot;
        wingWebbing3_L.setScale(1 - webbing3LScale * 0.07f, 1, webbing3LScale);
        float webbing4LScale = 1 - (float) (-0.5 * hand_L.rotateAngleY);
        float webbing4LRot = (float) (-(wingFrame4_L.rotateAngleY + hand_L.rotateAngleY + Math.toRadians(105))/2);
        wingWebbing4_L.rotateAngleY += webbing4LRot;
        wingWebbing4_L.setScale(1 - webbing4LScale * 0.02f, 1, webbing4LScale);
        wingWebbing5_L.rotationPointX += 12 * (float) (upperArm_L.rotateAngleY/Math.toRadians(35));
        wingWebbing5_L.setScale((float) (2 - (-shoulder1_L.rotateAngleY + shoulder1_L.defaultRotationY)/1.5), 1, (float) (0.915 - (-shoulder1_L.rotateAngleY + shoulder1_L.defaultRotationY)/1.2));
        wingWebbing6_L.setScale((float) (1 + (-shoulder1_L.rotateAngleY + shoulder1_L.defaultRotationY)/4), 1, (float) (1 - (-shoulder1_L.rotateAngleY + shoulder1_L.defaultRotationY)/1.6));
        wingWebbing6_L.rotationPointX += 14 * (-shoulder1_L.rotateAngleY + shoulder1_L.defaultRotationY);

        float webbing1RScale = (float) (-(wingFrame1_R.rotateAngleY - wingFrame2_R.rotateAngleY)/(Math.toRadians(35)));
        webbing1RScale = 0.8f * webbing1RScale + 0.2f;
        float webbing1RRot = (float) (-(wingFrame1_R.rotateAngleY - (wingFrame2_R.rotateAngleY - Math.toRadians(35)))/2);
        wingWebbing1_R.rotateAngleY += webbing1RRot;
        wingWebbing1_R.setScale(1 - webbing1RScale * 0.07f, 1, webbing1RScale);
        float webbing2RScale = (float) (-(wingFrame2_R.rotateAngleY - wingFrame3_R.rotateAngleY)/(Math.toRadians(35)));
        webbing2RScale = 0.8f * webbing2RScale + 0.2f;
        float webbing2RRot = (float) (-(wingFrame2_R.rotateAngleY - (wingFrame3_R.rotateAngleY - Math.toRadians(35)))/2);
        wingWebbing2_R.rotateAngleY += webbing2RRot;
        wingWebbing2_R.setScale(1 - webbing2RScale * 0.07f, 1, webbing2RScale);
        float webbing3RScale = (float) (-(wingFrame3_R.rotateAngleY - wingFrame4_R.rotateAngleY)/(Math.toRadians(35)));
        webbing3RScale = 0.8f * webbing3RScale + 0.2f;
        float webbing3RRot = (float) (-(wingFrame3_R.rotateAngleY - (wingFrame4_R.rotateAngleY - Math.toRadians(35)))/2);
        wingWebbing3_R.rotateAngleY += webbing3RRot;
        wingWebbing3_R.setScale(1 - webbing3RScale * 0.07f, 1, webbing3RScale);
        float webbing4RScale = 1 - (float) (0.5 * hand_R.rotateAngleY);
        float webbing4RRot = (float) (-(wingFrame4_R.rotateAngleY + hand_R.rotateAngleY - Math.toRadians(105))/2);
        wingWebbing4_R.rotateAngleY += webbing4RRot;
        wingWebbing4_R.setScale(1 - webbing4RScale * 0.02f, 1, webbing4RScale);
        wingWebbing5_R.rotationPointX -= 12 * (float) (-upperArm_R.rotateAngleY/Math.toRadians(35));
        wingWebbing5_R.setScale((float) (2 - (shoulder1_R.rotateAngleY - shoulder1_R.defaultRotationY)/1.5), 1, (float) (0.915 - (shoulder1_R.rotateAngleY - shoulder1_R.defaultRotationY)/1.2));
        wingWebbing6_R.setScale((float) (1 + (shoulder1_R.rotateAngleY - shoulder1_R.defaultRotationY)/4), 1, (float) (1 - (shoulder1_R.rotateAngleY - shoulder1_R.defaultRotationY)/1.6));
        wingWebbing6_R.rotationPointX += 14 * (shoulder1_L.rotateAngleY - shoulder1_L.defaultRotationY);

//        wingWebbing4_L.rotateAngleX -= 0.9/2 * (lowerArmJoint_L.rotateAngleZ + handJoint_L.rotateAngleZ * 2);
//        wingWebbing4_L.rotateAngleZ += 0.5/2 * (lowerArmJoint_L.rotateAngleZ + handJoint_L.rotateAngleZ * 2);
//        wingWebbing4_R.rotateAngleX -= 0.9/2 * (-lowerArmJoint_R.rotateAngleZ - handJoint_R.rotateAngleZ * 2);
//        wingWebbing4_R.rotateAngleZ -= 0.5/2 * (-lowerArmJoint_R.rotateAngleZ - handJoint_R.rotateAngleZ * 2);

        wingWebbing4_R.rotationPointY -= 0.01f;
        wingWebbing4_L.rotationPointY -= 0.01f;
        wingWebbing5_R.rotationPointY += 0.01f;
        wingWebbing5_L.rotationPointY += 0.01f;

        tailFinReversed.rotationPointY -= 0.02f;

        if (tailDynamic[0] != null) {
            backFin1.setScale(1, 1, 1 - 0.5f * tailDynamic[0].rotateAngleX);
            backFin1.scaleChildren = true;
            backFin1.rotationPointX += 0.002;
            backFin1Reversed.rotationPointX -= 0.004;

            backFin2.setScale(1, 1, 1 - 0.2f * tailDynamic[1].rotateAngleX);
            backFin2.scaleChildren = true;
            backFin2.rotationPointX += 0.001;
            backFin2Reversed.rotationPointX -= 0.002;
        }
    }
}