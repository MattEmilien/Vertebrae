package me.matt.vertebrae

import org.bukkit.plugin.java.JavaPlugin

class VertebraePlugin : JavaPlugin() {
    override fun onEnable() { Vertebrae.INSTANCE.start() }
    override fun onDisable() { Vertebrae.INSTANCE.stop() }
}
