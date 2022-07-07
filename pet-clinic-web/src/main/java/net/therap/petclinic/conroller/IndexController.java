package net.therap.petclinic.conroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author khandaker.maruf
 * @since 7/7/22
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    String getIndex() {
        return "index";
    }
}
