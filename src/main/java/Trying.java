public class Trying {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setCompany("Alba");
        e1.setEmailId("kadim@alba.com");
        e1.setEmployeeId(1);
        e1.setName("Kadim");

        Employee e2 = new Employee(2,"fatima","alba","fatima@alba.com");

        System.out.println(e1.toString());
        System.out.println(e2.toString());

        Student s1 = new Student();
        s1.setId(1);
        s1.setName("ali");
        s1.setSchool("al noor");
        s1.setPresent(true);

        System.out.println(s1.toString());
    }
}
