package static1;

public class StaticVar {
    private static int count;
    private String name;

    public StaticVar(String name) {
        this.name = name;
        //StaticVar.count++; 과 같다.
        count++;
    }

    /** 정적변수를 참조하면 인스턴스 변수를 기준으로 먼저 탐색한다.
     * 탐색후 존재하지 않으면 정적변수를 참조한다.
      */
    public void showCount() {
        System.out.println("count = " + count);
    }
}
