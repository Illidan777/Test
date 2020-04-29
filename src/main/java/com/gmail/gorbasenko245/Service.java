package com.gmail.gorbasenko245;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    Repozitory repozitory;
    @Transactional
    public void addUser(User user) {
        repozitory.save(user);
    }
}
