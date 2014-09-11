package ninja.usefulbits.init;

import cpw.mods.fml.common.registry.GameRegistry;
import ninja.usefulbits.block.BlockDarkenedBlock;
import ninja.usefulbits.block.BlockUB;
import ninja.usefulbits.reference.Names;

/*@author ViolentNinjaD

  Licensed under LGPL V3

*/
public class UBBlocks 
{
    public static final BlockUB darkenedBlock = new BlockDarkenedBlock();

    public static void init()
    {
        GameRegistry.registerBlock(darkenedBlock, Names.Blocks.DARKENED_BLOCK);
    }
}
