package me.matt.vertebrae.commands

import me.matt.vertebrae.commands.api.BaseCommand
import me.matt.vertebrae.managers.DataManager
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class DataCommand : BaseCommand {
    override val name = "data"
    override val description = "Fetches server metrics from the database"
    override val usage = "/data <key>"
    override val permission = "vertebrae.data"

    override fun execute(sender: CommandSender, args: List<String>): Boolean {
        if (!sender.hasPermission(permission)) sender.sendMessage("§cYou do not have permission to use this command!")

        if (args.isEmpty()) sender.sendMessage("§cUsage: $usage")

        val key = args[0]


        sender.sendMessage("Key: $key")

        return true
    }


}
