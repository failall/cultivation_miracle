package com.failall.cultivation_miracle.caps.cultivation;

import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.capabilities.AutoRegisterCapability;

@AutoRegisterCapability
public interface ICultivationCapability {
    void serializeNBT(CompoundTag tag);
    void deserializeNBT(CompoundTag tag);
    void copyFrom(CultivationCapability source);
}
