package org.example;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class AnnotationTest {


  public static void main(String[] args) throws ClassNotFoundException {

    Class classFromClass = Car.class;

    Car car = new Car();

    Class classFromObject = car.getClass();

    Class classByName = Class.forName("org.example.Car");

    if (classFromClass.isAnnotationPresent(MyAnnotation.class)) {
      System.out.println("MyAnnotation is present");

      MyAnnotation annotation = (MyAnnotation) classFromClass.getAnnotation(MyAnnotation.class);
      System.out.println("MyAnnotation name: " + annotation.name());
      System.out.println("Send email to: " + annotation.email());

    }

    Field[] fields = classFromClass.getDeclaredFields();

    for(Field field: fields) {
      System.out.println("Field name: " + field.getName());
      boolean annotationPresent = field.isAnnotationPresent(MyAnnotation.class);
      System.out.println("MyAnnotation present: " + annotationPresent);

      if (annotationPresent) {
        MyAnnotation annotation = field.getAnnotation(MyAnnotation.class);
        System.out.println("MyAnnotation name: " + annotation.name());
        System.out.println("Send email to: " + annotation.email());
      }
    }


  }


}
