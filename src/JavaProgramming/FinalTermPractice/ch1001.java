package JavaProgramming.FinalTermPractice;

class Sports {
    String getName() {
        return "아직 결정되지 않음";
    }
    int getPlayers() {
        return 0;
    }
}

class SportsExtends extends Sports {
    String getName() {
        return "축구";
    }
    int getPlayers() {
        return 11;
    }
}
public class ch1001 {
    public static void main(String[] args) {
        SportsExtends se = new SportsExtends();
        System.out.println("경기 이름: " + se.getName());
        System.out.println("경기자 수: " + se.getPlayers());
    }
}
