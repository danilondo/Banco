
package banco;

import java.util.Date;


public class Cliente extends Banco{
    
    private int monto;
    private boolean fondos;
    private String cc;

    public Cliente(int monto, boolean fondos, String cc, Date fechaDeCreacion, boolean creacionCuenta, String nombreDelTitular, double saldo, int numeroCuenta) {
        super(fechaDeCreacion, creacionCuenta, nombreDelTitular, saldo, numeroCuenta);
        this.monto = monto;
        this.fondos = fondos;
        this.cc = cc;
    }
    
    public void solicitarPrestamo(){
        fondos = true;
    }
    
    public void solicitarPrestamo(int cantidad){
        this.fondos = true;
        this.monto += cantidad;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public boolean isFondos() {
        return fondos;
    }

    public void setFondos(boolean fondos) {
        this.fondos = fondos;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }
    
    
    
}
