package net.ukaye.skulkequipment.mixin;

import net.ukaye.skulkequipment.SkulkEquipment;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class SkulkEquipmentMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		SkulkEquipment.LOGGER.info("This line is printed by an skulkequipment mod mixin!");
	}
}
