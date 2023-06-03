package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private static int ID;

    @Override
    public List<Car> getCars(int count) {
        List<Car> list;
        {
            list = new ArrayList<>();
            list.add(new Car(++ID, "series1", 1));
            list.add(new Car(++ID, "series2", 2));
            list.add(new Car(++ID, "series3", 3));
            list.add(new Car(++ID, "series4", 4));
            list.add(new Car(++ID, "series5", 5));
        }
        if (count == 0) {
            return list;
        }
        return list.stream().limit(count).collect(Collectors.toList());
    }
}
