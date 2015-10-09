package com.example.designparttern.structural.adapter;

import com.example.designparttern.structural.adapter.advance.Format;

/**
 * This stupid code is created by thantieuhodo on 10/9/15.
 */
public class AdapterDemo {

    public static void main(String[] args) {

        // multiFileReader joins functions from DocReader and PdfReader -> adapter for read document files.
        // we see that it can read document files with many types :v

        MultiFileReader reader = new MultiFileReader();

        // supported
        reader.readFile("path_doc", Format.DOC);

        // default
        reader.readFile("path_txt", Format.TXT);

        // supported
        reader.readFile("path_pdf", Format.PDF);


        // not support
        reader.readFile("path_xlsx", Format.XLSX);
        reader.readFile("path_xml", Format.XML);
    }
}
