package de.jd.doitnow.model;

import lombok.*;

// generates a constructor with 1 parameter for each field in your class.
@AllArgsConstructor
// will generate a constructor with no parameters
@NoArgsConstructor
//Setup Getter, Setter, EqualsAndHashCode and toString
@Data

public class User {

    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;
    private FitnessLevel level;
    private String password;
    private String email;
    private double bodyweight;
    private double bodyheight;

}
