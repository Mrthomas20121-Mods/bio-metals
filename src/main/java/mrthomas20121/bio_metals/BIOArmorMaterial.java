package mrthomas20121.bio_metals;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public enum BIOArmorMaterial implements IArmorMaterial {

    NETHERITE_STEEL("netherite_steel", 37, new int[]{4, 7, 9, 4}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.2F, () -> {
        return Ingredient.of(BioRegistry.netherite_steel_ingot);
    }),
    TUNGSTEN_STEEL("tungsten_steel", 25, new int[]{2, 5, 7, 2}, 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.1F, () -> {
        return Ingredient.of(BioRegistry.tungsten_steel_ingot);
    }),
    ZIRCALOY("zircaloy", 10, new int[]{2, 4, 6, 2}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.1F, () -> {
        return Ingredient.of(BioRegistry.zircaloy_ingot);
    }),
    BERYLLIUM_COPPER("beryllium_copper", 20, new int[]{3, 6, 8, 3}, 22, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.1F, () -> {
        return Ingredient.of(BioRegistry.beryllium_copper_ingot);
    });

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairIngredient;

    BIOArmorMaterial(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = new LazyValue<>(repairIngredient);
    }

    public int getDurabilityForSlot(EquipmentSlotType slot) {
        return HEALTH_PER_SLOT[slot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlotType p_200902_1_) {
        return this.slotProtections[p_200902_1_.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Nonnull
    public SoundEvent getEquipSound() {
        return this.sound;
    }

    @Nonnull
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Nonnull
    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
