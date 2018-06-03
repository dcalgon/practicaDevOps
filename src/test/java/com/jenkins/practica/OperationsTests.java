package com.jenkins.practica;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.jenkins.utils.DogsOperations;

public class OperationsTests {

	/**
	 * Checks if the operation getRandomDogImage returns a .jpg
	 */
	@Test
	public void testRandom() {
		 // Instantiate DogsOperations class
        DogsOperations dogsOperations = new DogsOperations();
        // Call getRandomDogImage operation and store the result on String
        String randomImageString  = dogsOperations.getRandomDogImage();
        // Assert true if the result string ends with '.jpg'
        assertTrue(randomImageString.contains(".jpg"));
	}
	
	/**
	 * Checks if the operation getBreedList returns a list of dogs (f.e. size > 0)
	 */
	@Test
	public void breedsList() {
		 // Instantiate DogsOperations class
        DogsOperations dogsOperations = new DogsOperations();
        // Call getBreedList operation and store the result on ArrayList
        List<String> breedList = dogsOperations.getBreedList();
        // Assert true if the result ArrayList has size of more than 0
        assertTrue (breedList.size()>0);
	}
}
