package com.evembackend.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import com.evembackend.enums.StatusRegistrationEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    @Column(nullable = false)
    private LocalDate registrationDate;

    @Column(nullable = false)
    private LocalTime registrationLocalTime;

    @Column(nullable = false)
    private StatusRegistrationEnum status;
}
