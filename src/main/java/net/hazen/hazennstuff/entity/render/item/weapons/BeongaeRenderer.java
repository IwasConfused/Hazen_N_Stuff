package net.hazen.hazennstuff.entity.render.item.weapons;

import net.hazen.hazennstuff.item.weapons.beongae.BeongaeItem;
import net.hazen.hazennstuff.item.weapons.beongae.BeongaeModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class BeongaeRenderer extends GeoItemRenderer<BeongaeItem> {
    public BeongaeRenderer() {
        super(new BeongaeModel());
        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
