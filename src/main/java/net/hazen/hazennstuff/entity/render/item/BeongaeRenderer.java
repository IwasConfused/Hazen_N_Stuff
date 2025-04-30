package net.hazen.hazennstuff.entity.render.item;

import net.hazen.hazennstuff.item.weapons.BeongaeItem;
import net.hazen.hazennstuff.item.weapons.BeongaeModel;
import net.hazen.hazennstuff.item.weapons.FireblossomRapierItem;
import net.hazen.hazennstuff.item.weapons.FireblossomRapierModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class BeongaeRenderer extends GeoItemRenderer<BeongaeItem> {
    public BeongaeRenderer() {
        super(new BeongaeModel());
        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
