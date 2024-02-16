package bootcamp.springframework.spring6webapp.controller;

import bootcamp.springframework.spring6webapp.service.IBookService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final IBookService bookService;

    public BookController(IBookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping ("/books")
    public String findAll(Model model){
        model.addAttribute("books", bookService.findAll());
        return "books";
    }

}
