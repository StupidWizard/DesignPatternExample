package com.example.designparttern.structural.adapter;

import com.example.designparttern.structural.adapter.FileReader;
import com.example.designparttern.structural.adapter.advance.AdvanceFileReader;
import com.example.designparttern.structural.adapter.advance.DocReader;
import com.example.designparttern.structural.adapter.advance.Format;
import com.example.designparttern.structural.adapter.advance.PdfReader;

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
