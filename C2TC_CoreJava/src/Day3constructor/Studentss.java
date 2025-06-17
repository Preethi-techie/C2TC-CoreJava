package Day3constructor;

public class Studentss{
    	 private int sid;
    	 private String sname;
    	 private String course;
     public Studentss()
     {
    	 this.sid=101;
    	 this.sname="preethi";
    	 this.course="ECE";
    	 
     }
     
     
	public Studentss(int sid, String sname, String course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.course = course;
	}


	
	public Studentss(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}


	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;}
	
	
	@Override
	public String toString() {
		return "Studentss [sid=" + sid + ", sname=" + sname + ", course=" + course + "]";
	}
     }

     