/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tree.repository;

import com.example.tree.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cleytonjf
 */
@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{
    
}
