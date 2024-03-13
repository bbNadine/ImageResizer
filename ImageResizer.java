import java.util.Scanner;

public class ImageResizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***Welcome to the Image Resizer!***\n");
        
        System.out.println("Enter original width: ");
        int originalWidth = scanner.nextInt();
        
        System.out.println("Enter original height: ");
        int originalHeight = scanner.nextInt();
        
        System.out.println("Resize by (1) width or (2) height? Enter 1 or 2:");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            System.out.println("Enter new width: ");
            int newWidth = scanner.nextInt();
            
            int newHeight = (originalHeight * newWidth) / originalWidth;
            System.out.println("New dimensions: " + newWidth + "x" + newHeight);
        } else if (choice == 2) {
            System.out.println("Enter new height: ");
            int newHeight = scanner.nextInt();
            
            int newWidth = (originalWidth * newHeight) / originalHeight;
            System.out.println("New dimensions: " + newWidth + "x" + newHeight);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }
        
        scanner.close();
    }
}
