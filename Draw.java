import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Draw {
    private int drawnNumber;
    private int storedNumber;
    private int count = 0;

    public Draw() {

    }

    public Integer getStoredNumber() {
        return storedNumber;
    }

    public Integer setStoredNumber() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your number: ");
        try {
            storedNumber = Integer.parseInt(reader.readLine());
        }catch (Exception e) {


        }
        return storedNumber;

    }


    public void draw() {
        Random random = new Random();
        drawnNumber = random.nextInt(11);
        System.out.println("The number has been drawn, so go on!\n");


    }

    public void count() {

        if (this.drawnNumber == this.storedNumber) {
            System.out.println("\nYou entered the correct number!");
            count++;
            System.out.println("Your current score is: " + count + "\n");
        }
        else {
            System.out.println("\nYou entered the wrong value :(");
            System.out.println("Your current score is: " + count + "\n");
        }
    }

    public int getCount() {
        return count;
    }


    public void winOrLose() {
        if (getCount() == 3) {
            System.out.println("Congratulations, YOU HAVE WON THE GAME!!");
        }
    }
}
