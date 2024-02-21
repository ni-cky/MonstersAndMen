package net.nicky.monstersandmen.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nicky.monstersandmen.MonstersAndMen;
import net.nicky.monstersandmen.entity.custom.ChimeraEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MonstersAndMen.MOD_ID);

    public static final RegistryObject<EntityType<ChimeraEntity>> CHIMERA =
            ENTITY_TYPES.register("chimera", () -> EntityType.Builder.of(ChimeraEntity::new, MobCategory.MONSTER)
                    .sized(2.5f,2.5f).build("chimera"));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
