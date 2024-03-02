/*// Definimos una clase llamada IndexHash
class IndexHash {
    // Declaramos una variable privada de tipo Integer llamada index
    private Integer index;
}*/

public class HashMap {

    public static void main(String[] args) {

        // Creamos un nuevo objeto de tipo java.util.HashMap llamado hashMap
        java.util.HashMap<Integer, String> hashMap = new java.util.HashMap<>();

        // Añadimos varios pares clave-valor al hashMap
        hashMap.put(1000, "Juan");
        hashMap.put(2000, "Pedro");
        hashMap.put(3000, "Maria");
        hashMap.put(4000, "Jose");

        // Imprimimos el hashMap completo
        System.out.println(hashMap);
        // Imprimimos el valor asociado a la clave 1000
        System.out.println(hashMap.get(1000));

        // Eliminamos el par clave-valor con clave 3000 e imprimimos el valor asociado a esa clave
        System.out.println(hashMap.remove(3000));
        // Imprimimos el hashMap después de la eliminación
        System.out.println(hashMap);

        // Comprobamos si el hashMap contiene la clave 1500
        if (hashMap.containsKey(1500))
            // Si la clave 1500 existe, imprimimos un mensaje con su valor asociado
            System.out.println("The key 1500 exists and his value is " + hashMap.get(1500));
        else
            // Si la clave 1500 no existe, imprimimos un mensaje indicándolo
            System.out.println("The key 1500 does not exist");

        // Recorremos todas las claves del hashMap
        for (Integer index : hashMap.keySet())
            // Para cada clave, imprimimos su valor asociado
            System.out.println(hashMap.get(index));
    }
}

/*
* Este código Java demuestra el uso de la clase HashMap de Java, que es una estructura de datos que almacena pares clave-valor.

Se crea un objeto HashMap llamado hashMap que almacena enteros
* como claves y cadenas como valores.
*
Se añaden varios pares clave-valor al hashMap.
*
Se imprime el hashMap completo.
*
Se imprime el valor asociado a la clave 1000.
*
Se elimina el par clave-valor con clave 3000 y se imprime el valor
* asociado a esa clave.
*
Se imprime el hashMap después de la eliminación.
*
Se comprueba si el hashMap contiene la clave 1500 y se imprime un
* mensaje apropiado.
*
Se recorren todas las claves del hashMap y se imprimen los valores
* asociados a cada clave.
**/