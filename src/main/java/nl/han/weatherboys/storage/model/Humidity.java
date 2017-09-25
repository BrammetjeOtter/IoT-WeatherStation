package nl.han.weatherboys.storage.model;

import javax.persistence.*;

@Entity
public class Humidity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    @ManyToOne(optional = false)
    private Child child;

    public long moment;

    public float humidity;

    public Humidity(Child child, long moment, float humidity) {
        this.child = child;
        this.moment = moment;
        this.humidity = humidity;
    }

    public Humidity() {
    }

}