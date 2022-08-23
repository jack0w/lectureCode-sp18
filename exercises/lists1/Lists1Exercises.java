public class Lists1Exercises {
    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrList(IntList L, int x) {
        /* Your code here. */
        IntList copy = new IntList(L.first+x, null);
	IntList p = copy;
	while(L.rest != null){
	   L = L.rest;
	   p.rest = new IntList(L.first+x, null);
	   p = p.rest;
	}
	return copy;   
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        /* Your code here. */
	IntList copy = L;
        while(L != null){
           L.first = L.first + x;
           L = L.rest;
        }
	return copy;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

        System.out.println(L.size());
        System.out.println(L.iterativeSize());

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
        System.out.println(L.get(1));
        System.out.println(L);
	IntList c1 = incrList(L, 3);
	IntList c2 = dincrList(L, 3);
	System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.get(0));
	System.out.println(c1.get(1));
	System.out.println(c1.get(2));
        System.out.println(c2.get(0));
        System.out.println(c2.get(1));
        System.out.println(c2.get(2));
	}
}
