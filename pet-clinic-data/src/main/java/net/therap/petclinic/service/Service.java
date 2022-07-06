package net.therap.petclinic.service;

import java.util.Set;

/**
 * @author khandaker.maruf
 * @since 7/6/22
 */
public interface Service<T> {

    T findById(Long id);

    Set<T> findAll();

    T save(T obj);
}
