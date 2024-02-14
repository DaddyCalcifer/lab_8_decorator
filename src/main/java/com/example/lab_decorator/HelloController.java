package com.example.lab_decorator;

import com.example.lab_decorator.Implements.Girland;
import com.example.lab_decorator.Implements.Presents;
import com.example.lab_decorator.Implements.Star;
import com.example.lab_decorator.Implements.XmasTreeImp;
import com.example.lab_decorator.Models.XmasTree;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Pane panel;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        panel.toFront();
        XmasTree tree = new XmasTreeImp();
        tree.draw(panel);
        System.out.println("xd");
    }
    public void ClearAll(ActionEvent actionEvent)
    {
        panel.toFront();
        XmasTree tree = new XmasTreeImp();
        panel.getChildren().clear();
        tree.draw(panel);
    }
    public void AddAll(ActionEvent actionEvent)
    {
        addLights(actionEvent);
        addPresents(actionEvent);
        addStar(actionEvent);
    }
    public void addLights(ActionEvent actionEvent)
    {
        panel.toFront();
        XmasTree tree =new Girland(new XmasTreeImp());
        tree.draw(panel);
    }
    public void addPresents(ActionEvent actionEvent)
    {
        panel.toFront();
        XmasTree tree =new Presents(new XmasTreeImp());
        tree.draw(panel);
    }
    public void addStar(ActionEvent actionEvent)
    {
        panel.toFront();
        XmasTree tree =new Star(new XmasTreeImp());
        tree.draw(panel);
    }
}