package laherencia;

import tarea3.tarea3;

/*Crea una clase Persona con las siguientes variables:

La edad

El nombre

El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito 
solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, 
tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga 
la clase Trabajador. */
public class laherencia {
    public static void main(String[] args) {
        Cliente usuario = new Cliente();
        usuario.edad= 18;
        usuario.nombre= "sergio";
        usuario.telefono = 66892141;
        usuario.credito = 10000.85;
        System.out.println(usuario.edad);
        System.out.println(usuario.nombre);
        System.out.println(usuario.telefono);
        System.out.println(usuario.credito);

        System.out.println("el obrero");

        Trabajador obrero = new Trabajador();
        obrero.edad =22;
        obrero.nombre = "freddy";
        obrero.salario = 2000.45;
        obrero.telefono = 69453121;
        System.out.println(obrero.edad);
        System.out.println(obrero.nombre);
        System.out.println(obrero.salario);
        System.out.println(obrero.telefono);
    }
}

class Persona{

    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    double credito;

}
class Trabajador extends Persona{
    double salario;
}

