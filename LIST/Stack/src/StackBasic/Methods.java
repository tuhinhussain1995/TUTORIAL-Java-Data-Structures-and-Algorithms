package StackBasic;

import java.util.*;

public class Methods {
    public static void display(){
        Stack<Integer> numbers = new Stack<>();        // or   Stack numbers = new Stack();

// o=object, e=element, c=collection, a=array, i=index

        // Stack =============================================================================================================>
                        // =======> Stack<Type> myStack = new Stack<>();
                        // =======> Stack myStack = new Stack<>();
                        // =======> Stack<Object> myStack=new Stack<Object>();

                // push(e) ----------------- inserted item data type ==> add new item at last position at the Stack.
                // pop() ------------------- last item data type ======> remove and get the last element of the Stack.
                // peek()------------------- last item data type ======> get the last element of the Stack
                // empty() ----------------- boolean ==================> check if the Stack is empty or not.
                // search(o) --------------- int ======================> search the element and get the distance from last to first.
                // clone()  ---------------- List =====================> Creates a new list with the same element, size, and capacity.

// Stack extends Vector.....................................................................................

        // java.util.Vector ============================================================================================================>

                // copyInto(o)  ------------- void ====================> copy the Stack and make a new Array.
                // trimToSize() ------------- void ====================> change the item storing capacity to Stack's own size
                // removeElementAt(i) ------- void ====================> remove an element from the Stack by following index number.
                // insertElementAt(o, i) ---- void ====================> insert an element into Stack by following index number.
                // setSize(o) --------------- void ====================> set the new size of a Stack.
                // capacity()  -------------- int =====================> total element storing capacity of a Stack.
                // ensureCapacity(o)  ------- void ====================> increase or decrease the element storing capacity of a Stack.
                // elements() --------------- element data type =======> Creating an empty enumeration to store in it.
                // elementAt(i) ------------- indexed item data type ==> get the element from the Stack.
                // firstElement() ----------- element data type =======> get the first element from the Stack.
                // lastElement() ------------ element data type =======> get the last element from the Stack.
                // setElementAt(o, i) ------- void ====================> change an existing element of the Stack by following the index number.
                // removeElement(o) --------- boolean =================> remove an element from the Stack.
                // removeAllElements() ------ void ====================> remove all element from the Stack.
                // removeElementAt(i) ------- void ====================> remove an element from the Stack by following the index number.
                // addElement(o) ------------ void ====================> add new element at the last position of the Stack.
                // indexOf(o, start i) ------ int =====================> return the exact index number of an element. (from start i it starts searching)
                // lastIndexOf(o, start i) -- int =====================> return the exact index number of an element. (From start i it starts searching)


        // java.util.List ================================================================================================>

                // add(i, e) --------------- void     =================> add single element to the list by following index number
                // addAll(i, c) ------------ boolean  =================> add all element to the list by following index number.
                // get(i) ------------------ item data type  ==========> get element by following index number
                // set(i, e) --------------- previous item data type ==> change element by following index number
                // listIterator() ---------- listIterator =============> iterate the list item
                // listIterator(i) --------- listIterator =============> iterate the list item by following index number
                // remove(i) --------------- removed item data type ===> remove element from list by following index number.
                // indexOf(o) -------------- int  =====================> print the exact index of the object
                // lastIndexOf(o) ---------- int ======================> print the exact index number of last object(multiple object can be same).
                // subList(start i, end i) - list =====================> copy the list by following stating and ending index number.


        // java.util.Collection ===============================================================================>

                // size() ----------------- int ======================> size of the list, set, queue.
                // isEmpty()--------------- boolean ==================> check is the list is empty or not.
                // contains(o)------------- boolean ==================> check if the element is exist inside of the list or not.
                // iterator()-------------- iterator =================> iterate the list item
                // toArray()--------------- array ====================> convert List to array
                // toArray([])------------- array ====================> convert List to Array
                // add(e)------------------ boolean  =================> add single element to the list
                // remove(o)--------------- boolean  =================> remove element from list by following object.
                // containsAll(c)---------- boolean ==================> check if the item collections is exist inside the list or not.
                // addAll(c)--------------- boolean  =================> add all element to the list
                // removeAll(c) ----------- boolean  =================> remove all elements from list, that is similar.
                // removeIf(filter) ------- boolean  =================> remove the element by using filter
                // retainAll(c)------------ boolean  =================> remove all elements that is not similar.
                // clear()----------------- void =====================> remove all the elements from the list and make it empty.
                // equals(o)--------------- boolean ==================> check if two list is equal or not.
                // toString()  ------------ String ===================> return ArrayList as String.
                // hashCode()-------------- int  =====================> create a hash code
                // Spliterator() ---------- Spliterator ==============> Creates a Spliterator over the elements in this collection.
                // Stream() --------------- Stream ===================> Returns a sequential Stream with this collection as its source.
                // parallelStream() ------- Stream ===================> Returns a possibly parallel Stream with this collection as its source.
                // Spliterator() ---------- Spliterator ==============> Creates a Spliterator over the elements in this collection.
        

        // java.lang.Iterable:
                // forEach(action) --------- void =====================> use for(java.util.Objects myVar : myList){}


        // Collections:
                // sort(list) -------------- void   ===================> arrange the list following ascending order.
                // replaceAll(list, find, replace) ---- void ==========> replace all the item of the list.
                // min() ------- inserted data type ========> find the minimum value
                // max() ------ inserted data type =========> find the maximum value
                // shuffle()  ------- void ==========> used to destroy any kind of order present in the data structure. It does just the opposite of the sorting.
                // reverse() --------- void ===========> reverses the order of elements
                // copy() ----------- void ============> creates a copy of elements from the specified source to destination
                // binarySearch() ------ int =========> searches for the specified element. It returns the position of the element in the specified collections. If not found return -1.
                // frequency() ------ int =========> returns the count of the number of times an element is present in the collection
                // disjoint() -------- boolean ========> checks if two collections contain some common element
                // indexOfSubList() --------- int ==============> Returns the starting position of the first occurrence of the specified target list.
                // lastIndexOfSubList() -------- int =============> Returns the starting position of the last occurrence of the specified target list.
                // fill() --------- void ==========> replace every element in a collection with the specified value




/////////////////////////////////////////////////////////////////////////////////////
/////////////////////// Stack<Type> numbers = new Stack<>(); ////////////////////////
/////////////////////// Stack numbers = new Stack<>(); /////////////////////////////
/////////////////////// Stack<Object> myStack=new Stack<Object>(); //////////////////
/////////////////////////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////// java.util.Stack //////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////
        
        numbers.add(34);
        numbers.add(56);
        numbers.add(6565);
        numbers.add(4);
        numbers.add(223);
        
// push(e) ----------------- inserted item data type ==> add new item at last position at the Stack.
        numbers.push(53);
        numbers.push(3434);


        Stack asd2 = new Stack<>();
        asd2.addAll(Arrays.asList(34, "Tuhin", 'A', 3.1316));
        asd2.push("Nazrul");
        asd2.push(true);


// pop() ------------------- last item data type ======> remove and get the last element of the Stack.
        int myNum = numbers.pop();
        System.out.println(myNum);

        System.out.println(asd2.pop());
        System.out.println(asd2.pop());
        
        
// peek()------------------- last item data type ======> get the last element of the Stack
        int adfa = numbers.peek();
        System.out.println(adfa);

        System.out.println(asd2.peek());
        System.out.println(asd2.peek());
        
        
// empty() ----------------- boolean ==================> check if the Stack is empty or not.
        boolean mybol = numbers.empty();
        System.out.println(mybol);

        Stack myNewStack = new Stack();
        System.out.println(myNewStack.empty());
        
        
// search(o) --------------- int ======================> search the element and get the distance from last to first.
        int er = numbers.search(34);
        System.out.println(er);

        int er1 = asd2.search("Tuhin");
        System.out.println(er1);

        System.out.println(asd2.search('B'));


// clone()  ---------------- List =====================> Creates a new list with the same element, size, and capacity.
        Stack mAL9 = (Stack) numbers.clone();

        System.out.println(mAL9);
        

///////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////// java.util.Vector //////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////
        
        numbers.add(34);
        numbers.add(56);
        numbers.add(6565);
        numbers.add(4);
        numbers.add(223);

// copyInto(o)  ------------- void ====================> copy the Stack and make a new Array.
        Integer[] myIntArr = new Integer[numbers.size()];

        numbers.copyInto(myIntArr);

        System.out.println(Arrays.toString(myIntArr));


// trimToSize() ------------- void ====================> change the item storing capacity to Stack's own size
        System.out.println(numbers.capacity());

        numbers.trimToSize();
        System.out.println(numbers.capacity());


// removeElementAt(i) ------- void ====================> remove an element from the Stack by following index number.
        numbers.removeElementAt(4);
        numbers.removeElementAt(2);


// setSize(o) --------------- void ====================> set the new size of a Stack.
        System.out.println(numbers.size());

        numbers.setSize(78);
        System.out.println(numbers.size());


// insertElementAt(o, i) ---- void ====================> insert an element into Stack by following index number.
        numbers.insertElementAt(23, 12);
        numbers.insertElementAt(545, 3);


// capacity()  -------------- int =====================> total element storing capacity of a Stack.
        // Stack default capacity is 10.
        System.out.println("Minimum capacity: " + numbers.capacity());

        numbers.ensureCapacity(28);
        System.out.println("New Minimum capacity: " + numbers.capacity());


// ensureCapacity(o)  ------- void ====================> increase or decrease the element storing capacity of a Stack.
        // Stack default capacity is 10.
        System.out.println("Minimum capacity: " + numbers.capacity());

        numbers.ensureCapacity(28);
        System.out.println("New Minimum capacity: " + numbers.capacity());



// elements() --------------- element data type =======> Creating an empty enumeration to store in it.
        Enumeration enu = numbers.elements();

        while (enu.hasMoreElements()) {
            System.out.println(enu.nextElement());
        }


// elementAt(i) ------------- indexed item data type ==> get the element from the Stack.
        numbers.elementAt(3);
        numbers.elementAt(34);


// firstElement() ----------- element data type =======> get the first element from the Stack.
        System.out.println(numbers.firstElement());

        Stack<String> myVect = new Stack<>();
        myVect.addAll(Arrays.asList("A", "B", "C"));

        System.out.println(myVect.firstElement());


// lastElement() ------------ element data type =======> get the last element from the Stack.
        System.out.println(numbers.lastElement());

        Stack<String> myVect3 = new Stack<>();
        myVect3.addAll(Arrays.asList("A", "B", "C"));

        System.out.println(myVect3.lastElement());


// setElementAt(o, i) ------- void ====================> change an existing element of the Stack by following the index number.
        numbers.setElementAt(3, 12);
        numbers.setElementAt(1333, 34);


// removeElement(o) --------- boolean =================> remove an element from the Stack.
        numbers.removeElement(1333);
        numbers.removeElement(3);

        Stack<String> myVect4 = new Stack<>();
        myVect4.addAll(Arrays.asList("A", "B", "C"));

        System.out.println(myVect4.removeElement("B"));


// removeElementAt(i) ------- void ====================> remove an element from the Stack by following the index number.
        numbers.removeElementAt(3);
        numbers.removeElementAt(34);


// removeAllElements() ------ void ====================> remove all element from the Stack.
        numbers.removeAllElements();


// addElement(o) ------------ void ====================> add new element at the last position of the Stack.
        numbers.addElement(55);
        numbers.addElement(3434);


// indexOf(o, start i) ------ int =====================> return the exact index number of an element. (from start i it starts searching)
        System.out.println(numbers.indexOf(34, 2));

        Integer ad = numbers.indexOf(34, 3);
        System.out.println(ad);


// lastIndexOf(o, start i) -- int =====================> return the exact index number of an element. (From start i it starts searching)
        System.out.println(numbers.lastIndexOf(34, 0));

        ad = numbers.lastIndexOf(34, 1);
        System.out.println(ad);




///////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////// java.util.List ///////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////
        numbers.add(34);
        numbers.add(56);
        numbers.add(6565);

// add(i, e) --------------- void     =================> add single element to the list by following index number
        System.out.println(numbers);

        numbers.add(1, 1111);
        numbers.add(2, 6666);

        System.out.println(numbers);


// addAll(i, c) ------------ boolean  =================> add all element to the list by following index number.
        Stack<Integer> newIntLis = new Stack<>();
        newIntLis.addAll(Arrays.asList(123, 456));

        numbers.addAll(0, newIntLis);

        System.out.println(numbers);


        Stack<Integer> newLs = new Stack<>();
        newLs.addAll(Arrays.asList(123, 456));

        numbers.addAll(0, newLs);

        System.out.println(numbers);


// get(i) ------------------ item data type  ==========> get element by following index number
        System.out.println(numbers.get(2));
        System.out.println(numbers.get(5));

        int a = numbers.get(6);
        System.out.println(a);

        for(int i=0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }


// set(i, e) --------------- previous item data type ==> change element by following index number
        numbers.set(0, 1111);
        System.out.println(numbers);

        numbers.set(3, 9999);
        System.out.println(numbers);


// listIterator() ---------- listIterator =============> iterate the list item
        ListIterator<Integer> listItr = numbers.listIterator();
        System.out.println("ListIterator");

        while (listItr.hasNext()){
            System.out.println(listItr.next());
        }

        while(listItr.hasPrevious()){
            System.out.println(listItr.previous());
        }


// listIterator(start i) --- listIterator =============> iterate the list item by following start index number
        ListIterator<Integer> listItr2 = numbers.listIterator(3);
        System.out.println("ListIterator");

        while (listItr2.hasNext()){
            System.out.println(listItr2.next());
        }

        while(listItr2.hasPrevious()){
            System.out.println(listItr2.previous());
        }


// remove(i) --------------- removed item data type ===> remove element from list by following index number.
        numbers.remove(3);
        System.out.println(numbers);

        int b = numbers.remove(2);
        System.out.println(b);



        Stack<String> myAL = new Stack<>();
        myAL.addAll(Arrays.asList("A", "B", "C", "D", "E"));
        myAL.remove("B");
        myAL.remove(2);


// indexOf(o) -------------- int  =====================> print the exact index of the object
        System.out.println(numbers.indexOf(9999));


        Stack<String> mll5 = new Stack<>();
        mll5.addAll(Arrays.asList("A", "C", "D", "A", "D", "C", "B"));

        int ac = mll5.indexOf("D");
        System.out.println(ac);


// lastIndexOf(o) ---------- int ======================> print the exact index number of last object(multiple object can be same).
        System.out.println(numbers.lastIndexOf(20));


        Stack<String> mll9 = new Stack<>();
        mll9.addAll(Arrays.asList("A", "C", "D", "A", "D", "C", "B"));

        int acc = mll5.lastIndexOf("A");
        System.out.println(acc);


// subList(start i, end i) - list =====================> copy the list by following stating and ending index number.
        Stack<String> mAL8 = new Stack<>();
        mAL8.addAll(Arrays.asList("A", "B", "C", "D", "E", "F"));

        System.out.println(numbers);

        Stack<String> myList3 = new Stack<>();
        myList3.addAll(mAL8.subList(1, 4));
        System.out.println(myList3);



//////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////// java.util.Collection  //////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////


// size() ----------------- int ======================> size of the list, set, queue.
        System.out.println("Stack size: "+ numbers.size());

        int myInt2 = numbers.size();
        System.out.println(myInt2);


// isEmpty()--------------- boolean ==================> check is the list is empty or not.
        boolean check = numbers.isEmpty();
        System.out.println(check);

        Stack<String> myStringList = new Stack<>();
        System.out.println(myStringList.isEmpty());


// contains(o)------------- boolean ==================> check if the element is exist inside of the list or not.
        boolean myBool = numbers.contains(9999);
        System.out.println(myBool);


// iterator()-------------- iterator =================> iterate the list item
        Iterator<Integer> miter = numbers.iterator();
        while (miter.hasNext()){
            System.out.println(miter.next());
        }


// toArray()--------------- array ====================> convert List to array
        java.lang.Object[] myNewList = numbers.toArray();

        System.out.println(myNewList);


// toArray([])------------- array ====================> convert List to Array
        Integer[] myInt9 = new Integer[numbers.size()];
        myInt9 = numbers.toArray(myInt9);
        System.out.println("toArray: "+ Arrays.toString(myInt9));


// add(e)------------------ boolean  =================> add single element to the list
        numbers.add(110);
        numbers.add(230);
        numbers.add(1);
        numbers.add(0);

        System.out.println(numbers);


// remove(o)--------------- boolean  =================> remove element from list by following object.
        Stack anotherList = new Stack<>();
        anotherList.addAll(Arrays.asList("tuhin", 230, 45.234f, true, 'M', 656.343d));

        java.lang.Object sdf = anotherList.get(1);

        numbers.remove(sdf);

        System.out.println(numbers);


// containsAll(c)---------- boolean ==================> check if the item collections is exist inside the list or not.
        Stack<Integer> myIntList1 = new Stack<>();
        myIntList1.addAll(Arrays.asList(22, 33, 44, 55, 66));
        Stack<Integer> myIntList2 = new Stack<>();
        myIntList2.addAll(Arrays.asList(22, 33, 44, 55, 66));

        boolean myBoolean = myIntList1.containsAll(myIntList2);
        System.out.println(myBoolean);

        myIntList1.remove(2);
        System.out.println(myIntList1.containsAll(myIntList2));


// addAll(c)--------------- boolean  =================> add all element to the list
        // First: (from value)
        numbers.addAll(Arrays.asList(3, 4, 5));
        System.out.println(numbers);

        // Second: (from array)
        Integer[] myInteger1 = new Integer[] { 10, 20, 30, 40 };
        numbers.addAll(Arrays.asList(myInteger1));
        System.out.println(numbers);

        // Third: (from List)
        List<Integer> myList = Arrays.asList(100, 200, 300);
        numbers.addAll(myList);
        System.out.println(numbers);

        // Forth: (from ArrayList)
        ArrayList<Integer> newIntList = new ArrayList<>(Arrays.asList(22, 33, 44, 55, 66));

        numbers.addAll(newIntList);
        System.out.println(numbers);

        // Fifth: (from Stack)
        LinkedList<Integer> mll = new LinkedList<>(Arrays.asList(22, 33, 44, 55, 66));

        numbers.addAll(mll);
        System.out.println(numbers);

        // Sixth: (from Stack)
        Vector<Integer> vi = new Vector<>(Arrays.asList(23, 232, 23));

        numbers.addAll(vi);
        System.out.println(numbers);


// removeAll(c) ----------- boolean  =================> remove all elements from list, that is similar.
        Integer[] newArray1 = {123, 456, 43};
        numbers.removeAll(Arrays.asList(newArray1));
        System.out.println(numbers);


        Stack<Integer> newIntList1 = new Stack<>();
        newIntList1.addAll(Arrays.asList(22, 33, 44, 55, 66));
        numbers.removeAll(newIntList1);
        System.out.println(numbers);


        newIntList1.removeAll(newIntList1);      // with itself
        System.out.println(newIntList1);


// removeIf(filter) ------- boolean  =================> remove the element by using filter
        myAL.removeIf((String i) -> i=="D");          // We used lambda here.
        numbers.removeIf((Integer in) -> in > 5);     // We used lambda here.


// retainAll(c)------------ boolean  =================> remove all elements that is not similar.
        Stack<Integer> myList4 = new Stack<>();
        myList4.addAll(Arrays.asList(22, 33, 44, 55, 66));
        Integer[] newArray2 = {11, 22, 33};

        myList4.retainAll(Arrays.asList(newArray2));
        System.out.println(myList4);



        Stack<Integer> myList1 = new Stack<>();
        myList1.addAll(Arrays.asList(22, 33, 44, 55, 66));

        Integer[] myArray = new Integer[] {11, 22, 33, 77, 99};
        ArrayList<Integer> myList2 = new ArrayList<>(Arrays.asList(myArray));

        System.out.println(myList1);
        System.out.println(myList2);

        myList1.retainAll(myList2);

        System.out.println(myList1);
        System.out.println(myList2);


// clear()----------------- void =====================> remove all the elements from the list and make it empty.
        numbers.clear();
        System.out.println(numbers);


// equals(o)--------------- boolean ==================> check if two list is equal or not.
        Stack<Integer> myIntList4 = new Stack<>();
        myIntList4.addAll(Arrays.asList(22, 33, 44, 55, 66));
        Stack<Integer> myIntList5 = new Stack<>();
        myIntList5.addAll(Arrays.asList(22, 33, 44, 55, 66));

        boolean myBoolean4 = myIntList4.equals(myIntList5);
        System.out.println(myBoolean4);

        myIntList4.remove(2);
        System.out.println(myIntList4.equals(myIntList5));


// toString()  ------------- String ===================> return ArrayList as String.
        System.out.println(numbers.toString());

        String myStr = numbers.toString();
        System.out.println(myStr);


// hashCode()-------------- int  =====================> create a hash code
        System.out.println(numbers.hashCode());

        for(Integer x : numbers){
            System.out.println(x.hashCode());
        }


// Stream() --------------- Stream ===================> Returns a sequential Stream with this collection as its source.
        // import java.util.stream.*;
        // Go to Stream file and watch out.


// parallelStream() ------- Stream ===================> Returns a possibly parallel Stream with this collection as its source.
        Stack<String> strings = new Stack<>();
        strings.addAll(Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl"));

        long count = strings.parallelStream().filter(string -> string.isEmpty()).count();

        System.out.println(count);


// Spliterator() ---------- Spliterator ==============> Creates a Spliterator over the elements in this collection.
        Spliterator<Integer> myNumbers = numbers.spliterator();

        System.out.println("Numbers are on the following:");

        myNumbers.forEachRemaining((n) -> System.out.println(n));


///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////  java.lang.Iterable  //////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////


// forEach(action) --------- void =====================> use for(java.util.Objects myVar : myList){}
        // First Way:
        numbers.forEach((n) -> System.out.println(n));

        // Second Way:
        Stack<Integer> number = new Stack<>();
        number.addAll(Arrays.asList(2,3,4,5,6,7));
        number.stream().map(x->x*x).forEach(y->System.out.println(y));


////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////// Collections ////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////


        numbers.add(34);
        numbers.add(56);
        numbers.add(6565);

// sort(list) -------------- void   ===================> arrange the list following ascending order.
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);


// replaceAll(list, find, replace) ---- void ==========> replace all the item of the list.
        Stack<String> al1 = new Stack<>();
        al1.addAll(Arrays.asList("A", "B", "A", "D"));
        Collections.replaceAll(al1, "A", "Tuhin");
        System.out.println(al1);

        Stack<Integer> al2 = new Stack<>();
        al2.addAll(Arrays.asList(11, 22, 33, 11, 44));
        Collections.replaceAll(al2, 11, 2000);
        System.out.println(al2);


// min() ------- inserted data type ========> find the minimum value
        System.out.println(Collections.min(numbers));

        int ase = Collections.min(numbers);
        System.out.println(ase);


// max() ------ inserted data type =========> find the maximum value
        System.out.println(Collections.max(numbers));

        ase = Collections.max(numbers);
        System.out.println(ase);


// shuffle()  ------- void ==========> used to destroy any kind of order present in the data structure. It does just the opposite of the sorting.
        System.out.println(numbers);

        Collections.shuffle(numbers);

        System.out.println(numbers);


// reverse() --------- void ===========> reverses the order of elements
        Collections.reverse(numbers);


// copy() ----------- void ============> creates a copy of elements from the specified source to destination
        Stack<Integer> asdf = new Stack<>();

        Collections.copy(numbers, asdf);
        System.out.println(asdf);


// binarySearch() ------ int =========> searches for the specified element. It returns the position of the element in the specified collections. If not found return -1.
        System.out.println(Collections.binarySearch(asdf, 33));

        int abc = Collections.binarySearch(asdf, 345);
        System.out.println(abc);


// frequency() ------ int =========> returns the count of the number of times an element is present in the collection
        System.out.println(Collections.frequency(numbers, 444));

        abc = Collections.binarySearch(numbers, 3434);
        System.out.println(abc);


// disjoint() -------- boolean ========> checks if two collections contain some common element
        System.out.println(Collections.disjoint(numbers, number));

        boolean myBo = Collections.disjoint(numbers, number);
        System.out.println(myBo);


// indexOfSubList() --------- int ==============> Returns the starting position of the first occurrence of the specified target list.
        System.out.println(Collections.indexOfSubList(numbers, number));

        int af = Collections.indexOfSubList(numbers, number);
        System.out.println(af);


// lastIndexOfSubList() -------- int =============> Returns the starting position of the last occurrence of the specified target list.
        System.out.println(Collections.lastIndexOfSubList(numbers, number));

        af = Collections.lastIndexOfSubList(numbers, number);
        System.out.println(af);


// fill() --------- void ==========> replace every element in a collection with the specified value
        Collections.fill(numbers, 0);

    }
}
