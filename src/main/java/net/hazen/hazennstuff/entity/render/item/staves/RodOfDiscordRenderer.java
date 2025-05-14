package net.hazen.hazennstuff.entity.render.item.staves;

import net.hazen.hazennstuff.item.staves.rod_of_discord.RodOfDiscordItem;
import net.hazen.hazennstuff.item.staves.rod_of_discord.RodOfDiscordModel;
import net.hazen.hazennstuff.item.weapons.ancient_warriors_axe.AncientWarriorsAxeItem;
import net.hazen.hazennstuff.item.weapons.ancient_warriors_axe.AncientWarriorsAxeModel;
import net.hazen.hazennstuff.item.weapons.skyscorcher.SkyscorcherItem;
import net.hazen.hazennstuff.item.weapons.skyscorcher.SkyscorcherModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;

public class RodOfDiscordRenderer extends GeoItemRenderer<RodOfDiscordItem> {
    public RodOfDiscordRenderer() {
        super(new RodOfDiscordModel());
        //addRenderLayer(new AutoGlowingGeoLayer<>(this));

        addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
