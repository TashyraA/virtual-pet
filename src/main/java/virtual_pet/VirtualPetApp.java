package virtual_pet;

import java.util.Scanner;

public class VirtualPetApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VirtualPet Bandit = new VirtualPet(10,5,8, 2);

       boolean running = true;

        while (running) {
            System.out.println("hungriness: " + Bandit.getHunger());
            System.out.println("happiness: " + Bandit.getHappy());
            System.out.println("tiredness: " + Bandit.getTired());
            System.out.println("cleanliness: " + Bandit.getClean());

            System.out.println("Kitty Kat Bandit");
            System.out.println("Take care of your pet!!");
            System.out.println("What would you like to do first?");
            System.out.println("1. Feed Bandit.");
            System.out.println("2. Play with Bandit.");
            System.out.println("3. Pet Bandit to sleep.");
            System.out.println("4. Give Bandit a bath.");
            System.out.println("5. Restart the game!");
            Scanner playerInput = new Scanner(System.in);
            String playerInputChoices = playerInput.nextLine();
            if (playerInputChoices.equals("1")) {
                Bandit.feed(5);
                Bandit.tick();
            }

            if (playerInputChoices.equals("2")) {
                Bandit.play(4);
                Bandit.tick();
            }

            if (playerInputChoices.equals("3")) {
                Bandit.tired(8);
                Bandit.tick();

            }

            if(playerInputChoices.equals("4")) {
                Bandit.clean(10);
                Bandit.tick();

            }

            if(playerInputChoices.equals("5")){
                running = false;
            }







        }


    }


}

