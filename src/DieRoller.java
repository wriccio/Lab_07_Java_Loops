import java.util.Random;
public class DieRoller
{
    public static void main(String[] args)
    {
        Random rand = new Random();

        int die1 = 0;
        int die2 = 0;
        int die3 = 0;
        int sum = 0;
        int roll = 0;

        System.out.printf("%-10s %8s %8s %8s %8s%n",
                "Roll", "Die1", "Die2", "Die3", "Sum");

        System.out.println("----------------------------------------------");

        do
        {
            roll++;

            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            die3 = rand.nextInt(6) + 1;

            sum = die1 + die2 + die3;

            System.out.printf("%-10d %8d %8d %8d %8d%n",
                    roll, die1, die2, die3, sum);

        } while (!(die1 == die2 && die2 == die3));
    }
}



