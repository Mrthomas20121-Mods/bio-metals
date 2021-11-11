package mrthomas20121.bio_metals.blocks;

import net.minecraft.block.Block;

public class BIOBlock extends Block {
    public BIOBlock(Properties properties) {
        super(properties.strength(3f, 3f).requiresCorrectToolForDrops());
    }
}
