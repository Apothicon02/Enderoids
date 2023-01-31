package com.Apothic0n.Enderoids;

import com.Apothic0n.Enderoids.api.biome.features.EnderoidsFeatureRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.valkyrienskies.eureka.ship.EurekaShipControl;

@Mod(Enderoids.MODID)
public class Enderoids {
    public static final String MODID = "endroid";

    public Enderoids() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);

        EnderoidsFeatureRegistry.register(eventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {

        });
    }
}