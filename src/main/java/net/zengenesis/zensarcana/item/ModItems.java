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
import net.zengenesis.zensarcana.item.custom.WandItem;

//For new items, copy public static final function, add new entry under ItemGroupEvents, add into en_us.json,
//add json in items, add json in models/item, and add textures
public class ModItems {


    public static final Item AURIUM_SHARDS = registerItem("aurium_shards", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ZensArcana.MOD_ID,"aurium_shards")))));
    public static final Item AURIUM_PLASTEEL = registerItem("aurium_plasteel", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ZensArcana.MOD_ID,"aurium_plasteel")))));

    public static final Item WAND = registerItem("wand", new Item(new Item.Settings().maxDamage(32)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ZensArcana.MOD_ID,"wand")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ZensArcana.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ZensArcana.LOGGER.info("Registering Mod Items for " + ZensArcana.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(AURIUM_SHARDS);
            entries.add(AURIUM_PLASTEEL);

        });
    }
}
