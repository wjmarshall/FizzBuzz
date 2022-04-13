package FizzBuzz;

import java.util.ArrayList;

public class FizzBuzz {
  int finalNum;

  public FizzBuzz(int num) {
    finalNum = num;
  }

  public static void main(String[] args) {
    FizzBuzz fb = new FizzBuzz(100);
    ArrayList<String> sequence = fb.generateSequence();
    for (int i = 0; i < sequence.size(); i++) {
      System.out.println(sequence.get(i));
    }
  }

  public String generateValue(Integer num) {
    if (num % 15 == 0) {
      return "FizzBuzz";
    } else if (num % 3 == 0) {
      return "Fizz";
    } else if (num % 5 == 0) {
      return "Buzz";
    } else {
      return num.toString();
    }
  }

  public ArrayList<String> generateSequence() {
    ArrayList<String> sequence = new ArrayList<String>();
    for (int i = 1; i <= finalNum; i++) {
      sequence.add(generateValue(i));
    }
    return sequence;
  }
}
