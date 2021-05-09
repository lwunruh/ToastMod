package com.github.lwunruh.registry;

import com.github.lwunruh.ToastMod;
import com.github.lwunruh.items.BreadKnifeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import sun.awt.CustomCursor;

public class ModItems {

    //Toast Items
    public static final Item SLICED_BREAD = new Item(new FabricItemSettings().group(ToastMod.Toast)
            .food((new FoodComponent.Builder()).alwaysEdible().snack().hunger(2).saturationModifier(2.0F).build()));
    public static final Item LIGHT_TOAST = new Item(new FabricItemSettings().group(ToastMod.Toast)
            .food((new FoodComponent.Builder()).alwaysEdible().snack().hunger(2).saturationModifier(2.0F).build()));
    public static final Item MEDIUM_TOAST = new Item(new FabricItemSettings().group(ToastMod.Toast)
            .food((new FoodComponent.Builder()).alwaysEdible().snack().hunger(2).saturationModifier(2.0F).build()));
    public static final Item BURNT_TOAST = new Item(new FabricItemSettings().group(ToastMod.Toast)
            .food((new FoodComponent.Builder()).alwaysEdible().snack().hunger(2).saturationModifier(2.0F).build()));

    //Toast Tools
    public static final BreadKnifeItem BREAD_KNIFE = new BreadKnifeItem(ToolMaterials.IRON, 4, 0.7F,
                new FabricItemSettings().group(ToastMod.Toast).maxDamage(64).recipeRemainder(ModItems.BREAD_KNIFE));


    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(ToastMod.MOD_ID, "sliced_bread"), SLICED_BREAD);
        Registry.register(Registry.ITEM, new Identifier(ToastMod.MOD_ID, "light_toast"), LIGHT_TOAST);
        Registry.register(Registry.ITEM, new Identifier(ToastMod.MOD_ID, "medium_toast"), MEDIUM_TOAST);
        Registry.register(Registry.ITEM, new Identifier(ToastMod.MOD_ID, "burnt_toast"), BURNT_TOAST);
        Registry.register(Registry.ITEM, new Identifier(ToastMod.MOD_ID, "bread_knife"), BREAD_KNIFE);
    }
}
