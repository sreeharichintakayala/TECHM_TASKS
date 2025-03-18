package Training;

import java.util.Scanner;

class Associate {
    private int id;
    private String name;
    private String technology;
    private int experienceInYears;
    
    public Associate(int id,String name,String technology,int experienceInYears) {
		// TODO Auto-generated constructor stub
    	this.id = id;
    	this.name = name;
    	this.technology = technology;
    	this.experienceInYears = experienceInYears;
	}

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }
}

class Solution {
    public static Associate[] associatesForGivenTechnology(Associate[] associates, String searchTechnology) {
        int count = 0;
        for (Associate associate : associates) {
            if (associate.getTechnology().equalsIgnoreCase(searchTechnology) && associate.getExperienceInYears() % 5 == 0) {
                count++;
            }
        }

        Associate[] result = new Associate[count];
        int index = 0;
        for (Associate associate : associates) {
            if (associate.getTechnology().equalsIgnoreCase(searchTechnology) && associate.getExperienceInYears() % 5 == 0) {
                result[index++] = associate;
            }
        }

        return result;
    }
}

public class Assignments1 {
    public static void main(String[] args) {
        Associate[] associates = {
        		new Associate(101, "Alex", "Java", 15),
        		new Associate(102, "ALbert", "Unix", 20),
        		new Associate(103, "Alferd", "Testing", 13),
        		new Associate(104, "Alfa", "Java", 15),
        		new Associate(105, "Almas", "Java", 29)
        		
        };

        // Reading input for five associates
        
        // Reading the search technology
        String searchTechnology = "Java";

        // Calling the method and getting the result
        Associate[] result = Solution.associatesForGivenTechnology(associates, searchTechnology);

        // Printing the ids of the filtered associates
        for (Associate associate : result) {
            System.out.println(associate.getId());
        }
    }
}