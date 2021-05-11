package com.github.lwunruh;

import com.github.lwunruh.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ToastMod implements ModInitializer {

	public static final String MOD_ID = "toastmod";

	public static final ItemGroup Toast = FabricItemGroupBuilder.create(
			new Identifier(ToastMod.MOD_ID, "toast_items"))
			.icon(() -> new ItemStack(ModItems.LIGHT_TOAST))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(ModItems.BREAD_KNIFE));
				stacks.add(new ItemStack(Items.BREAD));
				stacks.add(new ItemStack(ModItems.BERRY_BREAD));
				stacks.add(new ItemStack(ModItems.PUMPKIN_BREAD));
				stacks.add(new ItemStack(ModItems.SLICED_BREAD));
				stacks.add(new ItemStack(ModItems.SLICED_BERRY_BREAD));
				stacks.add(new ItemStack(ModItems.SLICED_PUMPKIN_BREAD));
				stacks.add(new ItemStack(ModItems.LIGHT_TOAST));
				stacks.add(new ItemStack(ModItems.LIGHT_BERRY_TOAST));
				stacks.add(new ItemStack(ModItems.LIGHT_PUMPKIN_TOAST));
				stacks.add(new ItemStack(ModItems.MEDIUM_TOAST));
				stacks.add(new ItemStack(ModItems.MEDIUM_BERRY_TOAST));
				stacks.add(new ItemStack(ModItems.MEDIUM_PUMPKIN_TOAST));
				stacks.add(new ItemStack(ModItems.BURNT_TOAST));
				stacks.add(new ItemStack(ModItems.BURNT_BERRY_TOAST));
				stacks.add(new ItemStack(ModItems.BURNT_PUMPKIN_TOAST));
			})
			.build();

	@Override
	public void onInitialize() {
		ModItems.registerItems();
	}
}

