package org.devoxx4kids.quebec;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MyRecipeBook {

    public MyRecipeBook() {
        GameRegistry.addRecipe(new ItemStack(Items.apple),
                "X ",
                "  ",
                'X', Blocks.dirt
        );

        GameRegistry.addRecipe(new ItemStack(Items.bed),
                "X ",
                " Y",
                'X', Blocks.dirt, 'Y', Blocks.sand
        );
    }
}
