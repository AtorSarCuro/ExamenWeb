package com.examenweb.ator.auth.dao;

import com.examenweb.ator.auth.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<Usuario, Integer> {

    Usuario findByUsername(String username);

}
