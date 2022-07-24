package chapter06;

class IniVar {
	boolean bi;
	byte bbi;
	char cy;
	short sx;
	int ix;
	long lx;
	float fz;
	double cz;
}

public class Exam0000 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IniVar ivar = new IniVar();
		System.out.println("boolean = " + ivar.bi);
		System.out.println("byte = " + ivar.bbi);
		System.out.println("char = " + ivar.cy);
		System.out.println("short = " + ivar.sx);
		System.out.println("int = " + ivar.ix);
		System.out.println("long = " + ivar.lx);
		System.out.println("float = " + ivar.fz);
		System.out.println("double = " + ivar.cz);
	}

}