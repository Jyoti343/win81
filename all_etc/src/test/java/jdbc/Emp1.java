package jdbc;

public class Emp1 {

	String ename;
	int sno;
	String job;
	int mgr;

	public Emp1(String ename, int sno, String job, int mgr) {
		this.ename = ename;
		this.sno = sno;
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




	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getmgr() {
		return mgr;
	}

	public void setmgr(int mgr) {
		this.mgr = mgr;
	}
	
	
}
