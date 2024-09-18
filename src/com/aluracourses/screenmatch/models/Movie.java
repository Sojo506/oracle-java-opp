package com.aluracourses.screenmatch.models;

public class Movie {
    private String name;
    private int releaseDate;
    private int durationInMinutes;
    private boolean isIncludedInPlan;
    private double sumOfEvaluations;
    private int numberOfEvaluations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public boolean isIncludedInPlan() {
        return isIncludedInPlan;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        isIncludedInPlan = includedInPlan;
    }

    public void showData() {
        System.out.printf("Movie name: %s%n", this.name);
        System.out.printf("Date of release: %d%n", this.releaseDate);
        System.out.printf("Duration of the movie: %d minutes %n", this.durationInMinutes);
        System.out.printf("Included in plan: %s%n", this.isIncludedInPlan);
    }

    public void evaluate(double note) {
        this.sumOfEvaluations += note;
        this.numberOfEvaluations++;
    }

    public double calculateAverage() {
        return this.sumOfEvaluations / this.numberOfEvaluations;
    }



    /*@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("com.aluracourses.screenmatch.models.Movie[");
        sb.append("name=").append(this.name).append(", ");
        sb.append("releaseDate=").append(this.releaseDate).append(",\n");
        sb.append("durationInMinutes=").append(this.durationInMinutes).append(",\n");
        sb.append("isIncludedInPlan=").append(this.isIncludedInPlan).append(",\n");
        sb.append("sumOfEvaluations=").append(this.sumOfEvaluations).append(",\n");
        sb.append("numberOfEvaluations=").append(this.numberOfEvaluations);
        sb.append("]");
        return sb.toString();
    }*/
}
