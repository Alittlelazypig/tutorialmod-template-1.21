package com.besson.tutorialmod.blocks;

import com.besson.tutorialmod.TutorialMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Modblocks {

    public static final Block CAIXIN_HEAT = register("caixin_heat",
            new Block(
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .strength(1.5F,1.5F)
            )
    );
    public static final Block HEGUOBANG_HEAT = register("heguobang_heat",
            new Block(
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .strength(1.5F,1.5F)
            ));
    public static final Block WANGWENJUN_HEAT = register("wangwenjun_heat",
            new Block(
                    AbstractBlock.Settings.create()
                            .strength(1.5F,1.5F)
            ));

    public static void registerBlockItems(String id, Block block){
        Item item= Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, id), new BlockItem(block, new Item.Settings()));
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
    }
    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TutorialMod.MOD_ID , id), block);
    }
    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Blocks");
    }
}
