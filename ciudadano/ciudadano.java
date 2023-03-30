package ciudadano;
/*Para practicar la encapsulación:

Crear clase Persona.

Crear variables las privadas edad, nombre y telefono de la clase Persona.

Crear gets y sets de cada propiedad.

Crear un objeto persona en el main.

Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola. */
public class ciudadano {
    public static void main(String[] args) {
        persona persona = new persona();
        persona.setEdad(15);
        System.out.println(persona.getEdad());
        persona.setNombre("sergio");
        System.out.println(persona.getNombre());
        persona.setNumero(66556949);
        System.out.println(persona.getNumero());


    }
}

class persona {

    private int edad;
    private String nombre;
    private int numero;

    public void setEdad(int edad){
        this.edad = edad;


    }

    public int getEdad() {
        return edad;
    }

    public void setNombre( String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return numero;
    }




}