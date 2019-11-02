/* 
 * Copyright 2019 Mario Merlos Abella <mario.merlos.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mario Merlos Abella <mario.merlos.alum@iescamp.es>
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //variables & Constantes
        final int MAX = 10;
        final int MIN = 0;
        
        boolean error;
        int user1;
        int user2;
        int user3;
        int user4;

        //Inicio bucle
        do {
            try {
                System.out.printf("Usuario 1 va al piso ...: ");
                user1 = SCN.nextInt();
                
                System.out.printf("Usuario 2 va al piso ...: ");
                user2 = SCN.nextInt();
                
                System.out.printf("Usuario 3 va al piso ...: ");
                user3 = SCN.nextInt();
                
                System.out.printf("Usuario 4 va al piso ...: ");
                user4 = SCN.nextInt();

                if (user1 <= MAX  && user1 >= MIN && user2 <= MAX  && user2 >= MIN && user3 <= MAX  && user3 >= MIN && user4 <= MAX  && user4 >= MIN ) {
                    System.out.printf("Pisos seleccionados por user1 ...:  %d%nPisos seleccionados por user2 ...: %d%nPisos seleccionados por user3 %d%nPisos seleccionados por user4 %d%n", user1, user2, user3, user4);
                    error = false;

                } else {
                    error = true;
                    System.out.println("valor incorrecto");
                }

            } catch (Exception e) {
                error = true;
                System.out.println("valor incorrecto");
                SCN.nextLine();
            }
        } while ((error == true));
        System.out.println("END");

    }

}
