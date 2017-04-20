public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result= new ArrayList<>();
          for(long i=1;i<=n;i++){
            if(i%3 !=0 && i%5!=0) {
                Long s=new Long(i);
                String ss=s.toString();
                result.add(ss);
            }
            else if(i%3==0 && i%5!=0) result.add("Fizz");
            else if(i%3!=0 && i%5==0) result.add("Buzz");
            else result.add("FizzBuzz");
        }
        return result;
    }
}