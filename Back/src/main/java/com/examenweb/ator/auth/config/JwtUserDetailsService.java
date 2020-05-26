package com.examenweb.ator.auth.config;

import com.examenweb.ator.auth.dao.UserDao;
import com.examenweb.ator.auth.entity.Usuario;
import com.examenweb.ator.auth.model.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario user = userDao.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new User(user.getUsername(), user.getPassword(),
                new ArrayList<>());
    }

    public Usuario save(UsuarioDto user) {
        Usuario usuario = new Usuario();
        usuario.setName(user.getName());
        usuario.setEmail(user.getEmail());
        usuario.setUsername(user.getUsername());
        usuario.setPassword(bcryptEncoder.encode(user.getPassword()));
        return userDao.save(usuario);
    }
}
