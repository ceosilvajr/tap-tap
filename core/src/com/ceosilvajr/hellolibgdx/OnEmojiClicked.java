package com.ceosilvajr.hellolibgdx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

/**
 * Created by ceosilvajr on 20/02/2018.
 *
 * @author ceosilvajr@gmail.com
 */
public class OnEmojiClicked extends ClickListener {

  private MyTexture myTexture;
  private MyActor myActor;
  private float originalScaleX;
  private float originalScaleY;

  public OnEmojiClicked(final MyActor myActor) {
    this.myActor = myActor;
    this.myTexture = myActor.getMyTexture();
    this.originalScaleX = myActor.getScaleX();
    this.originalScaleY = myActor.getScaleY();
  }

  @Override public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
    Gdx.app.log("TOUCHED", myTexture.getName() + " was touchDown.");
    myActor.addAction(Actions.scaleTo(3, 3, 1));
    return Boolean.TRUE;
  }

  @Override public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
    Gdx.app.log("TOUCHED", myTexture.getName() + " was touchUp.");
    myActor.addAction(Actions.scaleTo(originalScaleX, originalScaleY, 1));
  }

  @Override public void exit(InputEvent event, float x, float y, int pointer, Actor toActor) {
    super.exit(event, x, y, pointer, toActor);
  }
}
