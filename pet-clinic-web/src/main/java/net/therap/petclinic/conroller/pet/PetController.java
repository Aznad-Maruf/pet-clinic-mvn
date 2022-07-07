package net.therap.petclinic.conroller.pet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author khandaker.maruf
 * @since 7/7/22
 */
@Controller
public class PetController {

    @RequestMapping({"pet", "pets", "pet/index", "pet/index.html"})
    public String listVets() {
        return "pet/index";
    }
}
