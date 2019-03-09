package com.example.user.builder_singleton;

public class Person {
    private String name;
    private Integer yearOfBirth, colorOfHair, height, weight;
    private boolean haveChildren;

    public Person(String name, Integer yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public Integer getColorOfHair() {
        return colorOfHair;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWeight() {
        return weight;
    }

    public boolean isHaveChildren() {
        return haveChildren;
    }

    public static Builder newBuilder(String name, Integer yearOfBirth) {
        return new Person(name, yearOfBirth).new Builder();
    }

    public class Builder {
        public Builder setColorOfHair(Integer colorOfHair) {
            Person.this.colorOfHair = colorOfHair;

            return this;
        }

        public Builder setHeight(Integer height) {
            Person.this.height = height;

            return this;
        }

        public Builder setWeight(Integer weight) {
            Person.this.weight = weight;

            return this;
        }

        public Builder setHaveChildren(boolean haveChildren) {
            Person.this.haveChildren = haveChildren;

            return this;
        }

        public Person build() {
            return Person.this;
        }
    }
}

