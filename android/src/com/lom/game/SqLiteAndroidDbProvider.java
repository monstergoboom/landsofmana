package com.lom.game;

import com.lom.game.db.DbProvider;

/**
 * Created by amitrevski on 1/14/17.
 */
public class SqLiteAndroidDbProvider implements DbProvider {
    private SqLiteAndroidDbHelper helper;

    @Override
    public void create(String configuration) {
        helper = new SqLiteAndroidDbHelper(AndroidLauncher.getAppContext());
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
