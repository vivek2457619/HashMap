import java.util.*;
public class HashPractice{

//Ques-1 : To find the majority element with frequency > n/3. 
public static void majorityElement(int nums[]){ //-O(n)
    HashMap<Integer,Integer>map = new HashMap<>();
    int n = nums.length;
    //to add elements in hashmap
    for(int i=0; i<n; i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i], map.get(nums[i])+1); //increase frequency by 1
        } else{
            map.put(nums[i], 1);
        }
    }
    //to traverse in hashmap
    for(HashMap.Entry<Integer,Integer>e:map.entrySet()){
        if(e.getValue() > n/3){
            System.out.println(e.getKey());
        }
    }
}

//Ques-2 : To find the union of two arrays using hashset - O(n)
    public static int Union(int arr1[], int arr2[]){
        HashSet<Integer>set = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }
        return set.size();
    }

//Ques-3 : To find the intersection of two arrays
public static int intersection(int arr1[], int arr2[]){
    HashSet<Integer>set = new HashSet<>();
    int count = 0; //to count total no. of common elements(Intersection)
    for(int i=0; i<arr1.length; i++){
        set.add(arr1[i]);
    }
    for(int j=0; j<arr2.length; j++){
        if(set.contains(arr2[j])){
            count++;
            System.out.print(count+" ");
            set.remove(arr2[j]); //remove the element so that it doesn't match again
        }
    }
    System.out.println();
    return count;
}

//Ques-4 //To print itenarary for given tickets
public static String getStart(HashMap<String,String>tick){
   
    //reverse hashmap of original hashmap
    HashMap<String,String>revMap = new HashMap<>();
    for(HashMap.Entry<String,String>e:tick.entrySet()){ //reverse Hashmap formed 
        revMap.put(e.getValue(), e.getKey());
    }

    for(HashMap.Entry<String,String>e:tick.entrySet()){
        if(!revMap.containsKey(e.getKey())){
            return e.getKey(); //start from where we have to start path
        }
    }
    return null;
}

public static void main(String[] args) {
    //Ques-1
    // int nums[] = {1, 3};
    // majorityElement(nums);

    //Ques-2
    // int arr1[] = {7, 3, 9};
    // int arr2[] = {6, 3, 9, 2, 9, 4};
    // System.out.println(Union(arr1, arr2));
    // System.out.println(intersection(arr1, arr2));

    //Ques-4
    // HashMap<String,String>ticket = new HashMap<>();
    // ticket.put("goa", "chennai");
    // ticket.put("chennai", "bengaluru");
    // ticket.put("delhi", "goa");
    // ticket.put("mumbai", "delhi");
    
    // String start = getStart(ticket);
    // while(ticket.containsKey(start)){
    //     System.out.print(start+"->");
    //     start = ticket.get(start); //start updated as a value
    // }
    // System.out.print(start);

    //Ques-5 //To print no. of subarrays whose sum == k
    int arr[] = {10, 2, -2, -20, 10};
    int k = -10, sum = 0, ans = 0;

    HashMap<Integer,Integer>map = new HashMap<>();
             //sum //frequency
    map.put(0, 1); //if array is empty
        
    for(int j=0; j<arr.length; j++){
        sum += arr[j]; //sum of subarray calculated
    
    if(map.containsKey(sum-k)){
        ans += map.get(sum-k);
    }
    if(map.containsKey(sum)){
        map.put(sum, map.get(sum)+1);
    } else{
        map.put(sum, 1);
    }}
    System.out.println(ans);
}}