package com.codingwallahsir;
import java.util.*;

public class CollectionFramework {
    public static void main(String[] args) {

        //========================List=========================
        System.out.println("========================List=========================");
        //Ordered collection allows duplicate values
        //ArrayList -> Fast Support Multithreading
        //List<Integer> list = new ArrayList<>(); nothing wrong
        ArrayList<Integer> list = new ArrayList<>(); //but Good Practice
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(25);
        System.out.println(list);

        //LinkedList
        //List<Integer> list = new LinkedList<>(); nothing wrong
        LinkedList<Integer> linkedList = new LinkedList<>(); //but Good Practice
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(1,30);
        linkedList.add(2,25);
        System.out.println(linkedList);

        //Vector -> Same as ArrayList but not fast bcz of synchronized
        //block multithreading
        Vector<String> vector = new Vector<>();
        vector.add("5");
        vector.add("10");
        System.out.println(vector);

        //Stack extends Vector
        //Follows FILO/LIFO
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(15);
        stack.push(30);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack.peek());


        //========================Set=========================
        System.out.println("========================Set=========================");
        //Unordered collection does not allow duplicate values
        //HashSet
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(8);
        set.add(25);
        set.add(9);
        set.add(8);
        System.out.println(set);

        //LinkedHashSet -> Ordered collection does not allow duplicate values
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(2);
        linkedHashSet.add(2);
        linkedHashSet.add(10);
        System.out.println(linkedHashSet);

        //TreeSet -> Sorted does not allow duplicate values
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(9);
        treeSet.add(15);
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(5);
        System.out.println(treeSet);



        //========================Queue=========================
        // Follows FIFO, allows duplicate values
        System.out.println("========================Queue=========================");
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.offer(15);
        queue.offer(8);
        queue.add(10);
        //add can throw an exception but not in case of offer
        System.out.println(queue);
        queue.remove();
        //same remove can throw an exception, but not in case of poll
        //it will return null value if queue is empty
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());

        //ArrayQueue -> If we use normal queue as Class, then it can't work on both sides
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(1);
        q.offer(5);
        q.offerFirst(9);
        q.offerLast(8);
        System.out.println(q);

        //PriorityQueue -> Min Heap will come to first then no order follows
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(50);
        priorityQueue.offer(8);
        priorityQueue.offer(9);
        priorityQueue.offer(45);
        priorityQueue.offer(5);
        System.out.println(priorityQueue);

        // we can modify Min Heap / Max Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(50);
        pq.offer(8);
        pq.offer(9);
        pq.offer(45);
        pq.offer(5);
        System.out.println(pq);



        //========================Map=========================
        //HashMap
        System.out.println("========================Map=========================");
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("First",10);
        hashMap.put("Second",20);
        hashMap.put("Fifth",20);
        hashMap.put("Sixth",90);
        hashMap.put("Third",30);
        System.out.println(hashMap);

        //TreeMap ->It sorts the keys in alphabetical order
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("First",10);
        treeMap.put("Second",20);
        treeMap.put("Fifth",20);
        treeMap.put("Sixth",90);
        treeMap.put("Third",30);
        System.out.println(treeMap);



    }
}
