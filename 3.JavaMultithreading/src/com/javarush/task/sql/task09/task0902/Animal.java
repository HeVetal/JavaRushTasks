package com.javarush.task.sql.task09.task0902;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="animal_table", schema="test")
@Getter
@Setter
//напишите тут ваш код
public class Animal {
    //напишите тут ваш код
    @Id
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private Integer age;

    @Column(name="family")
    private String family;
}

//Подключи зависимости в проект.