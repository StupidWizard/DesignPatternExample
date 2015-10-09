package com.example.designparttern.structural.adapter.advance;

import com.example.designparttern.structural.adapter.FileReader;

/**
 * This stupid code is created by thantieuhodo on 10/9/15.
 */
public class FileReaderAdapter implements FileReader {

    private AdvanceFileReader myReader;

    public FileReaderAdapter(Format format) {
        switch (format) {
            case PDF:
                myReader = new PdfReader();
                break;

            case DOC:
                myReader = new DocReader();
                break;
        }
    }

    @Override
    public void readFile(String path, Format format) {
        switch (format) {
            case PDF:
                myReader.readPdfFile(path);
                break;

            case DOC:
                myReader.readDocFile(path);
                break;
        }
    }
}
