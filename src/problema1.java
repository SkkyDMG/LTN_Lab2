import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class problema1
{
   public static void main(String[] args) throws FileNotFoundException {

      File file = new File("judete_in.txt");
      Scanner scanner = new Scanner(file);
      String[] judete = new String[5];
      int i = 0;

      while (scanner.hasNextLine()) {

         judete[i] = scanner.nextLine();
         i++;
      }

      Arrays.sort(judete);

      for (i = 0; i < judete.length; i++)
      {
         System.out.println(judete[i] + "\n");
      }

      Scanner input = new Scanner(System.in);

      System.out.println("Introduceti Judetul: ");
      String jud = input.nextLine();
      int pozitie = Arrays.binarySearch(judete,jud);

      if(pozitie >= 0)
      {
         System.out.println("Judetul " +jud + " se afla la pozitia " +pozitie + "in tablou");
      }
      else
         System.out.println("Judetul nu se afla in tablou");

      input.close();
      scanner.close();

   }



}

