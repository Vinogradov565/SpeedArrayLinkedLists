import java.util.ArrayList;
import java.util.LinkedList;

public class Task extends Randomize{
    int i = 0;
    public void array(){
        ArrayList<Integer> arr = new ArrayList<>();
        while (i <= 100000) {
            arr.add(random());
            i++;
        }

        i = 0;
        while (i <= 10000) {
            System.out.println(arr.get(randomHunT()));
            i++;
        }
    }
    public void linked() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        while (i <= 100000) {
            linkedList.add(random());
            i++;
        }

        i = 0;
        while (i <= 10000) {
            System.out.println(linkedList.get(randomHunT())+ " ");
            i++;
        }
    }
}