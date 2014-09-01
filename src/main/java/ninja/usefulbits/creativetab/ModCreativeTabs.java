package ninja.usefulbits.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ninja.usefulbits.UsefulBits;
import ninja.usefulbits.init.UBItems;

/*@author ViolentNinjaD

  Licensed under LGPL V3

*/
public class ModCreativeTabs 
{
    public static final CreativeTabs GENERAL_TAB = new CreativeTabs(UsefulBits.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return UBItems.darkenedIngot;
        }
    };
}
