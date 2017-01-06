package jdbc;

public class Emp1 {

	String ename;
	int sno;
	int eid;
	String job;
	String mgr;

	public Emp1(String ename, int sno, int eid, String job, String mgr) {
		this.ename = ename;
		this.sno = sno;
		this.eid = eid;
		this.job = job;
		this.mgr = mgr;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getmgr() {
		return mgr;
	}

	public void setmgr(String mgr) {
		this.mgr = mgr;
	}
	
	
}
