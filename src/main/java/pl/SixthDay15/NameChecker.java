package pl.SixthDay15;

public class NameChecker {
    public String checkGender(String name){
        if (name.endsWith("a")){
            return "GIRL";
        } else {
         return "BOY";
        }
    }
    public String checkGenderOptionTwo(String name){
        return name.endsWith("a") ? "GIRL" : "BOY";
    }
}
