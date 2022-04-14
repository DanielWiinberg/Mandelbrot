module mandelbrot.mandelbrot {
    requires javafx.controls;
    requires javafx.fxml;


    opens mandelbrot.mandelbrot to javafx.fxml;
    exports mandelbrot.mandelbrot;
}