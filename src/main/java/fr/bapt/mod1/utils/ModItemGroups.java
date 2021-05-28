package fr.bapt.mod1.utils;

import fr.bapt.mod1.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroups {

    public static final ItemGroup MOD1_TAB = new ItemGroup("mod1tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.CLE_USB.get());
        }
    };

}