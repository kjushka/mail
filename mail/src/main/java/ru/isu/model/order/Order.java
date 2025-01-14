package ru.isu.model.order;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import ru.isu.model.basic.Service;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
@ToString
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id;
    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private Service service;
}
