package br.edu.ifsp.dsw3.empresa.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifsp.dsw3.empresa.model.domain.Departamento;

public interface DepartamentoDao extends JpaRepository<Departamento, Long>{
    
}
