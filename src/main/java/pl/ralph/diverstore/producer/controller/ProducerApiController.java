package pl.ralph.diverstore.producer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.ralph.diverstore.producer.model.Producer;
import pl.ralph.diverstore.producer.service.ProducerService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("producers")
public class ProducerApiController {

    private final ProducerService producerService;


    public ProducerApiController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Producer addProducer(Producer producer){
        return producerService.createProducer(producer);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public List<Producer> getProducers(){
        return producerService.getProducers();
    }
    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public Producer getProducer(@PathVariable UUID id){
        return producerService.getSingleProducer(id);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Producer updateProducer(@PathVariable UUID id, Producer producer){
        return producerService.updateProducer(id, producer);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProducer(@PathVariable UUID id){
        producerService.deleteProducer(id);
    }

}
