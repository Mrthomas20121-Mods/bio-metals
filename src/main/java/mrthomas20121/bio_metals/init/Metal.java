package mrthomas20121.bio_metals.init;

import mrthomas20121.bio_metals.BioMetals;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;

import javax.annotation.Nullable;

public enum Metal {

    antimony(BlockPart.values(), ItemPart.oreItems()),
    beryllium(BlockPart.values(), ItemPart.oreItems()),
    beryllium_copper(ItemTiers.BERYLLIUM_COPPER, BlockPart.block, ItemPart.toolReady()),
    nordic_gold(BlockPart.block, ItemPart.defaultItems()),
    rose_gold(BlockPart.block, ItemPart.defaultItems()),
    tungsten(BlockPart.values(), ItemPart.oreItems()),
    tungsten_steel(BlockPart.block, ItemPart.defaultItems()),
    zircaloy(BlockPart.block, ItemPart.defaultItems()),
    zirconium(BlockPart.values(), ItemPart.oreItems());

    private final IItemTier metalTier;
    private final ItemPart[] itemParts;
    private final BlockPart[] blockParts;

    Metal(BlockPart block, ItemPart[] itemParts) {
        this(null, block, itemParts);
    }

    Metal(BlockPart[] blockParts, ItemPart[] itemParts) {
        this(null, blockParts, itemParts);
    }

    Metal(IItemTier metalTier, BlockPart block, ItemPart[] itemParts) {
        this(metalTier, new BlockPart[] { block }, itemParts);
    }

    Metal(IItemTier metalTier, BlockPart[] blockParts, ItemPart[] itemParts) {
        this.metalTier = metalTier;
        this.blockParts = blockParts;
        this.itemParts = itemParts;
    }

    Metal(IItemTier metalTier, boolean ore) {
        this.metalTier = metalTier;
        if(ore) {
            this.itemParts = new ItemPart[] {
                    ItemPart.dust,
                    ItemPart.gear,
                    ItemPart.ingot,
                    ItemPart.nugget,
                    ItemPart.plate,
                    ItemPart.rod,
                    ItemPart.chunk,
                    ItemPart.cluster
            };
            this.blockParts = BlockPart.values();
        }
        else {
            this.itemParts = new ItemPart[] {
                    ItemPart.dust,
                    ItemPart.gear,
                    ItemPart.ingot,
                    ItemPart.nugget,
                    ItemPart.plate,
                    ItemPart.rod
            };
            this.blockParts = new BlockPart[] {
                    BlockPart.block
            };
        }
    }

    @Nullable
    public IItemTier getMetalTier() {
        return metalTier;
    }

    public ItemPart[] getItemParts() {
        return itemParts;
    }

    public BlockPart[] getBlockParts() {
        return blockParts;
    }

    private interface Part<T> {
        T create(Metal metal, @Nullable IItemTier tier);
        T create(Metal metal);
    }

    public enum ItemPart implements Part<Item> {
        dust,
        gear,
        ingot,
        nugget,
        plate,
        rod,
        chunk,
        cluster,
        axe,
        boots,
        chestplate,
        helmet,
        hoe,
        leggings,
        pickaxe,
        shovel,
        sword;

        public static ItemPart[] defaultItems() {
            return new ItemPart[] {
                dust,
                gear,
                ingot,
                nugget,
                plate,
                rod
            };
        }

        public static ItemPart[] oreItems() {
            return new ItemPart[] {
                    dust,
                    gear,
                    ingot,
                    nugget,
                    plate,
                    rod,
                    chunk,
                    cluster
            };
        }

        public static ItemPart[] toolReady() {
            return new ItemPart[] {
                    dust,
                    gear,
                    ingot,
                    nugget,
                    plate,
                    rod,
                    axe,
                    boots,
                    chestplate,
                    helmet,
                    hoe,
                    leggings,
                    pickaxe,
                    shovel,
                    sword
            };
        }

        @Override
        public Item create(Metal metal, @Nullable IItemTier tier) {
            return this.create(metal);
        }

        @Override
        public Item create(Metal metal) {
            return new Item(new Item.Properties().tab(BioRegistry.tab)).setRegistryName(BioMetals.MOD_ID, metal.name()+"_"+this.name());
        }
    }

    public enum BlockPart {
        block,
        ore
    }
}
