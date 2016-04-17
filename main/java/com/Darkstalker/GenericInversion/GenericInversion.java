package com.Darkstalker.GenericInversion;
import com.Darkstalker.Array.MyArray;
import com.Darkstalker.InversionRealisation.InversionRealisation;

import java.util.Arrays;

/**
 * Main class
 * Created by alxunderseelisnow on 03.04.16.
 */
public class GenericInversion {
    public static void main(final String args[])
    {
        Integer[] arrayInteger = {1,2,3,4,5,6,7};
        MyArray<Integer> firstArray = new MyArray<Integer>(arrayInteger);
        String[] arrayString = {"abra", "kadabra"};
        MyArray<String> secondArray = new MyArray<String>(arrayString);
        Double[] arrayDouble = {1., 2., 3.4, 5., 3.3};
        MyArray<Double> thirdArray = new MyArray<Double>(arrayDouble);
        System.out.println(Arrays.toString(firstArray.getArray()));
        System.out.println(Arrays.toString(secondArray.getArray()));
        System.out.println(Arrays.toString(thirdArray.getArray()));
        InversionRealisation<Integer> invertInt= new InversionRealisation<Integer>(firstArray);
        InversionRealisation<String> invertString = new InversionRealisation<String>(secondArray);
        InversionRealisation<Double> invertDouble = new InversionRealisation<Double>(thirdArray);
        invertInt.inversion();
        invertString.inversion();
        invertDouble.inversion();
        System.out.println(Arrays.toString(firstArray.getArray()));
        System.out.println(Arrays.toString(secondArray.getArray()));
        System.out.println(Arrays.toString(thirdArray.getArray()));
    }
}
