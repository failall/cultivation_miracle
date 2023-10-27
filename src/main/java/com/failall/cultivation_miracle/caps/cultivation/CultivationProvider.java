package com.failall.cultivation_miracle.caps.cultivation;

import com.failall.cultivation_miracle.CultivationMiracle;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.common.util.LazyOptional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

    public class CultivationProvider implements ICapabilityProvider, INBTSerializable<CompoundTag> {
    private final LazyOptional<CultivationCapability> lazyOptional = LazyOptional.of(this::createCultivationCapability);
    public static final ResourceLocation IDENTIFIER = new ResourceLocation(CultivationMiracle.MODID, "cultivation");
    public static Capability<CultivationCapability> INSTANCE = CapabilityManager.get(new CapabilityToken<CultivationCapability>() {});
    private CultivationCapability capability = null;

    private CultivationCapability createCultivationCapability() {
        if (this.capability == null) {
            this.capability = new CultivationCapability();
        }
        return this.capability;
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        return INSTANCE.orEmpty(cap, this.lazyOptional);
    }

    @Override
    public CompoundTag serializeNBT() {
        CompoundTag tag = new CompoundTag();
        createCultivationCapability().serializeNBT(tag);
        return tag;
    }

    @Override
    public void deserializeNBT(CompoundTag tag) {
        createCultivationCapability().deserializeNBT(tag);
    }
}
