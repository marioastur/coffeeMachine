import java.util.Scanner;

class coffeeMachine{
    static Coffee myCoffee = new Coffee(1000,1000,1000,100,0);

    public static void main(String[] args){
        userMenu();
    }

    public static void userMenu(){
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("#---------------------#");
        System.out.println("# COFFEE JAVA MACHINE #");
        System.out.println("#---------------------#");
        System.out.println("# 1 - Café Espresso   #");
        System.out.println("# 2 - Café Cappuccino #");
        System.out.println("# 3 - Café Latte      #");
        System.out.println("#---------------------#");
        System.out.println("# 4 - Mantenimiento   #");
        System.out.println("#---------------------#");
        System.out.print("Opción...");
        int userOption = keyBoard.nextInt();

        switch (userOption) {
            case 1:
                Coffee myEspresso = new Espresso();
                myCoffee.makeCoffee(myEspresso);
                userMenu();
                break;
            
            case 2:
                Coffee myCappuccino = new Cappuccino();
                myCoffee.makeCoffee(myCappuccino);
                userMenu();
                break;
            
            case 3:
                Coffee myLatte = new Latte();
                myCoffee.makeCoffee(myLatte);
                userMenu();
                break;
            
            case 4:
                maintenanceMenu();
                break;
            
            default:
                System.out.println("Opción no definida...");
                userMenu();
                break;
        }
    }

    public static void maintenanceMenu(){
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("#---------------------#");
        System.out.println("# COFFEE JAVA MACHINE #");
        System.out.println("#--- mantenimiento ---#");
        System.out.println("# 1 - Información     #");
        System.out.println("# 2 - Recargas        #");
        System.out.println("# 3 - Caja            #");
        System.out.println("#---------------------#");
        System.out.println("# 4 - Menu Usuario    #");
        System.out.println("#---------------------#");
        System.out.print("Opción...");
        int userOption = keyBoard.nextInt();

        switch (userOption) {
            case 1:
                myCoffee.infoProducts();
                maintenanceMenu();
                break;
            
            case 2:
                addProductMenu();
                maintenanceMenu();
                break;
            
            case 3:
                myCoffee.cashClosing();
                maintenanceMenu();
                break;

            case 4:
                userMenu();
                break;
            
            default:
                System.out.println("Opción no definida...");
                maintenanceMenu();
                break;
        }

    }

    public static void addProductMenu(){
        Scanner keyBoard = new Scanner(System.in);
        int addWater, addMilk, addCoffee, addCups = 0;
        System.out.println("#---------------------#");
        System.out.println("#  AÑADIR PRODUCTOS   #");
        System.out.println("#--- mantenimiento ---#");
        System.out.print("Agua...");
        addWater = keyBoard.nextInt();
        System.out.print("Leche...");
        addMilk = keyBoard.nextInt();
        System.out.print("Café...");
        addCoffee = keyBoard.nextInt();
        System.out.print("Vasos...");
        addCups = keyBoard.nextInt();

        myCoffee.addProducts(addWater, addMilk, addCoffee, addCups);

    }
}