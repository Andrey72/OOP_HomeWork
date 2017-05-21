package main.java.student;

import java.util.Arrays;

/**
 * Created by Sherlock on 19.05.2017.
 */
public class University {

    private String nameUniversity;
    private Group[] groups;
    private int size;
    private int count = 0;

    public University(String nameUniversity, Group[] groups) {
        this.nameUniversity = nameUniversity;
        this.groups = groups;
    }

    public University(String nameUniversity, int size) {
        this.nameUniversity = nameUniversity;
        this.size = size;
        this.groups = new Group[size];

    }

    public void showUniver() {
        System.out.println("Univer - " + nameUniversity);
        System.out.println(Arrays.toString(groups));
    }

    public boolean addGroup(Group group) {
        for (int i = 0; i < size; i++) {
            if (group.equals(groups[i])) {
                return false;
            }
        }
        if (count == size || groups == null) {
            System.out.println("Group FULL");
            return false;
        } else {
            groups[count++] = group;
            return true;
        }
    }

    public void removeGroup(int position) {

        if (position < 0 || groups.length - 1 < position) {
            System.out.println("Group don't exist");
        } else {
            System.arraycopy(groups, position + 1, groups, position, size - position - 1); // с одиним массивом!!
            groups[size - 1] = null;
            size--;
        }
    }
}

