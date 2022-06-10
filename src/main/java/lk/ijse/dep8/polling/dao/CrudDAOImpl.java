package lk.ijse.dep8.polling.dao;

import lk.ijse.dep8.polling.entity.SuperEntity;

import javax.persistence.EntityManager;
import javax.persistence.Id;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Optional;

public abstract class CrudDAOImpl<T extends SuperEntity, ID extends Serializable> implements CrudDAO<T, ID> {
    protected EntityManager em;
    private Class<T> entityClzObj;


    public CrudDAOImpl(){
        entityClzObj= (Class<T>) (( ( ParameterizedType)(this.getClass().getGenericSuperclass())).getActualTypeArguments()[0]);
    }
    @Override
    public T save(T entity) {
        em.persist(entity);
        return entity;
    }

    @Override
    public void deleteById(ID pk) {
        em.remove(em.getReference(entityClzObj,pk));

    }

    @Override
    public Optional<T> findById(Id pk) {
    T entity=em.find(entityClzObj,pk);
    return entity == null? Optional.empty(): Optional.of(entity);

    }

    @Override
    public List<T> findAll() {

        em.createQuery("select e from "+ entityClzObj.getName()+" e",entityClzObj).getResultList();
        return null;
    }

    @Override
    public long count() {
       return em.createQuery("select e from "+ entityClzObj.getName()+" e",long.class).getSingleResult();
    }

    @Override
    public boolean existsById(Id pk) {
        return findById(pk).isPresent();
    }
}
