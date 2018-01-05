public class Name {

    private String first;
    private String middle;
    private String last;

    public Name(String firstInput, String middleInput, String lastInput) {
        first = firstInput;
        middle = middleInput;
        last = lastInput;
    }

    public String getFirst() {
        return first;
    }

    public String getMiddle() {
        return middle;
    }

    public String getLast() {
        return last;
    }
}
