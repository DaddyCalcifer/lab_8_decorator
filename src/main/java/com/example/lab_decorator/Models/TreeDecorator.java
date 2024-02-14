package com.example.lab_decorator.Models;

import javafx.scene.layout.Pane;

public abstract class TreeDecorator implements XmasTree {
    XmasTree tree;
    public TreeDecorator(XmasTree tree)
    {
        this.tree = tree;
    }
    public void draw(Pane pane)
    {
        tree.draw(pane);
    }
}