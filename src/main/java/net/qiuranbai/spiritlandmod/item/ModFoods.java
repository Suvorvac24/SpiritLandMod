package net.qiuranbai.spiritlandmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties COOKED_SAUSAGE = new FoodProperties.Builder().nutrition(4)
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 1).build();
    public static final FoodProperties RAW_SAUSAGE = new FoodProperties.Builder().nutrition(1)
            .saturationMod(0.1f).build();
}
