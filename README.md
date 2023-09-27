# Vertebrae Minecraft Plugin 🎮

<p align="center">
  <img src="https://thumbs.dreamstime.com/b/spine-icon-outline-spine-vector-icon-web-design-isolated-white-background-spine-icon-outline-style-171187755.jpg" alt="Plugin Logo" width="300" height="300">
</p>


[![License](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE.md)
[![Minecraft Version](https://img.shields.io/badge/Minecraft-1.8%2B-brightgreen.svg)](https://www.minecraft.net/)

## Overview

The Vertebrae Minecraft Plugin is a feature-packed utility that enhances your Minecraft server's management capabilities. With Vertebrae, you can seamlessly sync server data across multiple instances, monitor player activity, and optimize resource usage.

## Features ✨

🌐 **Server Data Synchronization**: Keep your Minecraft server data in sync across multiple instances using Redis.

📊 **Real-time Monitoring**: Monitor player counts, CPU/RAM usage, whitelist status, and more in real-time.

🛠️ **Modular Design**: Extensible and customizable architecture allows for easy integration with other plugins.

🔒 **Secure**: Secure your Redis connections with password protection to keep your server data safe.

## Installation 🚀

1. Download the latest release from the [Releases](https://github.com/your-username/your-plugin/releases) page.

2. Place the JAR file in your server's `plugins` directory.

3. Configure the plugin by updating the `config.yml` file.

4. Restart your Minecraft server.

## Usage 🕹️

- Use the in-game commands to manage and monitor your server.
- Access real-time data via Redis for external monitoring tools.
- Customize Vertebrae's behavior through the configuration file.

## Monitored Statistics 📈

The Vertebrae Minecraft Plugin provides comprehensive monitoring of various server statistics, giving you valuable insights into your Minecraft server's performance and player activity. Here are the key statistics that we monitor:

- **Player Count**: Current number of players on the server.
- **Maximum Players**: Maximum player capacity of the server.
- **Whitelist Status**: Indicates whether the server whitelist is enabled.
- **CPU Usage**: Real-time CPU usage.
- **RAM Usage**: Real-time RAM usage.
- **Ticks Per Second (TPS)**: Server performance metric.
- **Uptime**: Server uptime in seconds.
- **Tick Time**: Average time for each tick to process.
- **Loaded Chunks**: Number of loaded chunks.
- **Active Chunks**: Number of actively loaded chunks.
- **Entity Count**: Total number of entities in the world.
- **World Size**: Size of the Minecraft world.
- **Economy Metrics**: Currency balance, transaction count, market activity.
- **Player Activity Metrics**: Login times, logout times, playtime, activity level.
- **Chat and Commands Metrics**: Chat log, command usage.

I'm constantly working to enhance your servers management experience. Soon, I'll be introducing a web panel built in React.js that will provide an even more interactive and user-friendly way to access and analyze these statistics.

Stay tuned for updates and new features!




## Configuration ⚙️

Edit the `config.yml` file to configure Vertebrae according to your server setup. You can customize settings such as Redis host, port, and more.

```yaml
# Example configuration:
redis:
  host: localhost
  port: 6379
  password: your_redis_password


