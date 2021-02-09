package ru.croc.springex.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

/**
 * Доменная модель пользователя
 *
 * @author AKosaretskiy
 */
@Data
@Entity
@Table(name = "user_table")
public class User {
    /**
     * Идентификатор
     */
    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    private String lastName;

    @OneToOne
    private Examination examination;
}
