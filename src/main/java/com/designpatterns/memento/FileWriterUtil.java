package com.designpatterns.memento;

/**
 * Created by rai.vivek on 25/03/19.
 */

//Momento pattern originator class

public class FileWriterUtil {

    private String fileName;
    private StringBuilder content;

    public FileWriterUtil(String file) {
        this.fileName = file;
        this.content = new StringBuilder();
    }

    @Override
    public String toString() {
        return this.content.toString();
    }

    public void write(String str) {
        content.append(str);
    }

    public Memento save() {
        return new Memento(this.fileName, this.content);
    }

    public void undoToLastSave(Object obj) {
        Memento momento = (Memento)obj;
        this.fileName = momento.fileName;
        this.content = momento.content;

    }

    private class Memento {

        private String fileName;
        private StringBuilder content;

        public Memento(String fileName, StringBuilder content) {
            this.fileName = fileName;
            this.content = new StringBuilder(content);
        }
    }
}
