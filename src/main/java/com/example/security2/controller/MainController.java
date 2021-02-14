/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.security2.controller;
import com.example.security2.model.Developer;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MainController {
    
    private List<Developer> DEVELOPERS= Stream.of(
            new Developer(1L,"Artem","Artemov"),
            new Developer(2L,"Egor","Paul"),
            new Developer(3L,"Ivan","Derevo")
    ).collect(Collectors.toList());
    
    @GetMapping("/")
    @PreAuthorize("hasAuthority('developers:read')")
    public String showDevelopers(Model model){
        model.addAttribute("DEVELOPERS",DEVELOPERS);
        return "developer-list";
    }
    @GetMapping("/add")
    @PreAuthorize("hasAuthority('developers:write')")
    public String addDeveloperForm(Developer developer){
        return "developer-add";
    }
    @PostMapping("/add")
    @PreAuthorize("hasAuthority('developers:write')")
    public String addDeveloper(Developer developer){
        DEVELOPERS.add(developer);
        return "redirect:/";
    }
    
}
