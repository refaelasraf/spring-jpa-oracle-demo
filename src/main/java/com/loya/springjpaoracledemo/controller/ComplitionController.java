package com.loya.springjpaoracledemo.controller;


import com.loya.springjpaoracledemo.entity.Complition;
import com.loya.springjpaoracledemo.service.ComplitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/complition")
public class ComplitionController {
    @Autowired
    ComplitionService complitionService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Complition> getAllComplitions() {
        return this.complitionService.getAllComplitions();
    }


    @RequestMapping(value = "/add", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Complition addComplition(@RequestBody Complition complition) {
        return this.complitionService.addComplition(complition);
    }


    @RequestMapping(value = "/update", method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Complition updateComplition(@RequestBody Complition complition) {
        return this.complitionService.updateComplition(complition);
    }

    @RequestMapping(value = "/{originalName}", method = RequestMethod.GET)
    public List<Complition> getComplitionByOriginalName(@PathVariable String originalName) {
        return this.complitionService.findComplitionByOriginalName(originalName);
    }

    @RequestMapping(value = "/all", method = RequestMethod.DELETE)
    public void deleteAllComplitions() {
        this.complitionService.deleteAllComplitions();
    }

    @RequestMapping(value = "/{originalName}", method = RequestMethod.DELETE)
    public void deleteComplition(@PathVariable String originalName) {
        this.complitionService.deleteComplitionByOriginalName(originalName);
    }

}