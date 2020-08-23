package com.javamultiplex.pattern.creational.builder.single.example1;

/**
 * @author Rohit Agarwal on 23/08/20 7:16 pm
 * @copyright www.javamultiplex.com
 */
public class Person {

    private final String firstName;
    private final String lastName;
    private final String city;
    private final long aadharId;

    protected Person(PersonBuilder personBuilder) {
        this.firstName = personBuilder.firstName;
        this.lastName = personBuilder.lastName;
        this.city = personBuilder.city;
        this.aadharId = personBuilder.aadharId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public long getAadharId() {
        return aadharId;
    }

    public static class PersonBuilder<SELF extends PersonBuilder<SELF>> {
        private final String firstName;
        private final String lastName;
        private String city;
        private long aadharId;

        public PersonBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public SELF withCity(String city) {
            this.city = city;
            return self();
        }

        public SELF withAadhar(long aadharId) {
            this.aadharId = aadharId;
            return self();
        }

        public Person build(){
            return new Person(this);
        }

        public SELF self(){
            return (SELF)this;
        }
    }

}
