package net.shakya.himal.joke_app.controllers;

import net.shakya.himal.joke_app.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService service;

    @Autowired
    public JokeController(JokeService service) {
        this.service = service;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", this.service.getJoke());

        return "chucknorris";
    }
}
