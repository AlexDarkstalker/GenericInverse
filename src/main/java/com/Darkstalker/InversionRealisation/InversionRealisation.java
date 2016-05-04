package com.Darkstalker.InversionRealisation;
import com.Darkstalker.Array.MyArray;
import com.Darkstalker.InversionInterface.InversionInterface;
/**
 * @param <T>
 * Created by alxunderseelisnow on 03.04.16.
 */
public class InversionRealisation<T> implements InversionInterface {

    /**
     * Constructor
     */
    public InversionRealisation()
    {}



        /*public <T> void inversion(final MyArray <T> array)
        {
            T tmp;
            for (int i = 0 ; i < array.getArray().length / 2; ++i)
            {
                tmp = array.getArray()[i];
                array.getArray()[i] = array.getArray()[array.getArray().length - i - 1];
                array.getArray()[array.getArray().length - i - 1 ] = tmp;
            }
        }*/

    /**
     * inversion of array
     * @param <T> type of elem
     * @param array MyArray <T>
     */
    public <T> void inversion(final MyArray <T> array) {
        T tmp;
        for (int i = 0 ; i < array.getLength() / 2; ++i)
        {
            tmp = array.getArrayElem(i);
            array.setArrayElem(i, array.getArrayElem(array.getLength() - i - 1)); //= array.getArray()[array.getArray().length - i - 1];
            //array.getArray()[array.getArray().length - i - 1 ] = tmp;
            array.setArrayElem(array.getLength() - i - 1, tmp);
        }
    }
}

