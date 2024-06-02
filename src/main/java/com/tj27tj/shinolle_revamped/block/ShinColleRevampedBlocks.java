package com.tj27tj.shinolle_revamped.block;

import com.tj27tj.shinolle_revamped.ShinColleRevamped;
import com.tj27tj.shinolle_revamped.block.grudge_lump.GrudgeLump;
import com.tj27tj.shinolle_revamped.block.ore.PolymetallicOre;
import com.tj27tj.shinolle_revamped.item.ShinColleRevampedItemGroup;
import com.tj27tj.shinolle_revamped.item.ShinColleRevampedItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ShinColleRevampedBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, ShinColleRevamped.MOD_ID);

    public static final RegistryObject<Block> ABYSSIUM_BLOCK = registerBlock("abyssium_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(5f,6f).sound(SoundType.METAL)));

    public static final RegistryObject<Block> POLYMETALLIC_BLOCK = registerBlock("polymetallic_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(3f).sound(SoundType.METAL)));

    public static final RegistryObject<Block> POLYMETALLIC_GRAVEL = registerBlock("polymetallic_gravel",
            () -> new FallingBlock(AbstractBlock.Properties.create(Material.SAND)
                    .harvestLevel(0).harvestTool(ToolType.SHOVEL)
                    .hardnessAndResistance(0.8f).sound(SoundType.SAND)));

    public static final RegistryObject<Block> POLYMETALLIC_ORE = registerBlock("polymetallic_ore",
            () -> new PolymetallicOre(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(3f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> GRUDGE_LUMP = registerBlock("grudge_lump",
            () -> new GrudgeLump(AbstractBlock.Properties.create(Material.SAND)
                    .harvestLevel(0).harvestTool(ToolType.SHOVEL).setLightLevel((state) -> 1)
                    .hardnessAndResistance(0.8f).sound(SoundType.SAND)));

    public static final RegistryObject<Block> SUBLIMATION_GRUDGE_LUMP = registerBlock("sublimation_grudge_lump",
            () -> new GrudgeLump(AbstractBlock.Properties.create(Material.SAND)
                    .harvestLevel(0).harvestTool(ToolType.SHOVEL).setLightLevel((state) -> 1)
                    .hardnessAndResistance(1f,200f).sound(SoundType.SAND)));



    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn =BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ShinColleRevampedItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ShinColleRevampedItemGroup.SHINCOLLE_REVAMPED_GROUP)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
