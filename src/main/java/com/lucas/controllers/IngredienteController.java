package com.lucas.controllers;


import com.lucas.controllers.requests.IngredienteRequest;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ingredientes")
public class IngredienteController {

    @PostMapping
    public String postIngrediente(@RequestBody @Valid IngredienteRequest request) {


        return request.toString();
    }
}
