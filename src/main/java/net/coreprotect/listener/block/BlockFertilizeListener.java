package net.coreprotect.listener.block;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.Tag;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFertilizeEvent;

import net.coreprotect.config.Config;
import net.coreprotect.consumer.Queue;
import net.coreprotect.thread.CacheHandler;

public final class BlockFertilizeListener extends Queue implements Listener {

    //@EventHandler
    protected void onBlockFertilize(BlockFertilizeEvent event) {
        if (event.isCancelled()) {
            return;
        }

        Block block = event.getBlock();
        if (!Config.getConfig(block.getWorld()).BLOCK_PLACE) {
            return;
        }

        Location location = block.getLocation();
        List<BlockState> blocks = event.getBlocks();
        if (blocks.size() == 1 && blocks.get(0).getLocation().equals(location) && Tag.SAPLINGS.isTagged(block.getType())) {
            return;
        }

        String user = "#bonemeal";
        Player player = event.getPlayer();
        if (player != null) {
            user = player.getName();
        }
        else {
            Object[] data = CacheHandler.redstoneCache.get(location);
            if (data != null) {
                long newTime = System.currentTimeMillis();
                long oldTime = (long) data[0];
                if ((newTime - oldTime) < 50) { // check that within same tick
                    user = (String) data[1];
                }

                CacheHandler.redstoneCache.remove(location);
            }
        }

        for (BlockState newBlock : blocks) {
            Queue.queueBlockPlace(user, newBlock, newBlock.getType(), newBlock.getBlock().getState(), newBlock.getType(), -1, 0, newBlock.getBlockData().getAsString());
        }
    }

}
