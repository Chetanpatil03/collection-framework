//🧍 4. Representing Real-World Data (e.g., Employee ID → Salary)
//You can map relationships between entities easily.
import java.util.*;

public class EmployeeData {
    public static void main(String[] args) {
        HashMap<Integer, Double> salaryMap = new HashMap<>();
        salaryMap.put(1, 50000.0);
        salaryMap.put(2, 65000.0);
        salaryMap.put(3, 80000.0);
        salaryMap.put(4, 80000.0);
        salaryMap.put(5, 80000.0);

        for (Map.Entry<Integer, Double> e : salaryMap.entrySet()) {
            System.out.println("Employee ID: " + e.getKey() + ", Salary: " + e.getValue());
        }
    }
}
