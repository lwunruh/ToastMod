package com.github.lwunruh.items;

import com.github.lwunruh.registry.ModItems;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class SliceBreadHelper {

    public static ItemStack getSlicedBread(PlayerEntity user, Item bread){
        int fire_aspect_level = EnchantmentHelper.getFireAspect(user);
        ItemStack new_stack;

        switch(fire_aspect_level){
            case 0:
                if(bread == ModItems.PUMPKIN_BREAD){new_stack = new ItemStack(ModItems.SLICED_PUMPKIN_BREAD, 4);}
                else if(bread == ModItems.BERRY_BREAD){new_stack = new ItemStack(ModItems.SLICED_BERRY_BREAD, 4);}
                else{new_stack = new ItemStack(ModItems.SLICED_BREAD, 4);}
                break;
            case 1:
                if(bread == ModItems.PUMPKIN_BREAD){new_stack = new ItemStack(ModItems.LIGHT_PUMPKIN_TOAST, 4);}
                else if(bread == ModItems.BERRY_BREAD){new_stack = new ItemStack(ModItems.LIGHT_BERRY_TOAST, 4);}
                else{new_stack = new ItemStack(ModItems.LIGHT_TOAST, 4);}
                break;
            case 2:
                if(bread == ModItems.PUMPKIN_BREAD){new_stack = new ItemStack(ModItems.MEDIUM_PUMPKIN_TOAST, 4);}
                else if(bread == ModItems.BERRY_BREAD){new_stack = new ItemStack(ModItems.MEDIUM_BERRY_TOAST, 4);}
                else{new_stack = new ItemStack(ModItems.MEDIUM_TOAST, 4);}
                break;
            default:
                new_stack = new ItemStack(ModItems.SLICED_BREAD, 4);break;
        }
        return new_stack;
    }
}
