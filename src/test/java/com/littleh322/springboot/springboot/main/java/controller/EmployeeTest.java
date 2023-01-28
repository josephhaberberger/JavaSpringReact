package com.littleh322.springboot.springboot.main.java.controller;

import static com.littleh322.springboot.springboot.main.java.util.EmployeeUtil.generateEmployee;

import com.littleh322.springboot.springboot.modal.Employee;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.Assertions;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class EmployeeTest {

    public static Employee employee;

    @BeforeAll
    public static void testSetup() {
        System.out.println("\rBEFORE THE CLASS\r");
        employee = generateEmployee();
    }

    @Test
    public void test_NameAndGender() {
        Assertions.assertEquals("name male", employee.getNameAndGender());
    }

    @Test
    public void testExceptionIsThrown() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            employee.calculateAvgTimeSpent(1000, 0);
        }, "Cannot divide by zero");
    }

    @Test
    public void testCalculateAvgTimeSpent() {
        Assertions.assertEquals(500, employee.calculateAvgTimeSpent(1000, 2));
    }

    @AfterAll
    public static void teardown() {
        System.out.println("\rAFTER THE CLASS: CLEAN UP\r");
    }
}