package com.ceosilvajr.hellolibgdx;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by ceosilvajr on 20/02/2018.
 *
 * @author ceosilvajr@gmail.com
 */
public class MyTexture extends Texture {

  private String name;

  public MyTexture(String internalPath) {
    super(internalPath);
    this.name = internalPath;
  }

  public String getName() {
    return name;
  }

  @Override public String toString() {
    return "MyTexture{" + "name='" + name + '\'' + '}';
  }
}
