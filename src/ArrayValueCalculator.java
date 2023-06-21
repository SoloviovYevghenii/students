import java.util.Arrays;

public class ArrayValueCalculator {

    int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        int expectedRows = 4;
        int expectedColumns = 4;
        int actualRows = array.length;
        int actualColumns = array[0].length;
        
        if (actualRows != expectedRows || actualColumns != expectedColumns) {
            throw new ArraySizeException("Wrong array size. Array must be 4x4.", actualRows, actualColumns,
                    expectedRows, expectedColumns);
        }

        int sum = 0;

        for (String[] row : array) {
            for (String element : row) {
                try {
                    sum += Integer.parseInt(element);
                } catch (NumberFormatException e) {
                    int rowIndex = Arrays.asList(array).indexOf(row);
                    int columnIndex = Arrays.asList(row).indexOf(element);
                    throw new ArrayDataException(
                            "Wrong data in cell [" + rowIndex + "][" + columnIndex + "]: " + element, rowIndex,
                            columnIndex, element);
                }
            }
        }
        return sum;
    }
}
