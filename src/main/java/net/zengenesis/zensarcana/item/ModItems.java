package net.zengenesis.zensarcana.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.zengenesis.zensarcana.ZensArcana;

public class ModItems {

    public static final Item RAW_AURIUM = registerItem("raw_aurium", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ZensArcana.MOD_ID,"raw_aurium")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ZensArcana.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ZensArcana.LOGGER.info("Registering Mod Items for " + ZensArcana.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RAW_AURIUM);
        });
    }
}
