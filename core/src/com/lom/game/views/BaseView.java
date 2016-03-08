package com.lom.game.views;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.lom.game.cards.BaseCard;

/**
 * Created by Alek on 3/4/2016.
 */
public class BaseView {
    BaseView parent;
    Texture texture;
    Sprite sprite;
    BaseCard card;

    int width, height, positionX, positionY;

    public int getWidth() { return this.width; }
    public void setWidth(int value) { this.width = value; }

    public int getHeight() { return this.height; }
    public void setHeight(int value) { this.height = value; }

    public int getPositionX() { return this.positionX; }
    public void setPositionX(int value) { this.positionX = value; }

    public int getPositionY() { return this.positionY; }
    public void setPositionY(int value) { this.positionY = value; }

    public void initialize(BaseCard value) {}
    public void load() {}
    public void render() {}
    public void show() {}
    public void hide() {}
    public void update() {}
}
