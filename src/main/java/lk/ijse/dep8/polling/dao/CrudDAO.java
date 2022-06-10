package lk.ijse.dep8.polling.dao;

import lk.ijse.dep8.polling.entity.SuperEntity;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface CrudDAO<T extends SuperEntity, ID extends Serializable> extends SuperDAO{

T save(T entity);

void deleteById(ID pk);

Optional<T> findById(Id pk);

List<T> findAll();

long count();

boolean existsById(Id pk);


}
