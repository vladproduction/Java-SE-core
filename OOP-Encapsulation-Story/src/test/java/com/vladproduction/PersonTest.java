package com.vladproduction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void personTest() {
        Person person = new Person("Umberto", 33);

        assertEquals("Umberto", person.getName());
        assertEquals(33, person.getAge());

        person.incrementAge();

        assertEquals("Umberto", person.getName());
        assertEquals(34, person.getAge());
    }


}