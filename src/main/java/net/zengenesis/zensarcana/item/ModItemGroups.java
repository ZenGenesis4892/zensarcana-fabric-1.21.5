package net.zengenesis.zensarcana.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.zengenesis.zensarcana.ZensArcana;
import net.zengenesis.zensarcana.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup AURIUM_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ZensArcana.MOD_ID, "zensarcana_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.AURIUM_PLASTEEL))
                    .displayName(Text.translatable("itemgroup.zensarcana.itemgroup"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.AURIUM_SHARDS);
                        entries.add(ModItems.AURIUM_PLASTEEL);
                        entries.add(ModBlocks.AURIUM_PLASTEEL_BLOCK);
                        entries.add(ModBlocks.AURIUM_CRYSTAL_CLUSTER);

                    }).build());



    public static void registerItemGroups() {
        ZensArcana.LOGGER.info("Registering Item Groups for " + ZensArcana.MOD_ID);
    }
}
