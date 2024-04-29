package backend.spring.elk;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeCreationRequest {

    private String empName;

    private String empNumber;

    @Override
    public String toString() {
        return "org.baeldung.EmployeeCreationRequest{" + "employeename='" + empName + '\'' + '}';
    }

}