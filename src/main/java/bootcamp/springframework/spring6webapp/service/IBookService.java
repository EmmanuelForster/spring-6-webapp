package bootcamp.springframework.spring6webapp.service;

import bootcamp.springframework.spring6webapp.domain.Book;

public interface IBookService {

    Iterable<Book> findAll();
}
