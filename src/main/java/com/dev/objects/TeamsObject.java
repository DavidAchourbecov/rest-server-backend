package com.dev.objects;


import javax.persistence.*;

@Entity
@Table(name = "teams")
public class TeamsObject {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column

    private int id;



    @Column (name = "name")

    private String nameTeams;



    @Column

    private int winning;

    @Column

    private int draw;

    @Column

    private int lost;

    @Column

    private int goalFrom;

    @Column

    private int goalLoss;

    @ManyToOne

    @JoinColumn (name = "user_id")

    private UserObject userObject;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameTeams() {
        return nameTeams;
    }

    public void setNameTeams(String nameTeams) {
        this.nameTeams = nameTeams;
    }

    public int getWinning() {
        return winning;
    }

    public void setWinning(int winning) {
        this.winning = winning;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public int getGoalFrom() {
        return goalFrom;
    }

    public void setGoalFrom(int goalFrom) {
        this.goalFrom = goalFrom;
    }

    public int getGoalLoss() {
        return goalLoss;
    }

    public void setGoalLoss(int goalLoss) {
        this.goalLoss = goalLoss;
    }

    public UserObject getUserObject() {
        return userObject;
    }

    public void setUserObject(UserObject userObject) {
        this.userObject = userObject;
    }
}
