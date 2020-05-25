class ACOn implements Commands {
    AirConditioner ac;

    ACOn(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.on();
    }
}