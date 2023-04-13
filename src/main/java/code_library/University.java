package code_library;

public class University {

    public String university;
    public String rank_display;
    public int score;
    public String type;
    public int student_faculty_ratio;
    public String international_students;
    public String faculty_count;
    public Location location;

    public University(String university, String rank_display, int score, String type, int student_faculty_ratio, String international_students, String faculty_count, Location location) {
        this.university = university;
        this.rank_display = rank_display;
        this.score = score;
        this.type = type;
        this.student_faculty_ratio = student_faculty_ratio;
        this.international_students = international_students;
        this.faculty_count = faculty_count;
        this.location = location;
    }

    public University() {
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getRank_display() {
        return rank_display;
    }

    public void setRank_display(String rank_display) {
        this.rank_display = rank_display;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStudent_faculty_ratio() {
        return student_faculty_ratio;
    }

    public void setStudent_faculty_ratio(int student_faculty_ratio) {
        this.student_faculty_ratio = student_faculty_ratio;
    }

    public String getInternational_students() {
        return international_students;
    }

    public void setInternational_students(String international_students) {
        this.international_students = international_students;
    }

    public String getFaculty_count() {
        return faculty_count;
    }

    public void setFaculty_count(String faculty_count) {
        this.faculty_count = faculty_count;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
