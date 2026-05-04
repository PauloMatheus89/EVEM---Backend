package com.evembackend.entity;


import com.evembackend.enums.StateEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class EventAddress {
       
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long Id;
    
    @Column(nullable = false, unique = false, length = 200)
    private String name;

    @Column(nullable = false, unique = false, length = 200)
    private String street;

    @Column(nullable = false, unique = false, length = 200)
    private String neighborhood;

    @Column(nullable = false, unique = false, length = 200)
    private String city;

    @Enumerated(EnumType.STRING)
    private StateEnum state;

    @Column(nullable = false, unique = true, length = 20)
    private String zipCode;
       
}
