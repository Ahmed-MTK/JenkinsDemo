import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Employee {
    private Integer employeeId;
    private String name;
    private String company;
    private String emailId;
}
