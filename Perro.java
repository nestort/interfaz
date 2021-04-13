/**
 * Perro
 */
public class Perro implements Mascota{
    // atributos
    String nombre;
    String raza;
    // constructor
    Perro(String nombre,String raza){
        this.nombre=nombre;
        this.raza=raza;
    }
    
    // metodos
    public void ladrar(){
        System.out.println("whoff");
    }
    // sobrescritura de metodo
    @Override
    public void lanzarJuguete(String objeto){
        System.out.println("hey");
    }

    
}