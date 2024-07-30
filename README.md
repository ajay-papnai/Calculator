# Calculator App

This is a simple calculator application built using Java. It leverages the power of the [EvalEx](https://github.com/uklimaschewski/EvalEx) - Java Expression Evaluator library to handle and evaluate mathematical expressions efficiently.

## Features

- Basic arithmetic operations: addition, subtraction, multiplication, and division
- Support for parentheses to control the order of operations
- Evaluation of complex mathematical expressions
- User-friendly interface for easy input and result display

## Getting Started

### Prerequisites

Before you begin, ensure you have the following installed on your machine:

- Java Development Kit (JDK) 8 or later
- Maven

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/ajay-papnai/Calculator.git
   cd Calculator
2. Install Dependencies:
   ```bash
   mvn install

3. Build the Project:
   ```bash
   mvn compile
4. Run the Application:
   ```bash
   mvn exec:java -Dexec.mainClass="com.ajaypapnai.calculator.Main"

### Usage
• Open the application and enter your mathematical expressions.

• The calculator will evaluate and display the result.

### Example Usage
```text
Input: (3 + 5) * 2
Output: 16
```
### Built With
•  [EvalEx](https://github.com/uklimaschewski/EvalEx): A Java Expression Evaluator library used for evaluating mathematical expressions.

### Contributing
Contributions are welcome! Please fork this repository and submit a pull request with your improvements.


### Acknowledgments
Special thanks to [uklimaschewski](https://github.com/uklimaschewski) for creating and maintaining the EvalEx library.

