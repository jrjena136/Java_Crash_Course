package org.javalearning.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class MinimalParkingSpaces {
    private static int minParkingSpaces(int[][] parkingStartEndTimes) {
        /*
        Solution -1
         */
        /*int result = 0;
        int count = 0;
        List<ParkingRecord> parkingRecords = new ArrayList<>();

        for (int i = 0; i < parkingStartEndTimes.length; i++) {
            parkingRecords.add(new ParkingRecord(parkingStartEndTimes[i][0], true));
            parkingRecords.add(new ParkingRecord(parkingStartEndTimes[i][1], false));
        }
        System.out.println("Before--->" + parkingRecords);

        Collections.sort(parkingRecords, new ParkingRecord());
        System.out.println("After--->" + parkingRecords);

        for (ParkingRecord pr : parkingRecords) {
            if (pr.arrived) {
                count++;
                result = Math.max(result, count);
                System.out.println("count--->" + count + " result--->" + result);
            } else {
                count--;
            }
        }
        System.out.println("count--->" + count + " result--->" + result);
        return result;*/

        /*
        Solution -2
         */
        if(parkingStartEndTimes.length<=1)
            return parkingStartEndTimes.length;
        Arrays.sort(parkingStartEndTimes, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int max = 0, cur = 1, end = parkingStartEndTimes[0][1];
        for(int i = 0; i < parkingStartEndTimes.length - 1; i++){
            if(end > parkingStartEndTimes[i + 1][0]){
                cur++;
                max = cur > max ? cur : max;
            }else {
                cur--;
            }
            end = Math.max(end, parkingStartEndTimes[i+1][1]);
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine().trim());
        int[][] parkingStartEndTimeList = new int[n][2];
        String[] parkingStartEndTimes = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            String[] parkingStartEndTime = parkingStartEndTimes[i].split(",");
            for (int j = 0; j < parkingStartEndTime.length; j++) {
                parkingStartEndTimeList[i][j] = Integer.parseInt(parkingStartEndTime[j]);
            }
        }

        int out = minParkingSpaces(parkingStartEndTimeList);
        System.out.println(out);

        wr.close();
        br.close();
    }
}

class ParkingRecord implements Comparator<ParkingRecord> {
    int time;
    boolean arrived;

    public ParkingRecord(int time, boolean arrived) {
        this.time = time;
        this.arrived = arrived;
    }

    public ParkingRecord() {

    }

    @Override
    public int compare(ParkingRecord p1, ParkingRecord p2) {
        return p1.time - p2.time;
    }

    @Override public String toString() {
        return "ParkingRecord(" + time + "," + arrived + ")";
    }
}