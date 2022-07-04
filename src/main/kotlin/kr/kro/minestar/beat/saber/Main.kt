package kr.kro.minestar.beat.saber

import kr.kro.minestar.beat.saber.function.event.Event
import kr.kro.minestar.utility.item.Head
import kr.kro.minestar.utility.main.FunctionalJavaPlugin
import org.bukkit.Bukkit

class Main : FunctionalJavaPlugin() {
    companion object {
        lateinit var head: Head
        lateinit var plugin: FunctionalJavaPlugin
    }

    override fun onEnable() {
        plugin = this
        prefix = "§9BeatSaber"
        head = Head(this)
//        saveResource("headItem.yml", true)
        getCommand("beat")?.setExecutor(Command)
        Event
    }

    override fun onDisable() {
        for (player in Bukkit.getOnlinePlayers()) try {
            player.closeInventory()
        } catch (_: Exception) {
        }
    }
}