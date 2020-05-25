class FanOn implements Commands{
    Fan fan;
    FanOn(Fan fan){
        this.fan = fan;
    }
    @Override
    public void execute() {
        fan.on();
    }
}