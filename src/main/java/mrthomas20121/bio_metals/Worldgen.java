package mrthomas20121.bio_metals;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureSpread;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BioMetals.mod_id)
public class Worldgen {

    public static int ANTIMONY_VEIN = 6;
    public static int ANTIMONY_HEIGHT = 40;
    public static int ANTIMONY_CHUNK = 8;

    public static int BERYLLIUM_VEIN = 5;
    public static int BERYLLIUM_HEIGHT = 20;
    public static int BERYLLIUM_CHUNK = 6;

    public static int TUNGSTEN_VEIN = 7;
    public static int TUNGSTEN_HEIGHT_MIN = 16;
    public static int TUNGSTEN_HEIGHT_MAX = 32;
    public static int TUNGSTEN_CHUNK = 6;

    public static int ZIRCONIUM_VEIN = 4;
    public static int ZIRCONIUM_HEIGHT = 32;
    public static int ZIRCONIUM_CHUNK = 6;

    public static ConfiguredFeature <?,?> ANTIMONY = newConfiguredFeature("antimony_ore", Feature.ORE.configured(
                    new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BioRegistry.antimony_ore.defaultBlockState(), ANTIMONY_VEIN)).range(ANTIMONY_HEIGHT)
            .squared().count(ANTIMONY_CHUNK));

    public static ConfiguredFeature <?,?> BERYLLIUM = newConfiguredFeature("beryllium_ore", Feature.ORE.configured(
                    new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BioRegistry.beryllium_ore.defaultBlockState(), BERYLLIUM_VEIN)).range(BERYLLIUM_HEIGHT)
            .squared().count(BERYLLIUM_CHUNK));

    public static ConfiguredFeature <?,?> TUNGSTEN = newConfiguredFeature("tungsten_ore", Feature.ORE.configured(
                    new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BioRegistry.tungsten_ore.defaultBlockState(), TUNGSTEN_VEIN)).range(TUNGSTEN_HEIGHT_MAX))
            .squared().count(TUNGSTEN_CHUNK);

    public static ConfiguredFeature <?,?> ZIRCONIUM = newConfiguredFeature("zirconium_ore", Feature.ORE.configured(
            new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BioRegistry.zirconium_ore.defaultBlockState(), ZIRCONIUM_VEIN)).range(ZIRCONIUM_HEIGHT))
            .squared().count(ZIRCONIUM_CHUNK);

    public static ConfiguredFeature<?, ?> newConfiguredFeature(String registryName, ConfiguredFeature<?, ?> configuredFeature) {
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(BioMetals.mod_id, registryName), configuredFeature);
        return configuredFeature;
    }

    @SubscribeEvent
    public static void generateOre(final BiomeLoadingEvent event) {
        if(BioConfig.WORLD_GEN.enableBerylliumOreSpawning.get()) {
            event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> BERYLLIUM);
        }

        if(event.getCategory().equals(Biome.Category.FOREST) && BioConfig.WORLD_GEN.enableTungstenOreSpawning.get()) {
            event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> TUNGSTEN);
        }

        if( (event.getCategory().equals(Biome.Category.SAVANNA) || event.getCategory().equals(Biome.Category.DESERT)) && BioConfig.WORLD_GEN.enableZirconiumOreSpawning.get() ) {
            event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> ZIRCONIUM);
        }

        if( (event.getCategory().equals(Biome.Category.JUNGLE) || event.getCategory().equals(Biome.Category.SWAMP)) && BioConfig.WORLD_GEN.enableAntimonyOreSpawning.get() )  {
            event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> ANTIMONY);
        }
    }
}
