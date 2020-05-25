class mainClass{

    public static void main(String[] args){
        Remote remote = new Remote();

        Light light = new Light();
        Commands lightOn = new LightOn(light);
        Commands lightOff = new LightOff(light);
        remote.setCommand(1, lightOn, lightOff);
        System.out.println("\n<<< LIGHT >>>");
        remote.buttonPressed(1);
        remote.buttonPressed(1);
        remote.buttonPressed(2);
        remote.buttonPressed(2);

        System.out.println("\n<<< FAN >>>");
        Fan fan = new Fan();
        Commands fanOn = new FanOn(fan);
        Commands fanOff = new FanOff(fan);
        remote.setCommand(2, fanOn, fanOff);
        remote.buttonPressed(3);
        remote.buttonPressed(3);
        remote.buttonPressed(4);
        remote.buttonPressed(4);

        System.out.println("\n<<< A.C >>>");
        AirConditioner airConditioner = new AirConditioner();
        Commands acOn = new ACOn(airConditioner);
        Commands acOff = new ACOff(airConditioner);
        remote.setCommand(2, acOn, acOff);
        remote.buttonPressed(3);
        remote.buttonPressed(3);
        remote.buttonPressed(4);
        remote.buttonPressed(4);

        System.out.println("\n<<< Projector >>>");
        Projector projector = new Projector();
        Commands projectorOn = new ProjectorOn(projector);
        Commands projectorOff = new ProjectorOff(projector);
        remote.setCommand(3, projectorOn, projectorOff);
        remote.buttonPressed(5);
        remote.buttonPressed(5);
        remote.buttonPressed(6);
        remote.buttonPressed(6);

        System.out.println("\n<< Master Button Pressed >>");
        remote.buttonPressed(0);

        System.out.println("\n<< Master Button Pressed >>");
        remote.buttonPressed(0);

    }
}