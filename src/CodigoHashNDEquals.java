import java.util.Objects;

class Usuario {
    private String nombre, correo;

    public Usuario(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public Usuario() {}

    // Método para verificar la igualdad entre objetos
    @Override
    public boolean equals(Object o) {
        // Si el objeto es la misma instancia, devolvemos true
        if (this == o) return true;

        // Si el objeto es null o no es de la misma clase, devolvemos false
        if ((o == null) || getClass() != o.getClass()) return false;

        // Convertimos el objeto a Usuario
        Usuario usuario = (Usuario) o;

        // Comparamos los campos nombre y correo de los dos objetos
        // Devolvemos true si son iguales y false si no lo son
        return Objects.equals(nombre, usuario.nombre) && Objects.equals(correo, usuario.correo);
    }

    // Método para generar un código hash para el objeto
    @Override
    public int hashCode() {

        // Generamos un código hash para el campo nombre
        int resultado = nombre != null ? nombre.hashCode() : 0;

        // Multiplicamos el resultado por 31 y le sumamos el código hash del campo correo
        resultado = 31 * resultado + (correo != null ? correo.hashCode() : 0);

        // Devolvemos el resultado como el código hash del objeto Usuario
        return resultado;
    }
}

public class CodigoHashNDEquals {

    public static void main(String[] args) {

        Usuario u = new Usuario();
        System.out.println(u.hashCode());

        Usuario u2 = new Usuario("Ejemplo", "ejemplo@ejemplo.com");
        System.out.println(u2.hashCode());

        Usuario u3 = new Usuario("Alejandro de la Vega", "alDV@gmail.com");
        System.out.println(u3.hashCode());

        if (u2.equals(u3)) System.out.println("\nLos objetos son iguales");
        else System.out.println("\nLos objetos no son iguales");

        /*Este código Java define una clase Usuario que tiene dos campos:
        nombre y correo.
        Implementa los métodos equals() y hashCode() para permitir la
        comparación y el cálculo del código hash basado en los valores
        de estos campos. En el método main, se crean instancias de Usuario
        y se demuestra cómo funciona la comparación de objetos y la generación
        de códigos hash.





         */
    }
}
