public class Movie {
    String name;
    int releaseDate;
    int durationInMinutes;
    boolean isIncludedInPlan;
    double sumOfEvaluations;
    int numberOfEvaluations;

    public void showData() {
        System.out.printf("Movie name: %s%n", this.name);
        System.out.printf("Date of release: %d%n", this.releaseDate);
        System.out.printf("Duration of the movie: %d minutes %n", this.durationInMinutes);
        System.out.printf("Included in plan: %s%n", this.isIncludedInPlan);
    }

    public void evaluate(double note) {
        this.sumOfEvaluations += note;
        numberOfEvaluations++;
    }

    public double calculateAverage() {
        return sumOfEvaluations / numberOfEvaluations;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Movie[");
        sb.append("name=").append(this.name).append(", ");
        sb.append("releaseDate=").append(this.releaseDate).append(", ");
        sb.append("durationInMinutes=").append(this.durationInMinutes).append(", ");
        sb.append("isIncludedInPlan=").append(this.isIncludedInPlan).append(", ");
        sb.append("sumOfEvaluations=").append(this.sumOfEvaluations).append(", ");
        sb.append("numberOfEvaluations=").append(this.numberOfEvaluations);
        sb.append("]");
        return sb.toString();
    }
}
