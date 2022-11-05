package org.sfg.chucknorris.sfgchucknorris.controller;

import org.sfg.chucknorris.sfgchucknorris.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping
    public String displayJoke(Model model) {
        String jokeQuote = jokeService.getJoke();
        model.addAttribute("joke", jokeQuote);
        return "index";
    }
}
