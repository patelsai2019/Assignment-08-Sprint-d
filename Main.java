public class Main {

    public static void main(String[] args) {

        calcCapacity(8,3,40);
        calcCapacity(9,3,40);
        calcCapacity(10,3,40);
        calcCapacity(11,3,40);
        calcCapacity(8,4,40);
        calcCapacity(8,5,40);
        calcCapacity(8,6,40);

        calcCapacity(8,3,35);
        calcCapacity(9,3,35);
        calcCapacity(10,3,35);
        calcCapacity(11,3,35);
        calcCapacity(8,4,35);
        calcCapacity(8,5,35);
        calcCapacity(8,6,35);

        calcCapacity(8,3,30);
        calcCapacity(9,3,30);
        calcCapacity(10,3,30);
        calcCapacity(11,3,30);
        calcCapacity(8,4,30);
        calcCapacity(8,5,30);
        calcCapacity(8,6,30);
    }


    public static void calcCapacity(int devs, int weeks, int hrs) {
        double effort = 100+50+20+360+80+160+500+240+40+40;
        double cap = (effort / (devs * weeks * hrs))*100;
        System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %d%% of capacity.\n",devs,weeks,hrs,(int)(cap));
    }
}
