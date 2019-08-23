package com.lom.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.FrameBuffer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.TextArea;
import com.badlogic.gdx.scenes.scene2d.ui.Window;
import com.lom.game.db.DbProvider;


public class LandsOfManaApp extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	ShapeRenderer shapeRenderer;
	int width, height;
	FrameBuffer gridFrameBuffer = null;
	TextureRegion gridTextureRegion = null;
	float gridScalar = 1.5f;
	float gridWidth, gridHeight;
	boolean gridEnabled;
	TextArea txtAreaWindow;
	ScrollPane outputWindowScrollPane;
	Window outputWindow;
	Stage stage;
	float defaultOutputWindowHeight = 200;
	DbProvider dbProvider;

	public LandsOfManaApp(DbProvider db) {
		super();
		gridEnabled = true;
		dbProvider = db;
	}

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("card_base_red.png");

		shapeRenderer = new ShapeRenderer();
		width = Gdx.graphics.getWidth();
		height = Gdx.graphics.getHeight();

		gridWidth = 25;
		gridHeight = 25;
	}

	public void drawGrid() {
		if (gridFrameBuffer == null) {
			gridFrameBuffer = new FrameBuffer(Pixmap.Format.RGBA8888, (int) (width * gridScalar),
					(int) (height * gridScalar), false);
			gridTextureRegion = new TextureRegion(gridFrameBuffer.getColorBufferTexture());
			gridTextureRegion.flip(false, true);

			gridFrameBuffer.begin();
			Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

			shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
			shapeRenderer.setColor(.2f, .1f, .2f, 1);

			float x = 0, y = 0, dx = 0, dy = height;

			for (int index_x = 0; index_x <= width; index_x += gridWidth) {
				x = dx = index_x;
				shapeRenderer.line(x, y, dx, dy);
			}

			x = 0;
			y = 0;
			dx = width;
			dy = 0;

			for (int index_y = 0; index_y <= height; index_y += gridHeight) {
				y = dy = index_y;
				shapeRenderer.line(x, y, dx, dy);
			}

			shapeRenderer.end();
			gridFrameBuffer.end();
		}
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		drawGrid();

		batch.begin();
		if (gridEnabled) batch.draw(gridTextureRegion, 0, 0, width, height);
		batch.draw(img, 100, 200);
		batch.end();
	}
}

