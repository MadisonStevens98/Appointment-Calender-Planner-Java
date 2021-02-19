/*Madison Stevens
9/12/17
 */
package project1;

public class Appointment {

    String month;
    int day;
    int hour;
    int min;
    String message;

    public Appointment() {
        month = "Jan";
        day = 1;
        hour = 12;
        min = 00;
        message = "No notes written for this appointment.";
    }

    public Appointment(String month1, int day1, int hour1, int min1, String message1) {
        setmonth(month1);
        setday(day1);
        sethour(hour1);
        setmin(min1);
        setmessage(message1);
    }

    public void setmonth(String month1) {
        int length = month1.length();
        if (length == 3) {
            month = month1;

        } else {
            System.out.println("You have entered an invalid month. Please enter the month of your appointment, using the first 3 letters (EX. June = Jun): ");
        }
    }

    public void setmessage(String message1) {
        int length = message1.length();
        if (length <= 40) {
            message = message1;
        } else {
            System.out.println("You have entered to many characters, please keep your notes under 40 characters.");
        }
    }

    public void setday(int day1) {
        if (day1 >= 1 && day1 <= 31) {
            day = day1;
        } else {
            System.out.println("You have entered an invalid day. Please choose a number between 1 and 31");
        }
    }

    public void sethour(int hour1) {
        if (hour1 >= 0 && hour1 <= 23) {
            hour = hour1;
        } else {
            System.out.println("You have entered an invalid hour, note to use military time. Please enter a value between 0 and 23");
        }
    }

    public void setmin(int min1) {
        if (min1 >= 0 && min1 <= 59) {
            min = min1;
        } else {
            System.out.println("You have entered an invalid minute value, please enter a value between 0 and 59");
        }
    }

    public String getmonth() {
        return month;
    }

    public String getmessage() {
        return message;
    }

    public int getday() {
        return day;
    }

    public int gethour() {
        return hour;
    }

    public int getmin() {
        return min;
    }

    public void inputAppointment() {
        System.out.print("Please enter the month of your appointment, using the first 3 letters (EX. June = Jun): ");
        setmonth(UserInput.getString(0, 3));

        System.out.print("Please enter the day of your appointment: ");
        setday(UserInput.getInt(1, 31));

        System.out.print("Enter the hour of you appointment, please use military time (0-24): ");
        sethour(UserInput.getInt(1, 23));

        System.out.print("Please enter the minute of your appointment (0-59): ");
        setmin(UserInput.getInt(1, 59));

        System.out.print("Please enter any notes you would like for your appointment (note to keep it under 40 characters): ");
        setmessage(UserInput.getString(1, 40));
    }

    public String toString() {
        String mins = null;
        if (min < 10) {
            mins = ":0" + min;
        }
        else {
            mins = ":" + min;
        }
        return "Your appointment is set for " + month + " " + day + " at " + hour + mins + ""
                + " and here are your notes for this appointment: " + message;

    }
}