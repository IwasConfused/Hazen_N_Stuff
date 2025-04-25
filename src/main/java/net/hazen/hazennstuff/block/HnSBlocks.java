package net.hazen.hazennstuff.block;

import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.block.custom.ModFlammableRotatedPillarBlock;
import net.hazen.hazennstuff.item.item.HnSItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class HnSBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(HazenNStuff.MOD_ID);

    public static final DeferredBlock<Block> ZENALITE_ABYSSLATE_ORE = registerBlock("zenalite_abysslate_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4),
            BlockBehaviour
                    .Properties.of()
                    .strength(3f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.ANCIENT_DEBRIS)
            ));

    public static final DeferredBlock<Block> PHANTASMIUM = registerBlock("phantasmium",
            () -> new Block(BlockBehaviour
                    .Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.ANCIENT_DEBRIS)
            ));

    public static final DeferredBlock<Block> ZENALITE_BRICKS = registerBlock("zenalite_bricks",
            () -> new Block(BlockBehaviour
                    .Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE_TILES)
            ));

    public static final DeferredBlock<Block> BLOCK_OF_ZENALITE = registerBlock("block_of_zenalite",
            () -> new Block(BlockBehaviour
                    .Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHERITE_BLOCK)
            ));

    public static final DeferredBlock<Block> ABYSSLATE = registerBlock("abysslate",
            () -> new Block(BlockBehaviour
                    .Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.ANCIENT_DEBRIS)
            ));

    public static final DeferredBlock<Block> ZENALITE_STONE_ORE = registerBlock("zenalite_stone_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4),
                    BlockBehaviour
                            .Properties.of()
                            .strength(3f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)
            ));

    public static final DeferredBlock<Block> ZENALITE_DEEPSLATE_ORE = registerBlock("zenalite_deepslate_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4),
                    BlockBehaviour
                            .Properties.of()
                            .strength(3f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.DEEPSLATE)
            ));

    public static final DeferredBlock<Block> WISEWOOD_PLANK = registerBlock("wisewood_planks",
            () -> new DropExperienceBlock(UniformInt.of(2, 4),
                    BlockBehaviour
                            .Properties.of()
                            .strength(3f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.WOOD)
            ));

    public static final DeferredBlock<StairBlock> WISEWOOD_STAIRS = registerBlock("wisewood_stairs",
            () -> new StairBlock(HnSBlocks.WISEWOOD_PLANK.get().defaultBlockState(),
                    BlockBehaviour
                            .Properties
                            .of()
                            .strength(2f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.WOOD)
            ));

    public static final DeferredBlock<SlabBlock> WISEWOOD_SLAB = registerBlock("wisewood_slab",
            () -> new SlabBlock(
                    BlockBehaviour
                            .Properties
                            .of()
                            .strength(2f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.WOOD)
            ));

    public static final DeferredBlock<Block> WISEWOOD_LOG = registerBlock("wisewood_log",
            () -> new ModFlammableRotatedPillarBlock(
                    BlockBehaviour
                            .Properties
                            .ofFullCopy(Blocks.OAK_LOG)
            ));

    public static final DeferredBlock<Block> WISEWOOD_WOOD = registerBlock("wisewood_wood",
            () -> new ModFlammableRotatedPillarBlock(
                    BlockBehaviour
                            .Properties
                            .ofFullCopy(Blocks.OAK_WOOD)
            ));

    public static final DeferredBlock<Block> STRIPPED_WISEWOOD_LOG = registerBlock("stripped_wisewood_log",
            () -> new ModFlammableRotatedPillarBlock(
                    BlockBehaviour
                            .Properties
                            .ofFullCopy(Blocks.STRIPPED_OAK_LOG)
            ));

    public static final DeferredBlock<Block> STRIPPED_WISEWOOD_WOOD = registerBlock("stripped_wisewood_wood",
            () -> new ModFlammableRotatedPillarBlock(
                    BlockBehaviour
                            .Properties
                            .ofFullCopy(Blocks.STRIPPED_OAK_WOOD)
            ));

    public static final DeferredBlock<Block> WISEWOOD_LEAVES = registerBlock("wisewood_leaves",
            () -> new LeavesBlock(
                    BlockBehaviour
                            .Properties
                            .ofFullCopy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    public static final DeferredBlock<Block> FIREBLOSSOM = registerBlock("fireblossom", () -> new RootsBlock(
            BlockBehaviour
                    .Properties
                    .of()
                    .mapColor(MapColor.NETHER)
                    .replaceable()
                    .noCollission()
                    .instabreak()
                    .sound(SoundType.FLOWERING_AZALEA)
                    .offsetType(BlockBehaviour.OffsetType.XZ)
                    .pushReaction(PushReaction.DESTROY)
            ));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        HnSItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
