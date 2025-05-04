package net.hazen.hazennstuff.entity.render.item.staves;

import net.hazen.hazennstuff.item.staves.frieren.FrierenStaffItem;
import net.hazen.hazennstuff.item.staves.frieren.FrierenStaffModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class FrierenStaffRenderer extends GeoItemRenderer<FrierenStaffItem> {
    public FrierenStaffRenderer() {
        super(new FrierenStaffModel());
        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
