public class EnumExample {
     enum Weekdays{SU,MO,TU,WE,TH,FR,SA}
    public static void main(String[] args) {
        Weekdays days = Weekdays.TH;

        switch (days)
        {
            case SU:
                System.out.print("SUNDAY");
                break;
            case MO:
                System.out.print("MONDAY");
                break;
            case TU:
                System.out.print("TUESDAY");
                break;
            case WE:
                System.out.print("WEDNESDAY");
                break;
            case TH:
                System.out.print("THURSDAY");
                break;
            case FR:
                System.out.print("FRIDAY");
                break;
            case SA:
                System.out.print("SATURDAY");
                break;
            default:
                System.out.print("Other day");
        }
    }
}


//class EnumExample{
//    enum Day{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
//    public static void main(String args[]){
//        Day day=Day.MONDAY;
//
//        switch(day){
//            case SUNDAY:
//                System.out.println("sunday");
//                break;
//            case MONDAY:
//                System.out.println("monday");
//                break;
//            default:
//                System.out.println("other day");
//        }
//    }}