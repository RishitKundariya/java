import java.util.*;

class Time
    {
        int hour;
        int minute;
        Time()
        {
            hour = 0;
            minute = 0;
        }
        Time(int hour, int minute)
        {
            this.hour = hour;
            this.minute = minute;
        }

        public Time Sum_Of_Time(Time t1)
        {
            Time t2 = new Time();

            t2.hour = t1.hour + this.hour;
            t2.minute = t1.minute + this.minute;
            if (t2.minute >= 60)
            {
                t2.minute = t2.minute - 60;
                t2.hour++;
            }
            return t2;
        }
    }
    class TimeObjectAditionDemo
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            int h = 0, m = 0;
            System.out.println("Enter the Hour of Firt Object ");
            h = sc.nextInt();
            System.out.println("Enter the Minute of Firt Object ");
            m = sc.nextInt();
            Time t1 = new Time(h, m);
            System.out.println("Enter the Hour of Second Object ");
            h = sc.nextInt();
            System.out.println("Enter the Minute of Second Object ");
            m = sc.nextInt();
            Time t2 = new Time(h, m);
            Time t3 = t1.Sum_Of_Time(t2);
            System.out.println(t1.hour + " : " + t1.minute + " + " + t2.hour + " : " + t2.minute + " = " + t3.hour + " : " + t3.minute);

        }
    }
