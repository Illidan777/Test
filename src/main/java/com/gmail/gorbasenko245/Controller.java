package com.gmail.gorbasenko245;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {
    Service service;
    public Controller(Service service) {
        this.service = service;
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public String contactAdd(
                             @RequestParam String name,
                             @RequestParam String surname,
                             @RequestParam String phone
                             )
    {


        User user = new User( name, surname, phone);
        service.addUser(user);

        return "index.jsp";
    }
}
