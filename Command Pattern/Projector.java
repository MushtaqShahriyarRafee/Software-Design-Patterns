
class Projector {
    boolean state;

    void on() {
        if (state == false) {
            System.out.println("Projector is turned On..");
            state = true;
        } else {
            System.out.println("Projector is already On..");
        }

    }

    void off() {
        if (state == true) {
            System.out.println("Projector is turned Off..");
            state = false;
        } else {
            System.out.println("Projector is already Off..");
        }
    }
}