public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int weight =  120; // вес в кг
        double height = 1.64; // рост в метрах
        double BodyMassIndex = service.calculate(weight,height);

        System.out.println("Ваш ИМТ:");
        System.out.printf("%8.2f - ", + BodyMassIndex);

        if (BodyMassIndex < 18.5)
            System.out.println( "Недостаточная (дефицит) масса тела");
        else if (BodyMassIndex >= 18.5 && BodyMassIndex < 25 )
            System.out.println("Норма");
        else if (BodyMassIndex >= 25 && BodyMassIndex < 30 )
            System.out.println("Избыточная масса тела (предожирение)");
        else if (BodyMassIndex >= 30 && BodyMassIndex < 35 )
            System.out.println("Ожирение 1 степени");
        else if (BodyMassIndex >= 35 && BodyMassIndex < 40 )
            System.out.println("Ожирение 2 степени");
        else
            System.out.println("Ожирение 3 степени");
        }
}
