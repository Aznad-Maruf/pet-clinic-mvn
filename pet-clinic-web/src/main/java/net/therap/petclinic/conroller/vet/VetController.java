package net.therap.petclinic.conroller.vet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author khandaker.maruf
 * @since 7/7/22
 */
@RequestMapping("/vet")
@Controller
public class VetController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listVets() {
        return "vet/index";
    }
}
