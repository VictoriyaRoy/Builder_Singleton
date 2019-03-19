package com.example.user.builder_singleton;

public class Person {
    private String name;
    private Integer yearOfBirth, colorOfHair, height, weight;
    private boolean haveChildren;


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


    public static class Builder {
        private Person newPerson;

        public Builder(String name, Integer yearOfBirth) {
            newPerson = new Person();
            newPerson.name = name;
            newPerson.yearOfBirth=yearOfBirth;

        }

        public Builder setColorOfHair(Integer colorOfHair) {
            newPerson.colorOfHair = colorOfHair;

            return this;
        }

        public Builder setHeight(Integer height) {
            newPerson.height = height;

            return this;
        }

        public Builder setWeight(Integer weight) {
            newPerson.weight = weight;

            return this;
        }

        public Builder setHaveChildren(boolean haveChildren) {
            newPerson.haveChildren = haveChildren;

            return this;
        }

        public Person build() {
            return newPerson;
        }
    }
}

