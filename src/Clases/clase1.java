package Clases;

import java.util.ArrayList;

public class clase1 {

    private String curso;
    private double p1;
    private double p2;
    private double p3;
    private double ef;

    private double c1;
    private double c2;
    private double c3;
    private double c4;
    private double c5;
    private double c6;

    private ArrayList<clase1> clas;

    public clase1() {
    }

    public clase1(String curso, double p1, double p2, double p3, double ef, double c1, double c2, double c3, double c4, double c5, double c6) {
        this.curso = curso;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.ef = ef;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
        this.c5 = c5;
        this.c6 = c6;
        this.clas = new ArrayList();
    }
    
    public double puntos(){
        double puntos=0;
        puntos=(p1*0.1)+(p2*0.2)+(p3*0.2)+(ef*0.3);
        return puntos;
    }
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getP3() {
        return p3;
    }

    public void setP3(double p3) {
        this.p3 = p3;
    }

    public double getEf() {
        return ef;
    }

    public void setEf(double ef) {
        this.ef = ef;
    }

    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }

    public double getC2() {
        return c2;
    }

    public void setC2(double c2) {
        this.c2 = c2;
    }

    public double getC3() {
        return c3;
    }

    public void setC3(double c3) {
        this.c3 = c3;
    }

    public double getC4() {
        return c4;
    }

    public void setC4(double c4) {
        this.c4 = c4;
    }

    public double getC5() {
        return c5;
    }

    public void setC5(double c5) {
        this.c5 = c5;
    }

    public double getC6() {
        return c6;
    }

    public void setC6(double c6) {
        this.c6 = c6;
    }

    public ArrayList<clase1> getClas() {
        return clas;
    }

    public void setClas(ArrayList<clase1> clas) {
        this.clas = clas;
    }
    
    
}
