package net.hazen.hazennstuff.setup;

import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.entity.spells.brimstone_hellblast.BrimstoneHellblastRenderer;
import net.hazen.hazennstuff.registries.HnSEntityRegistry;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@EventBusSubscriber(modid = HazenNStuff.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {


    @SubscribeEvent
    public static void registerRenderer(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(HnSEntityRegistry.BRIMSTONE_HELLBLAST.get(), BrimstoneHellblastRenderer::new);
    }


}