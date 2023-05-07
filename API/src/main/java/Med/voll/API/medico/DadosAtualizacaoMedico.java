package Med.voll.API.medico;


import jakarta.validation.constraints.NotNull;
import Med.voll.API.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
