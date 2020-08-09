package DequeBasic;

import java.util.*;

public class Basic {
    public static void display(){

//////////////////////////////////////////////////////////////////////////////////////
///////////////////////// All Data Type /////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////


// ArrayDeque:
        // Deque myArrayDeque = new ArrayDeque<>();

// LinkedList:
        // Deque myLinkedListDeque = new LinkedList<>();


        Deque myVector = new LinkedList();
        myVector.add("Tuhin");
        myVector.add(23);
        myVector.add(3.1416);
        myVector.add('c');
        myVector.add(true);

        System.out.println(myVector);


///////////////////////////////////////////////////////////////////////////////////
////////////////////////// Specific Data type //////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////


// ArrayDeque:
        // Deque<Byte> byteArrayDeque = new ArrayDeque<>();
        // Deque<Boolean> booleanArrayDeque = new ArrayDeque<>();
        // Deque<Character> charArrayDeque = new ArrayDeque<>();
        // Deque<Short> shortArrayDeque = new ArrayDeque<>();
        // Deque<Long> longArrayDeque = new ArrayDeque<>();
        // Deque<String> myArrayDeque = new ArrayDeque<>();
        // Deque<Integer> integerArrayDeque = new ArrayDeque<>();
        // Deque<Float> floatArrayDeque = new ArrayDeque<>();
        // Deque<Double> doubleArrayDeque = new ArrayDeque<>();

// LinkedList:
        // Deque<Byte> byteLLDeque = new LinkedList<>();
        // Deque<Boolean> booleanLLDeque = new LinkedList<>();
        // Deque<Character> charLLDeque = new LinkedList<>();
        // Deque<Short> shortLLDeque = new LinkedList<>();
        // Deque<Long> longLLDeque = new LinkedList<>();
        // Deque<String> myLLDeque = new LinkedList<>();
        // Deque<Integer> integerLLDeque = new LinkedList<>();
        // Deque<Float> floatLLDeque = new LinkedList<>();
        // Deque<Double> doubleLLDeque = new LinkedList<>();


// First Way:
        Deque<String> myList = new LinkedList<>();    // or new LinkedList/ArrayDeque<>();

        String[] myArray3 = new String[] {"one", "two", "three"};
        myList.addAll(Arrays.asList(myArray3));

// Second Way:
        Deque<String> myList1 = new LinkedList<>(Arrays.asList("one", "two", "three"));    // or new LinkedList/ArrayDeque<>();

// Third Way:
        String[] myArray = new String[] {"one", "two", "three"};
        Deque<String> myList2 = new LinkedList<>(Arrays.asList(myArray));    // or new LinkedList/ArrayDeque<>();





// String:

        String a[] = new String[] { "A", "B", "C", "D" };
        String d[] = new String[] { "I", "O"};

        // First
        Deque<String> list1 = new LinkedList<>(Arrays.asList("A", "B", "C"));
        System.out.println(list1);

        // Second:
        Deque<String> list2 = new LinkedList<>();

        list2.addAll(Arrays.asList(a));
        list2.addAll(Arrays.asList(d));
        System.out.println("String list is: " +list2);

        // Third:
        Deque<String> list3 = new LinkedList<>(Arrays.asList(a));

        list3.addAll(Arrays.asList(d));
        System.out.println("String list is: " +list3);


// Integer:

        Integer[] myInteger1 = new Integer[] { 10, 20, 30, 40 };
        Integer[] myInteger2 = new Integer[] { 1, 2, 3};

        // First
        Deque<Integer> list4 = new LinkedList<>(Arrays.asList(23, 2323, 34));
        System.out.println(list4);

        // Second:
        Deque<Integer> list5 = new LinkedList<>();

        list5.addAll(Arrays.asList(myInteger1));
        list5.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + list5);

        // Third:
        Deque<Integer> list6 = new LinkedList<>(Arrays.asList(myInteger1));

        list6.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + list6);


// Float:

        Float myFloat1[] = new Float[]{3.4f, 5.3f, 11.44f};
        Float myFloat2[] = new Float[]{66.32f, 53.3f};

        // First
        Deque<Float> list7 = new LinkedList<>(Arrays.asList(4.34f, 656.23f));
        System.out.println(list7);

        // Second:
        Deque<Float> list8 = new LinkedList<>();

        list8.addAll(Arrays.asList(myFloat1));
        list8.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ list8);

        // Third:
        Deque<Float> list9 = new LinkedList<>(Arrays.asList(myFloat1));

        list9.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ list9);


// Character:

        Character myCharacter[] = new Character[]{'A', 'E', 'I', 'O', 'U'};
        Deque<Character> list10 = new LinkedList<>(Arrays.asList(myCharacter));
        System.out.println("Character list is: " + list10);

// Boolean:

        Boolean[] myBoolean = new Boolean[]{false, false, true, false};
        Deque<Boolean> list11 = new LinkedList<>();
        list11.addAll(Arrays.asList(myBoolean));
        System.out.println("Boolean list is: " + list11);

// Double:

        Double myDouble[] = new Double[]{44.34d, 656.34d, 3.232d};
        Deque<Double> list12 = new LinkedList<>(Arrays.asList(myDouble));
        System.out.println("Double list is: " + list12);
    }
}

