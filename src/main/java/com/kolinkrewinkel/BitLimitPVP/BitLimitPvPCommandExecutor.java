package com.kolinkrewinkel.BitLimitPvP;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.google.common.base.Joiner;

public class BitLimitPvPCommandExecutor implements CommandExecutor {
    private final BitLimitPvP plugin;

    /*
     * This command executor needs to know about its plugin from which it came from
     */
    public BitLimitPvPCommandExecutor(BitLimitPvP plugin) {
        this.plugin = plugin;
    }

    /*
     * On command set the sample message
     */
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("BitLimitPvP.message") && args.length > 0) {
            this.plugin.getConfig().set("BitLimitPvP.message", Joiner.on(' ').join(args));
            return true;
        } else {
            return false;
        }
    }

}