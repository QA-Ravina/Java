package Collections;

import java.util.LinkedList;
import java.util.Queue;


public class Queue_Interface {

    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();

        que.add(22);
        que.offer(9);

        for (Integer q : que){
            System.out.println(q);
        }
    }
}
