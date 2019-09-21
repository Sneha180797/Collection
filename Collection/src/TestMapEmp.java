import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class TestMapEmp {

	public static void main(String[] args) {
		Map<String, Employee>map=accept();
		display(map);
		displaysort(map);
	}
	public static Map<String, Employee>accept()
	{
		Map<String ,Employee> emp=new HashMap<String, Employee>();
		emp.put("emp111", new Employee("Ramesh", 40000));
		emp.put("emp133", new Employee("Suresh", 34000));
		emp.put("emp11", new Employee("Mahesh", 54000));
		emp.put("emp101", new Employee("Ganesh", 67000));
		
		return emp;
	}
	public static void display(Map<String, Employee> map)
	{
		Set<String> st=map.keySet();
		
		for(String s:st)
		{
			Employee e=map.get(s);
			System.out.println(s+"\t=>"+e.getEname()+"\t"+e.getEsal());
		}
	}
	public static void displaysort(Map<String,Employee> map)
	{
		System.out.println("Sorted...");
		TreeMap<String,Employee>tmap =new TreeMap<String,Employee>();
		Set<String> st=tmap.keySet();
		
		for(String s:st){
			Employee e= tmap.get(s);
			System.out.println(s+"\t=>"+e.getEname()+"\t"+e.getEsal());
		}
	}
}

