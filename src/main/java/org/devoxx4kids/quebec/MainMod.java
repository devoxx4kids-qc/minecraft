package org.devoxx4kids.quebec;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import org.devoxx4kids.quebec.item.MyItem;
import org.devoxx4kids.quebec.item.Ovomaltine;

@Mod(modid = MainMod.MODID, version = MainMod.VERSION)
public class MainMod {

    public static final String MODID = "devoxx4kids_quebec";
    public static final String VERSION = "1.0";

    @EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new MyRecipeBook());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        MyItem item = new MyItem();
        Ovomaltine ovomaltine = new Ovomaltine(20, 0.3F, true);

        if (event.getSide() == Side. CLIENT) {
            RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
            renderItem.getItemModelMesher().register(item, 0, new ModelResourceLocation(MODID + ":" + "myItem" , "inventory"));
            renderItem.getItemModelMesher().register(ovomaltine, 0, new ModelResourceLocation(MODID + ":" + "ovomaltine" , "inventory"));

            GameRegistry.addRecipe(new ItemStack(item),
                    "X ",
                    "X ",
                    'X', Blocks.dirt);

            GameRegistry.addRecipe(new ItemStack(ovomaltine),
                    "X ",
                    " X",
                    'X', Blocks.dirt);


        }
    }
}
