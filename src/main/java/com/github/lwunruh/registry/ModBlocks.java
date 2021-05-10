package com.github.lwunruh.registry;

import jdk.nashorn.internal.ir.Block;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BarrelBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks{

    //public static final BarrelBlock PRESERVE_BARREL = new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(2.5F).sounds(BlockSoundGroup.WOOD));

    public void registerBlocks(){

        //Registry.register(Registry.BLOCK, new Identifier("preserve_barrel"), PRESERVE_BARREL);
    }
}
