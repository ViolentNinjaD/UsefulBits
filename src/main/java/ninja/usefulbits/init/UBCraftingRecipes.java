package ninja.usefulbits.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*@author ViolentNinjaD

  Licensed under LGPL V3

*/
public class UBCraftingRecipes 
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(UBBlocks.darkenedBlock, 1), "ddd", "ddd", "ddd", 'd', UBItems.darkenedIngot);
        GameRegistry.addRecipe(new ItemStack(UBItems.darkenedIngot, 1), "id ", "   ", "   ", 'd', Items.iron_ingot, 'i', new ItemStack(Items.dye, 1, 0));
    }
}
