/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidometro;

/**
 *
 * @author Leo
 */
public class Dia {
    private String data;
    private int totalBaixasMundo;
    private int baixasDiaBrasil;
    private float percentualTotal;
    private int baixasDiaMundo;
    private float percentualDia;

    private int calculaBaixasMundo(){
        
        return 1; //***
    }
    
    private float calculaPercentualTotal(){
        
        return 1f; //***
    }
    
    private float calculaPercentualDial(){
        
        return 1f; //***
    }
    
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getTotalBaixasMundo() {
        return totalBaixasMundo;
    }

    public void setTotalBaixasMundo(int totalBaixasMundo) {
        this.totalBaixasMundo = totalBaixasMundo;
    }

    public int getBaixasDiaBrasil() {
        return baixasDiaBrasil;
    }

    public void setBaixasDiaBrasil(int baixasDiaBrasil) {
        this.baixasDiaBrasil = baixasDiaBrasil;
    }

    public float getPercentualTotal() {
        return percentualTotal;
    }

    public void setPercentualTotal(float percentualTotal) {
        this.percentualTotal = percentualTotal;
    }

    public int getBaixasDiaMundo() {
        return baixasDiaMundo;
    }

    public void setBaixasDiaMundo(int baixasDiaMundo) {
        this.baixasDiaMundo = baixasDiaMundo;
    }

    public float getPercentualDia() {
        return percentualDia;
    }

    public void setPercentualDia(float percentualDia) {
        this.percentualDia = percentualDia;
    }
}
