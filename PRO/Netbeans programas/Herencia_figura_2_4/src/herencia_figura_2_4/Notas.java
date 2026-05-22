/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_figura_2_4;

/**
 *
 * @author mesteso
 */
public class Notas {
   private int matematicas;
   private int fisica;
   private int geografia;
   private int lengua;

    public Notas(int matematicas, int fisica, int geografia, int lengua) {
        this.matematicas = matematicas;
        this.fisica = fisica;
        this.geografia = geografia;
        this.lengua = lengua;
    }

    public int getMatematicas() {
        return matematicas;
    }

    public void setMatematicas(int matematicas) {
        this.matematicas = matematicas;
    }

    public int getFisica() {
        return fisica;
    }

    public void setFisica(int fisica) {
        this.fisica = fisica;
    }

    public int getGeografia() {
        return geografia;
    }

    public void setGeografia(int geografia) {
        this.geografia = geografia;
    }

    public int getLengua() {
        return lengua;
    }

    public void setLengua(int lengua) {
        this.lengua = lengua;
    }

    @Override
    public String toString() {
        return "Notas{" + "matematicas=" + matematicas + ", fisica=" + fisica + ", geografia=" + geografia + ", lengua=" + lengua + '}';
    }
    
}
