package com.javamultiplex.pattern.creational.builder.single.example1;

/**
 * @author Rohit Agarwal on 23/08/20 7:38 pm
 * @copyright www.javamultiplex.com
 */
public class Student extends Person {
    private final String hobby;
    private final String degree;

    protected Student(StudentBuilder studentBuilder) {
        super(studentBuilder);
        this.hobby = studentBuilder.hobby;
        this.degree = studentBuilder.degree;
    }

    public String getHobby() {
        return hobby;
    }

    public String getDegree() {
        return degree;
    }

    public static class StudentBuilder extends PersonBuilder<StudentBuilder> {
        private final String degree;
        private String hobby;

        public StudentBuilder(String firstName, String lastName, String degree) {
            super(firstName, lastName);
            this.degree=degree;
        }

        public StudentBuilder withHobby(String hobby) {
            this.hobby = hobby;
            return self();
        }

        @Override
        public Student build() {
            return new Student(this);
        }

        @Override
        public StudentBuilder self() {
            return this;
        }
    }
}
