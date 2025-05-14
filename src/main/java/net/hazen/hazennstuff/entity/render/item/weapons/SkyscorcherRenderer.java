package net.hazen.hazennstuff.entity.render.item.weapons;

import net.hazen.hazennstuff.item.weapons.ancient_warriors_axe.AncientWarriorsAxeItem;
import net.hazen.hazennstuff.item.weapons.ancient_warriors_axe.AncientWarriorsAxeModel;
import net.hazen.hazennstuff.item.weapons.skyscorcher.SkyscorcherItem;
import net.hazen.hazennstuff.item.weapons.skyscorcher.SkyscorcherModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;

public class SkyscorcherRenderer extends GeoItemRenderer<SkyscorcherItem> {
    public SkyscorcherRenderer() {
        super(new SkyscorcherModel());
        //addRenderLayer(new AutoGlowingGeoLayer<>(this));

        addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
