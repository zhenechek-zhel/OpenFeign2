package com.example.servicea.models;

import com.mongodb.lang.Nullable;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Builder
@AllArgsConstructor
@ToString
@Document
public class Person {


    @Id
    private String id;

    private String firstName;

    private String lastName;

    private int age;

}
