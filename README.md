# Metro Point-of-Sales (POS) System

## Overview
The Metro Point-of-Sales (POS) System is a Java-based application designed for managing retail operations across multiple branches. The system includes hierarchical user roles with distinct responsibilities and functionality, ensuring streamlined management and operations. It features a database for persistent storage and a fallback mechanism to ensure continuity during internet outages. The user interface is developed using JavaScript for a seamless experience.

---

## Key Features

### User Roles
1. **Super Admin**
   - Added by the developer.
   - Responsible for creating server admin accounts.

2. **Server Admin**
   - Can create branch admins.
   - Manages the overall system at a high level.

3. **Branch Admin/Branch Manager**
   - Created after a branch is added.
   - Responsible for creating cashier and data entry operator accounts.

4. **Cashier/Data Entry Operator**
   - Manages day-to-day sales and data input operations.

### Data Storage
- **Online Database**: Primary storage hosted on a remote server.
- **Offline Mode**: If the internet is unavailable:
  - Data is temporarily saved in a local text file.
  - Users are prompted to sync the offline data to the database once the internet is restored.

---

## System Workflow
1. **Super Admin Setup**:
   - Super admin is pre-configured by the developer.
2. **Branch Management**:
   - Server admin creates a branch admin after adding a new branch.
   - Branch admin is upgraded to manage the branch.
3. **Role Creation**:
   - Branch admin creates cashiers or data entry operators for daily operations.
4. **Offline Data Handling**:
   - Data is saved locally when offline.
   - On internet restoration, the user is prompted to sync local data with the online database before resuming normal operations.

---

## Technologies Used
- **Backend**: Java
- **Frontend**: Java
- **Database**: Hosted online for centralized storage
- **Local Storage**: Text files for offline mode

---

## Prerequisites
- Java Development Kit (JDK 8 or later)
- Internet connection for database operations
- A hosting service for the online database

---

## Installation
1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```bash
   cd metro-pos-system
   ```
3. Compile the Java backend:
   ```bash
   javac -d bin src/**/*.java
   ```
4. Start the system:
   ```bash
   java -cp bin Main
   ```

---

## Usage
1. Launch the system and log in with the appropriate role.
2. Follow the prompts to add branches, create accounts, or manage data.
3. In offline mode, ensure to sync local data once the internet is restored.

---

## Future Enhancements
- Add reporting tools for sales analysis.
- Include support for multiple payment methods.
- Enhance UI for mobile compatibility.

---

## License
This project is licensed under the [MIT License](LICENSE).

---

## Contributions
Contributions are welcome! Please submit pull requests or raise issues to report bugs or suggest new features.
