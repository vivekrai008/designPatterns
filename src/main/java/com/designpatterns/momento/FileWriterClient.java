package com.designpatterns.momento;

/**
 * Created by rai.vivek on 25/03/19.
 */

/*
    - Momento design pattern is used when we want to save the state of an object so that we can restore later on.
    - Momento design pattern is implement in such a way that the saved state of an object is not accessible outside of the
      object, this protects the integrity of saved state data.
    - Is implemented with two objects : Originator and Caretaker
    - Originator is the object whose state needs to be saved and restored and it uses an inner class to save the state
      of an Object. The inner class is called Momento and it's private so that it can't be accessed from other objects
 */

public class FileWriterClient {

    public static void main(String[] args)  {

        FileWriterCareTaker fileWriterCareTaker = new FileWriterCareTaker();
        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");

        fileWriter.write("First Set of Data" + "\n");
        System.out.println(fileWriter + "\n");

        fileWriterCareTaker.save(fileWriter);

        fileWriter.write("Second Set of Data" + "\n");
        System.out.printf(fileWriter + "\n");

        fileWriterCareTaker.undo(fileWriter);
        System.out.println(fileWriter + "\n");
    }
}
