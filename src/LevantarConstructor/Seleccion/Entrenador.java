package LevantarConstructor.Seleccion;

public class Entrenador extends SeleccionFutbol {
    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        //super(id, nombre, apellidos, edad);
        setId(id);
        setNombre(nombre);
        setApellidos(apellidos);
        setEdad(edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
        System.out.println("Dirige un partido");
    }

    public void dirigirEntrenamiento() {
        System.out.println("Dirige un entrenamiento");
    }
}