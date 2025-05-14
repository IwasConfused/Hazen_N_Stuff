package net.hazen.hazennstuff.entity.render.item.weapons;

import net.hazen.hazennstuff.item.weapons.ancient_warriors_axe.AncientWarriorsAxeItem;
import net.hazen.hazennstuff.item.weapons.ancient_warriors_axe.AncientWarriorsAxeModel;
import net.hazen.hazennstuff.item.weapons.skyscorcher.SkyscorcherItem;
import net.hazen.hazennstuff.item.weapons.skyscorcher.SkyscorcherModel;
import net.hazen.hazennstuff.item.weapons.starfury.StarfuryItem;
import net.hazen.hazennstuff.item.weapons.starfury.StarfuryModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;

public class StarfuryRenderer extends GeoItemRenderer<StarfuryItem> {
    public StarfuryRenderer() {
        super(new StarfuryModel());
        //addRenderLayer(new AutoGlowingGeoLayer<>(this));

        addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
