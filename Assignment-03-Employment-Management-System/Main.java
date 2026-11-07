public class Main
{

    public static void main(String[] args)
    {

        Employee e = new Employee();
        e.Name = "Ritu";
        e.EmployeeID = 190306;
        e.Edisplay();
        e.work();

        Manger m = new Manger();
        m.Name = "Anuj";
        m.EmployeeID = 1728;
        m.teamcount = 19;
        m.Mdetails();
        m.work();

        Developer d = new Developer();
        d.Name = "KD";
        d.EmployeeID = 1903;
        d.Language = "Java";
        d.Ddetails();
        d.work();

        SeniorManager sm = new SeniorManager();
        sm.Name = "Tanishkaa";
        sm.EmployeeID = 2;
        sm.Salary = 122123;
        sm.teamcount = 60;
        sm.SMdetails();

        System.out.println("Senior Manager Salary: " + sm.Salary);
        sm.work();

        System.out.println("\n------ Runtime Polymorphism ------");

        Employee ref;

        ref = new Manger();
        ref.work();

        ref = new Developer();
        ref.work();

        ref = new SeniorManager();
        ref.work();
    }
}
