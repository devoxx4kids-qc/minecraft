package org.devoxx4kids.quebec.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.devoxx4kids.quebec.MainMod;

public class MyItem extends Item {

    private String name = "myItem" ;

    public MyItem() {
        GameRegistry.registerItem (this , name);
        setUnlocalizedName(MainMod.MODID + "_" + name);
        setCreativeTab(CreativeTabs.tabMisc);
    }
}
