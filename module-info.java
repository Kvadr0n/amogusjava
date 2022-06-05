module ru.mirea.amogusjava {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;


    opens ru.mirea.amogusjava to javafx.fxml;
    exports ru.mirea.amogusjava;
}