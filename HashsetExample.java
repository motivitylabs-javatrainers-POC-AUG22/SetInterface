import java.util.*;



public class HashsetExample {
	
	public static void sizeMethod(HashSet<Integer> ob) 
	{
		System.out.println("size:"+ob.size());
        System.out.println(ob);
	}

    public static void isemptyMethod(HashSet<Integer> ob)
    {
    	 System.out.println("empty:"+ob.isEmpty());
         System.out.println(ob);
    }
    public static void containsMethod(HashSet<Integer> ob)
    {
    	 System.out.println("contains:"+ob.contains(10));
         System.out.println(ob);
    }
    public static void removeMethod(HashSet<Integer> ob)
    {

    	 System.out.println("remove:"+ob.remove(10));
         System.out.println(ob);
    }
    public static void addMethod(HashSet<Integer>ob)
    {
    	System.out.println("add:"+ob.add(22));
        System.out.println("Add"+ob);
    }
    public static void cloneMethod(HashSet<Integer>ob)
    {
    	 System.out.println("clone:"+ob.clone());
         System.out.println(ob);
         
    }
    public static void removeallMethod(HashSet<Integer>ob)
    {
    	 System.out.println("remove:"+ob.removeAll(ob));
         System.out.println(ob);
    }
    public static void containallmethod(HashSet<String>ob1)
    {
    	System.out.println("containsAll:"+ob1.containsAll(ob1));
    	System.out.println(ob1);
    }
    
    public static void iteratorMethod(HashSet<String> ob1)
    {
    	Iterator<String> it = ob1.iterator();  
    	    
         System.out.println(" elements : ");  
     
         while (it.hasNext()) { 
             System.out.println(it.next() + " ");  
         }
    }


public static void employeeDetails1(HashSet<Employee> h)
{
	
	h.add(new Employee(123,"Venu",20000));
	h.add(new Employee(124,"Josna",21000));
	h.add(new Employee(125,"Nikhil",20000));
	h.add(new Employee(126,"Ramya",20000));
	for(Employee e :h) {
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		
	}
}
}