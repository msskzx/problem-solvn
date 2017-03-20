package preez.mayhem.implementation;

import java.util.PriorityQueue;

public class EmergencyRoom {

	PriorityQueue<Patient> q;

	public EmergencyRoom() {
		q = new PriorityQueue<Patient>();
	}

	void newPatient(String n, int p) {
		q.add(new Patient(n, p));
	}

	Patient nextPatient() {
		return q.remove();
	}

	void print() {
		while (!q.isEmpty())
			System.out.println(nextPatient());
	}

	public static void main(String[] args) {
		EmergencyRoom e = new EmergencyRoom();
		e.newPatient("Alt", 4);
		e.newPatient("Notz", 2);
		e.newPatient("Daj", 1);
		e.newPatient("Karx", 3);
		e.print();
	}

}

class Patient implements Comparable<Patient> {
	String name;
	int severity;

	public Patient(String name, int severity) {
		this.name = name;
		this.severity = severity;
	}

	@Override
	public int compareTo(Patient o) {
		return this.severity - o.severity;
	}

	public String toString() {
		return name + ", " + severity;
	}
}