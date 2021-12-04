package logger;

import org.apache.commons.lang3.StringUtils;

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
		this.who = "\"noData\":"+"\"No user parameter\"";
		this.where = where;
		this.when = when;
		this.what = what;
	}
	
	public String toString() {
		StringBuilder res = new StringBuilder();

		res.append("\n{\n\"who\":" +'{');
		String[] whoSplit = this.who.split("\n");
		if(whoSplit.length>1) {
			String[] userId =whoSplit[0].split(":");
			String[] name  =whoSplit[1].split(":");
			
			res.append("\n \""+StringUtils.deleteWhitespace(userId[0])+'"'+":"+StringUtils.deleteWhitespace(userId[1]));
			res.append(",\n \""+StringUtils.deleteWhitespace(name[0])+'"'+":"+'"'+StringUtils.deleteWhitespace(name[1])+'"');
		}
		else
			res.append(this.who);
		
		res.append("}");
		res.append(",\n\"where\":" +'"'+ this.where+'"');
		res.append(",\n\"what\":" +'"'+ this.what+'"');
		res.append(",\n\"when\":" + '"'+this.when+'"'+"\n}");
		
		return res.toString();
	}

}
