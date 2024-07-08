import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        String input = "";
        ArrayList<String> list = new ArrayList<>();

        input = SafeInput.getNonZeroLenString(in, "Choose one of the follow: \nA: Add to list\tD: Delete from list\tI: Insert to list\tP: to print list\tQ: Quit program");

        if (input.equalsIgnoreCase("A"))
        {

        }


    }

    //add to the array "list"
    private static void add ()
    {
        String addItem = "";
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        addItem = SafeInput.getNonZeroLenString(in, "Input to item to add");
        list.add(addItem);

    }

}