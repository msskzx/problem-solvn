package preez.implementation;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Stack;

public class BrowsingHistory {

	Stack<Link> history = new Stack<Link>();

	void add(String url) {
		Stack<Link> tmp = new Stack<Link>();
		Link link = null;
		while (!history.isEmpty()) {
			if (history.peek().url.equals(url)) {
				link = history.pop();
				link.frequency++;
				break;
			}
			tmp.add(history.pop());
		}
		while (!tmp.isEmpty()) {
			history.add(tmp.pop());
		}
		int f = 1;
		if (link != null)
			f = link.frequency;
		link = new Link(url, f);
		history.add(link);
	}

	void removeLast() {
		history.pop();
	}

	void removeLast(String date) {
		Stack<Link> tmp = new Stack<Link>();
		while (!history.isEmpty()) {
			if (history.peek().date.equals(date)) {
				history.pop();
				break;
			}
			tmp.add(history.pop());
		}
		while (!tmp.isEmpty())
			history.add(tmp.pop());
	}

	int getNumberOfLinks() {
		return history.size();
	}

	String search() {
		Link most = history.peek();
		Stack<Link> tmp = new Stack<Link>();
		while (!history.isEmpty()) {
			if (most.frequency < history.peek().frequency)
				most = history.peek();
			tmp.add(history.pop());
		}
		while (!tmp.isEmpty())
			history.add(tmp.pop());
		return most.url;
	}

	void printHistory() {
		System.out.println("Current browsing history:");
		Stack<Link> tmp = new Stack<Link>();
		while (!history.isEmpty()) {
			System.out.println(history.peek());
			tmp.push(history.pop());
		}
		while (!tmp.isEmpty()) {
			history.push(tmp.pop());
		}
	}

	public static void main(String[] args) {
		BrowsingHistory browsingHistory = new BrowsingHistory();
		browsingHistory.add("https://www.google.com/");
		browsingHistory.add("http://www.youtube.com/");
		browsingHistory.add("https://www.google.com/");
		browsingHistory.printHistory();
		System.out.println("Most viewed so far is " + browsingHistory.search());
		browsingHistory.removeLast("2016-10-10");
		browsingHistory.printHistory();
		browsingHistory.add("http://www.facebook.com/");
		browsingHistory.add("http://www.youtube.com/");
		browsingHistory.add("https://www.google.com/");
		browsingHistory.add("http://met.guc.edu.eg/");
		browsingHistory.add("http://www.youtube.com/");
		browsingHistory.add("http://met.guc.edu.eg/");
		browsingHistory.add("http://met.guc.edu.eg/");
		browsingHistory.printHistory();
		System.out.println("Most viewed so far is " + browsingHistory.search());
		browsingHistory.removeLast();
		browsingHistory.removeLast();
		browsingHistory.printHistory();
		System.out.println("Most viewed so far is " + browsingHistory.search());
	}

}

class Link {
	String url;
	String date; // Format YYYY-MM-DD
	int frequency; // number of times a url has been visited

	public Link(String url) {
		this.url = url;
		this.frequency = 1;
		// gets the current date
		Calendar cal = Calendar.getInstance();
		Date calDate = cal.getTime();
		// and convert it into YYYY-MM-DD
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			date = format1.format(calDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Link(String url, int frequency) {
		this(url);
		this.frequency = frequency;
	}

	public String toString() {
		return url + " -- last visit: " + date + " -- visited: " + frequency + " times";
	}
}