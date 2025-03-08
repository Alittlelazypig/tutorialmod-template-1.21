package com.besson.tutorialmod.item;

import com.besson.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {//a

    public static final Item ICE_ETHER = registerItems("ice_ether",new Item(new Item.Settings()));
    private static Item registerItems(String id, Item item){
        //这是第一个下面 return 为改写更简单
        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(),Identifier.of(TutorialMod.MOD_ID,id)), item);
        //return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID), item);//改写
    }
    public static void registerModItems(){
        TutorialMod.LOGGER.info("Registering Items");
    }

}