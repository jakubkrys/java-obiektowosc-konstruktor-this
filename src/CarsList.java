public class CarsList {
    public static void main(String[] args) {

        char[] brand1 = {'O','p','e','l',' ','A','s','t','r','a'};
        Car c1 = new Car(brand1, 4299.99);
        char[] brand2 = {'A','u','d','i',' ','A','7'};
        Car c2 = new Car(brand2, 121200.54);
        char[] brand3 = {'B','M','W',' ','X','5',' ','M'};
        Car c3 = new Car(brand3, 120000.62);
        char[] brand4 = {'M','e','r','c','e','d','e','s',' ','G'};
        Car c4 = new Car(brand4, 150000.09);
        char[] brand5 = {'B','u','g','a','t','t','i',' ','V','e','y','r','o','n'};
        Car c5 = new Car(brand5, 420500.99);

        Car[] cars = new Car[5];
        cars[0] = c1;
        cars[1] = c2;
        cars[2] = c3;
        cars[3] = c4;
        cars[4] = c5;

        for(Car car : cars){
            System.out.print("Brand: ");
            for(char b : car.brand){
                System.out.print(b);
            }
            System.out.println();
            System.out.println("Price: "+car.price);
            System.out.println();
        }
    }
}
