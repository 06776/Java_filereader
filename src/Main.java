/*
 * File: Main.java
 * Author: Hajdara Patrik
 * Copyright: 2024, Hajdara Patrik
 * Group: SZOFT II/2/N
 * Date: 2024-02-07
 * Github: https://github.com/06776/
 * Licenc: GNU GPL
 * Warning: A kodban az esetlegesen elofordulo hibakert nem all modomban felelosseget vallalni
 */

import java.io.File;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try {
      File file = new File("dolgozok.txt");
      Scanner scanner = new Scanner(file);
      int totalMoneyForSzolnok = 0;

      for (int i = 0; i < 8; i++) {
        String line = scanner.nextLine();
        String[] columns = line.split(":");
        if (columns.length >= 6) {
          if (columns[2].trim().equalsIgnoreCase("Szolnok")) {
            try {
              totalMoneyForSzolnok += Integer.parseInt(columns[4].trim());
            } catch (NumberFormatException e) {
              System.out.println(
                "Hiba: Nem sikerült konvertálni az összeget egész számmá."
              );
            }
          }
        }
        System.out.println((i + 1) + "." + " sor" + " tartalma: " + line);
      }

      System.out.println("\n A Szolnokiak fizetese: " + totalMoneyForSzolnok);
      System.out.println("\n 'Written by Hajdara Patrik | 2024'");
      scanner.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
