package com.example.designparttern.structural.adapter;

import com.example.designparttern.structural.adapter.advance.FileReaderAdapter;
import com.example.designparttern.structural.adapter.advance.Format;

/**
 * This stupid code is created by thantieuhodo on 10/9/15.
 */
public class MultiFileReader implements FileReader {

    FileReaderAdapter myAdapter;

    @Override
    public void readFile(String path, Format format) {
        switch (format) {
            case TXT:
                // default format:
                System.out.println("Read text file from path: " + path);
                break;

            case DOC:
                myAdapter = new FileReaderAdapter(Format.DOC);
                myAdapter.readFile(path, format);
                break;

            case PDF:
                myAdapter = new FileReaderAdapter(Format.PDF);
                myAdapter.readFile(path, format);
                break;

            default:
                System.out.println("not support with type " + format.name());
                break;
        }
    }
}
