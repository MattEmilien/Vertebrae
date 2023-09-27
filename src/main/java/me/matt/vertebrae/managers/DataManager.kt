package me.matt.vertebrae.managers

import me.matt.vertebrae.config.PluginConfig
import redis.clients.jedis.Jedis
import java.util.concurrent.CompletableFuture

class DataManager(private val pluginConfig: PluginConfig, private val redisManager: RedisManager) {
    fun saveDataAsync(key: String, value: String): CompletableFuture<Void> {
        return CompletableFuture.runAsync {
            getResource()?.use { jedis ->
                jedis.set(key, value)
            }
        }
    }
    fun getDataAsync(key: String): CompletableFuture<String?> {
        return CompletableFuture.supplyAsync {
            getResource()?.use { jedis ->
                jedis.get(key)
            }
        }
    }

    private fun getResource(): Jedis? {
        return redisManager.getResource()
    }
}
