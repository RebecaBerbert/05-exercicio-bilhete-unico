import java.util.Random;

public class BilheteUnico {

    double saldo; //já é 0, não precisa fazer nada
    long numero;
    Usuario usuario;
    static final double TARIFA = 5.20; //não pode ser alterada (constante), costume ser tudo em caps lock

    //construtor- não tem tipo
    public BilheteUnico(String nome, long cpf, String perfil){
        Random random = new Random();
        numero = random.nextLong(1000, 10000);
        usuario= new Usuario(cpf, nome, perfil);
    }

    //método para carregar o bilhete
    public double carregar( double valor){
        saldo+=valor;

        return saldo;
    }

    //método para consultar o saldo do bilhete
    public double consultarSaldo(){
        return saldo;
    }


    //método para passar na catraca
     public String passarCatraca(){
        double debito=TARIFA;
        if (usuario.perfil.equalsIgnoreCase("comum")){
            debito=TARIFA;
        }
        if(saldo>=debito){
            saldo-=debito;
            return "catraca liberada";
        }
        return "saldo insuficiente";
     }

}
