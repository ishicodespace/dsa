package wrapperClasses;

public class Introduction {
    public static void main(String[] args) {
        System.out.println("--- Java Wrapper Classes Demo ---");

        int num = 10; // primitive int
        Integer boxedInt = Integer.valueOf(num);
        int unboxedInt = boxedInt.intValue();

        // 1) Boxing and unboxing
        int prim = 5;
        Integer boxed = Integer.valueOf(prim); // manual boxing (preferred)
        Integer autoBoxed = prim; // autoboxing
        int unboxed = boxed.intValue(); // manual unboxing
        int autoUnboxed = boxed; // autounboxing

        System.out.println("prim = " + prim + ", boxed = " + boxed + ", autoBoxed = " + autoBoxed);
        System.out.println("unboxed = " + unboxed + ", autoUnboxed = " + autoUnboxed);

        // 2) == vs equals and caching behaviour
        Integer x = Integer.valueOf(100);
        Integer y = Integer.valueOf(100);
        Integer p = Integer.valueOf(1000);
        Integer q = Integer.valueOf(1000);

        System.out.println("x == y (100 cached range -128..127): " + (x == y));
        System.out.println("x.equals(y): " + x.equals(y));
        System.out.println("p == q (1000 outside cache): " + (p == q));
        System.out.println("p.equals(q): " + p.equals(q));

        // 3) Parsing and valueOf
        String s = "42";
        int parsed = Integer.parseInt(s); // returns primitive int
        Integer parsedObj = Integer.valueOf(s); // returns Integer
        System.out.println("parseInt: " + parsed + ", valueOf: " + parsedObj);

        // 4) Unboxing null leads to NullPointerException - demonstrate with try/catch
        Integer maybeNull = null;
        try {
            int v = maybeNull; // autounboxing of null -> NPE
            System.out.println("unboxed value: " + v); // won't run
        } catch (NullPointerException npe) {
            System.out.println("Unboxing null throws: " + npe.getClass().getSimpleName());
        }

        // 5) Recommendation note (printed)
        System.out.println(
                "Note: use primitives for performance; use wrappers for collections, nullability, or utility methods.");
        System.out.println("--- Demo complete ---");
    }
}