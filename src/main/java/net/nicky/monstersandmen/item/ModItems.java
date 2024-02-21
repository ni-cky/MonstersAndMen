package net.nicky.monstersandmen.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nicky.monstersandmen.MonstersAndMen;
import net.nicky.monstersandmen.entity.ModEntities;

public class ModItems {

    private static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MonstersAndMen.MOD_ID);

    public static final RegistryObject<Item> CHIMERA_SPAWN_EGG = ITEMS.register("chimera_spawn_egg",
            ()-> new ForgeSpawnEggItem(ModEntities.CHIMERA, 0x7e9680, 0xc5d1c5,
            new Item.Properties()));
    
    public static void register(IEventBus eventBus) { ITEMS.register(eventBus);}
}
