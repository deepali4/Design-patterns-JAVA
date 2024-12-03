package Builder;

public class Employee {
    private String name; // required
    private String company; // required
    private String gender; // optional
    private int age;

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    Employee (EmployeeBuilder employeeBuilder){
        this.name = employeeBuilder.name;
        this.company = employeeBuilder.company;
        this.gender = employeeBuilder.gender;
        this.age = employeeBuilder.age;
    }


    public static class EmployeeBuilder{
        private String name; // required
        private String company; // required
        private String gender; // optional
        private int age;

        EmployeeBuilder(String name , String company){
            this.name = name;
            this.company = company;
        }

        // -- Setters for optional
        // ** Return the object of the builder class
        public EmployeeBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public EmployeeBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }


        public Employee build(){
          return new Employee(this);
        }

    }
}
