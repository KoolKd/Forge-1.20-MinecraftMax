package net.koolkd.maxmod.datagen;

import net.koolkd.maxmod.MaxMod;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
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
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}