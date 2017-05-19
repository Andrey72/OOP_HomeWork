package student;

import java.util.Arrays;

/**
 * Created by Sherlock on 19.05.2017.
 */
public class University {

    private String nameUniversity;
    private Group[] groups;
    private int size;
    private int countGroup = 0;

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

    public void addGroup(Group group) {
        if (countGroup == size) {
            System.out.println("Group FULL");
        } else {
            groups[countGroup] = group;
            countGroup++;
        }

    }

    public void removeGroup(int countGr) {

        if (countGr < 0 || groups.length - 1 < countGr) {
            System.out.println("Group don't exist");
        } else {
            Group[] temp = new Group[groups.length - 1];

            System.arraycopy(groups, countGr + 1, temp, 0, temp.length - countGr);
            System.arraycopy(groups, 0, temp, temp.length - countGr, countGr);

            groups = temp;
        }
    }
}

