public class ArrayDataException extends Exception {
    private int rowIndex;
    private int columnIndex;
    private String element;

    public ArrayDataException(String message, int rowIndex, int columnIndex, String element) {
        super(message);
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
        this.element = element;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public int getColumnIndex() {
        return columnIndex;
    }

    public String getElement() {
        return element;
    }
}