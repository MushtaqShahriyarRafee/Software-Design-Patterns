import java.util.Random;

class ChocolateBoiler{
    private boolean empty, boiled;
    private static ChocolateBoiler uniqObj;

    public boolean isEmpty() { return empty;}
    public boolean isBoiled() { return boiled;}

    private int signature;

    public ChocolateBoiler(){

        System.out.println("Creating object:");
        try{
            Thread.sleep(3000);
        }catch(Exception e){}
        empty = true;
        boiled = false;

        Random rand = new Random();
        signature = rand.nextInt(100000000);

        System.out.println("Created:: " + this);
    }

    public static ChocolateBoiler getuniqObj(){
        if(uniqObj == null){
            synchronized(ChocolateBoiler.class){
                if(uniqObj == null){
                    System.out.println("Creating from block >>");
                    uniqObj = new ChocolateBoiler();
                }
            }
        }
        return uniqObj;
    }

    public synchronized String toString(){
        return "Boiler<"+signature+">";
    }

    public synchronized void fill(){
        if(isEmpty()){
            System.out.println(this+"filling chocolate and milk");
            empty = false;
            boiled = false;
        }
        else{
            System.out.println(this+"Can't fill: Boiler not empty");
        }
    }

    public synchronized void boil(){
        if(!isEmpty() && !isBoiled()){
            System.out.println(this+"0o.o0 boiling chocolate and milk");
            boiled = true;
        }
        else{
            if(isEmpty()) System.out.println(this+"Can't boil: Boiler is empty");
            else System.out.println(this+"Can't boil: Already boiled");
        }
    }

    public synchronized void drain(){
        if(!isEmpty() && isBoiled()){
            System.out.println(this+"Draining chocolate bars");
            empty = true;
        }
        else{
            if(isEmpty()) System.out.println(this+"Can't drain: Boiler is empty");
            else System.out.println(this+"Can't drain: Not boiled yet");
        }
    }
}