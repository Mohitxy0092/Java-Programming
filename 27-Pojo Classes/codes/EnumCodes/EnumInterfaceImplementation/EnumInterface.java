package EnumCodes.EnumInterfaceImplementation;

public enum EnumInterface implements MyInterface {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public String toLowerCase(){
        return this.name().toLowerCase();
    }
}
