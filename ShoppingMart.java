import java.lang.System;
import java.util.Scanner;
import java.time.LocalDateTime;
class Store {
    Scanner gett = new Scanner(System.in);
    void productlist() {
        System.out.println("Select an option below:");
        System.out.println("1.Vegetables");
        System.out.println("2.Fruits");
        System.out.println("3.Groceries");
        //if new options, create here
    }

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        Store copt = new Store();
        Store s = new Store();
        copt.productlist();
        System.out.print("Enter an option(Eg.1,2,3): ");
        int option = read.nextInt();
        if(option == 1) 
        {
            NumberToWords no = new NumberToWords();
            vegetables veg = new vegetables();
            veg.vegetableslist();
            int quantity = veg.quantity; 
            int productnum =veg.productnum;
            int price =veg.price;
            if(productnum==11)
            {
                System.out.println("");
                System.out.println("------------------------------");
                System.out.println("System Genarated Bill: ");
                System.out.println(LocalDateTime.now());
                System.out.println("");
                System.out.println("Item purchased    : Tomato");
                System.out.println("Quantity (in Kgs) : " + quantity);
                System.out.println("Total price       : Rs." + price +"("+no.convert(price)+")");
                System.out.println("------------------------------");
                System.out.println("---Thank you! Visit again!---");
            }
            else if(productnum==12)
            {
                System.out.println("");
                System.out.println("------------------------------");
                System.out.println("System Genarated Bill: ");
                System.out.println(LocalDateTime.now());
                System.out.println("");
                System.out.println("Item purchased    : Onion");
                System.out.println("Quantity (in Kgs) : " + quantity);
                System.out.println("Total price       : Rs." + price +"("+no.convert(price)+")");
                System.out.println("------------------------------");
                System.out.println("---Thank you! Visit again!---");
            }
            else if(productnum==13)
            {
                System.out.println("");
                System.out.println("------------------------------");
                System.out.println("System Genarated Bill: ");
                System.out.println(LocalDateTime.now());
                System.out.println("");
                System.out.println("Item purchased    : Potato");
                System.out.println("Quantity (in Kgs) : " + quantity);
                System.out.println("Total price       : Rs." + price +"("+no.convert(price)+")");
                System.out.println("------------------------------");
                System.out.println("---Thank you! Visit again!---");
            }
        }
        else if(option==2)
        {
            NumberToWords no = new NumberToWords();
            fruits fru = new fruits();
            fru.fruitslist();
            int quantity = fru.quantity; 
            int productnum =fru.productnum;
            int price =fru.price;
            if(productnum==21)
            {
                System.out.println("");
                System.out.println("------------------------------");
                System.out.println("System Genarated Bill: ");
                System.out.println(LocalDateTime.now());
                System.out.println("");
                System.out.println("Item purchased    : Apple");
                System.out.println("Quantity (in Kgs) : " + quantity);
                System.out.println("Total price       : Rs." + price +"("+no.convert(price)+")");
                System.out.println("------------------------------");
                System.out.println("---Thank you! Visit again!---");
            }
            else if(productnum==22)
            {
                System.out.println("");
                System.out.println("------------------------------");
                System.out.println("System Genarated Bill: ");
                System.out.println(LocalDateTime.now());
                System.out.println("");
                System.out.println("Item purchased    : Orange");
                System.out.println("Quantity (in Kgs) : " +quantity);
                System.out.println("Total price       : Rs." +price);
                System.out.println("------------------------------");
            }
            else if(productnum==23)
            {
                System.out.println("");
                System.out.println("------------------------------");
                System.out.println("System Genarated Bill: ");
                System.out.println(LocalDateTime.now());
                System.out.println("");
                System.out.println("Item purchased    : Watermelon");
                System.out.println("Quantity (in Kgs) : " + quantity);
                System.out.println("Total price       : Rs." + price +"("+no.convert(price)+")");
                System.out.println("------------------------------");
                System.out.println("---Thank you! Visit again!---");
            }

        }
        else if(option==3)
        {
            NumberToWords no = new NumberToWords();
            groceries groc = new groceries();
            groc.grocerieslist();
            int quantity = groc.quantity; 
            int productnum =groc.productnum;
            int price =groc.price;
            if(productnum==31)
            {
                System.out.println("");
                System.out.println("------------------------------");
                System.out.println("System Genarated Bill: ");
                System.out.println(LocalDateTime.now());
                System.out.println("");
                System.out.println("Item purchased    : Sugar");
                System.out.println("Quantity (in Kgs) : " + quantity);
                System.out.println("Total price       : Rs." + price +"("+no.convert(price)+")");
                System.out.println("------------------------------");
                System.out.println("---Thank you! Visit again!---");
            }
            else if(productnum==32)
            {
                System.out.println("");
                System.out.println("------------------------------");
                System.out.println("System Genarated Bill: ");
                System.out.println(LocalDateTime.now());
                System.out.println("");
                System.out.println("Item purchased    : Salt");
                System.out.println("Quantity (in Kgs) : " + quantity);
                System.out.println("Total price       : Rs." + price +"("+no.convert(price)+")");
                System.out.println("------------------------------");
                System.out.println("---Thank you! Visit again!---");
            }
            else if(productnum==33)
            {
                System.out.println("");
                System.out.println("------------------------------");
                System.out.println("System Genarated Bill: ");
                System.out.println(LocalDateTime.now());
                System.out.println("");
                System.out.println("Item purchased    : Wheat flour");
                System.out.println("Quantity (in Kgs) : " + quantity);
                System.out.println("Total price       : Rs." + price +"("+no.convert(price)+")");
                System.out.println("------------------------------");
                System.out.println("---Thank you! Visit again!---");
            }

        }
        else {
            System.out.println("XXX INVALID CHOICE XXX");
        }
        System.out.println(" ");
    }
}
class vegetables {
    Scanner gett = new Scanner(System.in);
    int quantity;
    int productnum;
    int price;
    public int vegetableslist() {
        System.out.println("");
        System.out.println("Vegetable availability list: ");
        System.out.println("1.Tomato");
        System.out.println("2.Onion");
        System.out.println("3.Potato");
        //if new vegetable arrives, add above
        System.out.print("Enter an option: ");
        int veglist = gett.nextInt();
        if(veglist == 1) {
            System.out.println("");
            System.out.println("Tomato - 50rs for 1kg");
            System.out.print("How many kgs do you want? : ");
            quantity = gett.nextInt();
            productnum = 11;
            price = quantity * 50;
        }
        else if(veglist == 2) {
            System.out.println("");
            System.out.println("Onion - 30rs for 1kg");
            System.out.print("How many kgs do you want? : ");
            quantity = gett.nextInt();
            productnum = 12;
            price = quantity * 30;
        }
        else if(veglist == 3) {
            System.out.println("");
            System.out.println("Potato - 35rs for 1kg");
            System.out.print("How many kgs do you want? : ");
            quantity = gett.nextInt();
            productnum = 13;
            price = quantity * 35;
        }
        //add else if, if new vegetable adds
        else {
            System.out.println("XXX INVALID CHOICE XXX");
        }
        return 0; 
    }
}
class fruits
{
    Scanner gett = new Scanner(System.in);
    int quantity;
    int productnum;
    int price;
    public int fruitslist()
    {
        System.out.println("");
        System.out.println("Fruits availability list: ");
        System.out.println("1.Apple");
        System.out.println("2.Orange");
        System.out.println("3.Watermelon");
        //create new, if new fruit arrives
        System.out.print("Enter an option: ");
        int frulist = gett.nextInt();
        if(frulist == 1) {
            System.out.println("");
            System.out.println("Apple - 150rs for 1kg");
            System.out.print("How many kgs do you want? : ");
            quantity = gett.nextInt();
            productnum = 21;
            price = quantity * 150;
        }
        else if(frulist == 2) {
            System.out.println("");
            System.out.println("Orange - 130rs for 1kg");
            System.out.print("How many kgs do you want? : ");
            quantity = gett.nextInt();
            productnum = 22;
            price = quantity * 130;
        }
        else if(frulist == 3) {
            System.out.println("");
            System.out.println("Watermelon - 70 rs for 1kg");
            System.out.print("How many kgs do you want? : ");
            quantity = gett.nextInt();
            productnum = 23;
            price = quantity * 70;
        }
        //add else if, if new fruits item adds
        else {
            System.out.println("XXX INVALID CHOICE XXX");
        }
        return 0; 
    }
}
class groceries
{
    Scanner gett = new Scanner(System.in);
    int quantity;
    int productnum;
    int price;
    public int grocerieslist()
    {
        System.out.println("");
        System.out.println("Groceries availability list: ");
        System.out.println("1.Sugar");
        System.out.println("2.Salt");
        System.out.println("3.Wheat flour");
        //add new option, if grocery arrives
        System.out.print("Enter an option: ");
        int grolist = gett.nextInt();
        if(grolist == 1) {
            System.out.println("");
            System.out.println("Sugar - 40rs for 1kg");
            System.out.print("How many kgs do you want? : ");
            quantity = gett.nextInt();
            productnum = 31;
            price = quantity * 40;
        }
        else if(grolist == 2) {
            System.out.println("");
            System.out.println("Salt - 10rs for 1kg");
            System.out.print("How many kgs do you want? : ");
            quantity = gett.nextInt();
            productnum = 32;
            price = quantity * 10;
        }
        else if(grolist == 3) {
            System.out.println("");
            System.out.println("Wheat flour - 80 rs for 1kg");
            System.out.print("How many kgs do you want? : ");
            quantity = gett.nextInt();
            productnum = 33;
            price = quantity * 80;
        }
        //add else if, if new grocery adds
        else {
            System.out.println("XXX INVALID CHOICE XXX");
        }
        return 0; //this returns nothing
    }
}
class NumberToWords {

    static String[] ones = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
        "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    static String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static String convert(int number) {
        if (number == 0) return "Zero";

        if (number < 20) {
            return ones[number];
        } else if (number < 100) {
            return tens[number / 10] + (number % 10 != 0 ? " " + ones[number % 10] : "");
        } else {
            return ones[number / 100] + " Hundred" +
                   (number % 100 != 0 ? " and " + convert(number % 100) : "");
        }
    }
}
