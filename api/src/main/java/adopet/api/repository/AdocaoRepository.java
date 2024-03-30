package adopet.api.repository;

import adopet.api.model.Adocao;
import adopet.api.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdocaoRepository extends JpaRepository<Adocao, Long> {
    Boolean existsByPetIdAndStatus(Long idPet, Status status);

    Integer countByTutorIdAndStatus(Long idTutor, Status status);
}
