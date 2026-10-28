package com.github.steven23334.tlm_tell_maids;

import com.github.steven23334.tlm_tell_maids.command.TellMaidCommand;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(TlmTellMaids.MOD_ID)
public class TlmTellMaids {
    public static final String MOD_ID = "tlm_tell_maids";

    public TlmTellMaids() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onRegisterCommands(RegisterCommandsEvent event) {
        TellMaidCommand.register(event.getDispatcher());
    }
}
