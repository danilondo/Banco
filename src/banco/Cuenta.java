
package banco;

import java.util.Date;

public class Cuenta extends Banco{
    
    private boolean consultaBancaria;
    private float interesMensual;
    private Date fechaDeTransaccion;

    public Cuenta(boolean consultaBancaria, float interesMensual, Date fechaDeTransaccion, Date fechaDeCreacion, boolean creacionCuenta, String nombreDelTitular, double saldo, int numeroCuenta) {
        super(fechaDeCreacion, creacionCuenta, nombreDelTitular, saldo, numeroCuenta);
        this.consultaBancaria = consultaBancaria;
        this.interesMensual = interesMensual;
        this.fechaDeTransaccion = fechaDeTransaccion;
    }

    public void solicitud(){
        consultaBancaria = true;
    }
    
    public void estadoMensual(float porcentaje){
        this.consultaBancaria = true;
        this.interesMensual = porcentaje;
        
    }
    
    public boolean isConsultaBancaria() {
        return consultaBancaria;
    }

    public void setConsultaBancaria(boolean consultaBancaria) {
        this.consultaBancaria = consultaBancaria;
    }

    public float getInteresMensual() {
        return interesMensual;
    }

    public void setInteresMensual(float interesMensual) {
        this.interesMensual = interesMensual;
    }

    public Date getFechaDeTransaccion() {
        return fechaDeTransaccion;
    }

    public void setFechaDeTransaccion(Date fechaDeTransaccion) {
        this.fechaDeTransaccion = fechaDeTransaccion;
    }
    
    
    
    
}
