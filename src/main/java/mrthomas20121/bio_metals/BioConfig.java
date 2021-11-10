package mrthomas20121.bio_metals;

import net.minecraftforge.common.ForgeConfigSpec;

public class BioConfig {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final WorldGenConfig WORLD_GEN = new WorldGenConfig(BUILDER);
    public static ForgeConfigSpec config = BUILDER.build();

    public static class WorldGenConfig {
        static final String WORLDGEN = "World gen Option";
        public ForgeConfigSpec.BooleanValue enableAntimonyOreSpawning;
        public ForgeConfigSpec.BooleanValue enableBerylliumOreSpawning;
        public ForgeConfigSpec.BooleanValue enableTungstenOreSpawning;
        public ForgeConfigSpec.BooleanValue enableZirconiumOreSpawning;

        WorldGenConfig(ForgeConfigSpec.Builder builder) {
            builder.push(WORLDGEN);
            enableAntimonyOreSpawning = builder.define("Enable/Disable Antimony Ore Generation", true);
            enableBerylliumOreSpawning = builder.define("Enable/Disable Beryllium Ore Generation", true);
            enableTungstenOreSpawning = builder.define("Enable/Disable Tungsten Ore Generation", true);
            enableZirconiumOreSpawning = builder.define("Enable/Disable Zirconium Ore Generation", true);
            builder.pop();
        }
    }
}
