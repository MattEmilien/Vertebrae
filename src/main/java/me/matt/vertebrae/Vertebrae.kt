package me.matt.vertebrae

import me.matt.vertebrae.commands.CommandManager
import me.matt.vertebrae.config.PluginConfig
import me.matt.vertebrae.managers.DataManager
import me.matt.vertebrae.managers.RedisManager

enum class Vertebrae {
    INSTANCE;

    private var plugin: VertebraePlugin? = null
    private var pluginConfig: PluginConfig? = null
    private var redisManager: RedisManager? = null
    private var dataManager: DataManager? = null
    private lateinit var commandManager: CommandManager
    fun initialize(plugin: VertebraePlugin) {
        this.plugin = plugin
    }

    fun start() {
        assert(plugin != null) { "[Vertebrae] plugin is null" }

        configure()
        registerCommands()
        registerListeners()
        registerManagers()
    }

    fun stop() {

    }

    private fun registerCommands() {
    }

    private fun registerListeners() {
    }

    private fun registerManagers() {
        redisManager = RedisManager
        commandManager = CommandManager(VertebraePlugin())
        dataManager = DataManager(pluginConfig!!, redisManager!!)
    }

    private fun configure() {
        val plugin = plugin ?: return

        val redisHost = plugin.config.getString("redis.host", "localhost")
        val redisPort = plugin.config.getInt("redis.port", 6379)
        val redisPassword = plugin.config.getString("redis.password", "")

        pluginConfig = PluginConfig(redisHost, redisPort, redisPassword)
        redisManager?.initialize(pluginConfig!!)
    }

}
