package Task1;

import java.util.Scanner;

public class BoxRunner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("how many Box objects to instantiate ? in number");


        Box[] cargoOfBox = new Box[input.nextInt()];

        for (int i = 0; i < cargoOfBox.length; i++) {
            Scanner input1 = new Scanner(System.in);
            System.out.println("Please Enter the box Size Name : s,l,xl,xxl,xxxl");
            String boxSize = input1.nextLine();
            System.out.println("Please Enter the box Lable");
            String boxLabel = input1.nextLine();
            System.out.println("Please Enter the box length whole number");
            int length = (int) input1.nextFloat();
            System.out.println("Please Enter the box width whole number");
            int width = (int) input1.nextFloat();
            System.out.println("Please Enter the box Height whole number");
            int height = (int) input1.nextFloat();

            cargoOfBox[i] = new Box(boxSize,boxLabel,length,height,width);
        }

        for (Box i :
                cargoOfBox) {
            System.out.println(i.toString());
        }
    }
}
