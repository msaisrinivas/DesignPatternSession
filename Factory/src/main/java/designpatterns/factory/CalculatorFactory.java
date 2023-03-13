package designpatterns.factory;

import java.util.HashMap;
import java.util.Map;

public class CalculatorFactory {

    public Calculator getInstance(String mode) throws IllegalAccessException {
        Map<String, Calculator> classMap = new HashMap<>();
        classMap.put("basic", new BasicCalculator());
        classMap.put("science", new ScientificCalculator());
        classMap.put("program", new ProgrammingCalculator());

        if(classMap.get(mode) != null){
            return classMap.get(mode);
        }

        throw new IllegalAccessException("The Mode You are trying to access is not available");

//        We can also do with switch
//         (mode) {
//            case "basic":
//                return new BasicCalculator();
//            case "science":
//                return new ScientificCalculator();
//            case "program":
//                return new ProgrammingCalculator();
//            default:
//                throw new IllegalAccessError("The Mode You are trying to access is not available");
//        }
    }
}
