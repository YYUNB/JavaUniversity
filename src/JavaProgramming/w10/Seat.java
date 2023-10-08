package JavaProgramming.w10;

public class Seat {
    private String name;
    public Seat() {
        this.name = null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // name 값을 null로 세팅하여 예약 취소
    public void cancel() {
        name = null;
    }

    // 좌석이 예약되었는 지 확인
    public boolean checkOccupied() {
        if (name == null) return false;
        else return true;
    }

    // 인자로 받은 name과 객체의 name 값이 같은 지 확인
    public boolean checkNameEqual(String name) {
        return name.equals(this.name);
    }
}
