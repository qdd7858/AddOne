public class Main {

    public int[] plusOne(int[] digits) {
        boolean addOne = true;
        for (int i = digits.length-1; i >= 0; i--){
            if(addOne){
                addOne = (++digits[i]/10 == 1);
                digits[i]%=10;
            }
            else break;
        }
        if (addOne){
            int[] result = new int[digits.length+1];
            result[0] = 1;
            for (int j = 1; j < result.length; j++) result[j] = digits[j-1];
            return result;
        }
        return digits;
    }

    public static void main(String[] args){
        Main m = new Main();
        for (int i: m.plusOne(new int[]{9})){
            System.out.print("["+i+"]");
        }
    }
}
