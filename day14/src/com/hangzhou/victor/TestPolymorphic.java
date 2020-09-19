package com.hangzhou.victor;

/**
 * @Description: 多态的应用  装箱与拆箱
 * @Author: victor
 * @Date: 2020/9/16  22:14
 */
public class TestPolymorphic {
    public static void main(String[] args) {

        Car car = new Car();
        car.brand = "BMW";
        car.price = 200000;
        car.speed = 20;
        car.type = "小轿车";

        Bus bus = new Bus();
        bus.seatNum = 20;
        bus.price = 1000000;
        bus.speed = 60;
        bus.type = "公交车";

        Bicycle bicycle = new Bicycle();
        bicycle.color = "红";
        bicycle.price = 2000;
        bicycle.speed = 70;
        bicycle.type = "自行车";


        Employee employee = new Employee();
        employee.name = "victor";
        employee.goHome(car);
        employee.goHome(bus);
        employee.goHome(bicycle);

        Employee employee1 = new Employee();
        Vehicle myVehicle = employee1.buyVehicle(100);
        if (myVehicle != null) {
            myVehicle.run();
        } else {
            System.out.println("钱不够，什么都没有买...");
        }

       /* System.out.println(myVehicle);          //里面储存的是Bus类型的地址
        Bus myBus=(Bus) myVehicle;
        System.out.println(myBus);              //强制转换后，里面储存的也是Bus类型的地址，而且与强制转换前地址相同。
        System.out.println(myBus.seatNum);
        */

        if (myVehicle instanceof Bus) {           // instanceof   ...是否是谁的实例？
            Bus myBus1 = (Bus) myVehicle;
            System.out.println(myBus1.seatNum);
        } else if (myVehicle instanceof Car) {

            Car myCar1 = (Car) myVehicle;
            System.out.println(myCar1.brand);
        } else if (myVehicle instanceof Bicycle) {
            Bicycle myBicycle1 = (Bicycle)myVehicle;
            System.out.println(myBicycle1.color);
        }

    }
}

class Employee {
    String name;


    public void goHome(Vehicle vehicle) {
        System.out.print(name + "正在乘坐");
        vehicle.run();
    }

    public Vehicle buyVehicle(int money) {
        Vehicle vehicle =null;
        if (money >= 100) {
            Bus bus = new Bus();
            vehicle = bus;
            bus.type = "公交车";
            bus.speed = 80;
            bus.price = 1000000;
            bus.seatNum = 20;
        } else if (money > 20) {
            Car car = new Car();
            vehicle = car;
            car.type = "小轿车";
            car.speed = 100;
            car.price = 230000;
            car.brand = "Benz";

        } else if (money > 2) {
            Bicycle bicycle = new Bicycle();
            vehicle = bicycle;
            bicycle.type = "自行车";
            bicycle.speed = 20;
            bicycle.price = 25000;
            bicycle.color = "红";
        }
        return vehicle;
    }

}

class Vehicle {
    String type;
    int speed;
    double price;

    public void run() {
        System.out.println("一辆价值" + price + "RMB的" + type + "正在以" + speed + "km/h的速度前进...");

    }
}

class Car extends Vehicle {
    String brand;

    public void run() {
        System.out.println("一辆价值" + price + "RMB的" + brand + "品牌的" + type + "正在以" + speed + "km/h的速度前进...");
    }

}

class Bus extends Vehicle {
    int seatNum;

    public void run() {
        System.out.println("一辆价值" + price + "RMB的" + seatNum + "座位的" + type + "正在以" + speed + "km/h的速度前进...");
    }

}

class Bicycle extends Vehicle {
    String color;

    public void run() {
        System.out.println("一辆价值" + price + "RMB的" + color + "色的" + type + "正在以" + speed + "km/h的速度前进...");
    }

}