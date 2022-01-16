import java.util.Scanner;

/**
 * Name: Jonathan Wang
 * 14 min (HOWEVER, I FORGOT HOW TO READ/WRITE INTO FILE SO I DIDN'T DO IT YET)
 * Tests: Did not run through any tests because I didn't have a usaco account yet. (I created one now) However, passed manual sample test.
 * Feedback: This was the easiest one out of the three so I did it first. I forgot how to do read/write (last time 
 * I did them was a year ago, so I decided to hard code a solution and then move on so I can get done with the "calulation"
 * parts of all three programs. Upon a manuel run, this code passed the sample test (using System.out.println() for output).
 */
public class prob2_bronze
{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        int c1max = s.nextInt();
        int c1val = s.nextInt();
        int c2max = s.nextInt();
        int c2val = s.nextInt();
        int c3max = s.nextInt();
        int c3val = s.nextInt();
        
        int cowTurn = 1;
        for(int i = 0; i < 100; i++){
            if(cowTurn > 3){
                cowTurn = 1;
            }
            
            if(cowTurn == 1){
                if(c1val + c2val > c2max){
                    c1val -= c2max - c2val;
                    c2val = c2max;
                    
                }
                else{
                    c2val += c1val;
                    c1val = 0;
                }
            }
            if(cowTurn == 2){
                if(c2val + c3val > c3max){
                    c2val -= c3max - c3val;
                    c3val = c3max;
                    
                }
                else{
                    c3val += c2val;
                    c2val = 0;
                }
            }
            if(cowTurn == 3){
                if(c3val + c1val > c1max){
                    c3val -= c1max - c1val;
                    c1val = c1max;
                    
                }
                else{
                    c1val += c3val;
                    c3val = 0;
                }
            }
            cowTurn++;
        }
        
        System.out.println(c1val + "\n" + c2val + "\n" + c3val);
    }
}
/*
 * SAMPLE TEST
 * 10 3
 * 11 4
 * 12 5
 * 
 * took 3 attempts, fixed logic errors two times.
 * Completed within 14 min (BUT I NEED TO READ WRITE FILE CODE)
 */
