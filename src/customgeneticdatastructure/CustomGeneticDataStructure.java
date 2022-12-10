
package customgeneticdatastructure;


public class CustomGeneticDataStructure {
    
    public static void main(String[] args) {
        int intValue;
        String stringValue;
   
       CustomClass<Integer> customObject = new CustomClass<>();
       CustomClass<String> customString = new CustomClass<>();
         CustomMap<String, Integer> customMap = new CustomMap<>();
       customObject.setValue_1(1000);
       customString.setValue_1("Nkuli");
       
       intValue = customObject.getValue_1();
       stringValue = customString.getValue_1();
       System.out.println("integer value_1 =  " + intValue );
        System.out.println("String value_1 =  " + stringValue );
    }
    
}
