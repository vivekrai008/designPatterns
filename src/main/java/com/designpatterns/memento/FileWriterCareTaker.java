package com.designpatterns.memento;

/**
 * Created by rai.vivek on 25/03/19.
 */
public class FileWriterCareTaker {

    private Object obj;

    public void save(FileWriterUtil fileWriterUtil) {
        this.obj = fileWriterUtil.save();
    }

    public void undo(FileWriterUtil fileWriterUtil) {
        fileWriterUtil.undoToLastSave(this.obj);
    }
}
