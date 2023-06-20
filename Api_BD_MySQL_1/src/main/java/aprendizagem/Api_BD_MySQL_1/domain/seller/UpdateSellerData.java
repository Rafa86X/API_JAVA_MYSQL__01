package aprendizagem.Api_BD_MySQL_1.domain.seller;


import jakarta.validation.constraints.NotNull;

public record UpdateSellerData(
        @NotNull
        Long id, String nome, String sobrenome,String datanasc,
                               String telefone, String cep, String cidade, String rua, String numero,
                               String complemento) {

}
