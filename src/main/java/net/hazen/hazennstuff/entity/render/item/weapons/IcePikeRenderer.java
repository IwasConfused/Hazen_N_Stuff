package net.hazen.hazennstuff.entity.render.item.weapons;

import net.hazen.hazennstuff.item.weapons.ice_pike.IcePikeItem;
import net.hazen.hazennstuff.item.weapons.ice_pike.IcePikeModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class IcePikeRenderer extends GeoItemRenderer<IcePikeItem> {
    public IcePikeRenderer() {
        super(new IcePikeModel());
        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
