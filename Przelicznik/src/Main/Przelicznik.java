package Main;

public class Przelicznik {
    public static void main(String[] args){
        double meter_1 = 4;
        double centimeter_1 = 8;
        double millimeter_1 = 200;

        int hour_1 = 10;
        int minute_1 = 20;
        int second_1 = 30;
        int mmillisecond_1 = 40;

        Metryka m1 = new Metryka();
        m1.setMeter(meter_1);
        m1.setCentimeter(centimeter_1);
        m1.setMillimeter(millimeter_1);

        Time t1 = new Time();
        t1.setHour(hour_1);
        t1.setMinute(minute_1);
        t1.setSecond(second_1);
        t1.setMmillisecond(mmillisecond_1);

        System.out.println("========= Przelicznik jednostek miar odleglosci ==========");
        System.out.println(meter_1+" metrow to :"+m1.meterToCentimeter(m1.getMeter())+" centymetrow");
        System.out.println(meter_1+" metrow to :"+m1.meterToMillimeter(m1.getMeter())+" centymetrow");
        System.out.println(centimeter_1+" centymetrow to :"+m1.centimeterToMeter(m1.getCentimeter())+" metrow");
        System.out.println(millimeter_1+" milimetrow to :"+m1.millimeterToMeter(m1.getMillimeter())+" metrow");
        System.out.println("========= Przelicznik jednostek miar czasu ==========");
        System.out.println(hour_1+" godzin to :"+ t1.hourTominute(t1.getHour())+" minut");
        System.out.println(minute_1+" minut to :"+ t1.minuteTosecond(t1.getMinute())+" sekund");
        System.out.println(second_1+" sekund to :"+ t1.secondToMillisecond(t1.getSecond())+ " milisecund");


    }

}
