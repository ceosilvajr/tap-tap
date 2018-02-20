package com.ceosilvajr.hellolibgdx;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import java.util.Iterator;

/**
 * Created by ceosilvajr on 20/02/2018.
 *
 * @author ceosilvajr@gmail.com
 */
public class MyActor extends Actor {

  private MyTexture myTexture;

  public MyActor(MyTexture myTexture) {
    this.myTexture = myTexture;
    setTouchable(Touchable.enabled);
    setBounds(getX(), getY(), myTexture.getWidth(), myTexture.getHeight());
    addListener(new OnEmojiClicked(this));
  }

  @Override public void draw(Batch batch, float parentAlpha) {
    batch.draw(myTexture, getX(), getY());
  }

  @Override public void act(float delta) {
    for (final Iterator<Action> iterator = this.getActions().iterator(); iterator.hasNext(); ) {
      iterator.next().act(delta);
    }
  }

  public int getTextureWidth() {
    return myTexture.getWidth();
  }

  public int getTextureHeight() {
    return myTexture.getHeight();
  }

  public MyTexture getMyTexture() {
    return myTexture;
  }
}
