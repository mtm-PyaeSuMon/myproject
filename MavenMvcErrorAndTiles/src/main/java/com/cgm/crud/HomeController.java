package com.cgm.crud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *<h2>HomeControllerClass</h2>
 *<p>
 *Process for DisplayingHomeController
 *</p>
 *
 * @author PyaeSuMon
 *
 */
@Controller
public class HomeController {

    /**
     *<h2>viewHome
     *<p>
     *
     *</p>
     *
     * @return
     *@return String
     */
    @RequestMapping(value= {"/"})
    public String viewHome() {
        return "home";
    }
}
