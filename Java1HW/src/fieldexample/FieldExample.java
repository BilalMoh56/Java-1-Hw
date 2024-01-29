package fieldexample;

public class FieldExample {

    private int legalField;
    private String anotherLegalField;

    public static void main(String[] args) {
        FieldExample example = new FieldExample();


        System.out.println("Uninitialized int field: " + example.legalField);
        System.out.println("Uninitialized String field: " + example.anotherLegalField);

        int uninitializedLocalVariable = 0;
        System.out.println("Uninitialized local variable: " + uninitializedLocalVariable);
    }
}
