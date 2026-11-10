package divideandconquer;
/*Chalo 💪
Ab **Merge Sort** ko properly samajhte hain — concept + code + complexity.

---

# 🧠 Merge Sort Concept

Ye **Divide & Conquer** algorithm hai.

3 steps:

1️⃣ **Divide**
Array ko half mein tod do.

2️⃣ **Conquer**
Har half ko recursively sort karo.

3️⃣ **Combine (Merge)**
Dono sorted halves ko merge karo.

---

## Example:

Input:

```
[6, 3, 9, 5, 2, 8]
```

Divide:

```
[6,3,9]    [5,2,8]
```

Phir:

```
[6] [3,9]
[3] [9]
```

Har element single ho gaya → base case.

Phir merge back:

```
[3,9]
[3,6,9]
```

Final:

```
[2,3,5,6,8,9]
```

---

# 🔥 Full Java Code

```java
import java.util.*;

public class MergeSort {

    public static void mergeSort(int arr[], int si, int ei) {

        if (si >= ei) {
            return;  // base case
        }

        int mid = si + (ei - si) / 2;

        mergeSort(arr, si, mid);      // left half
        mergeSort(arr, mid + 1, ei);  // right half

        merge(arr, si, mid, ei);      // merge both halves
    }

    public static void merge(int arr[], int si, int mid, int ei) {

        int temp[] = new int[ei - si + 1];

        int i = si;        // left iterator
        int j = mid + 1;   // right iterator
        int k = 0;         // temp iterator

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy back to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 5, 2, 8};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
```

---

# ⏱ Time Complexity

Recurrence:

```
T(n) = 2T(n/2) + O(n)
```

Why?

* 2 recursive calls
* Merging takes O(n)

Final:

```
O(n log n)
```

---

# 📦 Space Complexity

Extra temp array use ho raha hai.

```
O(n)
```

Recursion stack:

```
O(log n)
```

Total:

```
O(n)
```

---

# Important Interview Points

* Stable sort ✅
* Not in-place ❌
* Always O(n log n)
* Good for linked list

---

Next karein:
Quick Sort?
Ya recurrence derive karna detail mein? 💪

 */
public class mergesort {
   
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
             System.out.println(arr[i]+" ");

        }
        //
           
        
    }
    public static void mergesorting(int arr[],int si,int ei ){
         if(si>=ei){
        return;
    };
        int mid=si+(ei-si)/2;// si+ei/2
        mergesorting(arr, si, mid);//left part
        mergesorting(arr, mid+1, ei);//right part
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;//iterator forleft part
        int j=mid+1;//iterator fir rught part
        int k=0;//iterator for temp part
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;k++;
            }else{ temp[k]=arr[j];
                j++;k++;
            }
            
        }
        //leftpart
        while(i<=mid){
            temp[k++]=arr[i++];
        };
        //right part
        while(j<=ei){
            temp[k++]=arr[j++];
             };
             //copy to original array
             for(k=0,i=si;k<temp.length;k++,i++){
             arr[i]=temp[k];
             }

        

        
    }
            public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        mergesorting(arr,0,arr.length-1);
        printarr(arr);
    }
    
}
