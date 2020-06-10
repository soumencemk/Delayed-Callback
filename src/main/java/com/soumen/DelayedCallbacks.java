package com.soumen;

import lombok.extern.java.Log;

/**
 * An API that can register a delayed event and process that when delay expired.
 *
 * @author Soumen Karmakar
 * @since 1.0
 */
@Log
public abstract class DelayedCallbacks {
    /**
     * @param delayInMs : Delay time in ms
     * @param callback  : Callback Object that needs to be invoked post delay
     *
     */
    public static void registerDelayedCallback(Long delayInMs, Callback callback) {
        log.info("Registering Callback : " + callback);
        new DelayedCallback(delayInMs, callback);
    }
}
