package com.example.projectwithjava;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;

public class ViewProductsPane extends BorderPane {

    private TableView<Product> tableView;
    private ObservableList<Product> productList;

    public ViewProductsPane() {
        tableView = new TableView<>();
        productList = FXCollections.observableArrayList(ProductRepository.getProducts());

        TableColumn<Product, Integer> idColumn = new TableColumn<>("ID");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Product, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Product, String> descriptionColumn = new TableColumn<>("Description");
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));

        TableColumn<Product, Integer> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        tableView.getColumns().addAll(idColumn, nameColumn, descriptionColumn, quantityColumn);
        tableView.setItems(productList);

        this.setCenter(tableView);
    }

    public ObservableList<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
        tableView.refresh();
    }
}
