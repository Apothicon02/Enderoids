package com.Apothic0n.Enderoids.api.biome.features;

import com.Apothic0n.Enderoids.Enderoids;
import com.Apothic0n.Enderoids.api.biome.features.types.EndShipFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EnderoidsFeatureRegistry {

    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, Enderoids.MODID);

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> MOSS_ISLAND = FEATURES.register("end_ship", () ->
            new EndShipFeature(NoneFeatureConfiguration.CODEC));

    public static void register(IEventBus eventBus) {
        FEATURES.register(eventBus);
    }
}
