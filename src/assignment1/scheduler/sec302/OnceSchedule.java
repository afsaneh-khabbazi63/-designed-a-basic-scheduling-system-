package assignment1.scheduler.sec302;
/**
 * this class subclass of schedule class which has 3 filed more than schedule class
 * 
 * @author afsanehkhabbazibasmenj
 * 
 *
 */
public class OnceSchedule extends Schedule {

    private int year;
    private int month;
    private int day;

    public OnceSchedule() {
        super();
        // TODO Auto-generated constructor stub
    }

    //OneDue method which has been overrid which validate day,monthand year

    public OnceSchedule(String description, int year, int month, int day) {
        super(description);
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean dueOn(int year, int month, int day) {
        // TODO Auto-generated method stub
        return year == this.year && month == this.month && day == this.day;
      
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }


}
