
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


import java.util.Map;
import java.util.Scanner;
import java.util.Set;



// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
// методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии)
// фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
// хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить
// параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
// условиям.         
public class laptopMain {
    public static void main(String[] args) {
    laptop l1 = new laptop(8, 256, "Windows 11 Home", "Lenovo IdeaPad 3 ", "Серый");
    laptop l2 = new laptop(8, 512, "Windows 11 Home", "ASUS Vivobook 15 ", "Серый");
    laptop l3 = new laptop(16, 1024, "Windows 11 Pro", "Acer Nitro V 15 ", "Чёрный");
    laptop l4 = new laptop(16, 512, "Windows 11 Pro", "THUNDEROBOT 911 X", "Чёрный");
    laptop l5 = new laptop(16, 512, "Windows 11 Pro", "ASUS TUF Gaming", "Чёрный");
    laptop l6 = new laptop(8, 512, "Windows 11 Home", "KUU Xbook-2", "Серый");
    laptop l7 = new laptop(16, 1024, "Windows 11 Pro", "THUNDEROBOT 911S", "Белый");
    laptop l8 = new laptop(8, 1024, "Windows 11 Pro", "Digma Pro", "Белый");
    laptop l9 = new laptop(8, 512, "Windows 11 Home", "ASUS Vivobook 15 ", "Чёрный");
    laptop l10 = new laptop(16, 1024, "Windows 11 Home", "ASUS Vivobook 15 ", "Чёрный");
    laptop l11 = new laptop(32, 512, "Windows 11 Pro", "Digma Pro", "Белый");
    laptop l12 = new laptop(32, 1024, "Windows 11 Home", "ASUS Vivobook 15 ", "Серый");
     
    Set<laptop> laptops = new HashSet<>(Arrays.asList(l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12));
    System.out.println("**Добро пожаловать в 5 Элемент**\n");
    Filtacion(laptops);
                
    } 
   public static void Filtacion (Set<laptop> laptop){
    Scanner scanner = new Scanner(System.in);
    Map<Integer, String> map = new HashMap<>();
    int ram = 0; int ssd = 0; String op = " "; String color = " ";
    String z =  " "; String z2 =  " "; String z3 =  " "; String z4 =  " ";
    map.put(1,"Оперативная память \n 1 - 8 ГБ; 2 - 16 ГБ; 3 - 32 ГБ; 4 - 64 ГБ;"); map.put(2,"Накопитель памяти \n 1 - 256 ГБ; 2- 512 ГБ; 3 - 1024 ГБ;"); map.put(3,"Операционная система \n 1 - Windows 11 Home; 2 - Windows 11 Pro;"); map.put(4, "Цвет \n 1 - Cерый; 2 - Чёрный; 3 - Белый;");
    while (true) {
        System.out.println("Введите цифру, соответствующую необходимому критерию:" + "\n0 - Выход из магазина!" + "\n1 - ОЗУ" + z + "\n" + "2 - Объем SSD" + z2 + "\n" + "3 - Операционная система" + z3 + "\n" +
      "4 - Цвет"+ z4 +"\n" + "Введите 'ent' для подтверждения поиска\n" + "Введите 'rem' чтобы очистить список.. \n");
        String input = scanner.nextLine();
        if (input.equals("ent")) {
         boolean filtr = true;
            if (z == " +" || z2 == " +" || z3 == " +" || z4 == " +") {
               
                for (laptop laptop2 : laptop) {
                    filtr = true;
                    if (z == " +" && laptop2.getRam() < ram) {
                     filtr = false;
                    }else if (z2 == " +" && laptop2.getSsd() < ssd) {
                     filtr = false;
                    }else if (z3 == " +" && laptop2.getOpSystem().equals(op)) {
                     filtr = false;
                    }else if (z4 == " +" && laptop2.getColor().equals(color)) {
                     filtr = false;
                    }
                    else if (filtr){
                     System.out.println(laptop2);
                     System.out.println("==========================");
                    }
                }
                
             }if(filtr == false){
             System.out.println("К сожалению ничего больше нет... \n");
             }
              
        }
        else if (input.equals("0")) {
 
            System.out.println("Вы вышли из магазина техники..");
             break; 
              
        }else if (input.equals("1")) {
             System.out.println(map.get(1) + "\n" + "Введите цифру, соответствующую необходимому критерию: ");
             String inputt = scanner.nextLine();
             if (ram == 8 || ram == 16) {
                System.out.println("Вы уже выбрали критерий\n");
                continue;
             }
             else if (inputt.equals("1")) {
               System.out.println("Параметр выбран! Пожалуйста выберите остальные критерии или подтвердите поиск\n");
                ram = 8;
                z = " +";

             }else if (inputt.equals("2")){
                System.out.println("Параметр выбран! Пожалуйста выберите остальные критерии или подтвердите поиск\n");
                 ram = 16;
                 z = " +"; 

             } else if (inputt.equals("3")){
               System.out.println("Параметр выбран! Пожалуйста выберите остальные критерии или подтвердите поиск\n");
                ram = 32;
                z = " +"; 

            } else if (inputt.equals("4")){
               System.out.println("Параметр выбран! Пожалуйста выберите остальные критерии или подтвердите поиск\n");
                ram = 64;
                z = " +"; 

            }  
        }else if (input.equals("2")) {
            System.out.println(map.get(2) + "\n" + "Введите цифру, соответствующую необходимому критерию: ");
            String inputt = scanner.nextLine();
             if (ssd == 256 || ssd == 512 || ssd == 1024) {
                System.out.println("Вы уже выбрали критерий\n");
                continue;
             }
             else if (inputt.equals("1")) {
               System.out.println("Параметр выбран! Пожалуйста выберите остальные критерии или подтвердите поиск\n");
                ssd = 256;
                z2 = " +";

             }else if (inputt.equals("2")){
                System.out.println("Параметр выбран! Пожалуйста выберите остальные критерии или подтвердите поиск\n");          
                 ssd = 512;
                 z2 = " +"; 

             }else if (inputt.equals("3")){
                System.out.println("Параметр выбран! Пожалуйста выберите остальные критерии или подтвердите поиск\n");
                 ssd= 1024;
                 z2 = " +"; 

             }     
        }else if (input.equals("3")) {
            System.out.println(map.get(3) + "\n" + "Введите цифру, соответствующую необходимому критерию: ");
            String inputt = scanner.nextLine();
             if (op == "Windows 11 Home" || op == "Windows 11 Pro") {
                System.out.println("Вы уже выбрали критерий\n");
                continue;
             }
             else if (inputt.equals("1")) {
               System.out.println("Параметр выбран! Пожалуйста выберите остальные критерии или подтвердите поиск\n");
                op = "Windows 11 Home";
                z3 = " +";
             }else if (inputt.equals("2")){
                System.out.println("Параметр выбран! Пожалуйста выберите остальные критерии или подтвердите поиск\n");
                 op = "Windows 11 Pro";
                 z3 = " +"; 
             }
        }else if (input.equals("4")) {
            System.out.println(map.get(4) + "\n" + "Введите цифру, соответствующую необходимому критерию: ");
            String inputt = scanner.nextLine();
             if (color == "Белый" || color == "Серый"|| color == "Чёрный") {
                System.out.println("Вы уже выбрали критерий\n");
                continue;
             }
             else if (inputt.equals("1")) {
               System.out.println("Параметр выбран! Пожалуйста выберите остальные критерии или подтвердите поиск\n");
                color = "Серый";
                z4 = " +";

             }else if (inputt.equals("2")){
                System.out.println("Параметр выбран! Пожалуйста выберите остальные критерии или подтвердите поиск\n");
                color = "Чёрный";
                 z4 = " +";    

             }else if (inputt.equals("3")){
                System.out.println("Параметр выбран! Пожалуйста выберите остальные критерии или подтвердите поиск\n");
                color = "Белый";
                z4 = " +";    
             }
             
        }else if(input.equals("rem")) {
         ram = 0; ssd = 0;  op = " "; color = " ";
         z =  " "; z2 =  " ";  z3 =  " ";  z4 =  " ";
           System.out.println("Список очищен....\n");
        }   
       
    }
      scanner.close();
      

   }
  
}
