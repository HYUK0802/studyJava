package Chapter2.ch24;

public class Subject {

    private String name;
    private int scorePoint;

    public String getName() {
        return name;
    }

    public Subject setName(String name) {
        this.name = name;
        return this;
    }

    public int getScorePoint() {
        return scorePoint;
    }

    public Subject setScorePoint(int scorePoint) {
        this.scorePoint = scorePoint;
        return this;
    }
}
