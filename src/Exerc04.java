//Write a Java program that prints the current time in GMT.
//
//GMT: Greenwich Mean Time (GMT) is the mean solar time at the Royal Observatory in Greenwich, London. GMT was formerly used as the international civil time standard, now superseded in that function by Coordinated Universal Time (UTC).
//
//Test Data
//Input the time zone offset to GMT: 256


import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input the time zone offset to GMT: ");
        long timeZoneChange = input.nextInt();

        long totalMilleseconds = System.currentTimeMillis();

        long totalSeconds = totalMilleseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = ((totalHours + timeZoneChange) % 24);

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
