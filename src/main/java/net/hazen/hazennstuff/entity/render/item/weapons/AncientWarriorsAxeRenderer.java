package net.hazen.hazennstuff.entity.render.item.weapons;

import net.hazen.hazennstuff.item.weapons.ancient_warriors_axe.AncientWarriorsAxeItem;
import net.hazen.hazennstuff.item.weapons.ancient_warriors_axe.AncientWarriorsAxeModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class AncientWarriorsAxeRenderer extends GeoItemRenderer<AncientWarriorsAxeItem> {
    public AncientWarriorsAxeRenderer() {
        super(new AncientWarriorsAxeModel());
        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
