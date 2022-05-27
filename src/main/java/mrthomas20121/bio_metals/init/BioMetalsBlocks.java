package mrthomas20121.bio_metals.init;

import mrthomas20121.bio_metals.BioMetals;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BioMetalsBlocks {

    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BioMetals.MOD_ID);

    public static RegistryObject<Block> antimony_block = registerMetalBlock("antimony_block");
    public static RegistryObject<Block> raw_antimony_block = registerRawBlock("raw_antimony_block");
    public static RegistryObject<Block> antimony_ore = registerOre("antimony_ore");
    public static RegistryObject<Block> deepslate_antimony_ore = registerMetalBlock("deepslate_antimony_ore");

    public static RegistryObject<Block> beryllium_block = registerMetalBlock("beryllium_block");
    public static RegistryObject<Block> raw_beryllium_block = registerRawBlock("raw_beryllium_block");
    public static RegistryObject<Block> beryllium_ore = registerOre("beryllium_ore");
    public static RegistryObject<Block> deepslate_beryllium_ore = registerMetalBlock("deepslate_beryllium_ore");

    public static RegistryObject<Block> beryllium_copper_block = registerMetalBlock("beryllium_copper_block");

    public static RegistryObject<Block> netherite_steel_block = registerMetalBlock("netherite_steel_block");

    public static RegistryObject<Block> nordic_gold_block = registerMetalBlock("nordic_gold_block");

    public static RegistryObject<Block> tungsten_block = registerMetalBlock("tungsten_block");
    public static RegistryObject<Block> raw_tungsten_block = registerRawBlock("raw_tungsten_block");
    public static RegistryObject<Block> tungsten_ore = registerOre("tungsten_ore");

    public static RegistryObject<Block> tungsten_steel_block = registerMetalBlock("tungsten_steel_block");

    public static RegistryObject<Block> registerMetalBlock(String name) {
        RegistryObject<Block> block = BLOCKS.register(name, () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));
        BioMetalsItems.register(name);
        return block;
    }

    public static RegistryObject<Block> registerRawBlock(String name) {
        RegistryObject<Block> block = BLOCKS.register(name, () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).requiresCorrectToolForDrops()));
        BioMetalsItems.register(name);
        return block;
    }

    public static RegistryObject<Block> registerOre(String name) {
        RegistryObject<Block> block = BLOCKS.register(name, () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
        BioMetalsItems.register(name);
        return block;
    }

    public static RegistryObject<Block> registerDeepslateOre(String name) {
        RegistryObject<Block> block = BLOCKS.register(name, () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops()));
        BioMetalsItems.register(name);
        return block;
    }
}
