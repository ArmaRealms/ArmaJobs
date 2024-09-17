package com.gamingmesh.jobs.hooks.PlayerBlockTracker;

import com.gestankbratwurst.playerblocktracker.PlayerBlockTracker;
import org.bukkit.block.Block;

public class PlayerBlockTrackerManager {

    public PlayerBlockTrackerManager() {
    }

    public boolean isTracked(Block block) {
        return PlayerBlockTracker.isTracked(block);
    }
}
