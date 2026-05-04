package com.evembackend.entity;

import com.evembackend.enums.StateEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "event")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Event {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    @Column(nullable = false, unique = false, length = 200)
    private String Title;

    @Column(nullable = false, unique = false, length = 300)
    private String description;

    //TODO: imgSrc ou imgUrl?

    @Column(nullable = false, unique = false)
    private int attendeeLimit;

    @Column(name = "TOTAL_ATTENDEES", nullable = false, unique = false)
    private int registeredAttendes;

    @Column(nullable = false)
    private StateEnum status;

    //TODO: Tickets SOld é necessário, se já temos RegistrationAttendees?
    //CreateAt e UpdatedAt - Auditoria (futuro)

}
