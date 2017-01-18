package jdbc;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;


public class Emp1_main {

   @Test
   public void jd1(){
	//	Emp1 em1=new Emp1(ename, sno, eid, job, manager)
    Emp1DAO e1d=new Emp1DAO();
  //  System.out.println("sqe"+e1d.getData());
    e1d.getData();
    List<Emp1> e=e1d.getInfo();
    for(Emp1 w:e)
    System.out.println("name="+w.getEname());
	}
}
