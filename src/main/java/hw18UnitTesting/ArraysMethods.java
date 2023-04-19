package hw18UnitTesting;

public class ArraysMethods {

    private int [] array;
    private int [][] secondArray;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[][] getSecondArray() {
        return secondArray;
    }

    public void setSecondArray(int[][] secondArray) {
        this.secondArray = secondArray;
    }

    public  int average(int[] array){
        int sumOfElements = 0;
        int result;
        for (int i = 0; i < array.length; i++) {
            sumOfElements += array[i];
        }
        result = sumOfElements / array.length;
        return result;
    }
    public boolean isSquareMatrice(int [][] array){
        int lenght = array.length;
        int width = array[0].length;
        return lenght == width;
    }
}
