/*package fr.bapt.mod1.init;

import fr.bapt.mod1.MOD1;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD1.MODID);
    /*public static final RegistryObject<Block> BLOC_USB = createBlock("bloc_usb",()-> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3f,15f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS.register( name, supplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    } public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier, Item.Properties properties)
    {
        RegistryObject<Block> block = BLOCKS.register( name, supplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }


        RegistryObject<Block> block = BLOCKS.register( name, supplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;  */
package fr.bapt.mod1.init;

import fr.bapt.mod1.MOD1;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD1.MODID);
    public static final RegistryObject<Block> BLOC_USB = createBlock("bloc_usb",()-> new Block(AbstractBlock.Properties
            .create(Material.ROCK)
            .hardnessAndResistance(3f,15f).harvestTool(ToolType.PICKAXE).setRequiresTool()));

    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS.register( name, supplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }

}

