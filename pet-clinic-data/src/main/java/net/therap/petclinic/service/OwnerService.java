package net.therap.petclinic.service;

import net.therap.petclinic.model.Owner;

/**
 * @author khandaker.maruf
 * @since 7/6/22
 */
public interface OwnerService extends Service<Owner, Long> {

    Owner findByLastName(String lastName);
}
