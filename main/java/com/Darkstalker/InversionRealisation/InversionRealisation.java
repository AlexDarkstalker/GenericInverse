package com.Darkstalker.InversionRealisation;
import com.Darkstalker.Array.MyArray;
import com.Darkstalker.InversionInterface.*;
/**
 * Created by alxunderseelisnow on 03.04.16.
 */
public class <T> InversionRealisation<T> implements InversionInterface {
    MyArray<T> array;
    public InversionRealisation(MyArray<T> templArray)
    {
        array = templArray;
    }
    public void inversion()
    {
        T tmp;
        for(int i = 0; i < array.getArray().length/2;i++)
        {
            tmp = array.getArray()[i];
            array.getArray()[i] = array.getArray()[array.getArray().length-i-1];
            array.getArray()[array.getArray().length-i-1] = tmp;
        }
    }
}
