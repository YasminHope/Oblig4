package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class paameldingController {
    @GetMapping("/paamelding")
    public String paamelding(){
        return "paamelding";
    }

    @GetMapping("/deltagerliste")
    public String deltagerliste() {
        return "deltagerliste";
    }

    @GetMapping("/paameldt")
    public String paameldt() {
        return "paameldtView";
    }

}
