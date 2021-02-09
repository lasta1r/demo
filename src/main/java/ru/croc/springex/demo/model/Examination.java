package ru.croc.springex.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table
public class Examination {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;


}
