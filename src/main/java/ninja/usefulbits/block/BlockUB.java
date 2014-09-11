package ninja.usefulbits.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.world.World;
import ninja.usefulbits.creativetab.ModCreativeTabs;
import ninja.usefulbits.reference.Textures;

/*@author ViolentNinjaD

  Licensed under LGPL V3

*/
public class BlockUB extends Block
{
    public BlockUB()
    {
        this(Material.rock);
    }

    public BlockUB(Material material)
    {
        super(material);
        this.setCreativeTab(ModCreativeTabs.GENERAL_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Textures.PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
