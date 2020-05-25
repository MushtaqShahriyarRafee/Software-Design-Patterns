
class Main{
    public static void main(String[] args){
        //ChocolateBoiler boiler = ChocolateBoiler.getuniqObj();
        //ChocolateBoiler boiler2 = ChocolateBoiler.getuniqObj();
        // boiler.boil(); // can't boil

        // boiler.fill();
        // boiler2.fill(); // can't fill

        // boiler.drain(); // can't drain
        
        // boiler.boil();

        Thread t1 = new Thread(new SimpleThread("Thread >>> 1"));
        t1.start();
        try{
            Thread.sleep(1000);
        }catch(Exception e){}

        Thread t2 = new Thread(new SimpleThread("Thread >>> 2"));
        t2.start();
    }
}