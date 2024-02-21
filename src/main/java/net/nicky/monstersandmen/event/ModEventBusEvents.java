package net.nicky.monstersandmen.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.nicky.monstersandmen.MonstersAndMen;
import net.nicky.monstersandmen.entity.ModEntities;
import net.nicky.monstersandmen.entity.custom.ChimeraEntity;

@Mod.EventBusSubscriber(modid = MonstersAndMen.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event){
        event.put(ModEntities.CHIMERA.get(), ChimeraEntity.createAttributes().build());
    }
}
