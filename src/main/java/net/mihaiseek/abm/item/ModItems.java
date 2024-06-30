package net.mihaiseek.abm.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mihaiseek.abm.AnotherBegginerMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DUMMY = registerItem("dummy", new Item(new FabricItemSettings()));
    public static final Item RAW_DUMMY = registerItem("raw_dummy", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(DUMMY);
        entries.add(RAW_DUMMY);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AnotherBegginerMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AnotherBegginerMod.LOGGER.info("Registering Mod Items for " + AnotherBegginerMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}