import java.util.Scanner;
public class Q3 
{
    public static void main(String args[])
    {
        
    }
}

class Time
{
    int hour;
    int minute;
    int second;
    Time(int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void displayTime()
    {
        System.out.println(hour + ":" + minute + ":" + second);
    }
    public void setTime(int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public add(Time t)
    {
        this.hour += t.hour;
        this.minute += t.minute;
        this.second += t.second;
    }
    public void correct()
    {
        if (second >= 60)
        {
            minute += second / 60;
            second %= 60;
        }
        if (minute >= 60)
        {
            hour += minute / 60;
            minute %= 60;
        }
        if (hour >= 24)
        {
            hour %= 24;
        }
    }

    public void nextSecond()
    {
        second++;
        correct();
    }
    public void nextMinute()
    {
        minute++;
        correct();
    }
    public void nextHour()
    {
        hour++;
        correct();
    }
    public void previousSecond()
    {
        second--;
        correct();
    }
    public void previousMinute()
    {
        minute--;
        correct();
    }
    public void previousHour()
    {
        hour--;
        correct();
    }
    
}