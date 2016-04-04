package com.Darkstalker.Array;

/**
 * class that helps to work with array
 * Created by alxunderseelisnow on 03.04.16.
 */
public class MyArray<T> {
    T[] templateArray;

    /**
     * constructor
     * @param array
     */
    public MyArray(T[] array)
    {
        this.templateArray = array;
    }

    /**
     * getter
     * @return
     */
    public T[] GetArray()
    {
        return this.templateArray;
    }
}

