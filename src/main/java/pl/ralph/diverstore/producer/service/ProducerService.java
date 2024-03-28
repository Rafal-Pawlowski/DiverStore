package pl.ralph.diverstore.producer.service;

import org.springframework.stereotype.Service;
import pl.ralph.diverstore.producer.model.Producer;

import java.util.List;
import java.util.UUID;

@Service
public class ProducerService {


    public Producer createProducer(Producer producer) {
        return null;
    }

    public List<Producer> getProducers() {
        List<Producer> producers = List.of(new Producer("Producer 1"), new Producer("Producer 2"), new Producer("Producer 3"));
        return producers;
    }

    public Producer getSingleProducer(UUID id) {
        Producer producer = new Producer("Single producer");
        return producer;
    }

    public Producer updateProducer(UUID id, Producer producerRequest) {
    Producer producer = new Producer("Producer before update");
    producer.setName(producerRequest.getName());
    return producer;

    }

    public void deleteProducer(UUID id) {
    }
}
