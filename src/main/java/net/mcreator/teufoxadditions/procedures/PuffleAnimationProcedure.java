package net.mcreator.teufoxadditions.procedures;

import software.bernie.geckolib.entity.IAnimatedEntity;
import software.bernie.geckolib.animation.builder.AnimationBuilder;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.entity.Entity;

import net.mcreator.teufoxadditions.TeufoxAdditionsModElements;

import java.util.Map;

@TeufoxAdditionsModElements.ModElement.Tag
public class PuffleAnimationProcedure extends TeufoxAdditionsModElements.ModElement {
	public PuffleAnimationProcedure(TeufoxAdditionsModElements instance) {
		super(instance, 27);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure PuffleAnimation!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.isSprinting())) {
			if (entity instanceof IAnimatedEntity) {
				new Object() {
					@OnlyIn(Dist.CLIENT)
					void playAnimation(Entity entity, String animationID) {
						IAnimatedEntity aniEntity = (IAnimatedEntity) entity;
						aniEntity.getAnimationManager().get("controller").setAnimation(new AnimationBuilder().addRepeatingAnimation(animationID, 3));
					}
				}.playAnimation(entity, "animation.puffle.walking");
			}
		} else {
			if (entity instanceof IAnimatedEntity) {
				new Object() {
					@OnlyIn(Dist.CLIENT)
					void playAnimation(Entity entity, String animationID) {
						IAnimatedEntity aniEntity = (IAnimatedEntity) entity;
						aniEntity.getAnimationManager().get("controller").setAnimation(new AnimationBuilder().addRepeatingAnimation(animationID, 3));
					}
				}.playAnimation(entity, "animation.puffle.idle");
			}
		}
	}
}
