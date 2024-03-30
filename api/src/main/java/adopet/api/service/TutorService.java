package adopet.api.service;

import adopet.api.dto.CadastroTutorDTO;
import adopet.api.dto.TutorDTO;
import adopet.api.model.Tutor;
import adopet.api.repository.TutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorService {

    private TutorRepository tutorRepository;

    public List<TutorDTO> listarTodos() {
        return tutorRepository.findAll().stream().map(TutorDTO::new).toList();
    }

    public void cadastrar(CadastroTutorDTO dados) {
        tutorRepository.save(new Tutor(dados));
    }
}
