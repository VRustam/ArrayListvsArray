package Section12.Liste_InterFace;

import java.util.ArrayList;

public class ArrayListvsArray {
    public static void main(String[] args) {
        ArrayList<String> namesLists = new ArrayList<>();
        String[] namesArray= new String[5000000];

        long startTime = System.currentTimeMillis();
        for (int i=0;i<5000000;i++){
            namesArray[i]="test" + i;
        }
        long finishTime = System.currentTimeMillis();

        System.out.println("Isleme vaxti Array" + (finishTime -startTime));

        startTime = System.currentTimeMillis();
        for (int i=0; i<5000000;i++){
            namesLists.add("test" + i);
        }
        finishTime = System.currentTimeMillis();

        System.out.println("Isleme vaxti List" + (finishTime -startTime));

        startTime = System.currentTimeMillis();
        namesArray[100000]="yei test";
        finishTime = System.currentTimeMillis();
        System.out.println("Isleme vaxti Array" + (finishTime -startTime));
        startTime = System.currentTimeMillis();
        namesLists.add(100000,"yeni deyer 2");
        finishTime = System.currentTimeMillis();
        System.out.println("Isleme vaxti list" + (finishTime -startTime));
    }
}
