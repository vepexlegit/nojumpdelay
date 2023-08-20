package de.vepexlegit.nojumpdelaydebug.mixins;

import de.vepexlegit.nojumpdelaydebug.NoJumpDelay;
import de.vepexlegit.nojumpdelaydebug.commands.NoJumpDelayCommand;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.client.ClientCommandHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityLivingBase.class)
public class MixinEntityLivingBase {
    @Inject(method = "onUpdate", at = @At("RETURN"))
    private void startGame(final CallbackInfo ci) {
        ClientCommandHandler.instance.registerCommand(new NoJumpDelayCommand());
    }

    @Shadow private int jumpTicks;

    @Inject(method = "onUpdate", at = @At("HEAD"))
    private void onUpdate(final CallbackInfo ci) {
        if(NoJumpDelay.INSTANCE.isEnabled()) {
            jumpTicks = 0;
        }
    }
}
