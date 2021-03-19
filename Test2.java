//Method 1: Delos Reyes, N
class bank
{
double getRateOfInterest()
{return 0;}  
}  

//Method 2: Delos Reyes, N
class SECURITYBANK extends Bank
{  
double getRateOfInterest(){return 0.99;}  
}

class Test2
{  
public static void main(String args[])
{  
SECURITYBANK sb=new SECURITYBANK();
GSAVE gs=new GSAVE(); 
LANDBANK lb=new LANDBANK();  
CHINABANK bc=new CHINABANK();  
UNIONBANK ub=new UNIONBANK();  
ING g=new ING(); 
BDO b=new BDO();
BPI bp=new BPI(); 
RCBC r=new RCBC();
CITIBANK cb=new CITIBANK();
CIMB ci=new CIMB();
METROBANK mb=new METROBANK();
System.out.println("SECURITYBANK Rate of Interest: "+sb.getRateOfInterest());
System.out.println("GSAVE Rate of Interest: "+gs.getRateOfInterest());
System.out.println("LANDBANK Rate of Interest: "+lb.getRateOfInterest());  
System.out.println("CHINABANK Rate of Interest: "+bc.getRateOfInterest());  
System.out.println("UNIONBANK Rate of Interest: "+ub.getRateOfInterest()); 
System.out.println("ING Rate of Interest: "+g.getRateOfInterest()); 
System.out.println("BDO Rate of Interest: "+b.getRateOfInterest()); 
System.out.println("BPI Rate of Interest: "+bp.getRateOfInterest()); 
System.out.println("RCBC Rate of Interest: "+r.getRateOfInterest()); 
System.out.println("CITIBANK Rate of Interest: "+cb.getRateOfInterest()); 
System.out.println("CIMB Rate of Interest: "+ci.getRateOfInterest()); 
System.out.println("METROBANK Rate of Interest: "+mb.getRateOfInterest()); 
}  
}
