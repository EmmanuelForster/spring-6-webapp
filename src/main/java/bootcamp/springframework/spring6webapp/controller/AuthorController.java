package bootcamp.springframework.spring6webapp.controller;

import bootcamp.springframework.spring6webapp.domain.Author;
import bootcamp.springframework.spring6webapp.service.IAuthorService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    private final IAuthorService authorService;

    public AuthorController(IAuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping(path = "/authors")
    public String findAllAuthors(Model model){
        model.addAttribute("authors", authorService.findAll());
        return "authors";
    }
}
