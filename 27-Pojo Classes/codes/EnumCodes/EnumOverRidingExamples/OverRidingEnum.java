package EnumCodes.EnumOverRidingExamples;

public enum OverRidingEnum {
    MONDAY{
        @Override
        public void defaultmethod() {
            System.out.println("Monday method called...");
        }
    },
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public void defaultmethod() {
        System.out.println("Default Method called...");
    }
}
