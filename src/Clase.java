public class Clase {
    public String curso;
    public int numero;
    public int capacidadMaxima;

    public Clase(String curso, int numero, int capacidadMaxima) {
        this.curso = curso;
        this.numero = numero;
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public String toString() {
        return "Curso: " + curso + "\nNumero: " + numero + "\nCapacidad: " + capacidadMaxima;
    }
}
