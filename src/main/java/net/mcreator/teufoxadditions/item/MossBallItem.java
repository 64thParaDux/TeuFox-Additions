
package net.mcreator.teufoxadditions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.teufoxadditions.itemgroup.FloofyTabItemGroup;
import net.mcreator.teufoxadditions.TeufoxAdditionsModElements;

import java.util.List;

@TeufoxAdditionsModElements.ModElement.Tag
public class MossBallItem extends TeufoxAdditionsModElements.ModElement {
	@ObjectHolder("teufox_additions:moss_ball")
	public static final Item block = null;
	public MossBallItem(TeufoxAdditionsModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(FloofyTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("moss_ball");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Craft with Iron to progress."));
		}
	}
}
