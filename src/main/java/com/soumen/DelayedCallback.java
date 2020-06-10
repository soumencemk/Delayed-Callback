package com.soumen;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Soumen Karmakar
 * 10/06/2020
 */
@Log
@Getter
@Setter
public class DelayedCallback {
    /**
     * A task that can be scheduled for one-time or repeated execution by a Timer
     */
    private Timer timer;
    /**
     * Callback Object that needs to be performed once the delay has exhausted
     */
    private Callback callback;

    DelayedCallback(Long delayTime, Callback callback) {
        timer = new Timer();
        timer.schedule(new PerformCallback(), delayTime);
    }

    class PerformCallback extends TimerTask {
        @Override
        public void run() {
            log.info("Delay expired.... processing callback");
            if (callback != null) {
                callback.performCallback();
            }
            timer.cancel();
        }
    }
}
