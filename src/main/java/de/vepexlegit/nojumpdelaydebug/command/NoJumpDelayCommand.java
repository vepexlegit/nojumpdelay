package de.vepexlegit.nojumpdelaydebug.command;

import de.vepexlegit.nojumpdelaydebug.NoJumpDelay;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;

public class NoJumpDelayCommand implements ICommand {

    public static Minecraft mc = Minecraft.getMinecraft();

    @Override
    public String getName() {
        return "nojumpdelay";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return null;
    }

    @Override
    public List<String> getAliases() {
        return Collections.emptyList();
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        if (args.length != 1 || (!args[0].equalsIgnoreCase("off") && !args[0].equalsIgnoreCase("on"))) {
            sender.sendMessage(new TextComponentString("Invalid Arguments."));
            return;
        }

        NoJumpDelay.INSTANCE.setEnabled(args[0].equalsIgnoreCase("on"));

        sender.sendMessage(new TextComponentString(String.format("NoJumpDelay has been %s.",
                NoJumpDelay.INSTANCE.isEnabled() ? "enabled" : "disabled")));
    }

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        return true;
    }

    @Override
    public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args, @Nullable BlockPos targetPos) {
        return null;
    }

    @Override
    public boolean isUsernameIndex(String[] args, int index) {
        return false;
    }

    @Override
    public int compareTo(ICommand o) {
        return 0;
    }
}
