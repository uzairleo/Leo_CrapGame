import java.util.Scanner;

public class Main{
    static void starLine(int sLimit)
    {
        for(int i=0;i<sLimit;i++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }

    static int comeOutRoll()
    {
        Scanner input=new Scanner(System.in);
          char ch;
          System.out.println("press R to roll the dices");
          ch=input.next().charAt(0);
          if(ch=='r'||ch=='R'){
        int dice1=(int)(Math.random()*6)+1;
        //also = int(Math.random()*(max-min)+1+min;assuming that max & min is defined
        int dice2=(int)(Math.random()*6)+1;
        int sumOfDices=0;
        sumOfDices=dice1+dice2;


        System.out.println("player rolled " +dice1+""+" +"+""+dice2+" = "+sumOfDices);

        return sumOfDices;
          }
          else {
              System.out.println("Error Invalid input");

              return 0;
          }
    }
    //
    public static void main(String[] args)
    {


        int rollDice=0;
        int againRollDice=0;
        int point=0;
        starLine(45);
        System.out.println("********Welcome to Uzairleo carp Game**********");
        starLine(45);
        System.out.println("Player rolling  the dices to start the game");
        rollDice=comeOutRoll();
        if(rollDice==7||rollDice==11){
            starLine(30);
            System.out.println("Congrats you won(The house lose)");
        }else
        if (rollDice==2||rollDice==3||rollDice==12)
        {
            starLine(40);
            System.out.println("You lose sorry (The house won the bet)");
        }
        else
        if (rollDice==1||rollDice==4||rollDice==5||rollDice==6||rollDice==8||rollDice==9||rollDice==10)
        {
            point=rollDice;
            System.out.println("Point :"+point);
            //now rolling the dice until 7 or the point not become comeoutroll so we get

            do {
                againRollDice=comeOutRoll();
                if (againRollDice == 7) {
                    starLine(35);
                    System.out.println("You lose the bet (The house won)");
                    break;

                } else if (againRollDice == point) {
                    starLine(40);
                    System.out.println("Congrats you make the point you won");
                    break;
                }
            }while (true);
        }
        starLine(40);
    }

}
