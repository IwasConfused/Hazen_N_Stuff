package net.hazen.hazennstuff.item;

import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.block.HnSBlocks;
import net.hazen.hazennstuff.item.item.HnSItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class HnSCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HazenNStuff.MOD_ID);

    public static final Supplier<CreativeModeTab> HAZEN_N_STUFF_MATERIALS = CREATIVE_MODE_TAB.register("hazennstuff_materials",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(HnSItems.ZENALITE_INGOT.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "hazennstuff_blocks"))
                    .title(Component.translatable("creativetab.hazennstuff.hazennstuff_materials"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(HnSItems.ZENALITE_INGOT);
                        output.accept(HnSItems.RAWZENALITE);
                        output.accept(HnSItems.STARKISSEDZENALITE);
                        output.accept(HnSItems.DIVINE_MOLD);
                        output.accept(HnSItems.SILVER_SCRAPS);
                        output.accept(HnSItems.EXCALIBUR_FRAGMENT);
                        output.accept(HnSItems.DIVINE_MOLD);
                        output.accept(HnSBlocks.FIREBLOSSOM);
                    }).build());

    public static final Supplier<CreativeModeTab> HAZEN_N_STUFF_BLOCKS = CREATIVE_MODE_TAB.register("hazennstuff_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(HnSBlocks.ZENALITE_ABYSSLATE_ORE.get()))
                    .title(Component.translatable("creativetab.hazennstuff.hazennstuff_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {

                        //Compact Blocks
                        output.accept(HnSBlocks.ZENALITE_BLOCK);
                        output.accept(HnSBlocks.PYRIUM_BLOCK);
                        output.accept(HnSBlocks.MITHRIL_BLOCK);
                        output.accept(HnSBlocks.ARCANE_STEEL_BLOCK);


                        //Zenalite Set
                        output.accept(HnSBlocks.ZENALITE_BRICKS);
                        output.accept(HnSBlocks.ZENALITE_SLAB);
                        output.accept(HnSBlocks.ZENALITE_STAIRS);


                        //Ore
                        output.accept(HnSBlocks.ZENALITE_DEEPSLATE_ORE);
                        output.accept(HnSBlocks.ZENALITE_STONE_ORE);
                        output.accept(HnSBlocks.ZENALITE_ABYSSLATE_ORE);
                        output.accept(HnSBlocks.ZENALITE_VOIDSTONE_ORE);

                        //Overworld Blocks
                        output.accept(HnSBlocks.RUNESTONE_SLAG);
                        output.accept(HnSBlocks.AQUASTONE);

                        //Nether Blocks

                        //End Blocks
                        output.accept(HnSBlocks.ABYSSLATE);
                        output.accept(HnSBlocks.PHANTASMIUM);
                        output.accept(HnSBlocks.COBBLED_VOIDSTONE);
                        output.accept(HnSBlocks.VOIDSTONE);

                        //Wisewood Set
                        output.accept(HnSBlocks.WISEWOOD_PLANK);
                        output.accept(HnSBlocks.WISEWOOD_SLAB);
                        output.accept(HnSBlocks.WISEWOOD_STAIRS);
                        output.accept(HnSBlocks.WISEWOOD_LEAVES);
                        output.accept(HnSBlocks.WISEWOOD_LOG);
                        output.accept(HnSBlocks.STRIPPED_WISEWOOD_LOG);
                    }).build());

    public static final Supplier<CreativeModeTab> HAZEN_N_STUFF_EQUIPMENT = CREATIVE_MODE_TAB.register("hazennstuff_equipment",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(HnSItems.RADIANCE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "hazennstuff_materials"))
                    .title(Component.translatable("creativetab.hazennstuff.hazennstuff_equipment"))
                    .displayItems((itemDisplayParameters, output) -> {
                        // Creaking
                        output.accept(HnSItems.CREAKING_HELMET.get());
                        output.accept(HnSItems.CREAKING_CHESTPLATE.get());
                        output.accept(HnSItems.CREAKING_LEGGINGS.get());
                        output.accept(HnSItems.CREAKING_BOOTS.get());
                        // Legionnaire
                        output.accept(HnSItems.LEGIONNAIRE_HELMET.get());
                        output.accept(HnSItems.LEGIONNAIRE_CHESTPLATE.get());
                        output.accept(HnSItems.LEGIONNAIRE_LEGGINGS.get());
                        output.accept(HnSItems.LEGIONNAIRE_BOOTS.get());
                        // Seraph
                        output.accept(HnSItems.SERAPH_HELMET.get());
                        output.accept(HnSItems.SERAPH_CHESTPLATE.get());
                        output.accept(HnSItems.SERAPH_LEGGINGS.get());
                        output.accept(HnSItems.SERAPH_BOOTS.get());
                        // Scourge
                        output.accept(HnSItems.CHARGED_SCOURGE_HELMET.get());
                        output.accept(HnSItems.CHARGED_SCOURGE_CHESTPLATE.get());
                        output.accept(HnSItems.CHARGED_SCOURGE_LEGGINGS.get());
                        output.accept(HnSItems.CHARGED_SCOURGE_BOOTS.get());
                        // Soul Flamed
                        output.accept(HnSItems.SOUL_FLAME_HELMET.get());
                        output.accept(HnSItems.SOUL_FLAME_CHESTPLATE.get());
                        output.accept(HnSItems.SOUL_FLAME_LEGGINGS.get());
                        output.accept(HnSItems.SOUL_FLAME_BOOTS.get());
                        // Supreme Witch
                        output.accept(HnSItems.SUPREME_WITCH_HELMET.get());
                        output.accept(HnSItems.SUPREME_WITCH_CHESTPLATE.get());
                        output.accept(HnSItems.SUPREME_WITCH_LEGGINGS.get());
                        output.accept(HnSItems.SUPREME_WITCH_BOOTS.get());
                        // Cryogenic Ruler
                        output.accept(HnSItems.CRYOGENIC_RULER_HELMET.get());
                        output.accept(HnSItems.CRYOGENIC_RULER_CHESTPLATE.get());
                        output.accept(HnSItems.CRYOGENIC_RULER_LEGGINGS.get());
                        output.accept(HnSItems.CRYOGENIC_RULER_BOOTS.get());
                        // Flesh Mass
                        output.accept(HnSItems.FLESH_MASS_HELMET.get());
                        output.accept(HnSItems.FLESH_MASS_CHESTPLATE.get());
                        output.accept(HnSItems.FLESH_MASS_LEGGINGS.get());
                        output.accept(HnSItems.FLESH_MASS_BOOTS.get());
                        // Ender Dragon
                        output.accept(HnSItems.ENDER_DRAGON_HELMET.get());
                        output.accept(HnSItems.ENDER_DRAGON_CHESTPLATE.get());
                        output.accept(HnSItems.ENDER_DRAGON_LEGGINGS.get());
                        output.accept(HnSItems.ENDER_DRAGON_BOOTS.get());
                        // Dark Ritual Templar
                        output.accept(HnSItems.DARK_RITUAL_TEMPLAR_HELMET.get());
                        output.accept(HnSItems.DARK_RITUAL_TEMPLAR_CHESTPLATE.get());
                        output.accept(HnSItems.DARK_RITUAL_TEMPLAR_LEGGINGS.get());
                        output.accept(HnSItems.DARK_RITUAL_TEMPLAR_BOOTS.get());
                        // Frieren
                        output.accept(HnSItems.FRIEREN_HELMET.get());
                        output.accept(HnSItems.FRIEREN_CHESTPLATE.get());
                        output.accept(HnSItems.FRIEREN_LEGGINGS.get());
                        output.accept(HnSItems.FRIEREN_BOOTS.get());
                        // Synthesizer V
                        output.accept(HnSItems.SYNTHESIZER_V_HELMET.get());
                        output.accept(HnSItems.SYNTHESIZER_V_CHESTPLATE.get());
                        output.accept(HnSItems.SYNTHESIZER_V_LEGGINGS.get());
                        output.accept(HnSItems.SYNTHESIZER_V_BOOTS.get());
                        // Utau
                        output.accept(HnSItems.UTAU_HELMET.get());
                        output.accept(HnSItems.UTAU_CHESTPLATE.get());
                        output.accept(HnSItems.UTAU_LEGGINGS.get());
                        output.accept(HnSItems.UTAU_BOOTS.get());
                        // Project Sekai
                        output.accept(HnSItems.PROJECT_SEKAI_HELMET.get());
                        output.accept(HnSItems.PROJECT_SEKAI_CHESTPLATE.get());
                        output.accept(HnSItems.PROJECT_SEKAI_LEGGINGS.get());
                        output.accept(HnSItems.PROJECT_SEKAI_BOOTS.get());
                        // Rotten Girl
                        output.accept(HnSItems.ROTTEN_GIRL_HELMET.get());
                        output.accept(HnSItems.ROTTEN_GIRL_CHESTPLATE.get());
                        output.accept(HnSItems.ROTTEN_GIRL_LEGGINGS.get());
                        output.accept(HnSItems.ROTTEN_GIRL_BOOTS.get());
                        // Fireblossom
                        output.accept(HnSItems.FIREBLOSSOM_BATTLEMAGE_CROWN.get());
                        output.accept(HnSItems.FIREBLOSSOM_BATTLEMAGE_HELMET.get());
                        output.accept(HnSItems.FIREBLOSSOM_BATTLEMAGE_CHESTPLATE.get());
                        output.accept(HnSItems.FIREBLOSSOM_BATTLEMAGE_LEGGINGS.get());
                        output.accept(HnSItems.FIREBLOSSOM_BATTLEMAGE_BOOTS.get());


                        //Geckolib

                        // Creaking
                        output.accept(HnSItems.GECKOLIB_CREAKING_HELMET.get());
                        output.accept(HnSItems.GECKOLIB_CREAKING_CHESTPLATE.get());
                        output.accept(HnSItems.GECKOLIB_CREAKING_LEGGINGS.get());
                        output.accept(HnSItems.GECKOLIB_CREAKING_BOOTS.get());
                        // Seraph
                        output.accept(HnSItems.GECKOLIB_SERAPH_HELMET.get());
                        output.accept(HnSItems.GECKOLIB_SERAPH_CHESTPLATE.get());
                        output.accept(HnSItems.GECKOLIB_SERAPH_LEGGINGS.get());
                        output.accept(HnSItems.GECKOLIB_SERAPH_BOOTS.get());
                        // Scourge
                        output.accept(HnSItems.GECKOLIB_CHARGED_SCOURGE_HELMET.get());
                        output.accept(HnSItems.GECKOLIB_CHARGED_SCOURGE_CHESTPLATE.get());
                        output.accept(HnSItems.GECKOLIB_CHARGED_SCOURGE_LEGGINGS.get());
                        output.accept(HnSItems.GECKOLIB_CHARGED_SCOURGE_BOOTS.get());
                        // Soul Flamed
                        output.accept(HnSItems.GECKOLIB_SOUL_FLAME_HELMET.get());
                        output.accept(HnSItems.GECKOLIB_SOUL_FLAME_CHESTPLATE.get());
                        output.accept(HnSItems.GECKOLIB_SOUL_FLAME_LEGGINGS.get());
                        output.accept(HnSItems.GECKOLIB_SOUL_FLAME_BOOTS.get());
                        // Supreme Witch
                        output.accept(HnSItems.GECKOLIB_SUPREME_WITCH_HELMET.get());
                        output.accept(HnSItems.GECKOLIB_SUPREME_WITCH_CHESTPLATE.get());
                        output.accept(HnSItems.GECKOLIB_SUPREME_WITCH_LEGGINGS.get());
                        output.accept(HnSItems.GECKOLIB_SUPREME_WITCH_BOOTS.get());
                        // Cryogenic Ruler
                        output.accept(HnSItems.GECKOLIB_CRYOGENIC_RULER_HELMET.get());
                        output.accept(HnSItems.GECKOLIB_CRYOGENIC_RULER_CHESTPLATE.get());
                        output.accept(HnSItems.GECKOLIB_CRYOGENIC_RULER_LEGGINGS.get());
                        output.accept(HnSItems.GECKOLIB_CRYOGENIC_RULER_BOOTS.get());
                        // Flesh Mass
                        output.accept(HnSItems.GECKOLIB_FLESH_MASS_HELMET.get());
                        output.accept(HnSItems.GECKOLIB_FLESH_MASS_CHESTPLATE.get());
                        output.accept(HnSItems.GECKOLIB_FLESH_MASS_LEGGINGS.get());
                        output.accept(HnSItems.GECKOLIB_FLESH_MASS_BOOTS.get());
                        // Ender Dragon
                        output.accept(HnSItems.GECKOLIB_ENDER_DRAGON_HELMET.get());
                        output.accept(HnSItems.GECKOLIB_ENDER_DRAGON_CHESTPLATE.get());
                        output.accept(HnSItems.GECKOLIB_ENDER_DRAGON_LEGGINGS.get());
                        output.accept(HnSItems.GECKOLIB_ENDER_DRAGON_BOOTS.get());
                        // Supreme Witch
                        output.accept(HnSItems.GECKOLIB_DARK_RITUAL_TEMPLAR_HELMET.get());
                        output.accept(HnSItems.GECKOLIB_DARK_RITUAL_TEMPLAR_CHESTPLATE.get());
                        output.accept(HnSItems.GECKOLIB_DARK_RITUAL_TEMPLAR_LEGGINGS.get());
                        output.accept(HnSItems.GECKOLIB_DARK_RITUAL_TEMPLAR_BOOTS.get());
                        // Fireblossom
                        output.accept(HnSItems.GECKOLIB_FIREBLOSSOM_BATTLEMAGE_CROWN.get());
                        output.accept(HnSItems.GECKOLIB_FIREBLOSSOM_BATTLEMAGE_HELMET.get());
                        output.accept(HnSItems.GECKOLIB_FIREBLOSSOM_BATTLEMAGE_CHESTPLATE.get());
                        output.accept(HnSItems.GECKOLIB_FIREBLOSSOM_BATTLEMAGE_LEGGINGS.get());
                        output.accept(HnSItems.GECKOLIB_FIREBLOSSOM_BATTLEMAGE_BOOTS.get());



                    }).build());

    public static final Supplier<CreativeModeTab> HAZEN_N_STUFF_WEAPONS = CREATIVE_MODE_TAB.register("hazennstuff_utility",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(HnSItems.RADIANCE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "hazennstuff_equipment"))
                    .title(Component.translatable("creativetab.hazennstuff.hazennstuff_equipment"))
                    .displayItems((itemDisplayParameters, output) -> {

                        //Weapons


                        //Fireblossom Rapier
                        output.accept(HnSItems.FIREBLOSSOM_RAPIER.get());
                        //Beongae
                        output.accept(HnSItems.BEONGAE.get());
                        //Ancient Warriors Axe
                        output.accept(HnSItems.ANCIENT_WARRIORS_AXE.get());
                        //Ice Pike
                        output.accept(HnSItems.ICE_PIKE.get());


                        //Staves

                        //Wisewood Cane
                        output.accept(HnSItems.WISEWOOD_CANE.get());
                        //Frieren Staff
                        output.accept(HnSItems.FRIEREN_STAFF.get());


                        //Curios
                        output.accept(HnSItems.RUPTURED.get());
                        output.accept(HnSItems.REFINED.get());
                        output.accept(HnSItems.REINFORCED.get());
                        output.accept(HnSItems.RADIANCE.get());


                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
