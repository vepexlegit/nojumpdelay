package de.vepexlegit.nojumpdelay.mixins;

import net.minecraft.entity.EntityLivingBase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityLivingBase.class)
public class MixinEntityLivingBase {

    @Shadow private int jumpTicks;

    @Inject(method = "onUpdate", at = @At("HEAD"))
    private void onUpdate(final CallbackInfo ci) {
        jumpTicks = 0;
    }
}
