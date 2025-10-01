package com.pluralsight;

public class App {

    public static void main(String[] args) {
        Student one = new Student("Jalen", 345, 4.3, true);
        Student two = new Student("Jake", 222, 2.3, true);
        Student three = new Student("Jason", 112, 1.3, false);
        System.out.println("=== Student Profile manager ===");
        System.out.println("Initial Student Profiles:");
        one.getProfile(one);
        three.isEnrolled();
        two.getName();
        two.getProfile(two);
        three.getProfile(three);
        System.out.println();

        System.out.println("=== Processing Student Changes ===");
        three.enroll();
        two.updateGpa(4.5);
        one.withdraw();
        one.updateGpa(5.0);
        two.addCourse("Science");
        System.out.println();

        System.out.println("Updated Student Profiles:");
        one.getProfile(one);
        two.getProfile(two);
        three.getProfile(three);




    }


}
