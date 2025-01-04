package me.matt.vertebrae.commands

import me.matt.vertebrae.VertebraePlugin
import me.matt.vertebrae.commands.api.BaseCommand
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.command.PluginCommand

class CommandManager(private val plugin: VertebraePlugin) {
    private val commands = mutableMapOf<String, BaseCommand>()

    private fun registerCommand(command: BaseCommand) {
        commands[command.name] = command
        val pluginCommand: PluginCommand? = plugin.getCommand(command.name)
        if (pluginCommand != null) {
            pluginCommand.executor = object : CommandExecutor {
                override fun onCommand(
                    sender: CommandSender,
                    command: Command,
                    label: String,
                    args: Array<out String>
                ): Boolean {
                    return commands[command.name]?.execute(sender, args.toList()) ?: false
                }
            }
        } else {
            plugin.logger.warning("Command '${command.name}' is not defined in plugin.yml!")
        }
    }

    fun registerAllCommands(commands: List<BaseCommand>) {
        commands.forEach { registerCommand(it) }
    }
}
