package assignment1.scheduler.sec302;

import java.util.Scanner;

/**
 * 
 * This is code for your part Part 3. The essence of this class is to demonstrate the Schedule class and subclasses.
 * You should fill an array of sSchedule objects (hint: observe the sample output file) with
 * different schedule activities. A user should be able to input a date and
 * obtain an output of all scheduled activities that happen on that date.
 * Use the Schedule class and PerDaySchedule classes from Part I of your work
 * and the PerMonthSchedule and OnceSchedule classes from your Part 2.
 * @author afsaneh khabbazibasmenj
 */

public class ScheduleAllTest {

    public static void main(String[] args) {
        //initialized the subclasses
        PerDaySchedule d = new PerDaySchedule();
        PerMonthSchedule m = new PerMonthSchedule();
        OnceSchedule o = new OnceSchedule();
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
         //creating arrays with subclasses 
        Schedule[] schedules = {
                new PerDaySchedule("open the aircraft door"),
                new OnceSchedule("Change the kitchenwares in the firstclass.",2022,10,31),
                new PerMonthSchedule("Dismantle the lights..",30),
                new PerMonthSchedule("Clean the rugs with water.",01),
                new PerDaySchedule("Clean the doormats."),        
        };
        int a=1; 
        while( a<20) {// while loop start 
        
        System.out.print("Enter a date (like 2020 01 30):");
        // getting date by scanner
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        System.out.println("Here are your scheduled activities on " + month + "/" + day + "/" + year);
          //for loop for arrays
        for (int i = 0; i < schedules.length; i++) {
            Schedule schedule = schedules[i];
            if (schedule.dueOn(year, month, day))
                System.out.println(schedule.getDescription());
            a++;
        }
    }}
}