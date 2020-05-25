class FanOff implements Commands{
    Fan fan;
    FanOff(Fan fan){
        this.fan = fan;
    }
    @Override
    public void execute() {
        fan.off();
    }
}