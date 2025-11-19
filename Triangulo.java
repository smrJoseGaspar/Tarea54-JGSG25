package es.gva.edu.sanchezgarcia.jg.tarea.jgsg24;

/**
 *
 * @author jgaspar
 */
public class Cuadrado implements Figura {
    
    private int base, altura;


    @Override
    public double calcularArea() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return base*altura/2;
    }

    @Override
    public double calcularPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Cuadrado(int b, int h) {
        this.base = b;
	this.altura =h;
    }

    public int getBase() {
        return base;
    }

    public int getAltura(){
	return altura;
    }

    public void setBase(int b) {
        this.base = b;
    }

    public void setAltura(int h) {
	this.altura=h;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + " altura="+altura'}';
    }
       
}
