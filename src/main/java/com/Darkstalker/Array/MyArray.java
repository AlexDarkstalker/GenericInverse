package com.Darkstalker.Array;

/**
 * class that helps to work with array
 * @param <T>
 * Created by alxunderseelisnow on 03.04.16.
 */
public class MyArray<T> {
    private T[] templateArray;
    /**
     * constructor
     * @param array T[]
     */
    public MyArray(final T[] array)
    {
        this.templateArray = array;
    }

    /**
     * getter
     * @return array
     */
    public T[] getArray()
    {
        return this.templateArray;
    }
}

