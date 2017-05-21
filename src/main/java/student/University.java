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

        if (size < groups.length) {
            groups[size++] = group;
            return true;
        } else {
            Group[] biggerGroup = new Group[groups.length + size];
            System.arraycopy(groups, 0, biggerGroup, 0, groups.length);
            biggerGroup[size++] = group;
            biggerGroup[size++] =null;
            groups = biggerGroup;
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

