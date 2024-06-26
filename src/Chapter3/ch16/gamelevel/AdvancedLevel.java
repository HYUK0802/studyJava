package Chapter3.ch16.gamelevel;

public class AdvancedLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("높이 점프 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("turn은 배우지 못했습니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("****** 중급자 레벨입니다 ******");
    }
}
