public class ArraySizeException extends Exception {
    private int actualRows;
    private int actualColumns;
    private int expectedRows;
    private int expectedColumns;

    public ArraySizeException(String message, int actualRows, int actualColumns, int expectedRows,
                              int expectedColumns) {
        super(message);
        this.actualRows = actualRows;
        this.actualColumns = actualColumns;
        this.expectedRows = expectedRows;
        this.expectedColumns = expectedColumns;
    }

    public int getActualRows() {
        return actualRows;
    }

    public int getActualColumns() {
        return actualColumns;
    }

    public int getExpectedRows() {
        return expectedRows;
    }

    public int getExpectedColumns() {
        return expectedColumns;
    }
}

