package com.agf.god.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created By gOD on 11/1/2020 6:26 PM
 */
@RestController
public class H {

    @GetMapping("/")
    public String h(){
        return "fuck u spring web flux";
    }
}
