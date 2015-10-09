package com.example.designparttern.structural.adapter.advance;

/**
 * This stupid code is created by thantieuhodo on 10/9/15.
 */
public class DocReader implements AdvanceFileReader {
    @Override
    public void readPdfFile(String path) {
        // because this class for DOC file only -> do nothing
    }

    @Override
    public void readDocFile(String path) {
        System.out.println("Read Doc file from path: " + path);
    }
}
