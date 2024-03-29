package polishandgraphics;

import processing.core.PApplet;
import processing.core.PImage;

public class DuckAnimation extends PApplet {
    // Variables
    int imgNum = 10;
    PImage[] dudeImgs;
    int imgIndex = 0;

    public static void main(String[] args) {
        PApplet.main("polishandgraphics.DuckAnimation");

    }

    public void settings() {
        size(300, 300);
    }

    public void setup() {
        dudeImgs = new PImage[imgNum];
        for (int i = 0; i < imgNum; i++) {
            dudeImgs[i] = loadImage("photos/" + i + ".jpg");
        }
        frameRate(10);
    }

    public void draw() {
        background(255);

        image(dudeImgs[imgIndex], 0, 0);
        imgIndex++;
        if (imgIndex >= dudeImgs.length) {
            imgIndex = 0;
        }
    }
}
