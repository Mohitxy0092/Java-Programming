import EnumCodes.CustomValues.CustomEnum;
import EnumCodes.EnumAbstractExample.EnumAbstract;
import EnumCodes.EnumInterfaceImplementation.EnumInterface;
import EnumCodes.EnumOverRidingExamples.OverRidingEnum;
import EnumCodes.normalEnum.EnumDemo;

public class Main {
    public static void main(String[] args) {
        callNormalEnum();
        callCustomValueEnum();
        callOverRideEnum();
        callAbstactEnum();
        callInterfaceEnum();
    }
    private static void callNormalEnum() {
        for (EnumDemo e : EnumDemo.values()) {
            System.out.print(e.ordinal() + " ");
        }
        System.out.print("\n");
        EnumDemo e = EnumDemo.valueOf("MONDAY");
        System.out.println(e.name());
    }
    private static void callCustomValueEnum(){
        CustomEnum e=CustomEnum.getValues(1);
        CustomEnum e1= CustomEnum.TUESDAY;
        System.out.println(e.getComment());
        System.out.println(e.getValue());
        System.out.println(e1.getValue());
        System.out.println(CustomEnum.FRIDAY.getComment());
    }
    private static void callOverRideEnum() {
        OverRidingEnum e= OverRidingEnum.FRIDAY;
        OverRidingEnum e1=OverRidingEnum.MONDAY;
        e.defaultmethod();
        e1.defaultmethod();
    }
    private static void callAbstactEnum() {
        EnumAbstract e= EnumAbstract.MONDAY;
        EnumAbstract e2= EnumAbstract.TUESDAY;
        e.defaultmethod();
        e2.defaultmethod();

    }
    private static void callInterfaceEnum() {
        EnumInterface e= EnumInterface.FRIDAY;
        System.out.println(e.toLowerCase());
    }
}