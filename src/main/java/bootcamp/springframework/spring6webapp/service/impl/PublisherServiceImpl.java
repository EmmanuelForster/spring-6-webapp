package bootcamp.springframework.spring6webapp.service.impl;

import bootcamp.springframework.spring6webapp.domain.Publisher;
import bootcamp.springframework.spring6webapp.repository.IPublisherRepository;
import bootcamp.springframework.spring6webapp.service.IPublisherService;
import org.springframework.stereotype.Service;

@Service
public class PublisherServiceImpl implements IPublisherService {

    private final IPublisherRepository publisherRepository;

    public PublisherServiceImpl(IPublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public Iterable<Publisher> findAll() {
        return publisherRepository.findAll();
    }
}
