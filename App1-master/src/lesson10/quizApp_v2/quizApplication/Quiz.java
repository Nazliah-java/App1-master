package lesson10.quizApp_v2.quizApplication;

import java.sql.Date;

public class Quiz {

    private int id;
    private int score;
    private Date date;

    public Quiz(int id, int score, Date date) {

        this.id = id;
        this.score = score;
        this.date = date;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}

