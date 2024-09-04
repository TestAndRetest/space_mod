package net.space_mod.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.space_mod.SpaceMod;

@Mod(SpaceMod.MOD_ID)
public class SpaceModForge {
    public SpaceModForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(SpaceMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        SpaceMod.init();
    }
}
