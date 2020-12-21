
package net.mcreator.teufoxadditions.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.teufoxadditions.block.Floofy_WoodPlanksBlock;
import net.mcreator.teufoxadditions.TeufoxAdditionsModElements;

@TeufoxAdditionsModElements.ModElement.Tag
public class FloofyTabItemGroup extends TeufoxAdditionsModElements.ModElement {
	public FloofyTabItemGroup(TeufoxAdditionsModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabfloofy_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Floofy_WoodPlanksBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
