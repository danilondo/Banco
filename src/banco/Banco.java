
package banco;

import java.util.Date;

public class Banco {

    private Date fechaDeCreacion;
    private boolean creacionCuenta;
    private String nombreDelTitular;
    private double saldo;
    private int numeroCuenta;

    public Banco(Date fechaDeCreacion, boolean creacionCuenta, String nombreDelTitular, double saldo, int numeroCuenta) {
        this.fechaDeCreacion = fechaDeCreacion;
        this.creacionCuenta = creacionCuenta;
        this.nombreDelTitular = nombreDelTitular;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }
    
    public void registro(String nombreApellido){
        this.nombreDelTitular = nombreApellido;
    }
   
    public void cuenta (int numero){
        numeroCuenta += numero;
    }
    
    public void depositar (double cantidad){
        saldo += cantidad;
    }
    
    public void realizarTransaccion(){
        creacionCuenta = true;
    }
    
    public void historialDeLaCuenta(){
        fechaDeCreacion = new Date();
    }
    
    public void depositar(int nuevoSaldo){
        if(nuevoSaldo<=this.saldo){
            System.out.println("No se ha depositado nada en la cuenta, saldo actual: " + saldo);
        }else{
            this.saldo = nuevoSaldo; System.err.println("Se ha depositado un dinero en la cuenta, saldo actual: " 
                    + nuevoSaldo);
                }
    }
}
