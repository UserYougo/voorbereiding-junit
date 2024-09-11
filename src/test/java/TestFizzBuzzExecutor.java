import nl.han.ica.oose.dea.testedfizzbuzz.FizzBuzzExecutor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestFizzBuzzExecutor {
    private FizzBuzzExecutor sut;

    @BeforeEach
    public void setup(){
        sut = new FizzBuzzExecutor();
    }

    @Test
    void testFizz(){
        // Arrange
            //setup
        // Act
        var testValue = sut.execute(21); //21%3==0 should return Fizz

        // Assert
        assertEquals("Fizz", testValue);
    }
    @Test
    void testBuzz(){
        //Arrange
            //setup

        //Act
        var testValue = sut.execute(50);

        //Assert
        assertEquals("Buzz", testValue);
    }

    @Test
    void testFizzBuzz(){
        //Arrange
            //setup

        //Act
        var testValue = sut.execute(15);

        //Assertion
        assertEquals("FizzBuzz", testValue);
    }
    @Test
    void testNumber(){
        //act
        var testValue = sut.execute(11);
        //assertion
        assertEquals("11", testValue);
    }

}
