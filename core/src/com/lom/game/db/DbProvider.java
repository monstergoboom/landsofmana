package com.lom.game.db;

/**
 * Created by Alek on 6/22/2016.
 */
public interface DbProvider {
    void create(String configuration);
    void set(String payload);
    String get(String id);
    boolean exists(String id);
}
