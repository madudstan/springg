package com.madudstan.school.services;

import com.madudstan.school.models.AlunoModel;
import com.madudstan.school.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AlunoService {

    @Autowired

    private AlunoRepository alunoRepository;

    public AlunoModel criarAluno(AlunoModel alunoModel){
        return alunoRepository.save(alunoModel);
    }

    public List<AlunoModel> buscarTodosAlunos(){
        return alunoRepository.findAll();
    }

    public void deletarAluno(Long id){                    //VOID NAO TEM RETORNO
        alunoRepository.deleteById(id);
    }

}
