package pl.ralph.diverstore.producer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.ralph.diverstore.producer.service.ProducerService;

@Controller
@RequestMapping("admin/producers")
public class ProducerAdminViewController {


    public final ProducerService producerService;

    public ProducerAdminViewController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping
    public String indexView(Model model){
        model.addAttribute("producers", producerService.getProducers());
    return "admin/producer/index";
    }

}
