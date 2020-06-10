package com.soumen;

/**
 * Callabck interface that the clients needs to implement
 *
 * @author Soumen Karmakar
 * @since 1.0
 */
@FunctionalInterface
public interface Callback {
    /**
     * client needs to implement this method and provide their own implementation
     */
    void performCallback();
}
