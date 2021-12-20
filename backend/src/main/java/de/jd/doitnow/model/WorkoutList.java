package de.jd.doitnow.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// generates a constructor with 1 parameter for each field in your class.
@AllArgsConstructor
// will generate a constructor with no parameters
@NoArgsConstructor
//Setup Getter, Setter, EqualsAndHashCode and toString
@Data

public class WorkoutList {

    private List<WorkoutPlan> workoutPlans;

}
