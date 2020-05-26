package com.examenweb.ator.me.controller;

import com.examenweb.ator.auth.model.UsuarioDto;
import com.examenweb.ator.me.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST}, allowedHeaders = "*")
@RequestMapping("/v1")
public class Me {

    @Autowired
    @Qualifier("usuarioService")
    UsuarioService usuarioService;

    @GetMapping("/me/{username}")
    public UsuarioDto getUser(@PathVariable("username") String username) {
        return usuarioService.obtenerPorUsuario(username);
    }
}
