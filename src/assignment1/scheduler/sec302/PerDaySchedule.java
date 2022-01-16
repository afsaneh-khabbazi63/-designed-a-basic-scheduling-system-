package assignment1.scheduler.sec302;

/**
 * This is code for Part 1.
 * In this file, create a subclass named PerDaySchedule. This is
 * a subclass of the Schedule Superclass.
 * Schedule has a description (for example,
 * "change the gear oil") and happens on one or more dates.
 * A perdayschedule activity happens every day.
 * @author afsaneh khabbazibasmenj
 */

public class PerDaySchedule extends Schedule {

    public PerDaySchedule() {
        super();
        // TODO Auto-generated constructor stub
    }

    public PerDaySchedule(String description) {
        super(description);
    }


    @Override

    public boolean dueOn(int year, int month, int day) {// this method shows every day activities
        return true;

    }

    @Override
    public String toString() {
        return super.toString();
    }
}