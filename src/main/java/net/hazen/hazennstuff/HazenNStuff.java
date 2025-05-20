package net.hazen.hazennstuff;

import mod.azure.azurelib.rewrite.animation.cache.AzIdentityRegistry;
import mod.azure.azurelib.rewrite.render.armor.AzArmorRendererRegistry;
import mod.azure.azurelib.rewrite.render.item.AzItemRendererRegistry;
import net.hazen.hazennstuff.block.HnSBlocks;
import net.hazen.hazennstuff.effect.HnSEffects;
import net.hazen.hazennstuff.entity.render.armor.CreakingSorcererArmorRenderer;
import net.hazen.hazennstuff.item.HnSCreativeModeTabs;
import net.hazen.hazennstuff.item.armor.HnSArmorMaterials;
import net.hazen.hazennstuff.item.item.HnSItems;
import net.hazen.hazennstuff.sound.HnSSounds;
import net.hazen.hazennstuff.spells.SpellRegistries;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
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
        HnSBlocks.register(modEventBus);
        HnSArmorMaterials.register(modEventBus);

        HnSEffects.register(modEventBus);
        HnSSounds.register(modEventBus);

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
            AzArmorRendererRegistry.register(CreakingSorcererArmorRenderer::new,
                    HnSItems.CREAKING_HELMET.get(),
                    HnSItems.CREAKING_CHESTPLATE.get(),
                    HnSItems.CREAKING_LEGGINGS.get(),
                    HnSItems.CREAKING_BOOTS.get());


            // Animation Registry
            AzIdentityRegistry.register(
                    HnSItems.CREAKING_HELMET.get(),
                    HnSItems.CREAKING_CHESTPLATE.get(),
                    HnSItems.CREAKING_LEGGINGS.get(),
                    HnSItems.CREAKING_BOOTS.get()
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
