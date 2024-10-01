// Write a java program to make addition, Subtraction and multiplication of two matrix using 2-D Array

package com.assignment2;

import java.util.Scanner;

public class MatrixOperations 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions for the matrices
        System.out.print("Enter the number of rows for the matrices: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for the matrices: ");
        int cols = scanner.nextInt();

        // Initialize matrices
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        // Input elements for the first matrix
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input elements for the second matrix
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Perform matrix addition
        int[][] additionResult = addMatrices(matrix1, matrix2, rows, cols);
        // Perform matrix subtraction
        int[][] subtractionResult = subtractMatrices(matrix1, matrix2, rows, cols);
        // Perform matrix multiplication
        int[][] multiplicationResult = multiplyMatrices(matrix1, matrix2, rows, cols);

        // Display results
        System.out.println("Matrix Addition:");
        printMatrix(additionResult, rows, cols);
        System.out.println("Matrix Subtraction:");
        printMatrix(subtractionResult, rows, cols);
        System.out.println("Matrix Multiplication:");
        printMatrix(multiplicationResult, rows, cols);

        scanner.close();
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
