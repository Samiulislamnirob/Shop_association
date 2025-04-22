module com.example.shop_association {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.shop_association to javafx.fxml;
    exports com.example.shop_association;
}