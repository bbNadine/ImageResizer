# Image Resizer App

## Overview
The Image Resizer App is a Java-based desktop application that allows users to calculate new dimensions for images, maintaining the aspect ratio based on user input. It features a simple graphical user interface (GUI) for ease of use. This project showcases the application of Java Swing for building GUIs and handling user input effectively.

## Features
- **User-Friendly Interface**: Simple and intuitive GUI allowing users to easily input image dimensions.
- **Aspect Ratio Maintenance**: Calculates new image dimensions while preserving the original aspect ratio.
- **Validation**: Checks for valid numerical input and provides feedback for incorrect entries.
- **Accessibility**: Keyboard navigation enabled for efficiency, including a 'Clear' button to reset input fields.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or newer installed on your machine.

### Running the Application
1. Clone the repository to your local machine:
2. Navigate to the project directory where the `ImageResizerGUI.java` file is located.
3. Compile the Java files:
4. Run the compiled `ImageResizerGUI` class to start the application:


## Usage
- **Original Width**: Enter the width of the original image in pixels.
- **Original Height**: Enter the height of the original image in pixels.
- **New Size**: Based on the selection (width or height), enter the desired new size to calculate the corresponding dimension.
- Press the **Calculate New Dimensions** button to view the calculated dimensions.
- Use the **Clear** button to reset all input fields.

## How It Works
The app utilizes Java Swing for the GUI components and event handling. Upon receiving the original dimensions and the user's input for the new size, it calculates the new dimensions using simple mathematical proportion formulas to ensure the aspect ratio remains unchanged.

## Contributions
Contributions are welcome! If you have suggestions or want to improve the app, feel free to fork the repository and submit a pull request.

## License
This project is open-sourced under the MIT License. See the LICENSE file for more details.

## Acknowledgments
- Special thanks to all contributors and reviewers who have helped in refining this app.
- This project was inspired by the need for a simple, yet effective tool for resizing images without losing their aspect ratio.

