package com.ceosilvajr.hellolibgdx;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import java.util.List;

public class MyGdxGame implements ApplicationListener {

  private SpriteBatch batch;
  private TextureRegion textureRegion;
  private Texture dessert;
  private Stage stage;

  @Override public void create() {
    final int canvassHeight = Gdx.graphics.getHeight();
    final int canvassWidth = Gdx.graphics.getWidth();
    batch = new SpriteBatch();
    dessert = new Texture("dessert.png");
    textureRegion = new TextureRegion(dessert, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
    stage = new Stage();
    final List<MyTexture> emojis = Emojis.getEmojis();
    final int emojisCount = emojis.size();
    final int initialPosition = canvassWidth / emojisCount;
    for (int x = 0; x < emojisCount; x++) {
      final MyActor myActor = new MyActor(emojis.get(x));
      final int centerDivider = initialPosition / 2;
      final int centerEmoji = myActor.getTextureWidth() / 2;
      int position = initialPosition * (x + 1);
      position = position - centerDivider - centerEmoji;
      myActor.setPosition(position, canvassHeight / 3);
      stage.addActor(myActor);
    }
    Gdx.input.setInputProcessor(stage);
  }

  @Override public void render() {
    Gdx.gl.glClearColor(0, 0, 0, 0);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    batch.begin();
    batch.draw(textureRegion, 0, 0);
    batch.end();
    stage.act(Gdx.graphics.getDeltaTime());
    stage.draw();
  }

  @Override public void dispose() {
    batch.dispose();
    dessert.dispose();
  }

  @Override public void resize(int width, int height) {
    stage.getViewport().update(width, height, true);
  }

  @Override public void pause() {

  }

  @Override public void resume() {

  }
}
