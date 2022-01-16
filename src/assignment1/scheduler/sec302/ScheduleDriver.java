package assignment1.scheduler.sec302;
/**
 * results of part1 and part2 Assignment
 * @author afsaneh khabbazibasmenj
 *
 */

public class ScheduleDriver {

    public static void main(String[] args) {
        //Start part1
        PerDaySchedule per = new PerDaySchedule("change the gear oil for air craft");
        System.out.println();
        System.out.println("SAMPLE OUTPUT FOR PART 1");
        System.out.println();

        System.out.print("PerDaySchedule is just a subclass of Schedule: ");
        // check which PerDayschedle class and schedule class are equal or not
        System.out.println(PerDaySchedule.class.getSuperclass() == Schedule.class);
        System.out.println("Expected" + ":" + "True");

        System.out.print("PerDaySchedule have no extra fields: ");
        // check wich have no extra field 
        System.out.println(PerDaySchedule.class.getDeclaredFields().length == 0);
        System.out.println("Expected" + ":" + "True");
        // we can see the comment which we has put in instructor
        System.out.println("Looking at perday schedules" + ":" + per.toString());
        System.out.println("Expected" + ":" + "change the gear oil for air craft");

        // test DueOn method for PerDayschedule
        System.out.println(per.dueOn(0, 0, 0));
        System.out.println("Expected" + ":" + "True");
        System.out.println();

        //start part2
        System.out.println("part2");
        System.out.println();


        // check which PerMonth class and schedule class are equal or not

        System.out.print("PerMonthSchedule is just a subclass of Schedule: ");
        System.out.println(PerMonthSchedule.class.getSuperclass() == Schedule.class);
        System.out.println("Expected" + ":" + "True");
        
        // check which OnceDayschedle class and schedule class are equal or not

        System.out.print("OnceSchedule is just a subclass of Schedule: ");
        System.out.println(OnceSchedule.class.getSuperclass() == Schedule.class);
        System.out.println("Expected" + ":" + "True");
        
        //check which PerMonthschedule has extra field than schedule

        System.out.print("PerMonthSchedule have no extra fields: ");
        System.out.println(PerMonthSchedule.class.getDeclaredFields().length == 0);
        System.out.println("Expected" + ":" + "False");
        
        // check which OnceSchedule class and schedule class are equal or not

        System.out.print("OnceSchedule have no extra fields: ");
        System.out.println(OnceSchedule.class.getDeclaredFields().length == 0);
        System.out.println("Expected" + ":" + "False");


        PerMonthSchedule month = new PerMonthSchedule("description 1",10);
        OnceSchedule once = new OnceSchedule("description 2",2021,11,15);
        //check DueOn method for perday which it doesnt have field and result should be false

        System.out.println(per.dueOn(0, 0, 0));
        System.out.println("Expected" + ":" + "True");
        //check DueOn method for PerMonth which have one field

        System.out.println(month.dueOn(0, 10, 0));
        System.out.println("Expected" + ":" + "True");
        // check the method for Oncemonth
        System.out.println(once.dueOn(2021, 11, 15));
        System.out.println("Expected" + ":" + "True");

    }
}
