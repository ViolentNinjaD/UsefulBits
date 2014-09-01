package ninja.usefulbits.init;

import cpw.mods.fml.common.registry.GameRegistry;
import ninja.usefulbits.item.ItemDarkenedIngot;
import ninja.usefulbits.item.ItemUB;
import ninja.usefulbits.reference.Names;

/*@author ViolentNinjaD

  Licensed under LGPL V3

*/
public class UBItems 
{
    public static final ItemUB darkenedIngot = new ItemDarkenedIngot();

    public static void init()
    {
        GameRegistry.registerItem(darkenedIngot, Names.Items.DARKENED_INGOT);
    }
}
