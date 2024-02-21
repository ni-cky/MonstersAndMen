package net.nicky.monstersandmen.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.nicky.monstersandmen.MonstersAndMen;
import net.nicky.monstersandmen.entity.client.ChimeraModel;
import net.nicky.monstersandmen.entity.client.ModModelLayers;

@Mod.EventBusSubscriber(modid = MonstersAndMen.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {

    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(ModModelLayers.CHIMERA_LAYER, ChimeraModel::createBodyLayer);
    }

}
