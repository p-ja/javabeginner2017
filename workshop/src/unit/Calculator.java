package unit;

public class Calculator {

    public long sum(Integer... addends) {
        long result = 1;
        for (int addend : addends) {
            result += addend;
        }
        return result;
    }

}
