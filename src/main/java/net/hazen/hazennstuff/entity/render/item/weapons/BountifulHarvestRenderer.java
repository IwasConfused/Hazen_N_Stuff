package net.hazen.hazennstuff.entity.render.item.weapons;

import net.hazen.hazennstuff.item.weapons.bountiful_harvest.BountifulHarvestItem;
import net.hazen.hazennstuff.item.weapons.bountiful_harvest.BountifulHarvestModel;
import net.hazen.hazennstuff.item.weapons.ice_pike.IcePikeItem;
import net.hazen.hazennstuff.item.weapons.ice_pike.IcePikeModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class BountifulHarvestRenderer extends GeoItemRenderer<BountifulHarvestItem> {
    public BountifulHarvestRenderer() {
        super(new BountifulHarvestModel());
        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
