package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws IOException
    {
    	int amounts=0;
    	String names="";
    	int vars=0;
    	Student study;
    	BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
    	Scanner scan = new Scanner(System.in);
    	
        University university = new University("CH.U.I.");
        Internship internship = new Internship("Interlink");
        Knowledge one = new Knowledge(1);
        Knowledge two = new Knowledge(2);
        Knowledge three = new Knowledge(3);
        Knowledge four = new Knowledge(4);
        Knowledge five = new Knowledge(5);
        
        System.out.println("amount of students: ");
        amounts=scan.nextInt();
        for(int i=0;i<amounts;i++)
        {
        	System.out.println("student name: ");
        	names=s.readLine();
        	study=new Student(names);
        	System.out.println("student Knowledge(1,2,3,4,5): ");
        	do{
        	vars=scan.nextInt();
        	if(vars<1 && vars>5)
        	{
        	System.out.println("error, input again \n");
        	};
        	}while(vars<1 && vars>5);
        	switch(vars)
        	{
        	case 1: {study.setKnowledge(one); break;}
        	case 2: {study.setKnowledge(two); break;}
        	case 3: {study.setKnowledge(three); break;}
        	case 4: {study.setKnowledge(four); break;}
        	case 5: {study.setKnowledge(five); break;}
        	};
        	university.addStudent(study);
        }
        university.setStudent();
        for(Student human:university.people)
        {
        	internship.setStudent(human);
        };
        System.out.println("In university "+university.name+" List of internship's by "+internship.name+" students( Knowledge > "+university.level+" ):");
        System.out.println(internship.getStudents());
    }
}
