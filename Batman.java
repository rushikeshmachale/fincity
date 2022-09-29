package Coding;

public class Batman {
    public static void main(String[] args) {
//        In your job as a Bat programmer, you need to write a function/method to find out how many steps it requires for Batman to tag every so Asylum staff can pick them up. Tagging involves reaching the patient and returning to the asylum to hand over the tag injector and pick up a new one. Assume Batman can run at infinite steps in the time requiring the patient one to take one step. In other words, he can tag all the patients in the same instance but must make it to each patient.
//
//        Input:
//        You will get the number of patients who escaped and at what step of the first patient Batman started.
//
//                Example:
//        findNumOfStepsRequired(3, 10) returns 30
//        Explanation:
//        After ten steps patient one is 10 steps away from the asylum. After ten steps of patient one, patient two is 20 steps away from the asylum. After ten steps of patient one, patient three is 30 steps away from the asylum.


        System.out.println(findNumOfStepsRequired(3, 10));
    }
    static int findNumOfStepsRequired(int patients, int start){
       int ans = patients*start;
        return ans;
    }
}
