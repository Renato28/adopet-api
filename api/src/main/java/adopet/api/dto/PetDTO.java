package adopet.api.dto;

import adopet.api.model.Pet;
import adopet.api.model.Tipo;

public record PetDTO(Long id, String nome, Integer idade, Tipo tipo, Boolean adotado, String imagem) {

    public PetDTO(Pet pet) {
        this(pet.getId(), pet.getNome(), pet.getIdade(), pet.getTipo(), pet.getAdotado(), pet.getImagem());
    }
}
