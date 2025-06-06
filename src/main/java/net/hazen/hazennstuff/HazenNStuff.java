package net.hazen.hazennstuff;

import mod.azure.azurelib.rewrite.animation.cache.AzIdentityRegistry;
import mod.azure.azurelib.rewrite.render.armor.AzArmorRendererRegistry;
import mod.azure.azurelib.rewrite.render.item.AzItemRendererRegistry;
import net.hazen.hazennstuff.registries.*;
import net.hazen.hazennstuff.entity.render.armor.*;
import net.hazen.hazennstuff.entity.render.item.weapons.HammerOfJusticeRenderer;
import net.hazen.hazennstuff.item.armor.HnSArmorMaterials;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(HazenNStuff.MOD_ID)
public class HazenNStuff
{
    public static final String MOD_ID = "hazennstuff";
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public HazenNStuff(IEventBus modEventBus, ModContainer modContainer)
    {
        NeoForge.EVENT_BUS.register(this);

        HnSCreativeModeTabs.register(modEventBus);

        HnSItems.register(modEventBus);
        HnSItems.HnSBlocks.register(modEventBus);
        HnSArmorMaterials.register(modEventBus);

        HnSEffects.register(modEventBus);
        HnSSounds.register(modEventBus);
        HnSEntityRegistry.register(modEventBus);
        SpellRegistries.register(modEventBus);

        modEventBus.addListener(this::addCreative);

      modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");

        if (Config.logDirtBlock)
            LOGGER.info("DIRT BLOCK >> {}", BuiltInRegistries.BLOCK.getKey(Blocks.DIRT));

        LOGGER.info(Config.magicNumberIntroduction + Config.magicNumber);

        Config.items.forEach((item) -> LOGGER.info("ITEM >> {}", item.toString()));
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {



        /*if (event.getTabKey() == CreativeModeTabs.COMBAT)
            event.accept(ModItems.CREAKING_MASK);
        if (event.getTabKey() == CreativeModeTabs.COMBAT)
            event.accept(ModItems.CREAKING_CHESTPLATE);
        if (event.getTabKey() == CreativeModeTabs.COMBAT)
            event.accept(ModItems.CREAKING_LEGGINGS);
        if (event.getTabKey() == CreativeModeTabs.COMBAT)
            event.accept(ModItems.CREAKING_BOOTS);*/

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELP!");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

            // Armor Rendering Registry

            //Arbitrium Robes
            AzArmorRendererRegistry.register(ArbitriumRobesArmorRenderer::new,
                    HnSItems.ARBITRIUM_ROBES_HELMET.get(),
                    HnSItems.ARBITRIUM_ROBES_CHESTPLATE.get(),
                    HnSItems.ARBITRIUM_ROBES_LEGGINGS.get(),
                    HnSItems.ARBITRIUM_ROBES_BOOTS.get());

            //Charged Scourge
            AzArmorRendererRegistry.register(ChargedScourgeArmorRenderer::new,
                    HnSItems.CHARGED_SCOURGE_HELMET.get(),
                    HnSItems.CHARGED_SCOURGE_CHESTPLATE.get(),
                    HnSItems.CHARGED_SCOURGE_LEGGINGS.get(),
                    HnSItems.CHARGED_SCOURGE_BOOTS.get());

            //Creaking
            AzArmorRendererRegistry.register(CreakingSorcererArmorRenderer::new,
                    HnSItems.CREAKING_HELMET.get(),
                    HnSItems.CREAKING_CHESTPLATE.get(),
                    HnSItems.CREAKING_LEGGINGS.get(),
                    HnSItems.CREAKING_BOOTS.get());

            //Cryogenic Ruler
            AzArmorRendererRegistry.register(CryogenicRulerArmorRenderer::new,
                    HnSItems.CRYOGENIC_RULER_HELMET.get(),
                    HnSItems.CRYOGENIC_RULER_CHESTPLATE.get(),
                    HnSItems.CRYOGENIC_RULER_LEGGINGS.get(),
                    HnSItems.CRYOGENIC_RULER_BOOTS.get());

            //Dark Ritual Templar
            AzArmorRendererRegistry.register(DarkRitualTemplarArmorRenderer::new,
                    HnSItems.DARK_RITUAL_TEMPLAR_HELMET.get(),
                    HnSItems.DARK_RITUAL_TEMPLAR_CHESTPLATE.get(),
                    HnSItems.DARK_RITUAL_TEMPLAR_LEGGINGS.get(),
                    HnSItems.DARK_RITUAL_TEMPLAR_BOOTS.get());

            // Ender Dragon
            AzArmorRendererRegistry.register(EnderDragonArmorRenderer::new,
                    HnSItems.ENDER_DRAGON_HELMET.get(),
                    HnSItems.ENDER_DRAGON_CHESTPLATE.get(),
                    HnSItems.ENDER_DRAGON_LEGGINGS.get(),
                    HnSItems.ENDER_DRAGON_BOOTS.get());

            // Fireblossom Helmet
            AzArmorRendererRegistry.register(FireblossomBattlemageHelmetArmorRenderer::new,
                    HnSItems.FIREBLOSSOM_BATTLEMAGE_HELMET.get(),
                    HnSItems.FIREBLOSSOM_BATTLEMAGE_CHESTPLATE.get(),
                    HnSItems.FIREBLOSSOM_BATTLEMAGE_LEGGINGS.get(),
                    HnSItems.FIREBLOSSOM_BATTLEMAGE_BOOTS.get());
            // Fireblossom Crown
            AzArmorRendererRegistry.register(FireblossomBattlemageCrownedArmorRenderer::new,
                    HnSItems.FIREBLOSSOM_BATTLEMAGE_BOOTS.get());

            // Flesh Mass
            AzArmorRendererRegistry.register(FleshMassArmorRenderer::new,
                    HnSItems.FLESH_MASS_HELMET.get(),
                    HnSItems.FLESH_MASS_CHESTPLATE.get(),
                    HnSItems.FLESH_MASS_LEGGINGS.get(),
                    HnSItems.FLESH_MASS_BOOTS.get());

            // Seraph
            AzArmorRendererRegistry.register(SeraphArmorRenderer::new,
                    HnSItems.SERAPH_HELMET.get(),
                    HnSItems.SERAPH_CHESTPLATE.get(),
                    HnSItems.SERAPH_LEGGINGS.get(),
                    HnSItems.SERAPH_BOOTS.get());

            // Soul Flame
            AzArmorRendererRegistry.register(SoulFlameArmorRenderer::new,
                    HnSItems.SOUL_FLAME_HELMET.get(),
                    HnSItems.SOUL_FLAME_CHESTPLATE.get(),
                    HnSItems.SOUL_FLAME_LEGGINGS.get(),
                    HnSItems.SOUL_FLAME_BOOTS.get());

            // Supreme Witch
            AzArmorRendererRegistry.register(SupremeWitchArmorRenderer::new,
                    HnSItems.SUPREME_WITCH_HELMET.get(),
                    HnSItems.SUPREME_WITCH_CHESTPLATE.get(),
                    HnSItems.SUPREME_WITCH_LEGGINGS.get(),
                    HnSItems.SUPREME_WITCH_BOOTS.get());

            //Charged Scourge
            AzArmorRendererRegistry.register(SLCCatArmorRenderer::new,
                    HnSItems.SLC_CAT_HELMET.get(),
                    HnSItems.SLC_CAT_CHESTPLATE.get(),
                    HnSItems.SLC_CAT_LEGGINGS.get(),
                    HnSItems.SLC_CAT_BOOTS.get());


            // Item Rendering Registry
            AzItemRendererRegistry.register(HammerOfJusticeRenderer::new, HnSItems.HAMMER_OF_JUSTICE.get());



            // Animation Registry
            AzIdentityRegistry.register(
                    HnSItems.ARBITRIUM_ROBES_HELMET.get(),
                    HnSItems.ARBITRIUM_ROBES_CHESTPLATE.get(),
                    HnSItems.ARBITRIUM_ROBES_LEGGINGS.get(),
                    HnSItems.ARBITRIUM_ROBES_BOOTS.get(),
                    HnSItems.CHARGED_SCOURGE_HELMET.get(),
                    HnSItems.CHARGED_SCOURGE_CHESTPLATE.get(),
                    HnSItems.CHARGED_SCOURGE_LEGGINGS.get(),
                    HnSItems.CHARGED_SCOURGE_BOOTS.get(),
                    HnSItems.CREAKING_HELMET.get(),
                    HnSItems.CREAKING_CHESTPLATE.get(),
                    HnSItems.CREAKING_LEGGINGS.get(),
                    HnSItems.CREAKING_BOOTS.get(),
                    HnSItems.CRYOGENIC_RULER_HELMET.get(),
                    HnSItems.CRYOGENIC_RULER_CHESTPLATE.get(),
                    HnSItems.CRYOGENIC_RULER_LEGGINGS.get(),
                    HnSItems.CRYOGENIC_RULER_BOOTS.get(),
                    HnSItems.DARK_RITUAL_TEMPLAR_HELMET.get(),
                    HnSItems.DARK_RITUAL_TEMPLAR_CHESTPLATE.get(),
                    HnSItems.DARK_RITUAL_TEMPLAR_LEGGINGS.get(),
                    HnSItems.DARK_RITUAL_TEMPLAR_BOOTS.get(),
                    HnSItems.ENDER_DRAGON_HELMET.get(),
                    HnSItems.ENDER_DRAGON_CHESTPLATE.get(),
                    HnSItems.ENDER_DRAGON_LEGGINGS.get(),
                    HnSItems.ENDER_DRAGON_BOOTS.get(),
                    HnSItems.FIREBLOSSOM_BATTLEMAGE_HELMET.get(),
                    HnSItems.FIREBLOSSOM_BATTLEMAGE_CHESTPLATE.get(),
                    HnSItems.FIREBLOSSOM_BATTLEMAGE_LEGGINGS.get(),
                    HnSItems.FIREBLOSSOM_BATTLEMAGE_BOOTS.get(),
                    HnSItems.FIREBLOSSOM_BATTLEMAGE_BOOTS.get(),
                    HnSItems.FLESH_MASS_HELMET.get(),
                    HnSItems.FLESH_MASS_CHESTPLATE.get(),
                    HnSItems.FLESH_MASS_LEGGINGS.get(),
                    HnSItems.FLESH_MASS_BOOTS.get(),
                    HnSItems.SERAPH_HELMET.get(),
                    HnSItems.SERAPH_CHESTPLATE.get(),
                    HnSItems.SERAPH_LEGGINGS.get(),
                    HnSItems.SERAPH_BOOTS.get(),
                    HnSItems.SOUL_FLAME_HELMET.get(),
                    HnSItems.SOUL_FLAME_CHESTPLATE.get(),
                    HnSItems.SOUL_FLAME_LEGGINGS.get(),
                    HnSItems.SOUL_FLAME_BOOTS.get(),
                    HnSItems.SUPREME_WITCH_HELMET.get(),
                    HnSItems.SUPREME_WITCH_CHESTPLATE.get(),
                    HnSItems.SUPREME_WITCH_LEGGINGS.get(),
                    HnSItems.SUPREME_WITCH_BOOTS.get(),
                    HnSItems.SLC_CAT_HELMET.get(),
                    HnSItems.SLC_CAT_CHESTPLATE.get(),
                    HnSItems.SLC_CAT_LEGGINGS.get(),
                    HnSItems.SLC_CAT_BOOTS.get(),
                    HnSItems.HAMMER_OF_JUSTICE.get()

            );
        }
    }

    {
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }

    public static ResourceLocation id(@NotNull String path)
    {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, path);
    }
}
