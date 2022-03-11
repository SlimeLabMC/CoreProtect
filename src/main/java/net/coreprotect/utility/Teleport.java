package net.coreprotect.utility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import net.coreprotect.language.Phrase;
import net.coreprotect.model.BlockGroup;

public class Teleport {

    private Teleport() {
        throw new IllegalStateException("Utility class");
    }

    public static void performSafeTeleport(Player player, Location location, boolean enforceTeleport) {
        try {
            Set<Material> unsafeBlocks = new HashSet<>(Arrays.asList(Material.LAVA));
            unsafeBlocks.addAll(BlockGroup.FIRE);

            int worldHeight = location.getWorld().getMaxHeight();
            int playerX = location.getBlockX();
            int playerY = location.getBlockY();
            int playerZ = location.getBlockZ();
            int checkY = playerY - 1;
            boolean safeBlock = false;
            boolean placeSafe = false;
            boolean alert = false;

            while (!safeBlock) {
                int above = checkY + 1;
                if (above > worldHeight) {
                    above = worldHeight;
                }

                Block block1 = location.getWorld().getBlockAt(playerX, checkY, playerZ);
                Block block2 = location.getWorld().getBlockAt(playerX, above, playerZ);
                Material type1 = block1.getType();
                Material type2 = block2.getType();

                if (!Util.solidBlock(type1) && !Util.solidBlock(type2)) {
                    if (unsafeBlocks.contains(type1)) {
                        placeSafe = true;
                    }
                    else {
                        safeBlock = true;
                        if (placeSafe) {
                            int below = checkY - 1;
                            Block blockBelow = location.getWorld().getBlockAt(playerX, below, playerZ);

                            if (checkY < worldHeight && unsafeBlocks.contains(blockBelow.getType())) {
                                alert = true;
                                block1.setType(Material.DIRT);
                                checkY++;
                            }
                        }
                    }
                }

                if (checkY >= worldHeight || player.getGameMode() == GameMode.SPECTATOR) {
                    safeBlock = true;

                    if (checkY < worldHeight) {
                        checkY++;
                    }
                }

                if (safeBlock && (checkY > playerY || enforceTeleport)) {
                    if (checkY > worldHeight) {
                        checkY = worldHeight;
                    }

                    double oldY = location.getY();
                    location.setY(checkY);
                    player.teleport(location);

                    if (!enforceTeleport) {
                        // Only send a message if the player was moved by at least 1 block
                        if (location.getY() >= (oldY + 1.00)) {
                            Chat.sendMessage(player, Color.DARK_AQUA + "方塊紀錄 " + Color.WHITE + "- " + Phrase.build(Phrase.TELEPORTED_SAFETY));
                        }
                    }
                    else {
                        Chat.sendMessage(player, Color.DARK_AQUA + "方塊紀錄 " + Color.WHITE + "- " + Phrase.build(Phrase.TELEPORTED, "x" + playerX + "/y" + checkY + "/z" + playerZ + "/" + location.getWorld().getName()));
                    }
                    if (alert) {
                        Chat.sendMessage(player, Color.DARK_AQUA + "方塊紀錄 " + Color.WHITE + Color.ITALIC + "- " + Phrase.build(Phrase.DIRT_BLOCK));
                    }
                }

                checkY++;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
