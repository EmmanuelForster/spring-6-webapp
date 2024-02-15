package bootcamp.springframework.spring6webapp.service;

import bootcamp.springframework.spring6webapp.domain.Publisher;


public interface IPublisherService {

    Iterable<Publisher> findAll();
}
