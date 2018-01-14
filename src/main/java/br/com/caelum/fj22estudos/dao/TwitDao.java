package br.com.caelum.fj22estudos.dao;

import br.com.caelum.fj22estudos.model.Twit;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class TwitDao {

    @PersistenceContext
    private EntityManager manager;

    public Twit findOne(Integer id) {
        return manager.find(Twit.class, id);
    }

    public void save(Twit twit) {
        manager.persist(twit);
    }

    public List<Twit> findAll() {
        return manager.createQuery("select t from Twit t", Twit.class).getResultList();
    }

    public void delete(Integer id) {
        manager.remove(findOne(id));
    }
}
