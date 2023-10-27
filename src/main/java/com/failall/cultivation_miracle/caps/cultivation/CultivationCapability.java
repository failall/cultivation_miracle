package com.failall.cultivation_miracle.caps.cultivation;

import net.minecraft.nbt.CompoundTag;

public class CultivationCapability implements ICultivationCapability{
    @Override
    public void serializeNBT(CompoundTag tag) {

    }

    @Override
    public void deserializeNBT(CompoundTag tag) {

    }

    // REMEMBER if more capability features(e.g. cultivation realm/level) is added, add it to the copyFrom method
    public void copyFrom(CultivationCapability source) {
       //this.var = source.var
    }
}
