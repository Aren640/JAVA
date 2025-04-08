public class Alumno {
    public String nombre;
    public String Apellido;
    public String DNI;
    public int edad;

    public Alumno(String nombre,String Apellido,String DNI,int edad){
        this.nombre=nombre;
        this.Apellido=Apellido;
        this.DNI=DNI;
        this.edad=edad;
    }
    public String getNombre(){
        return nombre;
        }

    public String getApellido() {
        return Apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString(){
        return"Nombre: "+nombre + "\nApellidos: " + Apellido + "\nEdad" + edad + "\nDNI" + DNI;
    }
}
