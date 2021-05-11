package com.github.lwunruh.items;

import com.github.lwunruh.registry.ModItems;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.FireAspectEnchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.function.Consumer;

public class BreadKnifeItem extends SwordItem {
    public BreadKnifeItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }


    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack offhand = user.getOffHandStack();
        ItemStack mainhand = user.getMainHandStack();
        Item item = offhand.getItem();

        if(item.equals(Items.BREAD) || item.equals(ModItems.BERRY_BREAD) || item.equals(ModItems.PUMPKIN_BREAD)){
            ItemStack new_bread = SliceBreadHelper.getSlicedBread(user, item);

            if(offhand.getCount() == 1) {
                user.equipStack(EquipmentSlot.OFFHAND, new_bread);
            } else {
                user.giveItemStack(new_bread);
                offhand.decrement(1);
            }

            postUse(mainhand, (LivingEntity)user);
            return TypedActionResult.success(mainhand);
        }
        else if (this.isFood()) {
            ItemStack itemStack = user.getStackInHand(hand);
            if (user.canConsume(this.getFoodComponent().isAlwaysEdible())) {
                user.setCurrentHand(hand);
                return TypedActionResult.consume(itemStack);
            } else {
                return TypedActionResult.fail(itemStack);
            }
        }
        else {
            return TypedActionResult.pass(mainhand);
        }
    }

    public void postUse(ItemStack stack, LivingEntity user) {
        stack.damage(1, (LivingEntity)user, (Consumer<LivingEntity>)((e) -> {
            e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
        }));
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        return this.isFood() ? user.eatFood(world, stack) : stack;
    }

    @Override
    public boolean hasRecipeRemainder() {
        return super.hasRecipeRemainder();
    }
}
