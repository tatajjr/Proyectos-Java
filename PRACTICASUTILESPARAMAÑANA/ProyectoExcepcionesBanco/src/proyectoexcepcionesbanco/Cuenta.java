package proyectoexcepcionesbanco;


public class Cuenta {
    String nombre;
    int numero;
    double saldo;
    
    public Cuenta(String nombre, int numero, double saldo)throws SaldoInsuficienteExcception{
        if (saldo<0) {
            throw new SaldoInsuficienteExcception("Saldo inicial negativo");
        }
        this.nombre=nombre;
        this.saldo=saldo;
        this.numero=numero;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nombre=" + nombre + ", numero=" + numero + ", saldo=" + saldo + '}';
    }
    public void movimiento(double valor)throws SaldoInsuficienteExcception{
        if (saldo+valor<0) {
            throw new SaldoInsuficienteExcception("Saldo Insuficiente");
            
        }
        saldo+=valor;
    }
    
}

