package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Repository
public class CarDaoImpl implements CarDao {

    List<Car> carList = new ArrayList<>();
    {
        carList.add(new Car(1l,"Lexus","white"));
        carList.add(new Car(2l,"Toyota","black"));
        carList.add(new Car(3l,"BMW","black"));
        carList.add(new Car(4l,"Honda", "blue"));
        carList.add(new Car(5l,"Audi","grey"));
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        List<Car> newCarList = new ArrayList<>();
        int counter = 0;
            for (Car c: carList) {
                if (counter < count) {
                newCarList.add(c);
                counter++;
                }
            }
        return newCarList;
    }

    @Override
    public List<Car> getAll() {
        return carList;
    }

}
