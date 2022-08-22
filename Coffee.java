public class Coffee{
    private int water;
    private int milk;
    private int coffeeBeans;
    private int cups;
    private int money;

    public Coffee(int water, int milk, int coffeeBeans, int cups, int money){
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.cups = cups;
        this.money = money;
    }

    public void addProducts(int water, int milk, int coffeeBeans, int cups){
        this.water += water;
        this.milk += milk;
        this.coffeeBeans += coffeeBeans;
        this.cups += cups;
    }

    public void makeCoffee(Coffee myCoffee){
        if(haveAllProducts(myCoffee)){
            System.out.println("\n... Su café ... ☕ \n");
            System.out.println("Gracias!\n");
            this.water -= myCoffee.water;
            this.milk -= myCoffee.milk;
            this.coffeeBeans -= myCoffee.coffeeBeans;
            this.cups -= myCoffee.cups;
            this.money += myCoffee.money;
        }
    }

    public boolean haveAllProducts(Coffee myCoffee) {
        if(this.water - myCoffee.water < 0 ||
        this.milk - myCoffee.milk < 0 ||
        this.coffeeBeans - myCoffee.coffeeBeans < 0 ||
        this.cups - myCoffee.cups == 0){
            System.out.println("No hay productos suficientes para este pedido");
            return false;
        }
        return true;        
    }

    public void cashClosing(){
        System.out.println("\nCierre de caja : " + money + "€ 💰\n");
        this.money = 0;
    }

    public void infoProducts(){
        System.out.println("#---------------------#");
        System.out.println("#  Stock en máquina   #");
        System.out.println("#---------------------#");
        System.out.println("> Agua : " + this.water + " ml");
        System.out.println("> Leche : " + this.milk + " ml");
        System.out.println("> Café : " + this.coffeeBeans + " gr");
        System.out.println("> Vasos : " + this.cups + " ud");
        System.out.println("> Dinero : " + this.money + " €");
        System.out.println("#---------------------#\n");
    }
    
}

class Espresso extends Coffee {
    public Espresso(){
        super(250,0,16,1,4);
    }
}

class Cappuccino extends Coffee {
    public Cappuccino(){
        super(200,100,20,1,6);
    }
    
}

class Latte extends Coffee {
    public Latte(){
        super(350,75,20,1,7);
    }
    
}