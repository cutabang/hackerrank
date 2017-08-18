package com.hackerrank.challenge.data_structure;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


public class PriorityQueueTest {

	private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }

}

class Priorities {
	public List<Student> getStudents(List<String> events) {
		PriorityQueue<Student> priorityQueue = new PriorityQueue<>(Comparator.comparing(Student::getCGPA).reversed()
			                                                                 .thenComparing(Student::getName)
			                                                                 .thenComparing(Student::getID));
		List<Student> result = new ArrayList<>();
		
		for (String event : events) {
			String[] eventSplit = event.split("\\s");
			String eventType = eventSplit[0];
			
			switch(eventType) {
			case "ENTER" :
				String name = eventSplit[1];
				String cgpa = eventSplit[2];
				String id = eventSplit[3];
				priorityQueue.offer(new Student(Integer.parseInt(id), name, new BigDecimal(cgpa)));
				System.out.println("priorityque: " + priorityQueue);
				break;
			case "SERVED" :
				priorityQueue.poll();
				System.out.println("priorityque: " + priorityQueue);
				break;
			default:
				break;
			}
		}
		
		priorityQueue.forEach(s->result.add(s));
		Collections.sort(result);
		return result;
	}
	
}

class Student implements Comparable<Student> {
	private int id;
	private String name;
	private BigDecimal cgpa;
	
	
	public Student(int id, String name, BigDecimal cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getCGPA() {
		return cgpa;
	}
	public void setCGPA(BigDecimal cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa + "]";
	}

	@Override
	public int compareTo(Student s) {
		if (!this.cgpa.equals(s.getCGPA())) {
			return s.getCGPA().compareTo(this.getCGPA());
		} else if (! this.name.equals(s.getName())) {
			return this.getName().compareTo(s.getName());
		} else {
			return this.id-s.getID();
		}
	}
}
