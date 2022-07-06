package net.therap.petclinic.model;

import java.io.Serializable;

/**
 * @author khandaker.maruf
 * @since 7/6/22
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
