package org.devoxx4kids.quebec.item;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.devoxx4kids.quebec.MainMod;

public class Ovomaltine extends ItemFood {

    private String name = "ovomaltine" ;

    public Ovomaltine(int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);

        setPotionEffect(Potion.moveSpeed.id, 15, 2, 1f);

        GameRegistry.registerItem (this , name);
        setUnlocalizedName(MainMod.MODID + "_" + name);
        setCreativeTab(CreativeTabs.tabMisc);
    }
}
