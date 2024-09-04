package net.space_mod.fabric;

import net.fabricmc.api.ModInitializer;
import net.space_mod.SpaceMod;

public class SpaceModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        SpaceMod.init();
    }
}
