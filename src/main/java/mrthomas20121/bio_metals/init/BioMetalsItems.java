package mrthomas20121.bio_metals.init;

import mrthomas20121.bio_metals.BioMetals;
import mrthomas20121.bio_metals.items.NetheriteSteelArmor;
import mrthomas20121.biolib.item.armor.BioArmorItem;
import mrthomas20121.biolib.item.tool.BioTier;
import net.minecraft.world.entity.EquipmentSlot;
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
    public static List<RegistryObject<Item>> ANTIMONY_TOOLS = registerTools("antimony", BioMetalsTiers.ANTIMONY);

    public static RegistryObject<Item> BERYLLIUM_INGOT = register("beryllium_ingot");
    public static RegistryObject<Item> BERYLLIUM_DUST = register("beryllium_dust");
    public static RegistryObject<Item> BERYLLIUM_NUGGET = register("beryllium_nugget");
    public static RegistryObject<Item> RAW_BERYLLIUM = register("raw_beryllium");
    public static List<RegistryObject<Item>> BERYLLIUM_TOOLS = registerTools("beryllium", BioMetalsTiers.BERYLLIUM);

    public static RegistryObject<Item> BERYLLIUM_COPPER_INGOT = register("beryllium_copper_ingot");
    public static RegistryObject<Item> BERYLLIUM_COPPER_DUST = register("beryllium_copper_dust");
    public static RegistryObject<Item> BERYLLIUM_COPPER_NUGGET = register("beryllium_copper_nugget");
    public static List<RegistryObject<Item>> BERYLLIUM_COPPER_TOOLS = registerTools("beryllium_copper", BioMetalsTiers.BERYLLIUM_COPPER);

    public static RegistryObject<Item> NETHERITE_STEEL_INGOT = register("netherite_steel_ingot");
    public static RegistryObject<Item> NETHERITE_STEEL_DUST = register("netherite_steel_dust");
    public static RegistryObject<Item> NETHERITE_STEEL_NUGGET = register("netherite_steel_nugget");
    public static List<RegistryObject<Item>> NETHERITE_STEEL_TOOLS = registerTools("netherite_steel", BioMetalsTiers.NETHERITE_STEEL);

    public static RegistryObject<Item> NORDIC_GOLD_INGOT = register("nordic_gold_ingot");
    public static RegistryObject<Item> NORDIC_GOLD_DUST = register("nordic_gold_dust");
    public static RegistryObject<Item> NORDIC_GOLD_NUGGET = register("nordic_gold_nugget");
    public static List<RegistryObject<Item>> NORDIC_GOLD_TOOLS = registerTools("nordic_gold", BioMetalsTiers.NORDIC_GOLD);

    public static RegistryObject<Item> TUNGSTEN_INGOT = register("tungsten_ingot");
    public static RegistryObject<Item> TUNGSTEN_DUST = register("tungsten_dust");
    public static RegistryObject<Item> TUNGSTEN_NUGGET = register("tungsten_nugget");
    public static RegistryObject<Item> RAW_TUNGSTEN = register("raw_tungsten");
    public static List<RegistryObject<Item>> TUNGSTEN_TOOLS = registerTools("tungsten", BioMetalsTiers.TUNGSTEN);

    public static RegistryObject<Item> TUNGSTEN_STEEL_INGOT = register("tungsten_steel_ingot");
    public static RegistryObject<Item> TUNGSTEN_STEEL_DUST = register("tungsten_steel_dust");
    public static RegistryObject<Item> TUNGSTEN_STEEL_NUGGET = register("tungsten_steel_nugget");
    public static List<RegistryObject<Item>> TUNGSTEN_STEEL_TOOLS = registerTools("tungsten_steel", BioMetalsTiers.TUNGSTEN_STEEL);

    public static RegistryObject<Item> register(String name) {
        return ITEMS.register(name, () -> new Item(new Item.Properties().tab(resourcesTab)));
    }

    public static List<RegistryObject<Item>> registerTools(String name, BioTier tier) {
        List<RegistryObject<Item>> items = new ArrayList<>();

        Item.Properties properties = new Item.Properties().tab(resourcesTab);

        switch (name) {
            case "netherite_steel" -> properties.fireResistant().rarity(Rarity.EPIC);
            case "tungsten", "nordic_gold" -> properties.rarity(Rarity.UNCOMMON);
            case "tungsten_steel" -> properties.rarity(Rarity.RARE);
        }

        if(tier.getLevel() <= 2) {
            items.add(ITEMS.register(name+"_axe", () -> new AxeItem(tier, 6.0f, -3F, properties)));
            items.add(ITEMS.register(name+"_hoe", () -> new HoeItem(tier, -1, 0F, properties)));
        }
        else {
            items.add(ITEMS.register(name+"_axe", () -> new AxeItem(tier, 5, -3F, properties)));
            items.add(ITEMS.register(name+"_hoe", () -> new HoeItem(tier, -3, 0F, properties)));
        }
        items.add(ITEMS.register(name+"_pickaxe", () -> new PickaxeItem(tier, 1, -2.8F, properties)));
        items.add(ITEMS.register(name+"_shovel", () -> new ShovelItem(tier, 1.5f, -3F, properties)));
        items.add(ITEMS.register(name + "_sword", () -> new SwordItem(tier, 3, -2.4F, properties)));

        return items;
    }

    public static List<RegistryObject<Item>> registerArmor(String name, ArmorMaterial material) {
        List<RegistryObject<Item>> items = new ArrayList<>();

        if(name.equals("netherite_steel")) {
            items.add(ITEMS.register(name+"_helmet", () -> new NetheriteSteelArmor(material, EquipmentSlot.HEAD, new Item.Properties().tab(resourcesTab))));
            items.add(ITEMS.register(name+"_chestplate", () -> new NetheriteSteelArmor(material, EquipmentSlot.CHEST, new Item.Properties().tab(resourcesTab))));
            items.add(ITEMS.register(name+"_leggings", () -> new NetheriteSteelArmor(material, EquipmentSlot.LEGS, new Item.Properties().tab(resourcesTab))));
            items.add(ITEMS.register(name+"_boots", () -> new NetheriteSteelArmor(material, EquipmentSlot.FEET, new Item.Properties().tab(resourcesTab))));
        }
        else {
            items.add(ITEMS.register(name+"_helmet", () -> new BioArmorItem(material, EquipmentSlot.HEAD, new Item.Properties().tab(resourcesTab))));
            items.add(ITEMS.register(name+"_chestplate", () -> new BioArmorItem(material, EquipmentSlot.CHEST, new Item.Properties().tab(resourcesTab))));
            items.add(ITEMS.register(name+"_leggings", () -> new BioArmorItem(material, EquipmentSlot.LEGS, new Item.Properties().tab(resourcesTab))));
            items.add(ITEMS.register(name+"_boots", () -> new BioArmorItem(material, EquipmentSlot.FEET, new Item.Properties().tab(resourcesTab))));
        }

        return items;
    }
}
