package info.lbrown.minecraft.lethalcraft;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class LethalCraftBlocks {
    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        Identifier id = Identifier.of(LethalCraft.MOD_ID, name);

        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }

    public static final BlockSetType FACILITY_BLOCK_SET_TYPE = new BlockSetType(
            "facility",
            true,
            false,
            false,
            BlockSetType.ActivationRule.EVERYTHING,
            BlockSoundGroup.METAL,
            LethalCraftSounds.FACILITY_DOOR_CLOSE,
            LethalCraftSounds.FACILITY_DOOR_OPEN,
            SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE,
            SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN,
            SoundEvents.BLOCK_METAL_PRESSURE_PLATE_CLICK_OFF,
            SoundEvents.BLOCK_METAL_PRESSURE_PLATE_CLICK_ON,
            SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF,
            SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON
            );


    public static final Block CONDENSED_DIRT = register(
            new Block(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GRASS)
                    .strength(0.4f)
            ),
            "condensed_dirt",
            true
    );

    public static final Block FACILITY_DOOR = register(
            new DoorBlock(FACILITY_BLOCK_SET_TYPE,
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.METAL)
                            .strength(0.4f)
                            .nonOpaque()
                            .requiresTool()
                    // AbstractBlock.Settings.copy(Blocks.IRON_DOOR)
                    ),
            "facility_door",
            true
    );

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(LethalCraftItems.LETHALCRAFT_ITEM_GROUP_KEY).register((itemGroup) -> {
            itemGroup.add(CONDENSED_DIRT.asItem());
            itemGroup.add(FACILITY_DOOR.asItem());
        });
    }
}
