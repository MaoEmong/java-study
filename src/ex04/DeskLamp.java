package ex04;

public class DeskLamp {
    // 인스턴스 변수의 정의
    private boolean isOn;       // 켜짐이나 꺼짐과 같은 램프의 상태

    // 메소드 정의
    public void TurnOn(){isOn = true;}
    public void TurnOff(){isOn = false;}
    public String toString()
    {
        return "현재 상태는 " + (isOn == true ? "켜짐" : "꺼짐");
    }
}
