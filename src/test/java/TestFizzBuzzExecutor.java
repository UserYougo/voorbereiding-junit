import nl.han.ica.oose.dea.testedfizzbuzz.FizzBuzzExecutor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFizzBuzzExecutor {
    private FizzBuzzExecutor FBE;

    @Test
    void testFizz(){
        // Arrange
        var sut = new FizzBuzzExecutor();

        // Act
        var testValue = sut.execute(21); //21%3==0 should return Fizz

        // Assert
        Assertions.assertEquals("Fizz", testValue);
    }
    @Test
    void testBuzz(){
        //Arrange
        var sut = new FizzBuzzExecutor();

        //Act
        var testValue = sut.execute(50);

        //Assert
        Assertions.assertEquals("Buzz", testValue);
    }

    @Test
    void testFizzBuzz(){
        //Arrange
        var sut = new FizzBuzzExecutor();

        //Act
        var testValue = sut.execute(15);

        //Assertion
        Assertions.assertEquals("FizzBuzz", testValue);
    }

}
