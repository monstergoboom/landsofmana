package com.lom.game.desktop;

import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.lom.game.LandsOfManaApp;

public class DesktopLauncher {
	public static void main (String[] arg) {
		Graphics.DisplayMode currentMode = LwjglApplicationConfiguration.getDesktopDisplayMode();

        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

        //config.setFromDisplayMode(currentMode);

		config.width = 1920;
		config.height = 1280;
        config.title = "Lands of Mana";
		config.initialBackgroundColor = new com.badlogic.gdx.graphics.Color(0,0,0,0);

		SqLiteDesktopDbProvider dbProvider = new SqLiteDesktopDbProvider();

		new LwjglApplication(new LandsOfManaApp(dbProvider), config);
	}
}
