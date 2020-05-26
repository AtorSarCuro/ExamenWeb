package com.examenweb.ator.me.service;

import com.examenweb.ator.auth.entity.Usuario;
import com.examenweb.ator.auth.model.UsuarioDto;
import com.examenweb.ator.me.repository.UsuarioRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private static final Log logger = LogFactory.getLog(UsuarioService.class);

    @Autowired
    @Qualifier("usuarioRepository")
    private UsuarioRepository usuarioRepository;

    public UsuarioDto obtenerPorUsuario(String username) {
        UsuarioDto dto = new UsuarioDto();
        try{
            Usuario byUsername = usuarioRepository.findByUsername(username);
            dto.setName(byUsername.getName());
            dto.setEmail(byUsername.getEmail());
            dto.setUsername(byUsername.getUsername());
        }catch(Exception e){
            logger.error(e.getMessage());
            logger.error(e.getLocalizedMessage());
        }
        return dto;
    }
}
