package com.evembackend.entity;

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
@Table(name = "user")
@Data //Biblioteca Lombok - getNome() / getEmail() setNome() / setEmail() toString() equals() hashCode()
@AllArgsConstructor
@NoArgsConstructor
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    //@Column é uma anotação do JPA usada para mapear um atributo da sua classe para uma coluna no banco de dados.
    @Column(nullable = false, unique = true, length = 200)
    private String nome;

    @Column(nullable = false, unique = true, length = 200)
    private String email;

    @Column(nullable = false, unique = true, length = 200)
    private String password;

    //Entidades dependem da Role
    private String phone;

    


}
