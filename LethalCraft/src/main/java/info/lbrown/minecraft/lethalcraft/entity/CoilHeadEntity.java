package info.lbrown.minecraft.lethalcraft.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

public class CoilHeadEntity extends HostileEntity {

    public CoilHeadEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));

//        this.goalSelector.add(1, )
    }

    public static DefaultAttributeContainer.Builder createCoilHeadAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 100)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.8f)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 9);
    }

}
