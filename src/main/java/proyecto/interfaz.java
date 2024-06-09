package proyecto;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class interfaz extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear etiquetas
        Label dateLabel = new Label("Selecciona una fecha:");
        Label colorLabel = new Label("Selecciona un color:");

        // Crear DatePicker
        DatePicker datePicker = new DatePicker();

        // Crear ColorPicker
        ColorPicker colorPicker = new ColorPicker();

        // Crear botón
        Button button = new Button("Confirmar selección");

        // Acción al presionar el botón
        button.setOnAction(e -> {
            // Obtener la fecha seleccionada
            String fechaSeleccionada = datePicker.getValue().toString();

            // Obtener el color seleccionado
            Color colorSeleccionado = colorPicker.getValue();

            // Mostrar la fecha y el color en la consola
            System.out.println("Fecha seleccionada: " + fechaSeleccionada);
            System.out.println("Color seleccionado: " + colorSeleccionado.toString());
        });

        // Crear VBox layout
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10));
        vbox.getChildren().addAll(dateLabel, datePicker, colorLabel, colorPicker, button);

        // Crear escena
        Scene scene = new Scene(vbox, 300, 200);

        // Configurar y mostrar la ventana
        primaryStage.setTitle("Seleccionar Fecha y Color");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


// hola