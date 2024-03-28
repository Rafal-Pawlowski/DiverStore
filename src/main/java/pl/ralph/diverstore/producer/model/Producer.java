package pl.ralph.diverstore.producer.model;

import java.util.UUID;

public class Producer {

    private UUID id;

    private String name;


    public Producer() {
    }

    public Producer(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Producer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
