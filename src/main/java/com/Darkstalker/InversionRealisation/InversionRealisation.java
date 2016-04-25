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
     * @param <T> int
     * @param array MyArray <T>
     */
    public <T> void inversion(final MyArray <T> array) {
        T tmp;
        for (int i = 0 ; i < array.getArray().length / 2; ++i)
        {
            tmp = array.getArray()[i];
            array.getArray()[i] = array.getArray()[array.getArray().length - i - 1];
            array.getArray()[array.getArray().length - i - 1 ] = tmp;
        }
    }
}

