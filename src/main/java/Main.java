import java.util.Arrays;

public class Main {
    // Program, który będzie symulował regulację temperatury w pomieszczeniach pewnego budynku.
//    Budynek składa się z 4 pomieszczeń, a każde pomieszczenie może posiadać niezależny klimatyzator jednego z dwóch typów:
//
//    BasicAirConditioner - obniża temperaturę pomieszczenia proporcjonalnie o 1 stopień na minutę przy wydajności 1 metra sześciennego na minutę.
//    Przykładowo jeśli pomieszczenie ma kubaturę 10 metrów sześciennych, to temperatura pomieszczenia będzie obniżana o 0,1 stopnia na minutę.
//
//    ProAirConditioner - obniża temperaturę pomieszczenia proporcjonalnie o 2 stopnie na minutę przy wydajności 1 metra sześciennego na minutę.
//    Przykładowo jeśli pomieszczenie ma kubaturę 10 metrów sześciennych, to temperatura pomieszczenia będzie obniżana o 0,2 stopnia na minutę.
//
//    Na potrzeby zadania symulujemy, że 1 minuta odpowiada 1 sekundzie.
//
//    W każdym pomieszczeniu można ustawić klimatyzację na włączoną lub wyłączoną oraz temperaturę do której temperatura ma zostać obniżona.
//    Program powinien co sekundę wyświetlić temperaturę w każdym z czterech pomieszczeń.
//    Co sekundę temperatura w pomieszczeniu powinna być obniżana o odpowiednią wartość w zależności od zastosowanego klimatyzatora.
//    Zakładamy dowolną temperaturę początkową => docelowo pobraną z czujnika za pomocą odpowiedniej metody.
//    Po obniżeniu temperatury do zadanej, powinna ona być utrzymywana na stałym poziomie.



    public static void main(String[] args) throws InterruptedException {


        Building budynek = new Building("Budynek", 4);

        AirConditioner airConditionerPro = new AirConditioner("Pro", 2);
        AirConditioner airConditionerBasic = new AirConditioner("Basic", 1);

        Room room1 = new Room(1, 10,25);
        Room room2 = new Room(2, 16,25);
        Room room3 = new Room(3,18,25);
        Room room4 = new Room(4,22,25);

        room1.setCooling_status(true);
        room2.setCooling_status(true);
        room3.setCooling_status(true);
        room4.setCooling_status(true);
        room1.setAirConditionerType(airConditionerBasic);
        room2.setAirConditionerType(airConditionerPro);
        room3.setAirConditionerType(airConditionerBasic);
        room4.setAirConditionerType(airConditionerPro);

        budynek.setRoom(new Room[]{room1,room2,room3,room4});

        room1.setTemp_set(15);
        room2.setTemp_set(10);
        room3.setTemp_set(12);
        room4.setTemp_set(9);





       while (true){

           Thread.sleep(1000);
           Arrays.stream(budynek.getRoom()).forEach(room -> System.out.println("Room nr:"+room.getRoom_ID()+" = "+room.getTemp_actual()));
           Arrays.stream(budynek.getRoom()).forEach(room -> budynek.getCoolDown(room));
           System.out.println();
       }


    }
}
