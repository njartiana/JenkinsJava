public class test_calculator {
    calculator calc = new calculator();


    public void test_add(){
        if (calc.add(2,2) == 4){
            System.out.println("Test addition passed");
        }
        else{
            System.out.println("Error for function addition");
        }
    }
    public void test_substract(){
        if (calc.substraction(4,2) == 2){
            System.out.println("Test subtraction passed");
        }
        else{
            System.out.println("Error for function subtraction");
        }
    }
    public void test_multiplication(){
        if (calc.multiplication(4,2) == 8){
            System.out.println("Test multiplication passed");
        }
        else{
            System.out.println("Error for function multiplication");
        }
    }
    public static void main(String[] args){
        test_calculator test = new test_calculator();
        test.test_add();
        test.test_substract();
        test.test_multiplication();
    }
}

