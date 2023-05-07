package net.socrate.mist.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.socrate.mist.Mist;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Mist.MOD_ID) ;
    public static final RegistryObject<Item> PROTECTOR = ITEMS.register("protector",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);
    }
}
