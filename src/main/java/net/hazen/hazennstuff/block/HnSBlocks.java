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
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Map;
import java.util.function.Supplier;

public class HnSBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(HazenNStuff.MOD_ID);


    //Overworld Blocks

    public static final DeferredBlock<Block> RUNESTONE_SLAG = registerBlock("runestone_slag",
            () -> new Block(BlockBehaviour
                    .Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.ANCIENT_DEBRIS)
            ));
    public static final DeferredBlock<Block> AQUASTONE = registerBlock("aquastone",
            () -> new Block(BlockBehaviour
                    .Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.ANCIENT_DEBRIS)
            ));

    //Nether Blocks

    //Fireblossom
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


    //End Blocks
    public static final DeferredBlock<Block> ABYSSLATE = registerBlock("abysslate",
            () -> new Block(BlockBehaviour
                    .Properties.of()
                    .strength(4f)
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
    public static final DeferredBlock<Block> VOIDSTONE = registerBlock("voidstone",
            () -> new Block(BlockBehaviour
                    .Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.ANCIENT_DEBRIS)
            ));
    public static final DeferredBlock<Block> COBBLED_VOIDSTONE = registerBlock("cobbled_voidstone",
            () -> new Block(BlockBehaviour
                    .Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.ANCIENT_DEBRIS)
            ));



    //Zenalite Set
    public static final DeferredBlock<Block> ZENALITE_BRICKS = registerBlock("zenalite_bricks",
            () -> new Block(BlockBehaviour
                    .Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE_TILES)
            ));
    public static final DeferredBlock<StairBlock> ZENALITE_STAIRS = registerBlock("zenalite_stairs",
            () -> new StairBlock(HnSBlocks.ZENALITE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour
                            .Properties
                            .of()
                            .strength(2f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.DEEPSLATE_TILES)
            ));
    public static final DeferredBlock<SlabBlock> ZENALITE_SLAB = registerBlock("zenalite_slab",
            () -> new SlabBlock(
                    BlockBehaviour
                            .Properties
                            .of()
                            .strength(2f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.DEEPSLATE_TILES)
            ));



    //Zenalite Ore
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
    public static final DeferredBlock<Block> ZENALITE_ABYSSLATE_ORE = registerBlock("zenalite_abysslate_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4),
                    BlockBehaviour
                            .Properties.of()
                            .strength(3f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.ANCIENT_DEBRIS)
            ));
    public static final DeferredBlock<Block> ZENALITE_VOIDSTONE_ORE = registerBlock("zenalite_voidstone_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4),
                    BlockBehaviour
                            .Properties.of()
                            .strength(3f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.ANCIENT_DEBRIS)
            ));



    //Wisewood Set
    public static final DeferredBlock<Block> WISEWOOD_PLANK = registerBlock("wisewood_planks",
            () -> new
                    Block(BlockBehaviour
                            .Properties
                            .of()
                            .mapColor(MapColor.WOOD)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sound(SoundType.WOOD)
                            .ignitedByLava()
            ));

    public static final DeferredBlock<StairBlock> WISEWOOD_STAIRS = registerBlock("wisewood_stairs",
            () -> new StairBlock
                    (HnSBlocks.WISEWOOD_PLANK.get().defaultBlockState(),
                    BlockBehaviour
                            .Properties
                            .of()
                            .strength(2.0F, 3.0F)
                            .sound(SoundType.WOOD)
                            .ignitedByLava()
            ));

    public static final DeferredBlock<SlabBlock> WISEWOOD_SLAB = registerBlock("wisewood_slab",
            () -> new SlabBlock(
                    BlockBehaviour
                            .Properties
                            .of()
                            .mapColor(MapColor.WOOD)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sound(SoundType.WOOD)
                            .ignitedByLava()
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

    public static final DeferredBlock<FenceGateBlock> WISEWOOD_FENCE_GATE = registerBlock("wisewood_fence_gate",
            () -> new FenceGateBlock(WoodType.CHERRY,
                    BlockBehaviour
                            .Properties
                            .of()
                            .mapColor(MapColor.WOOD)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sound(SoundType.WOOD)
                            .ignitedByLava()
            ));

    public static final DeferredBlock<FenceBlock> WISEWOOD_FENCE = registerBlock("wisewood_fence",
            () -> new FenceBlock(
                    BlockBehaviour
                            .Properties
                            .of()
                            .mapColor(MapColor.WOOD)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .ignitedByLava()
                            .sound(SoundType.WOOD)
            ));
    public static final DeferredBlock<DoorBlock> WISEWOOD_DOOR = registerBlock("wisewood_door",
            () -> new DoorBlock(
                    BlockSetType.OAK,
                    BlockBehaviour
                    .Properties
                    .of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .noOcclusion()
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)
            ));
    public static final DeferredBlock<TrapDoorBlock> WISEWOOD_TRAPDOOR = registerBlock("wisewood_trapdoor",
            () -> new TrapDoorBlock(
                    BlockSetType.OAK,
                    BlockBehaviour
                            .Properties
                            .of()
                            .mapColor(MapColor.WOOD)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(3.0F)
                            .noOcclusion()
                            .isValidSpawn(Blocks::never)
                            .ignitedByLava()));





    //Compact Block Set
    public static final DeferredBlock<Block> ZENALITE_BLOCK = registerBlock("zenalite_block",
            () -> new Block(BlockBehaviour
                    .Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHERITE_BLOCK)
            ));
    public static final DeferredBlock<Block> PYRIUM_BLOCK = registerBlock("pyrium_block",
            () -> new Block(BlockBehaviour
                    .Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHERITE_BLOCK)
            ));
    public static final DeferredBlock<Block> MITHRIL_BLOCK = registerBlock("mithril_block",
            () -> new Block(BlockBehaviour
                    .Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHERITE_BLOCK)
            ));
    public static final DeferredBlock<Block> ARCANE_STEEL_BLOCK = registerBlock("arcane_steel_block",
            () -> new Block(BlockBehaviour
                    .Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHERITE_BLOCK)
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
