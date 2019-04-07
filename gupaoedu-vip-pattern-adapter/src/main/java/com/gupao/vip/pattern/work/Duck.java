package com.gupao.vip.pattern.work;

public class Duck implements Comparable {
    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + "weight" + weight;
    }

    public int compareTo(Object o) {
        Duck anotherDuck = (Duck)o;
        if (this.weight < anotherDuck.weight) {
            return -1;
        }else if (this.weight == anotherDuck.weight){
            return 0;
        }else{//this.weight > anotherDuck.weight
            return 1;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
