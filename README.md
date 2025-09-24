# Campus Course & Records Manager (CCRM) - Java Project

## Project Overview

This Java project implements a comprehensive **Campus Course & Records Manager (CCRM)** system that demonstrates various core Java concepts through a practical application. The system manages student records, course information, enrollments, grades, and file operations, showcasing object-oriented programming principles, file I/O, collections framework, and menu-driven console applications.

### Getting It Running

**What You Need:**
- Java 17 or newer (I'm using OpenJDK 17.0.12)
- Any Java IDE like Eclipse or IntelliJ
- Windows, Mac, or Linux - doesn't matter

Here's my Java version output:
```bash
C:\Users\Adarsh Bhardwaj>java -version
openjdk version "17.0.12" 2024-07-16
OpenJDK Runtime Environment Temurin-17.0.12+7 (build 17.0.12+7)
OpenJDK 64-Bit Server VM Temurin-17.0.12+7 (build 17.0.12+7, mixed mode, sharing)
```

**Running the Application:**
```bash
# Get to the project folder
cd CCRM

# Compile everything
javac -cp . src/edu/ccrm/cli/*.java src/edu/ccrm/*/*.java

# Start the app
java -cp . src.edu.ccrm.cli.MainMenu

# Or if you prefer:
java -cp src edu.ccrm.cli.MainMenu
```

Just fire up your IDE, open MainMenu.java, and hit run if you want the easy route.

# Run with assertions enabled
java -ea -cp . MainApplication

# Compile and run specific examples
javac ExampleClass.java
java ExampleClass
```

## Evolution of Java

• **1995**: Java 1.0 - Initial release by Sun Microsystems, "Write Once, Run Anywhere"
• **1997**: Java 1.1 - Inner classes, JavaBeans, JDBC, RMI
• **1998**: Java 2 (J2SE 1.2) - Swing GUI, Collections Framework
• **2000**: Java 2 (J2SE 1.3) - HotSpot JVM, JNDI
• **2002**: Java 2 (J2SE 1.4) - Regular expressions, NIO, XML processing
• **2004**: Java 5 (J2SE 1.5) - Generics, annotations, autoboxing, enhanced for-loop
• **2006**: Java 6 (Java SE 6) - Performance improvements, scripting support
• **2011**: Java 7 (Java SE 7) - Try-with-resources, diamond operator, switch on strings
• **2014**: Java 8 (Java SE 8) - Lambda expressions, streams, default methods
• **2017**: Java 9 - Module system, JShell
• **2018**: Java 10 - Local variable type inference (var)
• **2018**: Java 11 - LTS release, HTTP client, string methods
• **2019**: Java 12-13 - Switch expressions, text blocks (preview)
• **2020**: Java 14-15 - Records (preview), sealed classes (preview)
• **2021**: Java 16-17 - LTS release, pattern matching, sealed classes
• **2022-2024**: Java 18-21 - Virtual threads, pattern matching enhancements

## Java Platform Comparison

| Feature | Java ME (Micro Edition) | Java SE (Standard Edition) | Java EE (Enterprise Edition) |
|---------|-------------------------|----------------------------|-------------------------------|
| **Target** | Mobile devices, IoT, embedded systems | Desktop applications, general-purpose | Enterprise web applications, servers |
| **Size** | Lightweight, minimal footprint | Full-featured | Comprehensive enterprise features |
| **APIs** | Limited core APIs, CLDC, MIDP | Complete core APIs, Swing, AWT | SE + web services, servlets, EJB |
| **Memory** | Low memory requirements (KB-MB) | Moderate memory usage | High memory requirements |
| **Examples** | Smart cards, sensors, mobile apps | Desktop apps, utilities | Web applications, microservices |
| **Components** | KVM, CLDC/CDC profiles | JVM, comprehensive libraries | Application servers, web containers |

## JDK, JRE, and JVM Explanation

### JVM (Java Virtual Machine)
- **Purpose**: Runtime environment that executes Java bytecode
- **Components**: Class loader, bytecode verifier, interpreter/JIT compiler
- **Platform-specific**: Different implementations for different operating systems
- **Memory management**: Heap, stack, method area, garbage collection

### JRE (Java Runtime Environment)
- **Includes**: JVM + Core libraries + Supporting files
- **Purpose**: Provides runtime environment for executing Java applications
- **Components**: JVM, Java class libraries, Java application launcher
- **For**: End users who need to run Java applications

### JDK (Java Development Kit)
- **Includes**: JRE + Development tools
- **Purpose**: Complete development environment for Java applications
- **Tools**: javac (compiler), java (launcher), jar, javadoc, debugger
- **For**: Developers who create Java applications

```
JDK = JRE + Development Tools
JRE = JVM + Core Libraries
JVM = Runtime execution environment
```

## Windows Installation Steps

### JDK Installation

1. **Download JDK**
   - Visit [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.org/)
   - Select Windows x64 installer
   
2. **Installation Process**
   - Run the downloaded installer
   - Follow installation wizard
   - Choose installation directory (default: `C:\Program Files\Java\jdk-XX`)
   
3. **Environment Variables Setup**
   - Right-click "This PC" → Properties → Advanced System Settings
   - Click "Environment Variables"
   - Add new System Variable: `JAVA_HOME` = JDK installation path
   - Edit `PATH` variable, add: `%JAVA_HOME%\bin`

4. **Verification**
   ```bash
   C:\Users\Adarsh Bhardwaj>java -version
   openjdk version "17.0.12" 2024-07-16
   OpenJDK Runtime Environment Temurin-17.0.12+7 (build 17.0.12+7)
   OpenJDK 64-Bit Server VM Temurin-17.0.12+7 (build 17.0.12+7, mixed mode, sharing)
   ```

**Screenshots Available:**
- `screenshots/java-version-verification.png` - Shows successful OpenJDK 17.0.12 installation

### Eclipse IDE Setup

1. **Download Eclipse**
   - Visit [Eclipse Downloads](https://www.eclipse.org/downloads/)
   - Download "Eclipse IDE for Java Developers"

2. **Installation**
   - Extract downloaded archive
   - Run `eclipse.exe`
   - Select workspace directory

3. **Project Setup**
   - File → New → Java Project
   - Enter project name
   - Select JRE version
   - Create project structure

4. **Configuration**
   - Window → Preferences → Java → Installed JREs
   - Verify correct JDK is selected
   - Configure compiler compliance level

**Screenshots Available:**
- `screenshots/eclipse-workspace-ccrm.png` - Shows CCRM project structure in Eclipse
- `screenshots/project-explorer.png` - Project folder organization with src/edu/ccrm structure
- `screenshots/mainmenu-java.png` - MainMenu.java file open in Eclipse editor

## Java Concepts Covered

This project touches on pretty much every important Java topic you'd encounter in a programming course:

**Core Programming Stuff:**
- **Console Interface** (`cli/MainMenu.java`) - The main menu system where everything starts
- **Classes and Objects** (`domain/` folder) - Student, Course, and Enrollment classes with proper encapsulation
- **File Operations** (`io/FileManager.java`) - Reading and writing CSV files, plus backup functionality
- **Collections** (`service/` classes) - Using ArrayLists and HashMaps to manage data in memory
- **Exception Handling** - Try-catch blocks throughout for handling file errors and invalid input
- **String Processing** (`util/StringUtils.java`) - Generating registration numbers, formatting output

**Advanced Topics:**
- **Package Organization** - Everything's organized in `edu.ccrm` packages following Java conventions
- **Business Logic** (`service/EnrollmentService.java`) - GPA calculations, enrollment rules, transcript generation  
- **Data Validation** (`util/ValidationUtil.java`) - Email format checking, enrollment prerequisites
- **NIO.2 File System** - Modern Java file handling for the backup system
- **CSV Processing** - Custom parsing without external libraries

**Real-World Application:**
The system shows how all these concepts work together in an actual program. When you add a student, it validates the email, generates a unique registration number (like 24bce10747), stores it in memory using collections, and can export everything to CSV files.

**OOP in Practice:**
- Student class encapsulates all student data with private fields and public methods
- Course class handles course information and instructor assignments  
- Enrollment class manages the relationship between students and courses
- Service classes contain the business logic separated from data models

## Assertions and Sample Commands

### Enabling Assertions

Assertions in Java are disabled by default in production. Enable them for development and testing:

**Command Line Options:**
```bash
# Enable all assertions
java -ea MyProgram
java -enableassertions MyProgram

# Enable assertions for specific package
java -ea:com.mycompany.mypackage... MyProgram

# Enable assertions for specific class
java -ea:com.mycompany.MyClass MyProgram

# Disable assertions (default)
java -da MyProgram
java -disableassertions MyProgram
```

**Eclipse Configuration:**
1. Right-click project → Run As → Run Configurations
2. Select Java Application
3. Go to Arguments tab
4. Add `-ea` to VM arguments

### Sample Assertion Code

```java
public class AssertionExample {
    public static void main(String[] args) {
        int age = 25;
        
        // Simple assertion
        assert age > 0 : "Age cannot be negative";
        
        // Assertion with boolean expression
        assert (age >= 18) : "Must be adult: " + age;
        
        System.out.println("All assertions passed!");
    }
}
```

**Sample Commands:**
```bash
# Compile the CCRM project
javac -cp . src/edu/ccrm/cli/MainMenu.java

# Run without assertions (default)
java -cp . src.edu.ccrm.cli.MainMenu

# Run with assertions enabled for debugging
java -ea -cp . src.edu.ccrm.cli.MainMenu

# Run with package-specific assertions
java -ea:edu.ccrm... src.edu.ccrm.cli.MainMenu
```

## How the Code is Organized

```
CCRM/
├── src/
│   └── edu/
│       └── ccrm/
│           ├── cli/
│           │   └── MainMenu.java          # Where it all starts
│           ├── config/
│           │   └── BackupManager.java     # Handles data backups
│           ├── domain/
│           │   ├── Student.java           # Student data model
│           │   ├── Course.java            # Course information
│           │   └── Enrollment.java        # Links students to courses
│           ├── service/
│           │   ├── StudentService.java    # Student business logic
│           │   ├── CourseService.java     # Course operations
│           │   └── EnrollmentService.java # Enrollment and grading
│           ├── io/
│           │   ├── FileManager.java       # CSV import/export
│           │   └── CSVProcessor.java      # CSV parsing utilities
│           └── util/
│               ├── ValidationUtil.java   # Input validation
│               └── StringUtils.java      # String operations
├── students.csv                           # Student data storage
├── courses.csv                           # Course data storage  
├── screenshots/
│   ├── java-version-verification.png
│   ├── eclipse-project-explorer.png
│   ├── ccrm-main-menu.png
│   ├── student-management-demo.png
│   ├── file-operations-menu.png
│   └── student-profile-display.png
├── README.md
├── USAGE.md
└── requirements.md
```

The structure follows standard Java practices - everything's in packages, business logic is separated from data models, and utility classes handle common operations. The CSV files store all the data, so you don't need a database to run this.

## Screenshots

### Java Installation Check
![Java Version](screenshots/java-version-verification.png)

### Eclipse Project Structure  
![Project Explorer](screenshots/eclipse-project-explorer.png)

### Main Application Menu
![CCRM Main Menu](screenshots/ccrm-main-menu.png)

### Student Management in Action
![Student Operations](screenshots/student-management-demo.png)

### File Operations Menu
![File Utilities](screenshots/file-operations-menu.png)

### Student Profile Display
![Profile Output](screenshots/student-profile-display.png)

## Additional Resources

### Documentation Files
- **USAGE.md**: Comprehensive user guide with step-by-step instructions
- **requirements.md**: Detailed project specifications and functional requirements  
- **README.md**: This complete technical documentation

### Data Files
- **students.csv**: Primary student data storage
- **courses.csv**: Course information and instructor assignments
- **Backup System**: Automated backup creation with timestamp-based versioning

## Additional Notes

### Best Practices
- Always use meaningful variable and method names
- Follow Java naming conventions (camelCase for variables/methods, PascalCase for classes)
- Include proper exception handling
- Use comments and documentation
- Enable assertions during development and testing

### Troubleshooting
- If `java -version` fails, check PATH environment variable
- For Eclipse issues, verify workspace and JDK configuration
- Compilation errors: Check classpath and import statements
- Runtime errors: Enable assertions and check console output

### Resources
- [Oracle Java Documentation](https://docs.oracle.com/en/java/)
- [Eclipse IDE Documentation](https://help.eclipse.org/)
- [Java Tutorials](https://docs.oracle.com/javase/tutorial/)
- [OpenJDK Documentation](https://openjdk.org/)