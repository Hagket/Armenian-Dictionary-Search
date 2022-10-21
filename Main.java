/*
Armenian Dictionary Search in Java
Made by Hagop Ketchedjian
Version 1.0 
November 2021
*/

import java.util.*;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    ArmenianDictionary ad = new ArmenianDictionary();
    System.out.println();
    System.out.println("Welcome to Armenian Dictionary Search.");
    System.out.println("Բարի գալուստ Հայերեն Բառ Փնտռողին.");
    System.out.println("Добро пожаловать в поиск по армянскому словарю․");
    System.out.println();
    System.out.println("Directions:\nTo find a word that starts with a certain letter use - after the letter (Ex. Ա- would give Արարատ). To find a word that ends with a certain letter or phrase use - before the letter (Ex. -ով would give կողով)․ \nEnter \"# of words\" to see how many words this program contains.");
    System.out.println();
    System.out.println("Հրահանգ:\nՈրոշակի տառով սկսվող բառ գտնելու համար օգտագործեք - տառից հետո (Ex. Ա- կտա Արարատ)։ Որոշակի տառով կամ արտահայտությունով ավարտվող բառ գտնելու համար օգտագործեք - տառից առաջ (Ex. -ով կտա կողով)");
    System.out.println();
    System.out.println("инструкции:\nЧтобы найти слово, которое начинается с определенной буквы, используйте - после буквы (Ex. Ա- даст Արարատ). Чтобы найти слово, оканчивающееся на определенную букву или фразу, используйте - перед буквой (Ex. -ով даст կողով)․");
    System.out.println();
    
    System.out.print("Մուտքագրեք որոնումը: ");
    Scanner in = new Scanner (System.in);
		String input = in.nextLine();

    while (!input.equals("Stop"))
		{
			System.out.println(ad.getResponse(input));
			input = in.nextLine();
		}
  }
}