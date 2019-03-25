package com.designpatterns.memento;

/**
 * Created by rai.vivek on 25/03/19.
 */

/*
    - Memento design pattern is used when we want to save the state of an object so that we can restore later on.
    - Memento design pattern is implement in such a way that the saved state of an object is not accessible outside of the
      object, this protects the integrity of saved state data.
    - Is implemented with two objects : Originator and Caretaker
    - Originator is the object whose state needs to be saved and restored and it uses an inner class to save the state
      of an Object. The inner class is called Momento and it's private so that it can't be accessed from other objects

    - Originator : the object for which the state to be saved. It create a memento and uses it in future to undo
    - memento : the object that is going to maintain the state of an originator. Its just a POJO
    - caretaker : the object that keeps track of multiple memento. Like maintaining savepoints

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
