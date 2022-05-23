package mrthomas20121.bio_metals.init;

import mrthomas20121.bio_metals.BioMetals;
import mrthomas20121.biolib.item.tool.BioTier;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

public class BioMetalsItems {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BioMetals.MOD_ID);

    public static CreativeModeTab resourcesTab = new CreativeModeTab("bio_metals.resources") {

        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ANTIMONY_INGOT.get());
        }
    };

    public static RegistryObject<Item> ANTIMONY_INGOT = register("antimony_ingot");
    public static RegistryObject<Item> ANTIMONY_DUST = register("antimony_dust");
    public static RegistryObject<Item> ANTIMONY_NUGGET = register("antimony_nugget");
    public static RegistryObject<Item> RAW_ANTIMONY = register("raw_antimony");
    public static List<RegistryObject<Item>> ANTIMONY_TOOLS = registerToolAndArmors("antimony", BioMetalsTiers.ANTIMONY);

    public static RegistryObject<Item> BERYLLIUM_INGOT = register("beryllium_ingot");
    public static RegistryObject<Item> BERYLLIUM_DUST = register("beryllium_dust");
    public static RegistryObject<Item> BERYLLIUM_NUGGET = register("beryllium_nugget");
    public static RegistryObject<Item> RAW_BERYLLIUM = register("raw_beryllium");

    public static RegistryObject<Item> register(String name) {
        return ITEMS.register(name, () -> new Item(new Item.Properties().tab(resourcesTab)));
    }

    public static List<RegistryObject<Item>> registerToolAndArmors(String name, BioTier tier) {
        List<RegistryObject<Item>> items = new ArrayList<>();

        items.add(ITEMS.register(name+"_axe", () -> new AxeItem(tier, 5, -3F, new Item.Properties().tab(resourcesTab))));
        items.add(ITEMS.register(name+"_pickaxe", () -> new PickaxeItem(tier, 1, -2.8F, new Item.Properties().tab(resourcesTab))));
        items.add(ITEMS.register(name+"_shovel", () -> new ShovelItem(tier, 1.5f, -3F, new Item.Properties().tab(resourcesTab))));
        items.add(ITEMS.register(name+"_hoe", () -> new HoeItem(tier, -3, 0F, new Item.Properties().tab(resourcesTab))));
        items.add(ITEMS.register(name+"_sword", () -> new SwordItem(tier, 3, -2.4F, new Item.Properties().tab(resourcesTab))));

        return items;
    }
}
