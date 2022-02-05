package dataType;

public class Variables {
        static int numGears =6;
        int cadence = 0;
        int speed = 0;
        int gear = 1;

    int changeChadence(Integer km, int time) {
        speed = km/time ;
        return speed;
    }

    public static void main(String[] args) {
        Variables output = new Variables();
        System.out.println(output.changeChadence(45, 45));

        }
    }
