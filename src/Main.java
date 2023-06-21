public class Main {
    public static void main(String[] args) {

        String[][] array = {
                { "1", "2", "3", "4" },
                { "5", "6", "7", "8" },
                { "9", "10", "11", "12" },
                { "13", "14", "15", "16" }
        };

        ArrayValueCalculator calculator = new ArrayValueCalculator();

        try {
            int result = calculator.doCalc(array);
            System.out.println(result);
        } catch (ArraySizeException e) {
            System.out.println("Unexpected array size. " + e.getMessage());
            System.out.println("Actual array size: " + e.getActualRows() + "x" + e.getActualColumns());
            System.out.println("Expected array size: " + e.getExpectedRows() + "x" + e.getExpectedColumns());
            e.printStackTrace();
        } catch (ArrayDataException e) {
            System.out.println("Unexpected data in array. " + e.getMessage());
            e.printStackTrace();
        }
    }
}
