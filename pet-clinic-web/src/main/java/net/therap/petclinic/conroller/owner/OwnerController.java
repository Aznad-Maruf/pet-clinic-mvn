package net.therap.petclinic.conroller.owner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author khandaker.maruf
 * @since 7/7/22
 */
@RequestMapping("owner")
@Controller
public class OwnerController {

    @RequestMapping({"", "/", "/index", "/index.html"})

    public String listVets() {
        return "owner/index";
    }
}
