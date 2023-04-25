/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Jugador {
    private String nombre;
    private int[] puntos;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntos = new int[7];
        for (int i = 0; i < puntos.length; i++) {
            this.puntos[i] = 0;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getPuntos() {
        return puntos;
    }

    public void setPuntos(int[] puntos) {
        this.puntos = puntos;
    }
    
    public int getPuntosN(int pos) {
        if (this.puntos[pos]>3)
            return 3;
        return this.puntos[pos];
    }
    
    public int getTotal() {
        int total = 0;
        for (int i = 0; i < this.puntos.length-1; i++) {
            if(this.puntos[i] > 3)
                total = total + ((this.puntos[i]-3) * (15+i));
        }
        if(this.puntos[6] > 3)
            total = total + ((this.puntos[6]-3) * (25));
        return total;
    }
    
    public void setArr(int pos, int punt) {
        this.puntos[pos] = this.puntos[pos] + punt;
        System.out.println(this.puntos[pos]);
    }
    
    public int todoCompleto() {
        int x = 0;
        
        for (int i = 0; i < this.puntos.length; i++) {
            if(this.puntos[i]>=3)
                x++;
        }
        if(x==7){
            return 1;
        }
        return 0;
    }
    
}
