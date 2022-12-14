package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HealthIssue {
    private int id;
    private String name;
    ArrayList<Doctor> doctors = new ArrayList<>();
}
