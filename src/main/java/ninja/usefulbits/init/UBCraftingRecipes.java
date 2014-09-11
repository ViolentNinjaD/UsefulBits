package ninja.usefulbits.init;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import violentninjad.violentapi.api.CraftingHelper;

/*@author ViolentNinjaD

  Licensed under LGPL V3

*/
public class UBCraftingRecipes 
{
    public static void init()
    {
        CraftingHelper.standard(new ItemStack(UBBlocks.darkenedBlock, 1), "ddd", "ddd", "ddd", 'd', UBItems.darkenedIngot);
        CraftingHelper.standard(new ItemStack(UBItems.darkenedIngot, 1), "id ", "   ", "   ", 'd', Items.iron_ingot, 'i', new ItemStack(Items.dye, 1, 0));
    }
}
