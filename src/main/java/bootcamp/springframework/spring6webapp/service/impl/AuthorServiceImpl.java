package bootcamp.springframework.spring6webapp.service.impl;

import bootcamp.springframework.spring6webapp.domain.Author;
import bootcamp.springframework.spring6webapp.repository.IAuthorRepository;
import bootcamp.springframework.spring6webapp.service.IAuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements IAuthorService {

    private final IAuthorRepository authorRepository;

    public AuthorServiceImpl(IAuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
