public class Main {
    public static void main(String[] args) {

        int weight = 95;                 // вес в кг
        double height = 1.75;            // рост в метрах

        BmiService service = new BmiService();
        double bodyMassIndex = service.calculate(weight, height);
        long finalBodyMassIndex1 = Math.round(bodyMassIndex);    //int finalBodyMassIndex = (int) bodyMassIndex;
        System.out.print(("Ваш ИМТ: " + finalBodyMassIndex1 + " - "));

        if (bodyMassIndex < 18.5) {
            System.out.println("Недостаточная (дефицит) масса тела");
        } else if (bodyMassIndex >= 18.5 && bodyMassIndex < 25) {
            System.out.println("Норма");
        } else if (bodyMassIndex >= 25 && bodyMassIndex < 30) {
            System.out.println("Избыточная масса тела (предожирение)");
        } else if (bodyMassIndex >= 30 && bodyMassIndex < 35) {
            System.out.println("Ожирение 1 степени");
        } else if (bodyMassIndex >= 35 && bodyMassIndex < 40) {
            System.out.println("Ожирение 2 степени");
        } else {
            System.out.println("Ожирение 3 степени");
        }
    }
}
