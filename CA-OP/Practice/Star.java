/**
 1. 왼쪽 정렬 직각삼각형
*
**
***
****
*****
 2. 오른쪽 정렬 직각삼각형
    *
   **
  ***
 ****
*****
3. 정방향 직각삼각형
    *
   ***
  *****
 *******
 */

package Practice;

public class Star {
    public static void main(String[] args) {
        // 1. 왼쪽 정렬 직각삼각형
        System.out.println("1. 왼쪽 정렬 직각삼각형");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. 오른쪽 정렬 직각삼각형
        System.out.println("2. 오른쪽 정렬 직각삼각형");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 3. 정방향 직각삼각형
        System.out.println("3. 정방향 직각삼각형");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}