package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> getCarsByCount(int count);
    List<Car> getAll();
}