class Remote {
    Commands[] slot = new Commands[7];

    void setCommand(int index, Commands cmd) {
        slot[index] = cmd;
    }

    void setCommand(int pair_no, Commands cmdOn, Commands cmdOff){
        int first  = 2*pair_no - 1;
        int second = first+1;
        slot[first] = cmdOn;
        slot[second] = cmdOff;
    }

    void buttonPressed(int index) {
        if (index == 0) {
            masterButtonPressed();
        }
        else slot[index].execute();
    }

    int master_state = 0;

    void masterButtonPressed() {
        master_state^=1;
        for(int i=master_state; i<slot.length;i+=2){
            if(! (slot[i]==null))
                slot[i].execute();
        }
    }
}