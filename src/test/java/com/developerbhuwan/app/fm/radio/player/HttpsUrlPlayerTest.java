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

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class HttpsUrlPlayerTest {
    
    private final FmPlayer fmPlayer;
    
    public HttpsUrlPlayerTest() {
        fmPlayer = new HttpsUrlPlayer(new PlayerDTO("https://radio.itechnepal.com/kanchanjunghafm/stream"));
    }
    
    @Test
    public void testPlay() throws Exception {
        assertNotNull(fmPlayer);
        new Thread(() -> {
            try {
                fmPlayer.play();
            } catch (Exception ex) {
                Logger.getLogger(HttpsUrlPlayerTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();
    }
    
}
