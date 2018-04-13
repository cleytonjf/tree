/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tree.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cleytonjf
 */
@RestController
public class HeloRest {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResponseEntity listar() {
        return new ResponseEntity(("Hello"), HttpStatus.OK);
    }
}
