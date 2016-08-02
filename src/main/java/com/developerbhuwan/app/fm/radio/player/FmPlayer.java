/*
 * ---------------------------------------------------------------------------------------
 *   _____                 _                       ____  _                               
 *  |  __ \               | |                     |  _ \| |                              
 *  | |  | | _____   _____| | ___  _ __   ___ _ __| |_) | |__  _   ___      ____ _ _ __  
 *  | |  | |/ _ \ \ / / _ \ |/ _ \| '_ \ / _ \ '__|  _ <| '_ \| | | \ \ /\ / / _` | '_ \ 
 *  | |__| |  __/\ V /  __/ | (_) | |_) |  __/ |  | |_) | | | | |_| |\ V  V / (_| | | | |
 *  |_____/ \___| \_/ \___|_|\___/| .__/ \___|_|  |____/|_| |_|\__,_| \_/\_/ \__,_|_| |_|
 *                                | |                                                    
 *                                |_|                                                    
 * ---------------------------------------------------------------------------------------
 * Copyright (C) 2016-08-02
 *
 * Author : Bhuwan Prasad Upadhyay
 * Portfolio : http://devbhuwan.github.io/
 * Blog : http://developerbhuwan.blogspot.com/
 * Twitter : @DeveloperBhuwan
 * Github : devbhuwan
 *
 */
package com.developerbhuwan.app.fm.radio.player;

import java.io.InputStream;
import javazoom.jl.player.Player;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public abstract class FmPlayer {

    private final PlayerDTO playerDTO;
    private Player player;

    public FmPlayer(PlayerDTO playerDTO) {
        this.playerDTO = playerDTO;
    }

    public void play() throws Exception {
        player = new Player(getInputStream(playerDTO));
        player.play();
    }

    public abstract InputStream getInputStream(PlayerDTO playerDTO) throws Exception;

    public void stop() {
        player.close();
    }

}
