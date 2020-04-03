package solution;

/**
 *
 * @author Josué Pivaral
 */
public class Cuadrado implements Forma {
    
    private int tamaño;
 
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
 
    @Override
    public int calcularArea() {
        return tamaño * tamaño;
    }
}
