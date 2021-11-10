package mrthomas20121.bio_metals;

import mrthomas20121.bio_metals.items.BIOArmor;
import mrthomas20121.bio_metals.items.NetheriteSteelArmor;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraft.item.Items;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = BioMetals.mod_id, bus= Mod.EventBusSubscriber.Bus.MOD)
public class BioRegistry {

    public static ItemGroup tab = new ItemGroup("bio_metals") {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(antimony_ingot);
        }
    };

    public static Item antimony_dust;
    public static Item antimony_gear;
    public static Item antimony_ingot;
    public static Item antimony_nugget;
    public static Item antimony_plate;
    public static Item antimony_rod;
    public static Item antimony_chunk;
    public static Item antimony_cluster;
    public static Block antimony_block = new Block(AbstractBlock.Properties.of(Material.METAL).harvestTool(ToolType.PICKAXE));
    public static Block antimony_ore = new Block(AbstractBlock.Properties.of(Material.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(1));

    public static Item beryllium_dust;
    public static Item beryllium_gear;
    public static Item beryllium_ingot;
    public static Item beryllium_nugget;
    public static Item beryllium_plate;
    public static Item beryllium_rod;
    public static Item beryllium_chunk;
    public static Item beryllium_cluster;
    public static Block beryllium_block = new Block(AbstractBlock.Properties.of(Material.METAL).harvestTool(ToolType.PICKAXE));
    public static Block beryllium_ore = new Block(AbstractBlock.Properties.of(Material.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2));

    public static Item beryllium_copper_dust;
    public static Item beryllium_copper_gear;
    public static Item beryllium_copper_ingot;
    public static Item beryllium_copper_nugget;
    public static Item beryllium_copper_plate;
    public static Item beryllium_copper_rod;
    public static Item beryllium_copper_axe;
    public static Item beryllium_copper_pickaxe;
    public static Item beryllium_copper_shovel;
    public static Item beryllium_copper_sword;
    public static Item beryllium_copper_hoe;
    public static Item beryllium_copper_helmet;
    public static Item beryllium_copper_chestplate;
    public static Item beryllium_copper_leggings;
    public static Item beryllium_copper_boots;
    public static Block beryllium_copper_block = new Block(AbstractBlock.Properties.of(Material.METAL).harvestTool(ToolType.PICKAXE));

    public static Item netherite_steel_dust;
    public static Item netherite_steel_gear;
    public static Item netherite_steel_ingot;
    public static Item netherite_steel_nugget;
    public static Item netherite_steel_plate;
    public static Item netherite_steel_rod;
    public static Item netherite_steel_axe;
    public static Item netherite_steel_pickaxe;
    public static Item netherite_steel_shovel;
    public static Item netherite_steel_sword;
    public static Item netherite_steel_hoe;
    public static Item netherite_steel_helmet;
    public static Item netherite_steel_chestplate;
    public static Item netherite_steel_leggings;
    public static Item netherite_steel_boots;
    public static Block netherite_steel_block = new Block(AbstractBlock.Properties.of(Material.METAL).harvestTool(ToolType.PICKAXE));

    public static Item nordic_gold_dust;
    public static Item nordic_gold_gear;
    public static Item nordic_gold_ingot;
    public static Item nordic_gold_nugget;
    public static Item nordic_gold_plate;
    public static Item nordic_gold_rod;
    public static Block nordic_gold_block = new Block(AbstractBlock.Properties.of(Material.METAL).harvestTool(ToolType.PICKAXE));

    public static Item rose_gold_dust;
    public static Item rose_gold_gear;
    public static Item rose_gold_ingot;
    public static Item rose_gold_nugget;
    public static Item rose_gold_plate;
    public static Item rose_gold_rod;
    public static Block rose_gold_block = new Block(AbstractBlock.Properties.of(Material.METAL).harvestTool(ToolType.PICKAXE));

    public static Item tungsten_dust;
    public static Item tungsten_gear;
    public static Item tungsten_ingot;
    public static Item tungsten_nugget;
    public static Item tungsten_plate;
    public static Item tungsten_rod;
    public static Item tungsten_chunk;
    public static Item tungsten_cluster;
    public static Block tungsten_block = new Block(AbstractBlock.Properties.of(Material.METAL).harvestTool(ToolType.PICKAXE));
    public static Block tungsten_ore = new Block(AbstractBlock.Properties.of(Material.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(3));

    public static Item tungsten_steel_dust;
    public static Item tungsten_steel_gear;
    public static Item tungsten_steel_ingot;
    public static Item tungsten_steel_nugget;
    public static Item tungsten_steel_plate;
    public static Item tungsten_steel_rod;
    public static Item tungsten_steel_axe;
    public static Item tungsten_steel_pickaxe;
    public static Item tungsten_steel_shovel;
    public static Item tungsten_steel_sword;
    public static Item tungsten_steel_hoe;
    public static Item tungsten_steel_helmet;
    public static Item tungsten_steel_chestplate;
    public static Item tungsten_steel_leggings;
    public static Item tungsten_steel_boots;
    public static Block tungsten_steel_block = new Block(AbstractBlock.Properties.of(Material.METAL).harvestTool(ToolType.PICKAXE));

    public static Item zircaloy_dust;
    public static Item zircaloy_gear;
    public static Item zircaloy_ingot;
    public static Item zircaloy_nugget;
    public static Item zircaloy_plate;
    public static Item zircaloy_rod;
    public static Item zircaloy_axe;
    public static Item zircaloy_pickaxe;
    public static Item zircaloy_shovel;
    public static Item zircaloy_sword;
    public static Item zircaloy_hoe;
    public static Item zircaloy_helmet;
    public static Item zircaloy_chestplate;
    public static Item zircaloy_leggings;
    public static Item zircaloy_boots;
    public static Block zircaloy_block = new Block(AbstractBlock.Properties.of(Material.METAL).harvestTool(ToolType.PICKAXE));

    public static Item zirconium_dust;
    public static Item zirconium_gear;
    public static Item zirconium_ingot;
    public static Item zirconium_nugget;
    public static Item zirconium_plate;
    public static Item zirconium_rod;
    public static Item zirconium_chunk;
    public static Item zirconium_cluster;
    public static Block zirconium_block = new Block(AbstractBlock.Properties.of(Material.METAL).harvestTool(ToolType.PICKAXE));
    public static Block zirconium_ore = new Block(AbstractBlock.Properties.of(Material.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2));

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        antimony_dust = register("antimony_dust", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        antimony_gear = register("antimony_gear", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        antimony_ingot = register("antimony_ingot", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        antimony_nugget = register("antimony_nugget", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        antimony_plate = register("antimony_plate", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        antimony_rod = register("antimony_rod", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        antimony_chunk = register("antimony_chunk", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        antimony_cluster = register("antimony_cluster", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        register("antimony_block", new BlockItem(antimony_block, new Item.Properties().tab(tab)), event.getRegistry());
        register("antimony_ore", new BlockItem(antimony_ore, new Item.Properties().tab(tab)), event.getRegistry());

        beryllium_dust = register("beryllium_dust", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        beryllium_gear = register("beryllium_gear", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        beryllium_ingot = register("beryllium_ingot", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        beryllium_nugget = register("beryllium_nugget", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        beryllium_plate = register("beryllium_plate", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        beryllium_rod = register("beryllium_rod", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        beryllium_chunk = register("beryllium_chunk", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        beryllium_cluster = register("beryllium_cluster", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        register("beryllium_block", new BlockItem(beryllium_block, new Item.Properties().tab(tab)), event.getRegistry());
        register("beryllium_ore", new BlockItem(beryllium_ore, new Item.Properties().tab(tab)), event.getRegistry());

        beryllium_copper_dust = register("beryllium_copper_dust", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        beryllium_copper_gear = register("beryllium_copper_gear", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        beryllium_copper_ingot = register("beryllium_copper_ingot", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        beryllium_copper_nugget = register("beryllium_copper_nugget", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        beryllium_copper_plate = register("beryllium_copper_plate", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        beryllium_copper_rod = register("beryllium_copper_rod", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        beryllium_copper_axe = register("beryllium_copper_axe", new AxeItem(ItemTiers.BERYLLIUM_COPPER, 5f, -3f, new Item.Properties().tab(tab)), event.getRegistry());
        beryllium_copper_pickaxe = register("beryllium_copper_pickaxe", new PickaxeItem(ItemTiers.BERYLLIUM_COPPER, 1, -2.8f, new Item.Properties().tab(tab)), event.getRegistry());
        beryllium_copper_shovel = register("beryllium_copper_shovel", new ShovelItem(ItemTiers.BERYLLIUM_COPPER, 1.5f, -3f, new Item.Properties().tab(tab)), event.getRegistry());
        beryllium_copper_sword = register("beryllium_copper_sword", new SwordItem(ItemTiers.BERYLLIUM_COPPER, 3, -2.4f, new Item.Properties().tab(tab)), event.getRegistry());
        beryllium_copper_hoe = register("beryllium_copper_hoe", new HoeItem(ItemTiers.BERYLLIUM_COPPER, -4, -2.8f, new Item.Properties().tab(tab)), event.getRegistry());
        beryllium_copper_helmet = register("beryllium_copper_helmet", new BIOArmor(BIOArmorMaterial.BERYLLIUM_COPPER, EquipmentSlotType.HEAD).setArmorTexture("beryllium_copper_layer_1"), event.getRegistry());
        beryllium_copper_chestplate = register("beryllium_copper_chestplate", new BIOArmor(BIOArmorMaterial.BERYLLIUM_COPPER, EquipmentSlotType.CHEST).setArmorTexture("beryllium_copper_layer_1"), event.getRegistry());
        beryllium_copper_leggings = register("beryllium_copper_leggings", new BIOArmor(BIOArmorMaterial.BERYLLIUM_COPPER, EquipmentSlotType.LEGS).setArmorTexture("beryllium_copper_layer_2"), event.getRegistry());
        beryllium_copper_boots = register("beryllium_copper_boots", new BIOArmor(BIOArmorMaterial.BERYLLIUM_COPPER, EquipmentSlotType.FEET).setArmorTexture("beryllium_copper_layer_1"), event.getRegistry());
        register("beryllium_copper_block", new BlockItem(beryllium_copper_block, new Item.Properties().tab(tab)), event.getRegistry());

        netherite_steel_dust = register("netherite_steel_dust", new Item(new Item.Properties().tab(tab).fireResistant()), event.getRegistry());
        netherite_steel_gear = register("netherite_steel_gear", new Item(new Item.Properties().tab(tab).fireResistant()), event.getRegistry());
        netherite_steel_ingot = register("netherite_steel_ingot", new Item(new Item.Properties().tab(tab).fireResistant()), event.getRegistry());
        netherite_steel_nugget = register("netherite_steel_nugget", new Item(new Item.Properties().tab(tab).fireResistant()), event.getRegistry());
        netherite_steel_plate = register("netherite_steel_plate", new Item(new Item.Properties().tab(tab).fireResistant()), event.getRegistry());
        netherite_steel_rod = register("netherite_steel_rod", new Item(new Item.Properties().tab(tab).fireResistant()), event.getRegistry());
        netherite_steel_axe = register("netherite_steel_axe", new AxeItem(ItemTiers.NETHERITE_STEEL, 5f, -3f, new Item.Properties().tab(tab).fireResistant()), event.getRegistry());
        netherite_steel_pickaxe = register("netherite_steel_pickaxe", new PickaxeItem(ItemTiers.NETHERITE_STEEL, 1, -2.8f, new Item.Properties().tab(tab).fireResistant()), event.getRegistry());
        netherite_steel_shovel = register("netherite_steel_shovel", new ShovelItem(ItemTiers.NETHERITE_STEEL, 1.5f, -3f, new Item.Properties().tab(tab).fireResistant()), event.getRegistry());
        netherite_steel_sword = register("netherite_steel_sword", new SwordItem(ItemTiers.NETHERITE_STEEL, 3, -2.4f, new Item.Properties().tab(tab).fireResistant()), event.getRegistry());
        netherite_steel_hoe = register("netherite_steel_hoe", new HoeItem(ItemTiers.NETHERITE_STEEL, -2, -2.8f, new Item.Properties().tab(tab).fireResistant()), event.getRegistry());
        netherite_steel_helmet = register("netherite_steel_helmet", new NetheriteSteelArmor(BIOArmorMaterial.NETHERITE_STEEL, EquipmentSlotType.HEAD).setArmorTexture("netherite_steel_layer_1"), event.getRegistry());
        netherite_steel_chestplate = register("netherite_steel_chestplate", new NetheriteSteelArmor(BIOArmorMaterial.NETHERITE_STEEL, EquipmentSlotType.CHEST).setArmorTexture("netherite_steel_layer_1"), event.getRegistry());
        netherite_steel_leggings = register("netherite_steel_leggings", new NetheriteSteelArmor(BIOArmorMaterial.NETHERITE_STEEL, EquipmentSlotType.LEGS).setArmorTexture("netherite_steel_layer_2"), event.getRegistry());
        netherite_steel_boots = register("netherite_steel_boots", new NetheriteSteelArmor(BIOArmorMaterial.NETHERITE_STEEL, EquipmentSlotType.FEET).setArmorTexture("netherite_steel_layer_1"), event.getRegistry());
        register("netherite_steel_block", new BlockItem(netherite_steel_block, new Item.Properties().tab(tab)), event.getRegistry());

        nordic_gold_dust = register("nordic_gold_dust", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        nordic_gold_gear = register("nordic_gold_gear", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        nordic_gold_ingot = register("nordic_gold_ingot", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        nordic_gold_nugget = register("nordic_gold_nugget", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        nordic_gold_plate = register("nordic_gold_plate", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        nordic_gold_rod = register("nordic_gold_rod", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        register("nordic_gold_block", new BlockItem(nordic_gold_block, new Item.Properties().tab(tab)), event.getRegistry());

        rose_gold_dust = register("rose_gold_dust", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        rose_gold_gear = register("rose_gold_gear", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        rose_gold_ingot = register("rose_gold_ingot", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        rose_gold_nugget = register("rose_gold_nugget", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        rose_gold_plate = register("rose_gold_plate", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        rose_gold_rod = register("rose_gold_rod", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        register("rose_gold_block", new BlockItem(rose_gold_block, new Item.Properties().tab(tab)), event.getRegistry());

        tungsten_dust = register("tungsten_dust", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        tungsten_gear = register("tungsten_gear", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        tungsten_ingot = register("tungsten_ingot", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        tungsten_nugget = register("tungsten_nugget", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        tungsten_plate = register("tungsten_plate", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        tungsten_rod = register("tungsten_rod", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        tungsten_chunk = register("tungsten_chunk", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        tungsten_cluster = register("tungsten_cluster", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        register("tungsten_block", new BlockItem(tungsten_block, new Item.Properties().tab(tab)), event.getRegistry());
        register("tungsten_ore", new BlockItem(tungsten_ore, new Item.Properties().tab(tab)), event.getRegistry());

        tungsten_steel_dust = register("tungsten_steel_dust", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        tungsten_steel_gear = register("tungsten_steel_gear", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        tungsten_steel_ingot = register("tungsten_steel_ingot", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        tungsten_steel_nugget = register("tungsten_steel_nugget", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        tungsten_steel_plate = register("tungsten_steel_plate", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        tungsten_steel_rod = register("tungsten_steel_rod", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        tungsten_steel_axe = register("tungsten_steel_axe", new AxeItem(ItemTiers.TUNGSTEN_STEEL, 5f, -3f, new Item.Properties().tab(tab)), event.getRegistry());
        tungsten_steel_pickaxe = register("tungsten_steel_pickaxe", new PickaxeItem(ItemTiers.TUNGSTEN_STEEL, 1, -2.8f, new Item.Properties().tab(tab)), event.getRegistry());
        tungsten_steel_shovel = register("tungsten_steel_shovel", new ShovelItem(ItemTiers.TUNGSTEN_STEEL, 1.5f, -3f, new Item.Properties().tab(tab)), event.getRegistry());
        tungsten_steel_sword = register("tungsten_steel_sword", new SwordItem(ItemTiers.TUNGSTEN_STEEL, 3, -2.4f, new Item.Properties().tab(tab)), event.getRegistry());
        tungsten_steel_hoe = register("tungsten_steel_hoe", new HoeItem(ItemTiers.TUNGSTEN_STEEL, -4, -2.8f, new Item.Properties().tab(tab)), event.getRegistry());
        tungsten_steel_helmet = register("tungsten_steel_helmet", new BIOArmor(BIOArmorMaterial.TUNGSTEN_STEEL, EquipmentSlotType.HEAD).setArmorTexture("tungsten_steel_layer_1"), event.getRegistry());
        tungsten_steel_chestplate = register("tungsten_steel_chestplate", new BIOArmor(BIOArmorMaterial.TUNGSTEN_STEEL, EquipmentSlotType.CHEST).setArmorTexture("tungsten_steel_layer_1"), event.getRegistry());
        tungsten_steel_leggings = register("tungsten_steel_leggings", new BIOArmor(BIOArmorMaterial.TUNGSTEN_STEEL, EquipmentSlotType.LEGS).setArmorTexture("tungsten_steel_layer_2"), event.getRegistry());
        tungsten_steel_boots = register("tungsten_steel_boots", new BIOArmor(BIOArmorMaterial.TUNGSTEN_STEEL, EquipmentSlotType.FEET).setArmorTexture("tungsten_steel_layer_1"), event.getRegistry());
        register("tungsten_steel_block", new BlockItem(tungsten_steel_block, new Item.Properties().tab(tab)), event.getRegistry());

        zircaloy_dust = register("zircaloy_dust", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        zircaloy_gear = register("zircaloy_gear", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        zircaloy_ingot = register("zircaloy_ingot", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        zircaloy_nugget = register("zircaloy_nugget", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        zircaloy_plate = register("zircaloy_plate", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        zircaloy_rod = register("zircaloy_rod", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        zircaloy_axe = register("zircaloy_axe", new AxeItem(ItemTiers.ZIRCALOY, 5f, -3f, new Item.Properties().tab(tab)), event.getRegistry());
        zircaloy_pickaxe = register("zircaloy_pickaxe", new PickaxeItem(ItemTiers.ZIRCALOY, 1, -2.8f, new Item.Properties().tab(tab)), event.getRegistry());
        zircaloy_shovel = register("zircaloy_shovel", new ShovelItem(ItemTiers.ZIRCALOY, 1.5f, -3f, new Item.Properties().tab(tab)), event.getRegistry());
        zircaloy_sword = register("zircaloy_sword", new SwordItem(ItemTiers.ZIRCALOY, 3, -2.4f, new Item.Properties().tab(tab)), event.getRegistry());
        zircaloy_hoe = register("zircaloy_hoe", new HoeItem(ItemTiers.ZIRCALOY, -2, -2.8f, new Item.Properties().tab(tab)), event.getRegistry());
        zircaloy_helmet = register("zircaloy_helmet", new BIOArmor(BIOArmorMaterial.ZIRCALOY, EquipmentSlotType.HEAD).setArmorTexture("zircaloy_layer_1"), event.getRegistry());
        zircaloy_chestplate = register("zircaloy_chestplate", new BIOArmor(BIOArmorMaterial.ZIRCALOY, EquipmentSlotType.CHEST).setArmorTexture("zircaloy_layer_1"), event.getRegistry());
        zircaloy_leggings = register("zircaloy_leggings", new BIOArmor(BIOArmorMaterial.ZIRCALOY, EquipmentSlotType.LEGS).setArmorTexture("zircaloy_layer_2"), event.getRegistry());
        zircaloy_boots = register("zircaloy_boots", new BIOArmor(BIOArmorMaterial.ZIRCALOY, EquipmentSlotType.FEET).setArmorTexture("zircaloy_layer_1"), event.getRegistry());
        register("zircaloy_block", new BlockItem(zircaloy_block, new Item.Properties().tab(tab)), event.getRegistry());

        zirconium_dust = register("zirconium_dust", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        zirconium_gear = register("zirconium_gear", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        zirconium_ingot = register("zirconium_ingot", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        zirconium_nugget = register("zirconium_nugget", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        zirconium_plate = register("zirconium_plate", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        zirconium_rod = register("zirconium_rod", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        zirconium_chunk = register("zirconium_chunk", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        zirconium_cluster = register("zirconium_cluster", new Item(new Item.Properties().tab(tab)), event.getRegistry());
        register("zirconium_block", new BlockItem(zirconium_block, new Item.Properties().tab(tab)), event.getRegistry());
        register("zirconium_ore", new BlockItem(zirconium_ore, new Item.Properties().tab(tab)), event.getRegistry());

    }
    @SubscribeEvent
    public static void registerBlock(RegistryEvent.Register<Block> event) {
        register("antimony_block", antimony_block, event.getRegistry());
        register("antimony_ore", antimony_ore, event.getRegistry());

        register("beryllium_block", beryllium_block, event.getRegistry());
        register("beryllium_ore", beryllium_ore, event.getRegistry());

        register("beryllium_copper_block", beryllium_copper_block, event.getRegistry());

        register("netherite_steel_block", netherite_steel_block, event.getRegistry());

        register("nordic_gold_block", nordic_gold_block, event.getRegistry());

        register("rose_gold_block", rose_gold_block, event.getRegistry());

        register("tungsten_block", tungsten_block, event.getRegistry());
        register("tungsten_ore", tungsten_ore, event.getRegistry());

        register("tungsten_steel_block", tungsten_steel_block, event.getRegistry());

        register("zircaloy_block", zircaloy_block, event.getRegistry());

        register("zirconium_block", zirconium_block, event.getRegistry());
        register("zirconium_ore", zirconium_ore, event.getRegistry());

    }


    private static Item register(String registry_name, Item item, IForgeRegistry<Item> r) {
        item.setRegistryName(BioMetals.mod_id, registry_name);
        r.register(item);
        return item;
    }

    private static void register(String registry_name, Block block, IForgeRegistry<Block> r) {
        block.setRegistryName(BioMetals.mod_id, registry_name);
        r.register(block);
    }
}
