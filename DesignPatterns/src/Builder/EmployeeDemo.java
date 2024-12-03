package Builder;

public class EmployeeDemo {

    public static void main(String[] args) {
        Employee employee = new Employee.EmployeeBuilder("Deepali","DB")
                .setAge(25)
                .setGender("F")
                .build();
    }

}
