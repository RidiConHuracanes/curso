package com.cursojava.curso.controllers;


import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Rene");
        usuario.setApellido("Osorio");
        usuario.setEmail("a@gmail.com");
        usuario.setTelefono("44867451");
        return usuario;
    }

    @RequestMapping(value = "usuarioa")
    public Usuario editarUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Rene");
        usuario.setApellido("Osorio");
        usuario.setEmail("a@gmail.com");
        usuario.setTelefono("44867451");
        return usuario;
    }

    @RequestMapping(value = "usuariob")
    public Usuario eliminarUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Rene");
        usuario.setApellido("Osorio");
        usuario.setEmail("a@gmail.com");
        usuario.setTelefono("44867451");
        return usuario;
    }

}
