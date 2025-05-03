package exercicio4oo.classes;

import java.awt.geom.Area;

public class Retangulo {
    private double largura;
    private double altura;

    public double calcularArea() {
        return this.largura * this.altura;
    }
    public Double getLargura() {return largura;}
    public void setLargura(double largura) {this.largura = largura;}

    public Double getAltura() {return altura;}
    public void setAltura(double altura) {this.altura = altura;}
}
