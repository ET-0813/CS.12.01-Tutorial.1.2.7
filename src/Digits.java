import jdk.internal.org.objectweb.asm.tree.InsnList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Digits {

    private ArrayList<Integer> digitList;

    public Digits(int num)
    {
        if(num < 0){
            throw new IllegalArgumentException("The number passed to the constructor (-1984) cannot be negative!");
        }
        digitList = new ArrayList<>();
        String numStr = String.valueOf(num);
        for (int i = 0; i < numStr.length(); i++) {

            digitList.add(Character.getNumericValue(numStr.charAt(i)));

        }

    }
    
    


    public boolean isStrictlyIncreasing()
    {

        for(int i = 0; i < digitList.size()-1; i++){
            if (digitList.get(i) >= digitList.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> getDigitList() {
        return digitList;
    }

}
