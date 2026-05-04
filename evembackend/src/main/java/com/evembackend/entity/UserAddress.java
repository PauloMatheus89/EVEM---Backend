package com.evembackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.evembackend.enums.StateEnum;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAddress {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long Id;

    @Column(nullable = false, unique = false, length = 200)
    private String city;

    //TODO: State deve ser adcionado ao front
    //@Enumerated(EnumType.STRING) é uma anotação do JPA usada para definir como um enum será salvo no banco de dados.
    @Enumerated(EnumType.STRING)
    private StateEnum state;

    @Column(nullable = false, unique = false, length = 200)
    private String neighborhood;

    @Column(nullable = false, unique = false, length = 200)
    private String street;
}
