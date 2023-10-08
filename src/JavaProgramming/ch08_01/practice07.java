package ch08_01;

class SafeArray {
    private int a[] = {};
    public int length;

    public SafeArray(int length) {
        this.length = length;
    }
    void inputN(int index, int num) {
        if(length <= index) System.out.println("잘못된 인덱스 " + index);
        else a[index] = num;
    }
}
public class practice07 {
    public static void main(String[] args) {
        SafeArray array = new SafeArray(3);
        array.inputN(3, 30);
    }

}
