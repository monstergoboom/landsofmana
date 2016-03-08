package com.lom.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.firebase.client.AuthData;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.security.token.TokenGenerator;
import com.firebase.security.token.TokenOptions;

import java.util.HashMap;
import java.util.Map;

public class LandsOfManaApp extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Firebase firebase;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("card_base_red.png");

		firebase = new Firebase("https://lom.firebaseio.com/users/1234567890");

		Map<String, Object> auth = new HashMap<String, Object>();
		auth.put("uid", "1234567890");

		TokenOptions tokenOptions = new TokenOptions();
		tokenOptions.setAdmin(true);

		TokenGenerator tokenGenerator = new TokenGenerator("MzDIYLhTX8MSKQuSRkfIe5p2rJQDZjj1sUQwbTv3");
		String token = tokenGenerator.createToken(auth);

		System.out.println("token: " + token);

		firebase.authWithCustomToken(token, new Firebase.AuthResultHandler() {
			@Override
			public void onAuthenticated(AuthData authData) {
				System.out.println("authenticated");

				firebase.child("doc_1").setValue("this is a test");
			}

			@Override
			public void onAuthenticationError(FirebaseError firebaseError) {
				System.out.println("unable to authenticate: " + firebaseError.getMessage());
			}
		});
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
}
