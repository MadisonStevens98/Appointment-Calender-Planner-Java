/*Madison Stevens
9/12/17
 */
package project1;

public class Main {

    public static void main(String args[]) {
        Appointment app = new Appointment();
        app.inputAppointment();
        Planner newplanner = new Planner();
        newplanner.run();
        System.out.println(app);
    }
}
