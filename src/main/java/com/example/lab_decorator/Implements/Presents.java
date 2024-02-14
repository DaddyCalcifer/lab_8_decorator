package com.example.lab_decorator.Implements;

import com.example.lab_decorator.Models.TreeDecorator;
import com.example.lab_decorator.Models.XmasTree;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Presents extends TreeDecorator {
    public Presents(XmasTree tree)
    {
        super(tree);
    }
    public void draw(Pane panePresent)
    {
        super.draw(panePresent);
        drawWithPresents(panePresent);
    }
    public void drawWithPresents(Pane panePresent)
    {
        Rectangle[] presents = new Rectangle[3];
        presents[0] = new Rectangle();
        presents[0].setX(115);
        presents[0].setY(370);
        presents[0].setWidth(70);
        presents[0].setHeight(50);
        presents[0].setArcWidth(20);
        presents[0].setArcHeight(20);
        presents[0].setFill(Color.BLUEVIOLET);

        presents[1] = new Rectangle();
        presents[1].setX(270);
        presents[1].setY(400);
        presents[1].setWidth(40);
        presents[1].setHeight(20);
        presents[1].setFill(Color.DARKRED);

        presents[2] = new Rectangle();
        presents[2].setX(320);
        presents[2].setY(370);
        presents[2].setWidth(30);
        presents[2].setHeight(50);
        presents[2].setFill(Color.GREEN);

        panePresent.getChildren().addAll(presents[0],presents[1],presents[2]);
    }
}