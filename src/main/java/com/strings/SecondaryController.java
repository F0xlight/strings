package com.strings;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {

        BufferedImage bi = ImageIO.read(new File("test.png"));
        BufferedImage nbi = Modifier.applyFunction(bi, 100, 11);
        File outputfile = new File("modified.png");
        ImageIO.write(nbi, "png", outputfile);

        App.setRoot("primary");
    }
}