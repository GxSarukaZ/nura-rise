package net.namozdizex.nura.registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.namozdizex.nura.NuraRise;
import net.namozdizex.nura.entity.Nurarihyon;

public class NREntity
{
    public static final EntityType<Nurarihyon> NURARIHYON = FabricEntityTypeBuilder.create(MobCategory.CREATURE, Nurarihyon::new).dimensions(EntityDimensions.fixed(0.7F,0.4F)).build();
    public static void init() {

        register("nurarihyon",NURARIHYON);

    }
    private static <T extends Entity> EntityType<T> register(String key, EntityType<T> type)
    {
        return Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(NuraRise.MOD_ID, key), type);
    }
}
