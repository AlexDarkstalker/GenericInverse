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
    public T getArrayElem(final int i)
    {
        return this.templateArray[i];
    }

    /**
     *
     * @param i number of elem
     * @param elem value of elem
     */
    public void setArrayElem(final int i, final T elem){
        this.templateArray[i] = elem;
    }

    /**
     *
     * @return length of array
     */
    public int getLength()
    {
        return this.templateArray.length;
    }
}

