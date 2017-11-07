package com.lom.game;

import android.content.Context;
import android.os.Bundle;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class AndroidLauncher extends AndroidApplication {
    private static Context mContext;

    public static Context getAppContext() {
        return mContext;
    }

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
        mContext = getApplicationContext();

        SqLiteAndroidDbProvider dbProvider = new SqLiteAndroidDbProvider();
		initialize(new LandsOfManaApp(dbProvider), config);
	}
}
