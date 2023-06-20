package aprendizagem.Api_BD_MySQL_1.domain.seller;

import jakarta.validation.constraints.NotNull;

public record UpdateDada(String cpf, String nome, String sobrenome, String datanasc, String telefone,
                         String cep, String cidade, String rua, String numero, String complement) {


    public UpdateDada(Seller seller){
        this(seller.getCpf(), seller.getNome(), seller.getSobrenome(), seller.getDatanasc(),seller.getTelefone(),
                seller.getCep(),seller.getCidade(),seller.getRua(),seller.getNumero(),seller.getComplemento());
    }


}
