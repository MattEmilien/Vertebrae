package me.matt.vertebrae.data

import java.util.UUID

data class ServerData(
    val serverId: UUID,
    var serverName: String,
    var playerCount: Int,
    var maxPlayers: Int,
    var whitelistEnabled: Boolean,
    var cpuUsage: Double,
    var ramUsage: Double,
    var tps: Double,
    var uptime: Long,
    var tickTime: Double,
    var loadedChunks: Int,
    var activeChunks: Int,
    var entityCount: Int,
    var worldSize: Long,
    var playerActivityMetrics: PlayerActivityMetrics,
    var chatAndCommandsMetrics: ChatAndCommandsMetrics
) {

    data class PlayerActivityMetrics(
        var loginTimes: List<Long>,
        var logoutTimes: List<Long>,
        var playtime: Long,
        var activityLevel: ActivityLevel
    )

    data class ChatAndCommandsMetrics(
        var chatLog: List<String>,
        var commandUsage: Map<String, Int>
    )

    enum class ActivityLevel {
        ACTIVE,
        IDLE,
        AFK
    }
}
