import java.util.Scanner;

public class Calculation implements Runnable {
        public static void main(String[] args) {
            try (Scanner input = new Scanner(System.in)) 
                Calculation calculation = new Calculation();
                int radius;
                double setCircle;
                System.out.print("Enter the radius of the circle: ");
                radius = calculation.nextInt();
                setCircle = Math.PI*radius*radius;
                System.out.println("The calculation result: "+ setCircle);
                calculation.clone();

        @Override
        public void run() {
            // TODO Auto-generated method stub
            
        }

       