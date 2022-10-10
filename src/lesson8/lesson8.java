package lesson8;

public class lesson8 {
     public static void main(String[] args) {
          //Домашняя работа 1
          System.out.println("Домашняя работа 1");
          //Задание 1
          System.out.println("Задание 1");
          int many = 15000;
          int total = 0;
          int i = 0;
          for (; total < 2_459_000; i++) {
               total = total + total / 100;
               total = total + many;
          }
          System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей!");
          {


               //Задание 2
               System.out.println("Задание 2");
               int one = 0;
               while (one < 10) {
                    one++;
                    System.out.print(one + " ");
               }
               System.out.println();
               for (int a = 10; a > 0; a--) {
                    System.out.print(a + " ");
               }
               System.out.println();

               //Задание 3
               System.out.println("Задание 3");
               int populationOfTheCountry = 12_000_000;
               int birthRate = (populationOfTheCountry / 1000) * 17;
               int mortality = (populationOfTheCountry / 1000) * 8;
               int time = 1;
               for (; time <= 10; time++) {
                    populationOfTheCountry = (populationOfTheCountry + birthRate) - mortality;
                    System.out.println("Год " + time + ", численность населения составляет " + populationOfTheCountry + " человек");
               }

               //Домашняя работа 2
               System.out.println("Домашняя работа 2");
               //Задание 1 и зидание 2
               System.out.println("Задание 1 и задание 2");
               int many1 = 15000;
               int total1 = 0;
               for (int i1 = 0; total1 <= 12_000_000; i1++) {
                    total1 = (total1 + many1);
                    total1 = (total1 + total1 / 100 * 7);
                    if (i1 % 6 == 0) {
                         System.out.println("Месяц " + i1 + ", сумма накоплений равна " + total1 + " рублей!");
                    }
               }

               //Задание 3
               System.out.println("Задание 3");
               int many2 = 15000;
               int total2 = 0;
               int monthsPerYear = 12;
               int numberOfYears = 9;
               int i2 = (monthsPerYear * numberOfYears);
               int i3 = 0;
               for (; i3 <= i2; i3++) {
                    total2 = (total2 + many2);
                    total2 = (total2 + total2 / 100 * 7);
                    if (i3 % 6 == 0) {
                         System.out.println("Месяц " + i3 + ", сумма накоплений равна " + total2 + " рублей!");
                    }
               }

               //Задание 4
               System.out.println("Задание 4");
               for (int friday = 7; friday <= 31; friday = (friday + 7)) {
                    System.out.println("Сегодня пятница, " + friday + "-е число.Необходимо подготовить отчёт!");
               }

               //Домашняя работа 3
               System.out.println("Домашняя работа 3");
               //Задание 1
               System.out.println("Задание 1");
               int theYearOfTheCometsPassageOverTheEarth = 79;
               int period1 = 200;
               int period2 = 100;
               int lastDate = (period2 + 2022);
               int firstDate = (2022 - period1);
               int u = 0;
               for (; u <= lastDate; u += theYearOfTheCometsPassageOverTheEarth) {
                    if (u >= firstDate)
                         System.out.println(u);
               }


               //Задание 2
               System.out.println("Задание 2");
               for (int s = 2; s <= 2; s++) {
                    for (int r = 1; r <= 10; r++) {
                         System.out.println(s + " x " + r + " = " + s * r);
                    }
                    System.out.println();
               }

               }
          }
     }