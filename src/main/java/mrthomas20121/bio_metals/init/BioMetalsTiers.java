package mrthomas20121.bio_metals.init;

import mrthomas20121.biolib.item.tool.BioTier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class BioMetalsTiers {

    public static BioTier ANTIMONY = new BioTier(2, 250, 6.0F, 2.0F, 25, () -> Ingredient.of(BioMetalsItems.ANTIMONY_INGOT.get()));
    public static BioTier BERYLLIUM = new BioTier(2, 400, 5.0F, 2.5F, 25, () -> Ingredient.of(BioMetalsItems.BERYLLIUM_INGOT.get()));
    public static BioTier BERYLLIUM_COPPER = new BioTier(3, 800, 6.5F, 3.5F, 15, () -> Ingredient.of(BioMetalsItems.BERYLLIUM_COPPER_INGOT.get()));
    public static BioTier NETHERITE_STEEL = new BioTier(4, 2200, 9.5F, 5.5F, 18, () -> Ingredient.of(BioMetalsItems.NETHERITE_STEEL_INGOT.get()));
    public static BioTier NORDIC_GOLD = new BioTier(3, 800, 5F, 3F, 10, () -> Ingredient.of(BioMetalsItems.NORDIC_GOLD_INGOT.get()));
    public static BioTier TUNGSTEN = new BioTier(3, 1200, 5.9F, 3.8F, 60, () -> Ingredient.of(BioMetalsItems.TUNGSTEN_INGOT.get()));
    public static BioTier TUNGSTEN_STEEL = new BioTier(4, 2000, 7.5F, 6F, 12, () -> Ingredient.of(BioMetalsItems.TUNGSTEN_STEEL_INGOT.get()));
}
