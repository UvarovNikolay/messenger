module ru.gb.messenger {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gb.messenger to javafx.fxml;
    exports ru.gb.messenger;
}