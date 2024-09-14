package info.lbrown.minecraft.lethalcraft;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class LethalCraftItems {

    public static Item register(Item item, String id) {
        Identifier itemID = Identifier.of(LethalCraft.MOD_ID, id);
        return Registry.register(Registries.ITEM, itemID, item);
    }

    public static final RegistryKey<ItemGroup> LETHALCRAFT_ITEM_GROUP_KEY = RegistryKey.of(
            Registries.ITEM_GROUP.getKey(),
            Identifier.of(LethalCraft.MOD_ID, "lethalcraft")
    );

    public static final Item SUSPICIOUS_SUBSTANCE = register(
            new Item(new Item.Settings()),
            "suspicious_substance"
    );

    public static final ItemGroup LETHALCRAFT_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(SUSPICIOUS_SUBSTANCE))
            .displayName(Text.translatable("itemGroup.lethalcraft"))
            .build();

    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, LETHALCRAFT_ITEM_GROUP_KEY, LETHALCRAFT_ITEM_GROUP);

        ItemGroupEvents.modifyEntriesEvent(LETHALCRAFT_ITEM_GROUP_KEY)
                .register((itemGroup) -> {
                    itemGroup.add(SUSPICIOUS_SUBSTANCE);
                });

        CompostingChanceRegistry.INSTANCE.add(SUSPICIOUS_SUBSTANCE, 0.3f);
        FuelRegistry.INSTANCE.add(SUSPICIOUS_SUBSTANCE, 30 * 20);
    }
}
