module fr.btssio.ratatouille {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;

    opens fr.btssio.ratatouille to javafx.fxml;
    exports fr.btssio.ratatouille;
}