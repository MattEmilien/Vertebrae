package me.matt.vertebrae.commands.api

import org.bukkit.command.CommandSender

interface BaseCommand {

    val name: String
    val description: String
    val usage: String
    val permission: String?

    fun execute(sender: CommandSender, args: List<String>): Boolean
}