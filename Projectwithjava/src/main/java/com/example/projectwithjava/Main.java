package com.example.projectwithjava;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        TabPane tabPane = new TabPane();

        ViewProductsPane viewProductsPane = new ViewProductsPane();
        Tab viewProductsTab = new Tab("View Products", viewProductsPane);

        AddProductPane addProductPane = new AddProductPane(viewProductsPane);
        Tab addProductTab = new Tab("Add Product", addProductPane);

        tabPane.getTabs().addAll(viewProductsTab, addProductTab);

        Scene scene = new Scene(tabPane, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Inventory Management System");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
