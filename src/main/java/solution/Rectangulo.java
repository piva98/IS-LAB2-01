package solution;

/**
 *
 * @author Josué Pivaral
 */
public class Rectangulo implements Forma {
    private int ancho;
    private int alto;
 
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
 
    public void setAlto(int alto) {
        this.alto = alto;
    }
 
    @Override
    public int calcularArea() {
        return ancho * alto;
    }
    
    
}
