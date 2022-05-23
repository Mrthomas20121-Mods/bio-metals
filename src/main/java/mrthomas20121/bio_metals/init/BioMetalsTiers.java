package mrthomas20121.bio_metals.init;

import mrthomas20121.biolib.item.tool.BioTier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class BioMetalsTiers {

    public static BioTier ANTIMONY = new BioTier(2, 250, 6.0F, 2.0F, 14, () -> Ingredient.of(BioMetalsItems.ANTIMONY_INGOT.get()));
}
