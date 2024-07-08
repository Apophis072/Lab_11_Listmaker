
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static ArrayList<String> list = new ArrayList<>();
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        String input = "";
        boolean done = false;
        int listnum = 0;

        do
        {
            input = SafeInput.getRegExString(in, "Choose one of the follow: \nA: Add to list\tD: Delete from list\tI: Insert to list\tP: to print list\tQ: Quit program", "[AaDdIiPpQq]");
            if (input.equalsIgnoreCase("A")) {
                add();
                listnum = 1;

            }
            else if (input.equalsIgnoreCase("D"))
            {
                if (listnum == 1)
                {
                    delete();
                }
                else
                {
                    System.out.println("There is no element in the list yet.");
                }
            }
            else if (input.equalsIgnoreCase("I"))
            {
                if (listnum == 1)
                {
                    insert();
                }
                else
                {
                    System.out.println("There isn't anything in the list yet. Please add to list first.");
                }
            }
            else if (input.equalsIgnoreCase("P"))
            {
                print();
            }
            else if (input.equalsIgnoreCase("Q"))
            {
                quit();
            }
        } while (!done);
    }

    //add to the array "list"
    private static void add ()
    {
        String addItem = "";
        Scanner in = new Scanner(System.in);

        addItem = SafeInput.getNonZeroLenString(in, "Input the item to add");
        list.addLast(addItem);

    }

    //delete a specific item in the array "list"
    private static void delete()
    {
        int delete;

        print();
        delete = SafeInput.getRangedInt(in, "Enter the index to the element that you want to delete", 0, list.size() - 1);
        list.remove(delete);

    }

    //Insert an element in a specific index
    private static void insert()
    {
        int insertIndex;
        String insert = "";

        print();
        insertIndex = SafeInput.getRangedInt(in, "Enter the index that you want to insert an element", 0, list.size());
        insert = SafeInput.getNonZeroLenString(in, "Enter the element that you want to insert");


        list.add(insertIndex, insert);
    }

    //print the list
    private static void print()
    {
        for (int e = 0; e < list.size(); e++)
        {
            System.out.println("Index " + e + ":\t" + list.get(e));
        }
    }

    //Quit the program
    private static void quit()
    {
        String quit = "";
        boolean done = false;
        boolean tryAgain = false;

        do {
            quit = SafeInput.getNonZeroLenString(in, "Just to double check. Type query to quit");
            if (quit.equals("query")) {
                System.exit(0);
            }
            else
            {
                System.out.println("\nYou typed " + quit + " instead of query so the program continues.");
                done = true;
            }

        }while(!done);
    }

}