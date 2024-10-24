package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class paameldingController {
    @GetMapping("/paamelding")
    public String paamelding(){
        return "paameldingView";
    }

    @GetMapping("/deltagerliste")
    public String deltagerliste() {
        return "deltagerlisteView";
    }

    @GetMapping("/paameldt")
    public String paameldt() {
        return "paameldtView";
    }

}
