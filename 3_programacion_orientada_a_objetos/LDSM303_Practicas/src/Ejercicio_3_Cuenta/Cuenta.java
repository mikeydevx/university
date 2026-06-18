package Ejercicio_3_Cuenta;

public class Cuenta {

    private String numeroCuenta;
    private String titular;
    private int saldoCuenta;

    public Cuenta() {

    }

    public Cuenta(String nc, String t, int s) {
        this.numeroCuenta = nc;
        this.titular = t;
        this.saldoCuenta = s;
    }

    public void setnumeroCuenta(String nc) {
        this.numeroCuenta = nc;
    }

    public String getnumeroCuenta() {
        return this.numeroCuenta;
    }

    public void settitular(String t) {
        this.titular = t;
    }

    public String gettitular() {
        return this.titular;
    }

    public void setsaldoCuenta(int s) {
        this.saldoCuenta = s;
    }

    public int getsaldoCuenta() {
        return this.saldoCuenta;
    }

    public void depositoCuenta(int c) {
        this.saldoCuenta = this.saldoCuenta + c;
    }

    public void retiroCuenta(int c) {
        if (c > this.saldoCuenta) {
        } else {
            this.saldoCuenta = this.saldoCuenta - c;
        }

    }

    public String mostrarDatos() {
        return "Numero cuenta " + this.getnumeroCuenta() + "\n"
                + "Titular: " + this.getnumeroCuenta() + "\n"
                + "Saldo: " + this.getsaldoCuenta();
    }

}
