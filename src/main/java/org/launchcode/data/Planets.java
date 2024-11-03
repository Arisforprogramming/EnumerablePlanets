//package org.launchcode.data;
//
//public enum Planets {
//    MERCURY ("Mercury"),
//    VENUS ("Venus"),
//    EARTH ("Earth"),
//    MARS ("Mars"),
//    JUPITER ("Jupiter"),
//    SATURN ("Saturn"),
//    URANUS("Uranus"),
//    NEPTUNE ("Neptune");
//
//
//
//private final String name;
//
//planets (String name){
//    this.name = name;
//}
//
//public String getName(){
//    return name;
//}
//}
package org.launchcode.enumerableplanets.data;

public enum Planets {

    MERCURY ("Mercury"),
    VENUS ("Venus"),
    EARTH ("Earth"),
    MARS ("Mars"),
    JUPITER ("Jupiter"),
    SATURN ("Saturn"),
    URANUS("Uranus"),
    NEPTUNE ("Neptune");

//    MERCURY ("Mercury", 88),
//    VENUS ("Venus", 226),
//    EARTH ("Earth", 365),
//    MARS ("Mars", 687),
//    JUPITER ("Jupiter", 4333),
//    SATURN ("Saturn", 10759),
//    URANUS("Uranus", 30687),
//    NEPTUNE ("Neptune", 60200);

    private final String name;
    private final int yearLength;


    Planets(String name, int yearLength) {
        this.name = name;
        this.yearLength = yearLength;
    }

    public String getName() {
        return  name;
    }

    public int getYearLength() {
        return yearLength;
    }

}