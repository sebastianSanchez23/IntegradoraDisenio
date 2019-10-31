/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.dsm401.examen.gui;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author pollo
 */
public class WindowMain extends Application {

    private static final Image IMG_YOGA = new Image(System.class.getResource("/res/lotus.png").toString());
    private static final Image IMG_LOGO = new Image(System.class.getResource("/res/lotus.png").toString());
    private static final Image IMG_SUCURSALES = new Image(System.class.getResource("/res/sucursal.png").toString());
    private static final Image IMG_EMPLEADOS = new Image(System.class.getResource("/res/empleado.png").toString());
    private static final Image IMG_CLIENTES = new Image(System.class.getResource("/res/cliente.png").toString());
    private static final Image IMG_PRODUCTOS = new Image(System.class.getResource("/res/productos.png").toString());
    private static final Image IMG_SERVICIOS = new Image(System.class.getResource("/res/servicios.png").toString());
    private static final Image IMG_RESERVACIONES = new Image(System.class.getResource("/res/reservaciones.png").toString());
    private static final Image IMG_SALAS = new Image(System.class.getResource("/res/salas.png").toString());
    private static final Image IMG_TRATAMIENTO = new Image(System.class.getResource("/res/tratamientos.png").toString());
    private static final Image IMG_CTRLSALA = new Image(System.class.getResource("/res/ctrlSala.png").toString());
    private static final Image IMG_SESION = new Image(System.class.getResource("/res/inicioSesion.png").toString());

    FXMLLoader fxmll;
    Stage window;
    Scene scene;
    @FXML
    ImageView imgvLogo;
    @FXML
    ImageView imgvInicioSesion;
    @FXML
    Button btnSucursales;
    @FXML
    Button btnEmpleados;
    @FXML
    Button btnClientes;
    @FXML
    Button btnProductos;
    @FXML
    Button btnServicios;
    @FXML
    Button btnReservaciones;
    @FXML
    Button btnSalas;
    @FXML
    Button btnTratamientos;
    @FXML
    Button btnCtrlSala;

    public WindowMain() {
        fxmll = new FXMLLoader(System.class.getResource("/edu/dsm401/examen/gui/fxml/window_main.fxml"));
        fxmll.setController(this);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        fxmll.load();
        scene = new Scene(fxmll.getRoot());
        window = primaryStage;
        window.setScene(scene);
//        window.setR{esizable(false);
//        window.resizableProperty().setValue(false);
        window.setTitle("MySpa");
        window.getIcons().add(IMG_LOGO);
        window.show();

        imgvLogo.setImage(IMG_YOGA);

        btnSucursales.setContentDisplay(ContentDisplay.RIGHT);
        btnEmpleados.setContentDisplay(ContentDisplay.RIGHT);
        btnClientes.setContentDisplay(ContentDisplay.RIGHT);
        btnProductos.setContentDisplay(ContentDisplay.RIGHT);
        btnServicios.setContentDisplay(ContentDisplay.RIGHT);
        btnReservaciones.setContentDisplay(ContentDisplay.RIGHT);
        btnSalas.setContentDisplay(ContentDisplay.RIGHT);
        btnTratamientos.setContentDisplay(ContentDisplay.RIGHT);
        btnCtrlSala.setContentDisplay(ContentDisplay.RIGHT);

        btnSucursales.setGraphic(new ImageView(IMG_SUCURSALES));
        btnEmpleados.setGraphic(new ImageView(IMG_EMPLEADOS));
        btnClientes.setGraphic(new ImageView(IMG_CLIENTES));
        btnProductos.setGraphic(new ImageView(IMG_PRODUCTOS));
        btnServicios.setGraphic(new ImageView(IMG_SERVICIOS));
        btnReservaciones.setGraphic(new ImageView(IMG_RESERVACIONES));
        btnSalas.setGraphic(new ImageView(IMG_SALAS));
        btnTratamientos.setGraphic(new ImageView(IMG_TRATAMIENTO));
        btnCtrlSala.setGraphic(new ImageView(IMG_CTRLSALA));

        imgvInicioSesion.setImage(IMG_SESION);

    }

}
