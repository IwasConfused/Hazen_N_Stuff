package net.hazen.hazennstuff.entity.render.item.weapons;

import net.hazen.hazennstuff.item.weapons.fireblossom_rapier.FireblossomRapierItem;
import net.hazen.hazennstuff.item.weapons.fireblossom_rapier.FireblossomRapierModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class FireblossomRapierRenderer extends GeoItemRenderer<FireblossomRapierItem> {
    public FireblossomRapierRenderer() {
        super(new FireblossomRapierModel());
        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
