/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioordenacao;

/**
 *
 * @author 030112096
 */
public class Periodico implements Comparable {
    
    private String issn,titulo,area,estrato;
    
    public Periodico(){
        issn = "";
        titulo = "";
        area = "";
        estrato = "";
    }
    
    public Periodico(String issn,String titulo,String area,String estrato){
        this.issn = issn;
        this.titulo = titulo;
        this.area = area;
        this.estrato = estrato;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEstrato() {
        return estrato;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
    }
    
    @Override
    public int compareTo(Object o){
        Periodico p = (Periodico)o;
        return this.issn.compareTo(p.issn);
    }
    
    @Override
    public String toString(){
        return this.issn+" - "+this.titulo+" - "+this.area+" - "+this.estrato;
    }
    
}
