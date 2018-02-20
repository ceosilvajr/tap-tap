package com.ceosilvajr.hellolibgdx;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ceosilvajr on 20/02/2018.
 *
 * @author ceosilvajr@gmail.com
 */
public class Emojis {

  public static List<MyTexture> getEmojis() {
    final List<MyTexture> emojis = new ArrayList<MyTexture>();
    emojis.add(new MyTexture("face_palm.png"));
    emojis.add(new MyTexture("heart.png"));
    emojis.add(new MyTexture("sad.png"));
    emojis.add(new MyTexture("smile.png"));
    return emojis;
  }
}
