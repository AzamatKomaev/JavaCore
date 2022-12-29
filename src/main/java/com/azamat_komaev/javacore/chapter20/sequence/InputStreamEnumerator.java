package com.azamat_komaev.javacore.chapter20.sequence;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

public class InputStreamEnumerator implements Enumeration<FileInputStream> {
    private Enumeration<String> files;

    public InputStreamEnumerator(Vector<String> files) {
        this.files = files.elements();
    }

    public boolean hasMoreElements() {
        return this.files.hasMoreElements();
    }

    public FileInputStream nextElement() {
        try {
            return new FileInputStream(files.nextElement().toString());
        } catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }
}
