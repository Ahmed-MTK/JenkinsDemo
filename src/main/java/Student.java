import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

@Data @ToString
public class Student {
    private int id;
    private String name;
    private String school;
    private boolean present;
    private int  parentMobile;
}
