
package net.mcreator.teufoxadditions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.teufoxadditions.TeufoxAdditionsModElements;

import java.util.List;

import com.google.common.collect.Multimap;

@TeufoxAdditionsModElements.ModElement.Tag
public class ChiselItem extends TeufoxAdditionsModElements.ModElement {
	@ObjectHolder("teufox_additions:chisel")
	public static final Item block = null;
	public ChiselItem(TeufoxAdditionsModElements instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemToolCustom() {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("Use on planks to make gears."));
			}
		}.setRegistryName("chisel"));
	}
	private static class ItemToolCustom extends Item {
		protected ItemToolCustom() {
			super(new Item.Properties().group(ItemGroup.TOOLS).maxDamage(100));
		}

		@Override
		public float getDestroySpeed(ItemStack itemstack, BlockState blockstate) {
			if (blockstate.getBlock() == Blocks.ACACIA_LOG.getDefaultState().getBlock())
				return 4f;
			if (blockstate.getBlock() == Blocks.OAK_LOG.getDefaultState().getBlock())
				return 4f;
			if (blockstate.getBlock() == Blocks.OAK_PLANKS.getDefaultState().getBlock())
				return 4f;
			if (blockstate.getBlock() == Blocks.JUNGLE_PLANKS.getDefaultState().getBlock())
				return 4f;
			if (blockstate.getBlock() == Blocks.ACACIA_PLANKS.getDefaultState().getBlock())
				return 4f;
			if (blockstate.getBlock() == Blocks.DARK_OAK_PLANKS.getDefaultState().getBlock())
				return 4f;
			if (blockstate.getBlock() == Blocks.OAK_PLANKS.getDefaultState().getBlock())
				return 4f;
			if (blockstate.getBlock() == Blocks.SPRUCE_PLANKS.getDefaultState().getBlock())
				return 4f;
			if (blockstate.getBlock() == Blocks.DARK_OAK_PLANKS.getDefaultState().getBlock())
				return 4f;
			return 1;
		}

		@Override
		public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving) {
			stack.damageItem(1, entityLiving, i -> i.sendBreakAnimation(EquipmentSlotType.MAINHAND));
			return true;
		}

		@Override
		public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
			stack.damageItem(2, attacker, i -> i.sendBreakAnimation(EquipmentSlotType.MAINHAND));
			return true;
		}

		@Override
		public int getItemEnchantability() {
			return 2;
		}

		@Override
		public Multimap<String, AttributeModifier> getAttributeModifiers(EquipmentSlotType equipmentSlot) {
			Multimap<String, AttributeModifier> multimap = super.getAttributeModifiers(equipmentSlot);
			if (equipmentSlot == EquipmentSlotType.MAINHAND) {
				multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(),
						new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Tool modifier", 2f, AttributeModifier.Operation.ADDITION));
				multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(),
						new AttributeModifier(ATTACK_SPEED_MODIFIER, "Tool modifier", -3, AttributeModifier.Operation.ADDITION));
			}
			return multimap;
		}
	}
}
