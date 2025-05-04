package net.hazen.hazennstuff.entity.render.item.staves;

import net.hazen.hazennstuff.item.staves.wisewood_cane.WisewoodCaneItem;
import net.hazen.hazennstuff.item.staves.wisewood_cane.WisewoodCaneModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class WisewoodCaneRenderer extends GeoItemRenderer<WisewoodCaneItem> {
    public WisewoodCaneRenderer() {
        super(new WisewoodCaneModel());
        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
