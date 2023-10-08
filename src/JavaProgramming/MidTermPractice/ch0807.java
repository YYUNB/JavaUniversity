package MidTermPractice;

class SafeArray {
    private int a[];
    public int length;

    SafeArray (int l) {
        this.length = l;
        a = new int[length];
    }

    void inputArray(int index, int n) {
        if (length > index) a[index] = n;
        else System.out.println("잘못된 인덱스 " + index);
    }
}
public class ch0807 {
    public static void main(String[] args) {
        SafeArray sa = new SafeArray(3);
        sa.inputArray(3, 2);
    }
}
