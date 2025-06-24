import java.util.ArrayList;

public class PointsManagement {

    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;

    public PointsManagement() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addPoint(int point) {
        if (point >= 0 && point <= 100) {
            this.points.add(point);
        }
    }

    public double getAverage() {
        int sum = 0;
        for (Integer point : this.points) {
            sum += point;
        }
        return (double) sum / this.points.size();
    }

    public double getPassingAverage() {
        int sum = 0;
        int count = 0;
        for (Integer point : this.points) {
            if (point >= 50) {
                count++;
                sum += point;
            }
        }
        return (double) sum / count;
    }

    public double getPassingPercentage() {
        int count = 0;
        for (Integer point : this.points) {
            if (point >= 50) {
                count++;
            }
        }
        return ((double) count / this.points.size()) * 100;
    }

    public void generateGrades() {
        for (int point : this.points) {
            if (point < 50) {
                this.grades.add(0);
            } else if (point < 60) {
                this.grades.add(1);
            } else if (point < 70) {
                this.grades.add(2);
            } else if (point < 80) {
                this.grades.add(3);
            } else if (point < 90) {
                this.grades.add(4);
            } else {
                this.grades.add(5);
            }
        }
    }

    public void getDistribution() {
        for (int i = 5; i >= 0; i--) {
            int count = 0;
            for (int grade : this.grades) {
                if (grade == i) {
                    count++;
                }
            }
            System.out.print(i + ": ");
            for (int j = 0; j < count; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void print() {
        System.out.println("Point average (all): " + this.getAverage());
        System.out.println("Point average (passing): " + this.getPassingAverage());
        System.out.println("Pass percentage: " + this.getPassingPercentage());
        System.out.println("Grade distribution:");
        this.generateGrades();
        this.getDistribution();
    }
}
