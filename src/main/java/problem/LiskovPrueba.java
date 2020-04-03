package problem;

import static junit.framework.Assert.assertEquals;

/**
 *
 * @author Josué Pivaral
 */
public class LiskovPrueba {
    
      
    public void testArea() {
    Rectangulo r = new Rectangulo();
    r.setAncho(5);
    r.setAlto(4);
    assertEquals(20, r.calcularArea());
  }
  
}
