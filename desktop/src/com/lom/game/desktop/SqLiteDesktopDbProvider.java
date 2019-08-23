package com.lom.game.desktop;

import com.lom.game.db.DbProvider;

/**
 * Created by amitrevski on 1/14/17.
 */

public class SqLiteDesktopDbProvider implements DbProvider {
    @Override
    public void create(String configuration) {

    }

    @Override
    public void set(String payload) {

    }

    @Override
    public String get(String id) {
        return null;
    }

    @Override
    public boolean exists(String id) {
        return false;
    }
}
