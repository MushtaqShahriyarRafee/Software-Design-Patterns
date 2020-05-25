class SimpleThread implements Runnable{

    String name;
    SimpleThread (String name){
        this.name = name;
    }

    public void run(){
        ChocolateBoiler boiler = ChocolateBoiler.getuniqObj();
        System.out.println(name + " " + boiler);
        boiler.fill();
    }
}