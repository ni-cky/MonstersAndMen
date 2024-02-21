package net.nicky.monstersandmen.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.nicky.monstersandmen.MonstersAndMen;

public class ModCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MonstersAndMen.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MONSTERS_TAB = CREATIVE_MODE_TABS.register("monsters_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Items.SKELETON_SKULL))
                    .title(Component.translatable("creativetab.monsters_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.CHIMERA_SPAWN_EGG.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
