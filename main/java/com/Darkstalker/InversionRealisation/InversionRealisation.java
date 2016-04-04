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
        for(int i = 0; i < array.GetArray().length/2;i++)
        {
            tmp = array.GetArray()[i];
            array.GetArray()[i] = array.GetArray()[array.GetArray().length-i-1];
            array.GetArray()[array.GetArray().length-i-1] = tmp;
        }
    }
}
