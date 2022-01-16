package assignment1.scheduler.sec302;

/**
 * This is code for Part 2. Create a subclass named PerMonthSchedule.
 * This is a schule of activities that happen on the same day every month.
 * @author afsaneh khabbazibasmenj
 */

public class PerMonthSchedule extends Schedule {

    private int day;

    public PerMonthSchedule() {
        super();
      
    }

  

    public PerMonthSchedule(String description, int day) {
        super(description);
        this.day = day;
        
    }

    @Override
    public boolean dueOn(int year, int month, int day) {
        return day == this.day;
      
    }

    @Override
    public String toString() {
        
        return super.toString();
    }


}

