package dio.gof.facade;

import sistemaExterno1.CamadaService;
import sistemaExterno2.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep){
    String cidade = CepApi.getInstancia().recuperarCidade(cep);
    String estado = CepApi.getInstancia().recuperarEstado(cep);

        CamadaService.gravarCliente(nome, cep, estado,cidade);
    }
}
