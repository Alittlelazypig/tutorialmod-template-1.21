package com.besson.tutorialmod.item;

import com.besson.tutorialmod.TutorialMod;
import com.besson.tutorialmod.blocks.Modblocks;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final RegistryKey<ItemGroup> TUTORIAL_GROUP = register("tutorial_group");
    public static final RegistryKey<ItemGroup> BLOCK_GROUP = register("block_group");

    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.ofVanilla(id));
    }
    public static void registerModItemGroup(){
        Registry.register(
                Registries.ITEM_GROUP, TUTORIAL_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP,-1)
                        .displayName(Text.translatable("itemGroup.tutorialmod.tutorial_group"))
                        .icon(() -> new ItemStack(ModItems.ICE_ETHER))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.ICE_ETHER);
                            entries.add(ModItems.MY_NEWITEMS);
                            entries.add(ModItems.YELLOW_JUNK);
                        })
                        .build()
        );
        Registry.register(Registries.ITEM_GROUP, BLOCK_GROUP,
        ItemGroup.create(ItemGroup.Row.TOP,-1)
                .displayName(Text.translatable("itemGroup.tutorialmod.block_group"))
                                .icon(() -> new ItemStack(ModItems.MY_NEWITEMS))
                                        .entries((displayContext, entries) -> {

                                            entries.add(Modblocks.CAIXIN_HEAT);
                                            entries.add(Modblocks.HEGUOBANG_HEAT);
                                            entries.add(Modblocks.WANGWENJUN_HEAT);

                                                })
                                                .build()
        );

        TutorialMod.LOGGER.info("Registering Groups");
    }
//api方法
//    public static final ItemGroup TUTORIAL_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(TutorialMod.MOD_ID,"tutorial_group"),
//            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.tutorial_group"))
//                    .icon(() -> new ItemStack(ModItems.ICE_ETHER))
//                    .entries((displayContext, entries) -> {
//                        entries.add(ModItems.ICE_ETHER);
//                        entries.add(ModItems.MY_NEWITEMS);
//                    }).build());
//    public static void registerModItemGroup(){
//        TutorialMod.LOGGER.info("初始化成功");
//    }
}
