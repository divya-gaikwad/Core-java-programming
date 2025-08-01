class ambiguity{void add(int x,int y){System.out.println("sum is ="+(x+y));}void add(int c,float d){System.out.println("sum is ="+(c+d));}void add(float e,int f){System.out.println("sum is ="+(e+f));}
public static void main(String arg[]){	ambiguity ob=new ambiguity();	ob.add(10,20);	ob.add(10,30f);	ob.add(10f,400);}

}

