/*
*
* Aula com Nataniel Paiva
*
* Esse projeto poderá ser distribuído da forma que você achar melhor
* O importante é que você aprenda de verdade!
*
 */
package io.spring.aula.natan.service;

import io.spring.aula.natan.entity.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nataniel Paiva <nataniel.paiva@gmail.com>
 */
@Service
public class UsuarioService {

    public List<Usuario> listaUsuario() {

        List<Usuario> usuarioLista = new ArrayList<>();

        Usuario usuario = new Usuario();

        usuario.setEmail("nataniel.paiva@gmail.com");
        usuario.setIdade(26);
        usuario.setNome("Nataniel");

        usuarioLista.add(usuario);

        usuario = new Usuario();

        usuario.setEmail("fulano@gmail.com");
        usuario.setIdade(35);
        usuario.setNome("Fulano de tal");

        usuarioLista.add(usuario);

        return usuarioLista;

    }

    public List<Usuario> listaUsuario(Usuario usuarioAdd) {

        List<Usuario> usuarioLista = new ArrayList<>();

        Usuario usuario = new Usuario();

        usuario.setEmail("nataniel.paiva@gmail.com");
        usuario.setIdade(26);
        usuario.setNome("Nataniel");

        usuarioLista.add(usuario);

        usuario = new Usuario();

        usuario.setEmail("fulano@gmail.com");
        usuario.setIdade(35);
        usuario.setNome("Fulano de tal");

        usuarioLista.add(usuario);
        usuarioLista.add(usuarioAdd);

        return usuarioLista;

    }

}
