package org.example.module1.lesson20;

public class Example2 {
}

class DayClass {
    public static final DayClass MONDAY = new DayClass(0,"MONDAY" );
    public static final DayClass TUESDAY = new DayClass(1, "TUESDAY");
    public static final DayClass WEDNESDAY = new DayClass(2, "WEDNESDAY");
    public static final DayClass THURSDAY = new DayClass(3, "THURSDAY");
    public static final DayClass FRIDAY = new DayClass(4, "FRIDAY");
    public static final DayClass SATURDAY = new DayClass(5, "SATURDAY");
    public static final DayClass SUNDAY = new DayClass(6,"SUNDAY");

    private static final DayClass[] array = {MONDAY, TUESDAY,
            WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};

    private final int ordinal;
    private final String name;

    private DayClass(int ordinal, String name) {
        this.ordinal = ordinal;
        this.name = name;
    }

    public static DayClass[] values(){
        // better to use copy of array
        return array;
    }

    public static DayClass valueOf(String name){

        for (DayClass day : array) {
            if(day.name.equals(name)){
                return day;
            }
        }

        return null; // throw exception
    }

    public String name(){
        return name;
    }

    public int ordinal(){
        return ordinal;
    }
}


class Type /*extends Enum<Type>*/{

    /**
     * Sole constructor.  Programmers cannot invoke this constructor.
     * It is for use by code emitted by the compiler in response to
     * enum class declarations.
     *
     * @param name    - The name of this enum constant, which is the identifier
     *                used to declare it.
     * @param ordinal - The ordinal of this enumeration constant (its position
     *                in the enum declaration, where the initial constant is assigned
     *                an ordinal of zero).
     */
//    protected Type(String name, int ordinal) {
//        super(name, ordinal);
//    }
}
