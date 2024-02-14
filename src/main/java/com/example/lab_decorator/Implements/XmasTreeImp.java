package com.example.lab_decorator.Implements;

import com.example.lab_decorator.Models.XmasTree;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class XmasTreeImp implements XmasTree {
    public XmasTreeImp() {
        super();
    }
    @Override
    public void draw(Pane pane) {
        var leafPath = new Path() {{
            setFill(Color.GREEN);
            setFillRule(FillRule.EVEN_ODD);
            setStroke(Color.GREENYELLOW);
        }};
        leafPath.getElements().addAll(
                new MoveTo(240, 120),
                new LineTo(125, 360),
                new LineTo(355, 360),
                new ClosePath()
        );
        var rectangle = new Rectangle(220, 360, 40, 60) {{
            setFill(Color.BROWN);
        }};
        pane.getChildren().addAll(leafPath, rectangle);
    }
}
