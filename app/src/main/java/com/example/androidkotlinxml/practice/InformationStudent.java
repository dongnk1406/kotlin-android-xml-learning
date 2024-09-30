package com.example.androidkotlinxml.practice;

public class InformationStudent extends Student {
    private double scoreJava;
    private double scoreJS;

    public InformationStudent(double scoreJava, double scoreJS) {
        this.scoreJava = scoreJava;
        this.scoreJS = scoreJS;
    }

    @Override
    public double getScore() {
        return this.scoreJava * 2 + this.scoreJS / 2;
    }

    public double getScoreJava() {
        return scoreJava;
    }

    public void setScoreJava(double scoreJava) {
        this.scoreJava = scoreJava;
    }

    public double getScoreJS() {
        return scoreJS;
    }

    public void setScoreJS(double scoreJS) {
        this.scoreJS = scoreJS;
    }
}
