package net.therap.petclinic.model;

/**
 * @author khandaker.maruf
 * @since 7/6/22
 */
public class PetType extends BaseEntity{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
