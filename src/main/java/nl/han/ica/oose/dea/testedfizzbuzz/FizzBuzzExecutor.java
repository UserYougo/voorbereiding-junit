package nl.han.ica.oose.dea.testedfizzbuzz;

public class FizzBuzzExecutor {

    public String execute(int i) {
        String text = "";
        if (i % 3 == 0) {
            text += "Fizz";
        }
        if (i % 5 == 0) {
            text += "Buzz";
        }
        if(text == ("")){
            text += i;
        }
        return text;
    }
}


