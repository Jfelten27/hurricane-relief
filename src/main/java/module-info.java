module com.pending.hurricanerelief {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.pending.hurricanerelief to javafx.fxml;
    exports com.pending.hurricanerelief;
}