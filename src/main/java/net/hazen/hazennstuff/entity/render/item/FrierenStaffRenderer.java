package net.hazen.hazennstuff.entity.render.item;

import net.hazen.hazennstuff.item.staves.FrierenStaffItem;
import net.hazen.hazennstuff.item.staves.FrierenStaffModel;
import net.hazen.hazennstuff.item.weapons.FireblossomRapierItem;
import net.hazen.hazennstuff.item.weapons.FireblossomRapierModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class FrierenStaffRenderer extends GeoItemRenderer<FrierenStaffItem> {
    public FrierenStaffRenderer() {
        super(new FrierenStaffModel());
        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
