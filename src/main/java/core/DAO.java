package core;

import java.util.Collection;

public interface DAO<T extends Entity, ID> {
    T findById(ID id);
    Collection<T> findAll();
    int insert(T entity);
    int update(T entity);
    int delete(ID id);
}
