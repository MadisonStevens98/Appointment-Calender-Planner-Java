/*Madison Stevens
9/12/17
 */
package project1;

public class Planner {

    Appointment[] array = new Appointment[20];

    public Planner() {
        array[0] = new Appointment("Mar", 7, 17, 30, "Quiz");
        array[1] = new Appointment("Apr", 1, 17, 30, "Midterm");
        array[2] = new Appointment("May", 6, 17, 30, "Quiz");
        array[3] = new Appointment("Jun", 3, 17, 30, "Final");
    }

    public void run() {
        while (true) {
            System.out.println("A)dd Appointment , D)elete Appointment , L)ist Appointment , E)xit");
            char action = UserInput.getChar();
            switch (action) {
                case 'a':
                case 'A':
                    addAppointment();
                    break;
                case 'd':
                case 'D':
                    deleteAppointment();
                    break;
                case 'l':
                case 'L':
                    listAppointment();
                    break;
                case 'e':
                case 'E':
                    break;
                default:
                    System.out.println("Invalid input please use A, D, L, or E");
                    break;
            }
        }
    }

    public boolean compareAppointment(Appointment A1, Appointment A2) {
        String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int a = 0;
        int b = 0;
        for (int i = 0; i < months.length; i++) {
            if (A1.getmonth().equals(months[i])) {
                a = i;
            }
            if (A2.getmonth().equals(months[i])) {
                b = i;
            }
        }
        if (a < b){
            return true;
        } else if(b < a){
            return false;
        } else {
            if (A1.getday() < A2.getday()) {
                return true;
            } else if (A2.getday() < A1.getday()){
                return false;
            }
            else {
            if (A1.gethour()< A2.gethour()){
            return true;
            }
            else if (A1.gethour() < A2.gethour()){
                    return false;
                    }
         else if (A1.getmin() < A2.getmin()){
            return true;
            
        }
        else {
            
    }
        }
    }
        return true;
    }
    
    public void insertAppointment(Appointment A1) {
        for (int i = 0; i < array.length; i++) {
            if (!compareAppointment(array[i], A1)) {
                Appointment[] temp = array;
                array[i] = A1;
                for (int j = i; j < temp.length; j++) {
                    array[j + 1] = temp[i];
                }
            }
        }
    }
    
    public void listAppointment() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + 1 + ")" + array[i]);
        }
    }
    public void deleteAppointment (){
        listAppointment();
        System.out.println("Please look at the number of the appointment you would like to delete, then type it:");
        array [UserInput.getInt(1,100)] = null;
    }
    public void addAppointment() {
     Appointment app = new Appointment();
        app.inputAppointment();
        insertAppointment(app);
    }
}
