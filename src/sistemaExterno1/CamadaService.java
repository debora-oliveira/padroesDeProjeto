package sistemaExterno1;

public class CamadaService {
    private CamadaService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String estado, String cidade){
        System.out.println("Cliente salvo no sistema 1");
        System.out.println(nome +" - "+ cep +" - "+ estado +" - "+ cidade);
    }
}
