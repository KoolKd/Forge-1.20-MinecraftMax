package net.koolkd.maxmod.datagen;

import net.koolkd.maxmod.MaxMod;
import net.koolkd.maxmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MaxMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
//        blockWithItem(ModBlocks.SAPPHIRE_ORE);

//        simpleBlock(ModBlocks.VESSEL_FURNACE.get(),
//                new ModelFile.UncheckedModelFile(modLoc("block/vessel")));
        logBlock((RotatedPillarBlock) ModBlocks.MAHOE_LOG.get());

//        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_MAHOE_LOG.get(), blockTexture(ModBlocks.STRIPPED_MAHOE_LOG.get()), blockTexture(ModBlocks.MAHOE_LOG.get()));

        blockItem(ModBlocks.MAHOE_LOG);

//        blockItem(ModBlocks.STRIPPED_MAHOE_LOG);
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(MaxMod.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}