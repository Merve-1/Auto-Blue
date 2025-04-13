package auto.blue.auto_blue.model;

import auto.blue.auto_blue.service.VehicleService;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NonNull
    private String make;

    @Column
    @NonNull
    private String model;

    @Column
    @NonNull
    private int year;

    public Vehicle(){}

    public Long getId() {return id;}

    public String getMake(){return make;}
    public void setMake (String make){this.make=make;}

    public String getModel(){return model;}
    public void setModel(String model){this.model=model;}

    public int getYear(){return year;}
    public void setYear(int year){this.year=year;}

}
