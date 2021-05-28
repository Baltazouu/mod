package fr.bapt.mod1.init;

import fr.bapt.mod1.MOD1;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD1.MODID);

    public static final RegistryObject<Item> CLE_USB = ITEMS.register("cle_usb", ()-> new Item(new Item.Properties()
            .group(fr.bapt.mod1.utils.ModItemGroups.MOD1_TAB)
        .food(new Food.Builder().hunger(7).saturation(0.8F).meat()
                    .effect(()->new EffectInstance(Effects.SPEED, 20*30,0), 1.0f).build())));
                    //->new EffectInstance)

  //  public static final RegistryObject<Item> BLOC_USB = ITEMS.register("bloc_usb", ()-> new Item(new Item.Properties()));
}
