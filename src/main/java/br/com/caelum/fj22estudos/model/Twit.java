package br.com.caelum.fj22estudos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Entity
public class Twit {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Max(value = 280)
    private String mensagem;

    @OneToMany
    private Usuario usuario;

    /**
     * @deprecated hibernate only
     */
    public Twit() {}

    public Twit(String mensagem, Usuario usuario) {
        this.mensagem = mensagem;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }


    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
