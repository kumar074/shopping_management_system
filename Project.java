import java.util.ArrayList;
import java.util.Scanner;

class Project {
    private static final String[] ids = {"kumar", "pratyush", "mousam", "jay", "liku", "jyoti"};
    private static final String[] passwords = {"kumar@2004", "pratyush@2003", "mousam@2003", "jay@2004","liku@2003", "jyoti@2000"};

    // ANSI escape codes for different colors
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vrid, passkey;
        boolean exit = false;

        // Validate user ID and password
        do {
            System.out.print("Enter your ID: ");
            vrid = sc.nextLine();

            System.out.print("Enter your Password: ");
            passkey = sc.nextLine();

            if (!isValidCredentials(vrid, passkey)) {
                System.out.println(ANSI_PURPLE + "Invalid ID or Password! Please try again." + ANSI_RESET);
            }
        } while (!isValidCredentials(vrid, passkey));

        System.out.println("                                                ");
        System.out.println(ANSI_GREEN + "User Login Successful" + ANSI_RESET);

        System.out.println("                                                  ");
        // Print welcome message in blue color
        System.out.println(ANSI_BLUE + "Welcome to SUIIT_Mart" + ANSI_RESET);

        ArrayList<String> selectedClothes = new ArrayList<>();
        ArrayList<String> selectedFood = new ArrayList<>();
        ArrayList<String> selectedElectronics = new ArrayList<>();

        double clothesTotal = 0.0;
        double foodTotal = 0.0;
        double electronicsTotal = 0.0;

        // Loop to allow selecting items from multiple groups
        while (!exit) {
            System.out.println("                                                                                                         ");
            System.out.println(ANSI_CYAN + "Click 1 For Clothes, Click 2 For Food, Click 3 For Electronics, or 0 to Exit: " + ANSI_RESET);
            int group = sc.nextInt();

            switch (group) {
                case 1:
                    while (true) {
                        System.out.println(ANSI_CYAN + "Customize Your Wearable :>" + ANSI_RESET);
                        // Call method to handle clothes selection
                        System.out.println("                                                                                                                                                                                                                       ");
                        System.out.println("Click '1' for T-Shirt > MRP-1500.00/-, Click '2' for Shirt > MRP-1000.00/-, \n" +
                                "Click '3' for Jeans pant > MRP-2300.00/, Click '4' for Shoes > MRP-4000.00/-,\n" +
                                " Click '5' for Belt > MRP-700.00/-, Click '6' For Exiting..");
                        int Scloth = sc.nextInt();

                        switch (Scloth) {
                            case 1:
                                selectedClothes.add("T-Shirt");
                                clothesTotal += 1500.0;
                                break;
                            case 2:
                                selectedClothes.add("Shirt");
                                clothesTotal += 1000.0;
                                break;
                            case 3:
                                selectedClothes.add("Jeans pant");
                                clothesTotal += 2300.0;
                                break;
                            case 4:
                                selectedClothes.add("Shoes");
                                clothesTotal += 4000.0;
                                break;
                            case 5:
                                selectedClothes.add("Belt");
                                clothesTotal += 700.0;
                                break;
                            case 6:
                                System.out.println(ANSI_GREEN + "Exiting Clothes Selection..." + ANSI_RESET);
                                System.out.println("Selected Clothes: " + selectedClothes);
                                System.out.println("Total Clothes MRP: " + clothesTotal);
                                break;
                            default:
                                System.out.println(ANSI_PURPLE + "Invalid Input.. T_T " + ANSI_RESET);
                                break;
                        }
                        if (Scloth == 6) {
                            break; // Exit the clothes selection loop if the user chooses to exit
                        }
                    }
                    break;

                case 2:
                    while (true) {
                        System.out.println(ANSI_CYAN + "What Do You Want To Eat ? :)" + ANSI_RESET);
                        // Call method to handle food selection
                        System.out.println("                                                                                                                                                                                             ");
                        System.out.println("Click '1' for Pizza > MRP-250.00/-, Click '2' for Sandwich > MRP-50.00/-,\n" +
                                " Click '3' for Ice Cream > MRP-40.00/\n,Click '4' For Cold Drinks > MRP-15.00/-, \n" +
                                " Click '5' to Exit Food Selection.");
                        int Sfood = sc.nextInt();

                        switch (Sfood) {
                            case 1:
                                selectedFood.add("Pizza");
                                foodTotal += 250.0;
                                break;
                            case 2:
                                selectedFood.add("Sandwich");
                                foodTotal += 50.0;
                                break;
                            case 3:
                                selectedFood.add("Ice Cream");
                                foodTotal += 40.0;
                                break;
                            case 4:
                                selectedFood.add("Cold Drinks");
                                foodTotal += 15.0;
                                break;
                            case 5:
                                System.out.println(ANSI_GREEN + "Exiting Food Selection..." + ANSI_RESET);
                                System.out.println("Selected Food: " + selectedFood);
                                System.out.println("Total Food MRP: " + foodTotal);
                                break;
                            default:
                                System.out.println(ANSI_PURPLE + "Invalid Input.. T_T " + ANSI_RESET);
                                break;
                        }
                        if (Sfood == 5) {
                            break; // Exit the food selection loop if the user chooses to exit
                        }
                    }
                    break;

                case 3:
                    while (true) {
                        System.out.println(ANSI_CYAN + "Discover Your Next Tech Upgrade ~ :}" + ANSI_RESET);
                        // Call method to handle electronics selection
                        System.out.println("                                                                                                                                                                                                 ");
                        System.out.println("Click '1' for Mobile > MRP-20000.00/-, Click '2' for Laptop > MRP-50000.00/-, Click '3' for Smart Tv > MRP-19000.00/-\n,Click '4' For Speaker > MRP-8000.00/-,  Click '5' to Exit Tech Selection.");
                        int Stech = sc.nextInt();

                        switch (Stech) {
                            case 1:
                                selectedElectronics.add("Mobile");
                                electronicsTotal += 20000.0;
                                break;
                            case 2:
                                selectedElectronics.add("Laptop");
                                electronicsTotal += 50000.0;
                                break;
                            case 3:
                                selectedElectronics.add("Smart Tv");
                                electronicsTotal += 19000.0;
                                break;
                            case 4:
                                selectedElectronics.add("Speaker");
                                electronicsTotal += 8000.0;
                                break;
                            case 5:
                                System.out.println(ANSI_GREEN + "Exiting Tech Selection..." + ANSI_RESET);
                                System.out.println("Selected Electronics: " + selectedElectronics);
                                System.out.println("Total Electronics MRP: " + electronicsTotal);
                                break;
                            default:
                                System.out.println(ANSI_PURPLE + "Invalid Input.. T_T " + ANSI_RESET);
                                break;
                        }
                        if (Stech == 5) {
                            break; // Exit the tech selection loop if the user chooses to exit
                        }
                    }
                    break;

                case 0:
                    System.out.println("Your Selected Items : \n" + selectedClothes + "\n" + selectedFood + "\n" + selectedElectronics);
                    double totalCost = clothesTotal + foodTotal + electronicsTotal;
                    System.out.println(ANSI_BLUE + "Your Total MRP: " + totalCost + ANSI_RESET);
                    exit = true;
                    break;

                default:
                    System.out.println(ANSI_PURPLE + "Invalid input" + ANSI_RESET);
                    break;
            }
        }
        System.out.println("                                                                                                        ");
        System.out.println(ANSI_CYAN + "How Would You Like To Pay $_$ : " +
                "\nO For Pay In Cash, Press Any Number to Pay Online " + ANSI_RESET);
        int pay = sc.nextInt();
        if (pay == 0) {
            System.out.println(ANSI_GREEN + "Give It To The Cashier " + ANSI_RESET);
        } else {
            System.out.println("Pay Online to This Number :- 7873500213");
        }
        System.out.println("      +                                                                                    ");
        System.out.println(ANSI_BLUE + "Thanks For Visiting " +
                "\nHave A Good Day ^_^ \nPlease Visit Again.." + ANSI_RESET);

        sc.close();
    }

    // Method to validate user ID and password
    private static boolean isValidCredentials(String id, String password) {
        for (int i = 0; i < ids.length; i++) {
            if (ids[i].equals(id) && passwords[i].equals(password)) {
                return true;
            }
        }
        return false;
    }
}
