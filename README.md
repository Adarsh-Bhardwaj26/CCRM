# Campus Course & Records Manager (CCRM)

CCRM is a Java console application designed for university-level student, course, enrollment, grading, and file utilities management. It supports interactive CLI-based operations such as adding/listing/updating/deactivating students and courses, enrolling and grading, transcript viewing, and data import/export/backup.

## Features

- Student Management: Add, list, update, deactivate students, view student profiles and transcripts
- Course Management: Add, list, update, deactivate courses, search/filter courses, assign instructors
- Enrollment & Grading: Enroll/unenroll students in courses with business rules, record grades, compute GPA, view transcripts
- File Operations: Import/export CSV files for students/courses, backup and restore project data, recursive directory size checking
- Instructor Assignment: Assign instructors when adding/updating courses
- CLI Workflow: Menu-driven console with intuitive options for all features

## Folder Structure

CCRM/
├── src/
│ └── edu/ccrm/
│ ├── cli/
│ ├── config/
│ ├── domain/
│ ├── service/
│ ├── io/
│ └── util/
├── students.csv
├── courses.csv
├── README.md
├── USAGE.md
├── requirements.md



## Technologies

- Java 17 or higher
- Uses NIO.2 for file and backup operations
- No external dependencies required

## Author

- ADARSH BHARDWAJ

## Contact

- adarshbhardwajlnc@gmail.com