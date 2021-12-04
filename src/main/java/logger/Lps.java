package logger;

public class Lps {
	String who;
	String where;
	String when;
	String what;
	
	
	
	public Lps(String who, String where, String when, String what) {
		this.who = who;
		this.where = where;
		this.when = when;
		this.what = what;
	}
	
	public Lps(String where, String when, String what) {
		this.who = "No user parameter";
		this.where = where;
		this.when = when;
		this.what = what;
	}
	
	public String toString() {
		StringBuilder res = new StringBuilder();
		
		res.append("\n" + this.who);
		res.append("\n" + this.where);
		res.append("\n" + this.what);
		res.append("\n" + this.when);
		
		return res.toString();
	}

}
