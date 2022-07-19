package notas;

// Fig. 7.15: GradeBookTest.java
// GradeBookTest creates a GradeBook object using an array of grades, 
// then invokes method processGrades to analyze them.

import java.util.Scanner;
public class GradeBookTest
{ 
   // main method begins program execution
   public static void main(String[] args)
   {
      // one-dimensional array of student grades
      int[] notasLP3 = {10, 68, 94, 100, 83, 78, 85, 91, 76, 77};
      int[] notasBD1 = {12, 68, 94, 90, 83, 78, 85, 91, 76, 61};
      int[] notasWEB1 = {14, 68, 94, 80, 83, 78, 85, 91, 76, 57};
      
      //GradeBook[] materias = (LP3, BD1, WEB1);
      
      GradeBook objetoLP3 = new GradeBook("LP3", notasLP3);
      GradeBook objetoBD1 = new GradeBook("BD1", notasBD1);
      GradeBook objetoWEB1 = new GradeBook("WEB1", notasWEB1);
      
      GradeBook[] materias = {objetoLP3, objetoBD1, objetoWEB1};
      
         Scanner entrada = new Scanner (System.in);
         System.out.printf("Quer o relatório de qual matéria (1, 2 ou 3): "); 
         int opcao = entrada.nextInt();
            
         materias[opcao-1].processGrades();
   } 
} // end class GradeBookTest


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
