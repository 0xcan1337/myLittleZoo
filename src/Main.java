import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to myLittlePets, my friend!");

        System.out.println("Select my dogs or my cats to meet one of them: 1) cat 2) dog");
        Scanner scanner0 = new Scanner(System.in);
        int animalSelected = scanner0.nextInt();

        System.out.println("Please type the animal's name you want to call it: ");
        Scanner scanner = new Scanner(System.in);
        String animalName = scanner.next();



        switch (animalSelected){
            case 1:
                Cat cat = new Cat(animalName, "cat",10,23,20,true);
                cat.callIt();
                cat.makeNoise();
                System.out.println("Here is " + animalName+"'s details: (True = M, False = F)");
                cat.getAll();
                break;
            case 2:
                Dog dog = new Dog(animalName, "dog",10,23,20,false);
                dog.callIt();
                dog.makeNoise();
                System.out.println("Here is " + animalName+"'s details: (True = M, False = F)");
                dog.getAll();
                break;
        }


    }

}