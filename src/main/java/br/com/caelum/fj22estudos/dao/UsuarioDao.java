package br.com.caelum.fj22estudos.dao;

import br.com.caelum.fj22estudos.model.Usuario;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UsuarioDao {

    @PersistenceContext
    private EntityManager manager;

    public Usuario findOne(Integer id) {
        return manager.find(Usuario.class, id);
    }

    public void save(Usuario filme) {
        manager.persist(filme);
    }

    public List<Usuario> findAll() {
        return manager.createQuery("select u from Usuario u", Usuario.class).getResultList();
    }

    public void delete(Integer id) {
        manager.remove(findOne(id));
    }
}
