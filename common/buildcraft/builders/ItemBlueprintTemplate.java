/** Copyright (c) 2011-2015, SpaceToad and the BuildCraft Team http://www.mod-buildcraft.com
 *
 * BuildCraft is distributed under the terms of the Minecraft Mod Public License 1.0, or MMPL. Please check the contents
 * of the license located in http://www.mod-buildcraft.com/MMPL-1.0.txt */
package buildcraft.builders;

import net.minecraft.item.ItemStack;

import buildcraft.api.enums.EnumBlueprintType;

public class ItemBlueprintTemplate extends ItemBlueprint {
    public ItemBlueprintTemplate() {
        super();
        setTextureLocation("buildcraftbuilders:template/");
    }

    @Override
    public EnumBlueprintType getType(ItemStack stack) {
        return EnumBlueprintType.TEMPLATE;
    }
}
