package com.example.projectwithjava;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class AddProductPane extends VBox {

    private TextField nameField;
    private TextField descriptionField;
    private TextField quantityField;
    private Button addButton;
    private ViewProductsPane viewProductsPane;

    public AddProductPane(ViewProductsPane viewProductsPane) {
        this.viewProductsPane = viewProductsPane;

        Label nameLabel = new Label("Name:");
        nameField = new TextField();

        Label descriptionLabel = new Label("Description:");
        descriptionField = new TextField();

        Label quantityLabel = new Label("Quantity:");
        quantityField = new TextField();

        addButton = new Button("Add Product");
        addButton.setOnAction(e -> addProduct());

        GridPane form = new GridPane();
        form.setPadding(new Insets(10));
        form.setVgap(10);
        form.setHgap(10);

        form.add(nameLabel, 0, 0);
        form.add(nameField, 1, 0);
        form.add(descriptionLabel, 0, 1);
        form.add(descriptionField, 1, 1);
        form.add(quantityLabel, 0, 2);
        form.add(quantityField, 1, 2);
        form.add(addButton, 1, 3);

        this.getChildren().add(form);
    }

    private void addProduct() {
        String name = nameField.getText();
        String description = descriptionField.getText();
        int quantity = Integer.parseInt(quantityField.getText());

        Product product = new Product(name, description, quantity);
        ProductRepository.addProduct(product);

        viewProductsPane.addProduct(product);

        // Clear fields after adding
        nameField.clear();
        descriptionField.clear();
        quantityField.clear();
    }
}

