package com.besson.tutorialmod.item;

import com.besson.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item ICE_ETHER = registerItems("ice_ether",new Item(new Item.Settings()));
    public static final Item MY_NEWITEMS = registerItems("my_newitems",new Item(new Item.Settings()));
    private static Item registerItems(String id, Item item){
        //这是第一个下面 return 为改写更简单
        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(),Identifier.of(TutorialMod.MOD_ID,id)), item);
        //return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID), item);//改写
    }
    public static void addItemToIG(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(ICE_ETHER);
        fabricItemGroupEntries.add(MY_NEWITEMS);
    }

    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIG);;
        TutorialMod.LOGGER.info("Registering Items");
    }

}