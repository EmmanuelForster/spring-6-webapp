package bootcamp.springframework.spring6webapp.service.impl;

import bootcamp.springframework.spring6webapp.domain.Book;
import bootcamp.springframework.spring6webapp.repository.IBookRepository;
import bootcamp.springframework.spring6webapp.service.IBookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookService {

    private final IBookRepository bookRepository;

    public BookServiceImpl(IBookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
