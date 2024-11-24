package com.faesa.cucumber.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

/**
 * A anotação @Data contempla todas as anotações abaixo:
 * @Setter
 * @Getter
 * @AllArgsConstructor
 * @NoArgsConstructor
 * @EqualsAndHashCode
 */
@Data
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private int idade;
}