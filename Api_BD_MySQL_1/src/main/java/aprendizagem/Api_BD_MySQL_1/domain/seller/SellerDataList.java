package aprendizagem.Api_BD_MySQL_1.domain.seller;

public record SellerDataList(Long id,String nome, String sobrenome, String telefone) {

    public SellerDataList(Seller seller){
        this(seller.getId(),seller.getNome(),seller.getSobrenome(),seller.getTelefone());
    }
}
