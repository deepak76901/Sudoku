module com.sudoku {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.sudoku to javafx.fxml;
    exports com.sudoku;
}