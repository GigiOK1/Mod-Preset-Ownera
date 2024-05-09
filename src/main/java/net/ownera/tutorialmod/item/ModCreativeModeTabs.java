package net.ownera.tutorialmod.item;

import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.ownera.tutorialmod.TutorialMod;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CUSTOM_TAB = CREATIVE_MODE_TABS.register("custom_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CRYSTALINE.get()))
                    .title(Component.translatable("creativetab.custom_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.CRYSTALINE_EXTRACT.get());
                        pOutput.accept(ModItems.CRYSTALINE.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
