package com.androiddesdecero.collections;

import android.util.Log;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by albertopalomarrobledo on 4/2/19.
 */

/*Un Iterador es una de las mcuhas maneras de recorrer una colección de datos
y como cada opción tiene ventajas y desventajas

Para obtener un iterador de una colección de datos tenemos que
llamar al metodo iteractor.
List<String> nombres;
Iterator<String> iter = nombres.iteractor();
 */

public class CustomIteractor {

    /*
    Para obtener un iterador de una colección de datos tenemos que
    llamar al metodo iteractor.
    */


    public void probarIteractor(){

        List<String> nombres = new ArrayList<>();
        nombres.add("Alberto");
        nombres.add("Manuel");
        nombres.add("Marta");
        Iterator<String> iter = nombres.iterator();

        /*Principales metodos
        hasNext()
        El metodo se puede usar para verificar si al menos hay un elemento
        para iterar. Es decir si tiene siguiente la posición en la que estamos
        */
        while(iter.hasNext()){
            /*next()
            El metodo se usa para pasar al siguiente elemento de la colección
            y obtener su valor
            */
            String nombre = iter.next();
            Log.d("TAG1", nombre);

            //Es importante chequear antes que hasNext para evitar problemas
            /*
            Remove()
            Para eliminar un elemento de la colleción
            iter.remove();
            */

            if(nombre.equals("Alberto")){
                iter.remove();
            }
        }
    }


}
