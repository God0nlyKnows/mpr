package com.example;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import org.apache.commons.io.FileUtils;
import ij.io.Opener;

public class DownloadAndDisplayImage {
    public static void main(String[] args) throws Exception {

        String filename = "file.jpg";
        FileUtils.copyURLToFile(
                new URL("https://upload.wikimedia.org/wikipedia/commons/3/38/JPEG_example_JPG_RIP_001.jpg"),
                new File(filename));
        File file = new File(filename);
        try {

            BufferedImage image = ImageIO.read(file);
            for(int i = 0; i<image.getHeight();i++){
                for(int j = 0; j<image.getWidth();j++){

                    image.setRGB(j, i, image.getRGB(j, i) - 40); //random mod
                }
            }
            ImageIO.write(image, "jpg", file);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        Opener opener = new Opener();
        opener.open(filename);

        Thread.sleep(5000);
        System.exit(0);
    }
}
