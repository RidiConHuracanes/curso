package com.cursojava.curso.controllers;


import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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

    @RequestMapping(value = "usuarios")
    public List <Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(23l);
        usuario.setNombre("Rene");
        usuario.setApellido("Osorio");
        usuario.setEmail("a@gmail.com");
        usuario.setTelefono("44867451");

        Usuario usuario2 = new Usuario();
        usuario2.setId(45l);
        usuario2.setNombre("Alejandro");
        usuario2.setApellido("Osorio");
        usuario2.setEmail("b@gmail.com");
        usuario2.setTelefono("23456789");

        Usuario usuario3 = new Usuario();
        usuario3.setId(56l);
        usuario3.setNombre("Rene");
        usuario3.setApellido("Natareno");
        usuario3.setEmail("c@gmail.com");
        usuario3.setTelefono("12345678");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
    }

    @RequestMapping(value = "usuarioa")
    public Usuario editar(){
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
