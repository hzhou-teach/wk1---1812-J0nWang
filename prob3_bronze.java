import java.util.Scanner;
import java.io.*;
import java.io.FileNotFoundException;

/**
 * Name: Jonathan Wang
 * 1 hour so far.
 * Tests: Did not run yet
 * Feedback: I decided to go over read/write java because I created a usaco account and I want to run the tests.
 * However, I did not finish coding the calculation block. I think the difficulty of this question was medium because
 * it takes a bunch of if statements and other checks to make sure you are calculating the total buckets correctly.
 * I did not finish writing the code yet.
 */
public class prob3_bronze
{
    public static void main(String args[]){
        try{
            File file = new File("blist.in.txt");
            Scanner s = new Scanner(file);
            
            int n = s.nextInt();
            int[][] cowList = new int[n][3];
            
            for(int i = 0; i < n; i++){
                for(int k = 0; k < 3; k++){
                    cowList[i][k] = s.nextInt();
                    //System.out.println(cowList[i][k]); // WORKS.
                }
            } 
            
            int tMax = cowList[0][1]; // for hour FJ stops milking
            int sMin = cowList[0][0]; // for hour FJ starts milking
            for(int i = 0; i < cowList.length - 1; i++){
                if(cowList[i + 1][2] > tMax){
                    tMax = cowList[i][1];
                }
                if(cowList[i + 1][1] < sMin){
                    sMin = cowList[i][0];
                }
            }
            
            boolean sTrue = false;
            int count = sMin;
            int[] cowOn = new int[1000]; // filled with indexes of cows that are currently being milked
            int bucketNowAvaliable = 0;
            int totBucket = 0;
            for(int i = sMin; i < tMax; i++){
                do{
                    for(int k = 0; k < cowList.length; k++){
                        if(cowList[i][0] == sMin){
                            sMin = i; // i is current hour
                            cowOn[k] = k; // k will  be index of cow that started millking
                            for(int j : cowOn){
                                if(cowList[i][1] == i){
                                    bucketNowAvaliable += cowList[i][2];
                                }
                            }

                            totBucket += cowList[k][2];
                            // NOT DONE
                            /*
                             * Still calculating how many buckets to add to totBucket at specified hour
                             */
                            sTrue = true;
                        }
                    }
                } while(sTrue == false);
                
                
            }
            
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }   
        
        
        
         // in question it is 1 <= n <= 100 cows, so use READ WRITE METHODS
        // do a initial nextInt then create list based off n. so cowList[n * 3]; actually better to do 2d array I think
        /* so do cosList[n][]; then do for loop
         * int count = 0;
         * for(int i = 0; i < n; i++){
         *     count = 0;
         *     for(k = 0; k < 3; k ++){ // because three elements per cow
         *         cowList[n][k] = s.nextInt();
         *         count++
         }
         }
         *//*
        int s1 = s.nextInt();
        int t1 = s.nextInt();
        int b1 = s.nextInt();
        int s2 = s.nextInt();
        int t2 = s.nextInt();
        int b2 = s.nextInt();
        int s3 = s.nextInt();
        int t3 = s.nextInt();
        int b3 = s.nextInt();
        */
        
    }
}
/*
 * SAMPLE INPUT
 * 3
4 10 1
8 13 3
2 6 2
 */