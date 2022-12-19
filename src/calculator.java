public class calculator {
    public int add(int value_1, int value_2){
        return value_1 + value_2 ;
    }
    public int substraction(int value_1, int value_2){
        return value_1 - value_2 ;
    }

    public int multiplication(int value_1, int value_2){
        return value_1 * value_2;
    }

    public void test_add(){
        if (add(2,2) == 4){
            System.out.println("Test addition passed");
        }
        else{
            System.out.println("Error for function addition");
        }
    }
    public void test_substract(){
        if (substraction(4,2) == 2){
            System.out.println("Test subtraction passed");
        }
        else{
            System.out.println("Error for function subtraction");
        }
    }
    public void test_multiplication(){
        if (multiplication(4,2) == 8){
            System.out.println("Test multiplication passed");
        }
        else{
            System.out.println("Error for function multiplication");
        }
    }

    public static void main(String[] args){
        calculator test = new calculator();
        test.test_add();
        test.test_multiplication();
        test.test_substract();
    }
}
