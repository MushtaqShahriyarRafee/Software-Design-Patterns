
class Light {
    boolean state;

    void on() {
        if (state == false) {
            System.out.println("Light is turned On..");
            state = true;
        } else {
            System.out.println("Light is already On..");
        }
    }

    void off() {
        if (state == true) {
            System.out.println("Light is turned Off..");
            state = false;
        } else {
            System.out.println("Light is already Off..");
        }
    }
}