package com.kutil.kutilsigns.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SloupBlock extends Block {

    public SloupBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(2f, 3f)
                .sound(SoundType.METAL)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
