package pl.ralph.diverstore.producer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.ralph.diverstore.producer.domain.model.Producer;
import pl.ralph.diverstore.producer.service.ProducerService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/producers")
public class ProducerApiController {

    private final ProducerService producerService;


    public ProducerApiController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Producer addProducer(@RequestBody Producer producer){
        return producerService.createProducer(producer);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Producer> getProducers(){
        return producerService.getProducers();
    }
    @GetMapping("{producer-id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Producer getProducer(@PathVariable("producer-id") UUID id){
        return producerService.getSingleProducer(id);
    }

    @PutMapping("{producer-id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Producer updateProducer(@PathVariable("producer-id") UUID id, @RequestBody Producer producer){
        return producerService.updateProducer(id, producer);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProducer(@PathVariable UUID id){
        producerService.deleteProducer(id);
    }

}
