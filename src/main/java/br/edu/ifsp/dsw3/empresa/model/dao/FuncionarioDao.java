package br.edu.ifsp.dsw3.empresa.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifsp.dsw3.empresa.model.domain.Funcionario;

public interface FuncionarioDao extends JpaRepository<Funcionario, Long>{
    
}
