package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {

    //Car car = new Car("green", "nissan");

    ObjectMapper objectMapper = new ObjectMapper();
    //objectMapper.writeValue(new File("car.json"), car);

    Car carFromFile = objectMapper.readValue(new File("car.json"), Car.class);
    System.out.println(carFromFile);

  }

}
