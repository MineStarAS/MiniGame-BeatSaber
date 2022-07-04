package kr.kro.minestar.beat.saber.function.event

import kr.kro.minestar.beat.saber.Main.Companion.plugin
import kr.kro.minestar.utility.event.enable
import kr.kro.minestar.utility.string.toServer
import org.bukkit.Bukkit
import org.bukkit.Effect
import org.bukkit.EntityEffect
import org.bukkit.block.BlockFace
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.event.player.PlayerJoinEvent

object Event : Listener {
    init {
        enable(plugin)
    }

    @EventHandler
    fun join(e: PlayerJoinEvent) {
    }

    @EventHandler
    fun interact(e: PlayerInteractEvent) {
        e.action.toString().toServer()
        if (e.action != Action.RIGHT_CLICK_AIR) return
    }
}