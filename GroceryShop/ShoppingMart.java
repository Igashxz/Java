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
    public static void main(String args[]) 
    {
        Scanner read = new Scanner(System.in);
        Store copt = new Store();
        Store s = new Store();
        String[] itemNames = new String[50];
        int[] itemQuantities = new int[50];
        int[] itemPrices = new int[50];
        int itemCount = 0;
        int finalTotal = 0;

        int more = 1;
        while (more == 1) {
            copt.productlist();
            System.out.print("Enter an option(Eg.1,2,3): ");
            int option = read.nextInt();

            if(option == 1) {
                vegetables veg = new vegetables();
                veg.vegetableslist();
                int quantity = veg.quantity;
                int productnum = veg.productnum;
                int price = veg.price;

                if(productnum == 11) {
                    itemNames[itemCount] = "Tomato";
                } else if(productnum == 12) {
                    itemNames[itemCount] = "Onion";
                } else if(productnum == 13) {
                    itemNames[itemCount] = "Potato";
                }
                itemQuantities[itemCount] = quantity;
                itemPrices[itemCount] = price;
                finalTotal += price;
                itemCount++;
            }

            else if(option == 2) {
                fruits fru = new fruits();
                fru.fruitslist();
                int quantity = fru.quantity;
                int productnum = fru.productnum;
                int price = fru.price;

                if(productnum == 21) {
                    itemNames[itemCount] = "Apple";
                } else if(productnum == 22) {
                    itemNames[itemCount] = "Orange";
                } else if(productnum == 23) {
                    itemNames[itemCount] = "Watermelon";
                }
                itemQuantities[itemCount] = quantity;
                itemPrices[itemCount] = price;
                finalTotal += price;
                itemCount++;
            }

            else if(option == 3) {
                groceries groc = new groceries();
                groc.grocerieslist();
                int quantity = groc.quantity;
                int productnum = groc.productnum;
                int price = groc.price;

                if(productnum == 31) {
                    itemNames[itemCount] = "Sugar";
                } else if(productnum == 32) {
                    itemNames[itemCount] = "Salt";
                } else if(productnum == 33) {
                    itemNames[itemCount] = "Wheat flour";
                }
                itemQuantities[itemCount] = quantity;
                itemPrices[itemCount] = price;
                finalTotal += price;
                itemCount++;
            }

            else {
                System.out.println("XXX INVALID CHOICE XXX");
            }

            System.out.println("");
            System.out.print("Do you want anything else? Press 1 for Yes / 0 for No: ");
            more = read.nextInt();
            System.out.println("");
    }
    // Display full bill
    NumberToWords no = new NumberToWords();
    System.out.println("------------------------------");
    System.out.println("System Genarated Bill: ");
    System.out.println(LocalDateTime.now());
    System.out.println("");
    for(int i = 0; i < itemCount; i++) {
        System.out.println("Item purchased    : " + itemNames[i]);
        System.out.println("Quantity (in Kgs) : " + itemQuantities[i]);
        System.out.println("Price             : Rs." + itemPrices[i]);
        System.out.println("------------------------------");
    }
    System.out.println("Total Price       : Rs." + finalTotal + " (" + no.convert(finalTotal) + ")");
    System.out.println("------------------------------");
    System.out.println("---Thank you! Visit again!---");
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
        } else if (number < 1000) {
            return ones[number / 100] + " Hundred" +
                   (number % 100 != 0 ? " and " + convert(number % 100) : "");
        } else if (number < 1000000) {
            return convert(number / 1000) + " Thousand" +
                   (number % 1000 != 0 ? (number % 1000 < 100 ? " and " : " ") + convert(number % 1000) : "");
        } else {
            return "Number too large";
        }
    }
}
