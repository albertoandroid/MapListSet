package com.androiddesdecero.collections;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by albertopalomarrobledo on 4/2/19.
 */

/*
La interface Collection
Una colección representa un grupo de objetos.
Cuando queremos trabajar con un conjunto de elementos, vamos a necesitar
almacenarlos, la interfaz Collection nos permite almacenadr cualquier
tipo de dato y además nos ofrece una serie de métodos como pueden
ser añadir un elemento obtener el tamaño, elminar. etc.
A partir de esta interfza se extienden otras interfaces como
List Map y Set que veremos a continuación.
 */
public class CustomCollection {
    /*
    SET La interfaz set define una colección que no puede tener
    elementos duplicados.
    Es decir hereda todos los metodos de colección y le añade unos
    de comparación para evitar que se dupliquen datos.
     */


    public static void probarSet(){
        int repeticiones = 100000;
        Long tiempoComienzoSet;
        Long tiempoFinSet;


        /*HatSet
        Esta implementación evita datos repetidos y es la de mayor
        rendimiento debido a que no garantiza ningún orden a la hora
        de realizar las iteracciones.
        */
        Set <Integer> hashSet = new HashSet<Integer>();
        tiempoComienzoSet = System.currentTimeMillis();
        for(int i=0; i<repeticiones; i++){
            hashSet.add(i);
        }
        tiempoFinSet = System.currentTimeMillis();
        Log.d("TAG1", "Tiempo HashSet: " + (tiempoFinSet-tiempoComienzoSet));

        /*
        TreeSet
        A la hora de almacenar los datos, treeSet los ordena.
        Por ello es más lento que HashSet.
        */
        Set <Integer> treeSet = new TreeSet<Integer>();
        tiempoComienzoSet = System.currentTimeMillis();
        for(int i=repeticiones; i>0; i--){
            treeSet.add(i);
        }
        tiempoFinSet = System.currentTimeMillis();
        Log.d("TAG1", "Tiempo HashSet: " + (tiempoFinSet-tiempoComienzoSet));

        /*
        LinkedHashSet
        Esta implementacion nos ofrece almacenar los elementos
        en función del orden de inserción.
        Mas lenta que hashSet y más rapida que TreeSet
         */
        Set <Integer> linkedHashSet = new LinkedHashSet<>();
        tiempoComienzoSet = System.currentTimeMillis();
        for(int i=0; i<repeticiones; i++){
            linkedHashSet.add(i);
        }
        tiempoFinSet = System.currentTimeMillis();
        Log.d("TAG1", "Tiempo HashSet: " + (tiempoFinSet-tiempoComienzoSet));


        //A partir de esta interfza se extienden otras interfaces como
        //List Map y Set que veremos a continuación.

        /*
    SET La interfaz set define una colección que no puede tener
    elementos duplicados.
    Es decir hereda todos los metodos de colección y le añade unos
    de comparación para evitar que se dupliquen datos.
     */

        /*HashSet
        Esta implementación evita datos repetidos y es la de mayor
        rendimiento debido a que no garantiza ningún orden a la hora
        de realizar las iteracciones.
        */
        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("Alberto");
        hashSet1.add("Maria");
        hashSet1.add("Marta");
        hashSet1.add("Pablo");
        hashSet1.add("Jesús");
        hashSet1.add("Alberto");
        for(String nombre: hashSet1){
            Log.d("TAG1", "Nombre: " + nombre);

        }

        /*
        TreeSet
        A la hora de almacenar los datos, treeSet los ordena.
        Por ello es más lento que HashSet.
        */
        TreeSet<String> treeSetSet1 = new TreeSet<>();
        treeSetSet1.add("Alberto");
        treeSetSet1.add("Maria");
        treeSetSet1.add("Marta");
        treeSetSet1.add("Pablo");
        treeSetSet1.add("Jesús");
        treeSetSet1.add("Alberto");
        for(String nombre: treeSetSet1){
            Log.d("TAG1", "Nombre: " + nombre);

        }

        /*
        LinkedHashSet
        Esta implementacion nos ofrece almacenar los elementos
        en función del orden de inserción.
        Mas lenta que hashSet y más rapida que TreeSet
         */
        LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<>();
        linkedHashSet1.add("Alberto");
        linkedHashSet1.add("Maria");
        linkedHashSet1.add("Marta");
        linkedHashSet1.add("Pablo");
        linkedHashSet1.add("Jesús");
        linkedHashSet1.add("Alberto");
        for(String nombre: linkedHashSet1){
            Log.d("TAG1", "Nombre: " + nombre);

        }





        //A partir de esta interfza se extienden otras interfaces como
        //List Map y Set que veremos a continuación.


        /*
        La interfaz List define una sucencios de datos.
        La diferencia con Set es que si admite datos duplicados.
        -Acceso posicional de elementos.
        - Busqueda de Elementos
        Iteracción sobre elementos

        */

        /*
        Array List
        Implementación más usada
        Se basa en un array que se puede redimensionar. Aumentar o
        disminuir su tamaño de manera sencilla.
        Tiene muy buen rendimiento
        */

        /*
        LinkedList
        Es una lista doblemente ligada. Es decir que cada elemento
        tiene un puntero al elemente anterior y posterior.
        */

        List<String> lista = new ArrayList<>();

        lista.add("Alberto");
        lista.add("Maria");
        lista.add("Marta");
        lista.add("Pablo");
        lista.add("Jesús");
        lista.add("Alberto");
        for(String nombre: lista) {
            Log.d("TAG1", "Nombre Lista: " + nombre);
        }

        Log.d("TAG1", "Nombre get(0): " + lista.get(0));
        lista.remove(0);

        /*
        Map
        La interfaz Map nos permite guardar datos en formato de
        clave valor.
        De tal manera que para una clave solo hay un valor.
        Es decir la interfaz Map asocia claves a valores.
        La interfaz map no admite claves duplicadas.
        Y cada clave tiene asociado un valor.
        Nos permite añadir, eliminar y modificar datos de una forma
        muy sencilla.
        */

        /*
        HashMap
        Es la implementación de mayor rendimiento
        Los elementos insertados no tienen ningún orden especifico.
         */

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alberto", 3);
        hashMap.put("Marta", 3);
        hashMap.put("Paco", 5);
        hashMap.put("Maria", 2);
        hashMap.put("Victoria", 44);
        for(String nombre: hashMap.keySet()){
            Log.d("TAG1", "Nombre: " + nombre + " " + hashMap.get(nombre));
        }

        /*
        El Tree Map ordena los datos de forma natural

         */

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Alberto", 3);
        treeMap.put("Marta", 3);
        treeMap.put("Paco", 5);
        treeMap.put("Maria", 2);
        treeMap.put("Victoria", 44);
        for(String nombre: treeMap.keySet()){
            Log.d("TAG1", "TreeMap - Nombre: " + nombre + " " + treeMap.get(nombre));
        }

        /*
        LinkedHashMNap -> ordena los datos en función de su inserción.
         */

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Alberto", 3);
        linkedHashMap.put("Marta", 3);
        linkedHashMap.put("Paco", 5);
        linkedHashMap.put("Maria", 2);
        linkedHashMap.put("Victoria", 44);
        for(String nombre: linkedHashMap.keySet()){
            Log.d("TAG1", "linkedHashMap - Nombre: " + nombre + " " + linkedHashMap.get(nombre));
        }


        String[] letras = {"cocodrilo","zorro","leon", "tortuga","gacela", "jiraba",
                            "rinoceronte", "zorro", "leon", "zorro","rana"};

        Map<String, Integer> orden = new TreeMap<>();
        for(int i=0; i<letras.length; i++){
            if(orden.containsKey(letras[i])){
                orden.put(letras[i], orden.get(letras[i]) + 1);
            }else{
                orden.put(letras[i], 1);
            }
        }

        for(String nombre: orden.keySet()){
            Log.d("TAG1", "linkedHashMap - Nombre: " + nombre + " " + orden.get(nombre));
        }







    }






}
