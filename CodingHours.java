public class CodingHours {
    public static void main(String[] args) {
        int dailyCodingHours = 6; // Hours per day
        int semesterWeeks = 17; // Weeks in a semester
        int workdaysPerWeek = 5; // Number of workdays per week
        int averageWorkHoursWeekly = 52; // Average work hours per week

       int totalCodingHours = dailyCodingHours * workdaysPerWeek * semesterWeeks;

        double percentageOfCodingHours = ((double) totalCodingHours / (averageWorkHoursWeekly * semesterWeeks)) * 100;

        System.out.println("Total coding hours in the semester: " + totalCodingHours + " hours");
        System.out.println("Percentage of coding hours in the semester: " + percentageOfCodingHours + "%");
    }
}
