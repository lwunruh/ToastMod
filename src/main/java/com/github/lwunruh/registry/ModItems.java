package com.github.lwunruh.registry;

import com.github.lwunruh.ToastMod;
import com.github.lwunruh.items.BreadKnifeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import sun.awt.CustomCursor;

public class ModItems {

    //Toast Items
    public static final Item SLICED_BREAD = new Item(new FabricItemSettings().group(ToastMod.Toast)
            .food((new FoodComponent.Builder()).alwaysEdible().snack().hunger(2).saturationModifier(2.0F).build()));
    public static final Item LIGHT_TOAST = new Item(new FabricItemSettings().group(ToastMod.Toast)
            .food((new FoodComponent.Builder()).alwaysEdible().snack().hunger(3).saturationModifier(2.0F).build()));
    public static final Item MEDIUM_TOAST = new Item(new FabricItemSettings().group(ToastMod.Toast)
            .food((new FoodComponent.Builder()).alwaysEdible().snack().hunger(3).saturationModifier(2.0F).build()));
    public static final Item BURNT_TOAST = new Item(new FabricItemSettings().group(ToastMod.Toast)
            .food((new FoodComponent.Builder()).alwaysEdible().snack().hunger(2).saturationModifier(2.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 300, 0), 1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 60, 0), 0.5F)
                    .build()));

    //Spreads

    //Toast Tools
    public static final BreadKnifeItem BREAD_KNIFE = new BreadKnifeItem(ToolMaterials.IRON, 4, 0.7F,
                new FabricItemSettings().group(ToastMod.Toast).maxDamage(64).recipeRemainder(ModItems.BREAD_KNIFE));

    //Block Items
    //public static final BlockItem PRESERVE_BARREL = new BlockItem(ModBlocks.PRESERVE_BARREL, new Item.Settings().group(ToastMod.Toast));


    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(ToastMod.MOD_ID, "sliced_bread"), SLICED_BREAD);
        Registry.register(Registry.ITEM, new Identifier(ToastMod.MOD_ID, "light_toast"), LIGHT_TOAST);
        Registry.register(Registry.ITEM, new Identifier(ToastMod.MOD_ID, "medium_toast"), MEDIUM_TOAST);
        Registry.register(Registry.ITEM, new Identifier(ToastMod.MOD_ID, "burnt_toast"), BURNT_TOAST);
        Registry.register(Registry.ITEM, new Identifier(ToastMod.MOD_ID, "bread_knife"), BREAD_KNIFE);
        //Registry.register(Registry.ITEM, new Identifier(ToastMod.MOD_ID, "preserve_barrel"), PRESERVE_BARREL);
    }
}
