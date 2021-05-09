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

	public static final ItemGroup Toast = FabricItemGroupBuilder.build(
			new Identifier(MOD_ID, "toast_items"),
			() -> new ItemStack(ModItems.MEDIUM_TOAST)
	);

	@Override
	public void onInitialize() {
		ModItems.registerItems();
	}
}

