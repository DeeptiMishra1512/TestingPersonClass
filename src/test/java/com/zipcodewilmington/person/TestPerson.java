package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();


        // Then
        String actualName = person.getName();
        int actualAge = person.getAge();

        System.out.println("person name: " + person.getName());

        Assert.assertEquals("Deepti", actualName);
        Assert.assertEquals(35, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testConstructorWithAllValues() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        double expectedheight = 154.0;
        double expectedweight = 167.0;
        double expectedsalary = 20000.0;


        // When
        Person person = new Person(expectedAge,expectedName,expectedweight,expectedheight,expectedsalary);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        double actualweight = person.getWeight();
        double actualHeight = person.getHeight();
        double actualSalary = person.getSalary();
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedweight, actualweight,0.001);
        Assert.assertEquals(expectedheight, actualHeight,0.001);
        Assert.assertEquals(expectedsalary, actualSalary,0.001);

    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testSetHeight() {
        // Given
        Person person = new Person();
        double expected = 156.9;

        // When
        person.setHeight(expected);

        // Then
        double actual = person.getHeight();
        Assert.assertEquals(expected,actual,0.001);
    }

    @Test
    public void testSetPerson() {
        // Given
        Person person = new Person();
        double expectedHeight = 156.9;
       // double

        // When
        person.setHeight(expectedHeight);

        // Then
        double actual = person.getHeight();
        Assert.assertEquals(expectedHeight,actual,0.001);
    }
}
