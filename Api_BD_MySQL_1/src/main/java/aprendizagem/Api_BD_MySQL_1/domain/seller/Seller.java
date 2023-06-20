package aprendizagem.Api_BD_MySQL_1.domain.seller;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "vendedor")
@Entity(name = "Seller")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Seller {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;
    private String nome;


    private String sobrenome;
    private String datanasc;
    private String telefone;
    private String cep;
    private String cidade;
    private String rua;
    private String numero;
    private String complemento;
    private boolean active;

    public Seller(SellerRegistrationData dados) {
        this.active = true;
        this.cpf = dados.cpf();
        this.nome = dados.nome();
        this.sobrenome = dados.sobrenome();
        this.datanasc = dados.datanasc();
        this.telefone = dados.telefone();
        this.cep = dados.cep();
        this.cidade=dados.cidade();
        this.rua = dados.rua();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
    }

    public void updater(UpdateSellerData dados){
        if(dados.nome() != null){
            this.nome =dados.nome();
        }
        if(dados.sobrenome() != null){
            this.sobrenome =dados.sobrenome();
        }
        if(dados.datanasc() != null){
            this.datanasc =dados.datanasc();
        }
        if(dados.telefone() != null){
            this.telefone =dados.telefone();
        }
        if(dados.cep() != null){
            this.cep =dados.cep();
        }
        if(dados.cidade() != null){
            this.cidade =dados.cidade();
        }
        if(dados.rua() != null){
            this.rua =dados.rua();
        }
        if(dados.numero() != null){
            this.numero =dados.numero();
        }
        if(dados.complemento() != null){
            this.complemento =dados.complemento();
        }

    }

    public void excluir() {
        this.active = false;
    }

}
