package mrthomas20121.bio_metals;

import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public enum ItemTiers implements IItemTier {

    BERYLLIUM_COPPER(3, 400, 6.0f, 2.0f, 22, () -> {
        return Ingredient.of(new ItemStack(BioRegistry.beryllium_copper_ingot));
    }),
    NETHERITE_STEEL(4, 2031, 9.5F, 4.5F, 15, () -> {
        return Ingredient.of(new ItemStack(BioRegistry.netherite_steel_ingot));
    }),
    ZIRCALOY(2, 300, 5.5F, 2.5f, 10, () -> {
        return Ingredient.of(new ItemStack(BioRegistry.zircaloy_ingot));
    }),
    TUNGSTEN_STEEL(3, 1600, 9.5F, 4.5F, 10, () -> {
        return Ingredient.of(new ItemStack(BioRegistry.netherite_steel_ingot));
    });;

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyValue<Ingredient> repairIngredient;

    ItemTiers(int level, int uses, float speed, float damage, int enchant, Supplier<Ingredient> ingredientSupplier) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchant;
        this.repairIngredient = new LazyValue<>(ingredientSupplier);
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    @Nonnull
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
