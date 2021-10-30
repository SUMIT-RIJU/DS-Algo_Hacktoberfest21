#include <stdio.h>
// simple sorting algorithm implemented requiring array and array size as input
void sort(int arr[],int count){
    int temp;
     for (int i = 0; i < count ; i++) {
        for(int j = 0; j < count-i-1; j++){
            if(arr[j]>arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}

int main()
{
    int arr[5] = {5,4,3,2,1};
    int count = sizeof(arr)/sizeof(arr[0]);
    printf("Actual array is : ");
    for (int i = 0; i < count ; i++) {
        printf("%d ",arr[i]);
    }
    printf("\n");
    sort(arr,count);
    printf("Sorted Array is : ");
    for (int i = 0; i < count ; i++) {
        printf("%d ",arr[i]);
    }
}
