package br.com.caelum.fj22estudos.controller;

import br.com.caelum.fj22estudos.dao.TwitDao;
import br.com.caelum.fj22estudos.dao.UsuarioDao;
import br.com.caelum.fj22estudos.model.Twit;
import br.com.caelum.fj22estudos.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @Autowired
    private Usuario usuario;

    @Autowired
    private Twit twit;

    @Autowired
    private TwitDao twitDao;

    @GetMapping(value = "/cadastro")
    public ModelAndView cadastro() {
        return  new ModelAndView("usuario/cadastro");
    }



}
