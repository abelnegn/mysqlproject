package com.example.mysqlproject;

import com.example.mysqlproject.dao.ProfileService;
import com.example.mysqlproject.model.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class MysqlprojectApplication implements CommandLineRunner{

	@Autowired
	private ProfileService profileService;

	public static void main(String[] args) {
		SpringApplication.run(MysqlprojectApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

/*		int arr[] = {10,20,30,40,50, 60, 70, 80, 90};
		int key = 90;
		int last=arr.length-1;
		binarySearch(arr,0,last,key);*/

		int arr[] ={3,60,35,2,45,320,5};

		System.out.println("Array Before Bubble Sort");
		for(int i=0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		bubleSort(arr);//sorting array elements using bubble sort

		System.out.println("Array After Bubble Sort");
		for(int i=0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}

	}

	private void binarySearch(int array[], int first, int last, int key){
		int mid = (first + last)/2;

		while(first <= last){
			if(array[mid] < key){
				first = mid + 1;
			}else if(array[mid] == key){
				System.out.println("Element is found at index " + mid);
				break;
			}else{
				last = mid - 1;
			}
			mid = (first + last)/2;
		}
		if(first > last){
			System.out.println("Element is not found");
		}
	}

	private int linearSearch(int[] arr, int key){
		for(int i=0;i<arr.length;i++){
			if(arr[i] == key){
				return i;
			}
		}
		return -1;
	}

	private void bubleSort(int[] arr){
		int n = arr.length;
		int temp = 0;

		for(int i=0; i<n; i++){
			for(int j=1; j < (n-i); j++){
				if(arr[j-1] > arr[j]){
					//swap elements
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
