package proyectoexcepcionesbanco;


public class ProyectoExcepcionesBanco {

    public static void main(String[] args) {
        Cuenta c;
        String [] valores={"100","-500","1000"};
        try{
            c=new Cuenta("Antonio",25,1000);
            System.out.println(c);
            procesarMovimiento(c,valores);
            System.out.println(c);
        }
        catch(NumberFormatException e3){
            System.out.println(e3.getMessage());
        }
        catch(SaldoInsuficienteExcception e1){
            System.out.println(e1.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void procesarMovimiento(Cuenta c, String[] valores) throws SaldoInsuficienteExcception {
        for (int i = 0; i < valores.length; i++) {
            c.movimiento(Double.parseDouble(valores[i]));
            
        } 
    }
    
}
