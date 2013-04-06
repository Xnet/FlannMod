// Coded by Flann

package mods.flann.src;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class Flann_ItemWireCutter extends ItemTool
{
	public String tex;
	
	private static Block blocksEffectiveAgainst[];
	
    protected Flann_ItemWireCutter(int par1, String t, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, 2, par2EnumToolMaterial, blocksEffectiveAgainst);
		tex = t;
		setCreativeTab(FlannModCore.flanntab);
	}
    
    @Override
	@SideOnly(Side.CLIENT) //Makes sure that only the client side can call this method
	public void updateIcons(IconRegister IR){
		this.iconIndex = IR.registerIcon(FlannModCore.modid + ":" + tex);
	}

    /*
     * Returns if the item (tool) can harvest results from the block type.
     */
    @Override
    public boolean canHarvestBlock(Block par1Block)
    {
        if (par1Block == FlannModCore.barbedWire)
        {
        	return true;
        }
        return par1Block.blockMaterial == Flann_Material.iron2;
    }

    /*
     * Returns the strength of the stack against a given block. 1.0F base, (Quality+1)*2 if correct blocktype, 1.5F if
     * sword
     */
    @Override
    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
        if (par2Block != null && (par2Block == FlannModCore.barbedWire))
        {
            return 800F ; //efficiencyOnProperMaterial;
        }
        else
        {
            return super.getStrVsBlock(par1ItemStack, par2Block);
        }
    }

    static
    {
    	blocksEffectiveAgainst = (new Block[]
    			{FlannModCore.barbedWire});
    }
}