package EnumCodes.EnumAbstractExample;

public enum EnumAbstract {
    MONDAY{
        @Override
        public void defaultmethod() {
            System.out.println("Monday method called...");
        }
    },
    TUESDAY{
        @Override
        public void defaultmethod() {
            System.out.println("Tuesday Method called...");
        }
    };

    public abstract void defaultmethod();
}
