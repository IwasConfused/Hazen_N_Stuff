package net.hazen.hazennstuff.entity.render.item;

import net.hazen.hazennstuff.item.weapons.FireblossomRapierItem;
import net.hazen.hazennstuff.item.weapons.FireblossomRapierModel;
import net.hazen.hazennstuff.item.weapons.IcePikeItem;
import net.hazen.hazennstuff.item.weapons.IcePikeModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class IcePikeRenderer extends GeoItemRenderer<IcePikeItem> {
    public IcePikeRenderer() {
        super(new IcePikeModel());
        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
