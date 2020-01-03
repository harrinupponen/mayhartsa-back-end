package com.example.demo.web;

import com.example.demo.domain.Hartsa;
import com.example.demo.domain.HartsaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@CrossOrigin
@Controller
public class HartsaController {

    @Autowired
    HartsaRepository hRepo;

    //REST-method to fetch all contents
    @GetMapping(value = "/content")
    public @ResponseBody
    List<Hartsa> hartsaListRest() {
        return (List<Hartsa>) hRepo.findAll();
    }

}
