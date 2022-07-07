package net.therap.petclinic.service;

import org.springframework.data.repository.CrudRepository;

import java.util.Set;

/**
 * @author khandaker.maruf
 * @since 7/6/22
 */
public interface Service<T, ID> {

    T findById(ID id);

    Set<T> findAll();

    T save(T entity);

    void deleteById(ID id);

    void delete(T entity);
}
