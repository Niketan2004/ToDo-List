# 📋 To-Do List Application

Welcome to the **To-Do List Application** project! This simple and user-friendly application helps you keep track of your tasks, ensuring you stay organized and productive. 🚀

## ✨ Features

- 📝 Add new tasks with ease.
- ✏️ Edit tasks effortlessly.
- ❌ Delete tasks you no longer need.
- 📆 View all your tasks in a structured manner.
- 🎨 Enhanced UI with Tailwind CSS for a sleek and responsive design.
- 💻 Built with Spring Boot and Thymeleaf for seamless functionality.

## 🛠️ Technologies Used

- **Backend**: Spring Boot
- **Frontend**: Thymeleaf, HTML, Tailwind CSS, JavaScript
- **Database**: MySQL
- **Tools**: Maven, Postman

## Project Structure
```
📦 To-Do List Application
 ┣ 📂 src/main/java/com/todo
 ┃ ┣ 📜 controller/TaskController.java
 ┃ ┣ 📜 model/Task.java
 ┃ ┣ 📜 repository/TaskRepository.java
 ┃ ┗ 📜 service/TaskService.java
 ┣ 📂 src/main/resources
 ┃ ┣ 📂 static (CSS & JS files)
 ┃ ┣ 📂 templates (Thymeleaf HTML files)
 ┃ ┗ 📜 application.properties
 ┣ 📜 pom.xml (Maven dependencies)
 ┗ 📜 README.md
```
 
## 🎯 How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/Niketan2004/ToDo-List.git
   ``` 
2. Go to `application.properties` and make Database Configuration.

3. Navigate to the project directory:
   ```bash
   cd todo-list-application
   ```

4. Build the project using Maven:
   ```bash
   mvn clean install
   ```

5. Run the application:
   ```bash
   mvn spring-boot:run
   ```

6. Open your browser and go to:
   ```
   http://localhost:8080/todo/tasks
   ```

## 📸 Screenshots

1. **Home Page or Task List** 🏠
   ![Home Page](https://github.com/user-attachments/assets/4009ee10-e9cd-4069-8e2b-97d2b000021e)

2. **Add Task Page** ➕
   ![Add Task Page](https://github.com/user-attachments/assets/3572737e-40ea-426c-bec9-a8c72cf0fd56)

3. **Edit Task Page** ✏️
   ![Edit Task Page](https://github.com/user-attachments/assets/cee4d7e4-b16a-4983-bb0c-8c75e65e47ef)


## 💡 Future Enhancements

- ✅ Mark tasks as completed.
- 🔔 Add task reminder notifications.
- 📊 Add analytics to track task completion rates.

## 🤝 Contribution

Contributions are welcome! 🎉 If you have ideas or find bugs, feel free to create issues or submit pull requests. 

