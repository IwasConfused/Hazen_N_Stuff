package net.hazen.hazennstuff.entity.render.item.tools;

import net.hazen.hazennstuff.item.util.spectral_pickaxe.SpectralPickaxeItem;
import net.hazen.hazennstuff.item.util.spectral_pickaxe.SpectralPickaxeModel;
import net.hazen.hazennstuff.item.weapons.ancient_warriors_axe.AncientWarriorsAxeItem;
import net.hazen.hazennstuff.item.weapons.ancient_warriors_axe.AncientWarriorsAxeModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class SpectralPickaxeRenderer extends GeoItemRenderer<SpectralPickaxeItem> {
    public SpectralPickaxeRenderer() {
        super(new SpectralPickaxeModel());
        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
