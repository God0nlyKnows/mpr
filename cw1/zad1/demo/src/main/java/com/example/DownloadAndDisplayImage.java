package com.example;

import java.io.File;
import java.net.URL;
import org.apache.commons.io.FileUtils;
import ij.io.Opener;

public class DownloadAndDisplayImage {
    public static void main(String[] args) throws Exception {

        String filename = "file.jpg"; 
        FileUtils.copyURLToFile(new URL("https://upload.wikimedia.org/wikipedia/commons/3/38/JPEG_example_JPG_RIP_001.jpg"),new File(filename));

        Opener opener = new Opener();
        opener.open(filename);
    }
}
