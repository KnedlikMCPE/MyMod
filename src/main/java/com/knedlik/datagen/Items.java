package com.knedlik.datagen;

import com.knedlik.mymod.MyMod;
import com.knedlik.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class Items extends ItemModelProvider {

    public Items(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, MyMod.MODID,existingFileHelper);
    }

    @Override
    protected void registerModels() {
        singleTexture(Registration.TESTITEM.get().getRegistryName().getPath(),
        new ResourceLocation("item/handheld"),
        new ResourceLocation(MyMod.MODID, "item/wooden_pickaxe"));
    }
}
