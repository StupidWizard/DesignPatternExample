package com.example.designparttern.structural.adapter.advance;

/**
 * This stupid code is created by thantieuhodo on 10/9/15.
 */
public class PdfReader implements AdvanceFileReader {


    @Override
    public void readPdfFile(String path) {
        System.out.println("Read PDF file at path: " + path);
    }

    @Override
    public void readDocFile(String path) {
        // because this class is for PDF file only -> do nothing
    }
}
