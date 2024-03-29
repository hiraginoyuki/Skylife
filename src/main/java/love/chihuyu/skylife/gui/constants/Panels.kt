package love.chihuyu.skylife.gui.constants

import love.chihuyu.skylife.util.ItemUtil
import net.md_5.bungee.api.ChatColor
import org.bukkit.Material

/* ktlint-disable no-multi-spaces dot-spacing */
object Panels {
    val fill         = ItemUtil.create(Material.LIGHT_GRAY_STAINED_GLASS_PANE, " ")
    val separator    = ItemUtil.create(Material.     WHITE_STAINED_GLASS_PANE, " ")
    val nextPage     = ItemUtil.create(Material.      LIME_STAINED_GLASS_PANE, ChatColor.GREEN.toString() + "Next Page")
    val previousPage = ItemUtil.create(Material.       RED_STAINED_GLASS_PANE, ChatColor.RED.toString() + "Previous Page")
}
