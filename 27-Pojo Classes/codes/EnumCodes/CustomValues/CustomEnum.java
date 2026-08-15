package EnumCodes.CustomValues;

public enum CustomEnum {
    SUNDAY(1,"First day of week"),
    MONDAY(2,"Second day of week"),
    TUESDAY(3,"Third day of week"),
    WEDNESDAY(4,"Fourth day of week"),
    THURSDAY(5,"Fifth day of week"),
    FRIDAY(6,"Sixth day of week"),
    SATURDAY(7,"Seventh day of week");


    private int value;
    private String comment;


    CustomEnum(int val,String comt) {
        this.value=val;
        this.comment=comt;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }


    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    public static CustomEnum getValues(int val) {
        for(CustomEnum e : CustomEnum.values()){
            if(val== e.value) {
                return e;
            }
        }
        return null;
    }
}
