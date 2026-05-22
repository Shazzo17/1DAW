/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresaapp;

/**
 *
 * @author mesteso
 */
public class Personal_comision extends Personal{
    double salario_minimo;
    int cantidad_clientes;
    double monto_cliente;

    public Personal_comision(double salario_minimo, int cantidad_clientes, double monto_cliente, String dni, String nombre, String apellido, int ano_ingreso) {
        super(dni, nombre, apellido, ano_ingreso);
        this.salario_minimo = salario_minimo;
        this.cantidad_clientes = cantidad_clientes;
        this.monto_cliente = monto_cliente;
    }

    public double getSalario_minimo() {
        return salario_minimo;
    }

    public void setSalario_minimo(double salario_minimo) {
        this.salario_minimo = salario_minimo;
    }

    public int getCantidad_clientes() {
        return cantidad_clientes;
    }

    public void setCantidad_clientes(int cantidad_clientes) {
        this.cantidad_clientes = cantidad_clientes;
    }

    public double getMonto_cliente() {
        return monto_cliente;
    }

    public void setMonto_cliente(double monto_cliente) {
        this.monto_cliente = monto_cliente;
    }

    @Override
    public String toString() {
        return super.toString()+"Personal_comision{" + "salario_minimo=" + salario_minimo + ", cantidad_clientes=" + cantidad_clientes + ", monto_cliente=" + monto_cliente + '}';
    }
    public  double calcular_salario(){
        double resultado;
        resultado=this.cantidad_clientes*this.monto_cliente;
        if (resultado>this.salario_minimo){
            return resultado;
        }
        return salario_minimo;
    }
    
   
    

    
    
}
