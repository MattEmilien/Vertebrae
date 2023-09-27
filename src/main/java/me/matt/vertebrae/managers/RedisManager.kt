package me.matt.vertebrae.managers

import me.matt.vertebrae.config.PluginConfig
import redis.clients.jedis.Jedis
import redis.clients.jedis.JedisPool
import redis.clients.jedis.JedisPoolConfig

object RedisManager {
    private lateinit var config: PluginConfig
    private lateinit var jedisPool: JedisPool

    fun initialize(config: PluginConfig) {
        this.config = config
        jedisPool = createJedisPool()
    }

    private fun createJedisPool(): JedisPool {
        val jedisPoolConfig = JedisPoolConfig()
        jedisPoolConfig.maxTotal = 10

        val host = config.redisHost
        val port = config.redisPort
        val password = config.redisPassword

        return JedisPool(jedisPoolConfig, host, port, 2000, password)
    }

    fun getResource(): Jedis? {
        return jedisPool.resource
    }

    fun returnResource(jedis: Jedis?) {
        jedis?.close()
    }

    fun setData(key: String, value: String) {
        getResource()?.use { jedis ->
            jedis.set(key, value)
        }
    }

    fun getData(key: String): String? {
        return getResource()?.use { jedis ->
            jedis.get(key)
        }
    }
}
