package adopet.api.dto;

import adopet.api.model.Adocao;
import adopet.api.model.Status;

public record AdocaoDTO(Long id, Long tutorId, Long petId, String motivo, Status status,
                        String justificativa) {
    public AdocaoDTO(Adocao adocao) {
        this(adocao.getId(), adocao.getTutor().getId(), adocao.getPet().getId(), adocao.getMotivo(),
                adocao.getStatus(), adocao.getJustificativa());
    }
}
