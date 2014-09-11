package ninja.usefulbits.block;

import ninja.usefulbits.reference.Names;

/*@author ViolentNinjaD

  Licensed under LGPL V3

*/
public class BlockDarkenedBlock extends BlockUB
{
    public BlockDarkenedBlock()
    {
        super();
        this.setHardness(5.0F);
        this.setResistance(12.0F);
        this.setBlockName(Names.Blocks.DARKENED_BLOCK);
    }
}
