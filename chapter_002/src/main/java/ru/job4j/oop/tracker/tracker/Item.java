package ru.job4j.oop.tracker.tracker;

import java.util.Objects;

public class Item {
    private String id;
    private String name;
    //private String desc;
    //private long time;

    public Item(String name) {
        this.name = name;
        //this.desc = desc;
        //this.time = time;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    /*public String getDecs() {
        return desc;
    }
    public void setDecs(String decs) {
        this.desc = decs;
    }
    public long getTime() {
        return time;
    }
    public void setTime(long time) {
        this.time = time;
    }*/
    /*@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return time == item.time
                &&
                Objects.equals(id, item.id)
                &&
                Objects.equals(name, item.name)
                &&
                Objects.equals(desc, item.desc);
    }*/
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
        //return Objects.hash(id, name, desc, time);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                //", desc='" + desc + '\'' +
                //", time=" + time +
                '}';
    }
}