# 🚀 **Mission: Mars Deployment - CI/CD Challenge** 🌌

## **Mission Briefing**
Congratulations, engineer! You have been selected as the **Lead DevOps Engineer** for **SpaceX MarsOps**, a team responsible for deploying the first-ever **Martian CRUD (Create, Read, Update, Delete) Application**. Your task is to set up a **fully automated CI/CD pipeline** that ensures our **Mission Control CRUD System** (a simple CRUD app) is always built, tested, and packaged properly. 

However, the mission has strict **compliance, reliability, and automation** requirements! You must ensure:

**1. Code is always tested before packaging**  
**2. Builds are automated and optimized**  



---

## **🛠️ Mission Tasks**

### 🚦 **Phase 1: Mission Repository Initialization**
1. **Create a Git repository** for your project (GitHub).
2. Create and add a simple **CRUD application** that manages space station resource stock (e.g., product name, id, quantity ) using a relational or NoSQL database (preferably in-memory) and exposes the required REST endpoints.
   - Supported stacks: Flask/Django, Node.js (Express), Java (Spring Boot), DBs: SQLite, H2, MongoDB etc.
3. Ensure the application runs locally and document the setup in a `README.md`.
4. Push the code to your repository.

---

### 🚀 **Phase 2: CI - Mission Safety Checks**
**Goal:** Ensure the mission code is always tested and reviewed before proceeding to the next phase.

1. **Choose a CI/CD tool** (GitHub Actions).
2. **Implement automated checks**:
   - **Code Quality Check** using ESLint/PyLint/Checkstyle.
   - **Unit Tests** with Jest, PyTest, or JUnit.
3. **Configure branch protection rules**:  
   - Only merge changes into the `main` branch after passing checks.

**Mission Success Criteria:**  
Every code commit triggers a **CI pipeline** that performs tests and quality checks.

---

### 🚢 **Phase 3: Build Automation - The Martian Compiler**
**Goal:** Automate the application build process to ensure a deployable artifact.

1. **Use a build automation tool**:
   - **Java** → Use **Maven/Gradle** to generate a `.jar` file.
   - **Python** → Use `setup.py` and package the app.
   - **Node.js** → Use `webpack` or `npm build`.
2. **Dockerize the application**:
   - Write a `Dockerfile` to package the app.
   - Build the Docker image and store it in **Docker Hub** (ensure the confidentiality of your docker credentials by storing them as GitHub secrets).

**Mission Success Criteria:**  
The CI pipeline automatically builds and stores a deployable artifact.



## 🎯 **Bonus Challenge: Intergalactic Infrastructure as Code (IaC) + Simple UI**
**(Optional, for extra credit!)**  
- Use **Docker Compose** to **automate local environment setup**.
- **Create a very simple UI** (JavaScript-based, using React, Vue, or plain HTML/CSS/JS) to interact with the CRUD application.
- **Docker Compose the frontend with the backend (CRUD App)**, ensuring they run together seamlessly.

**Mission Success Criteria:**  
The entire application stack (UI + Backend + Database) can be **started with one command** using Docker Compose!  
The UI provides a basic interface for users to **perform CRUD operations** on the backend.

---

## **Submission Guidelines**
**Final Deliverables**:
- **GitHub Repository Link** (including `README.md`).
- **CI/CD Configuration File** (e.g., `.github/workflows/main.yml`).
- **Dockerfile + Build Scripts**.
- **Invite us to the repository** (**GitHub Username: `tasosger`**), (**GitHub Username: `Cristian-Scobioala`**).

---

## **Grading Rubric**

| Category                        | Points |
|---------------------------------|--------|
| CI Pipeline (Testing & Linting) | 50     |
| Build Automation (Docker, Artifacts) | 50     |
| Bonus: IaC | +30     |

---

## **🚀 Final Words**
You are responsible for ensuring the **first-ever Martian CRUD system build pipeline** is a **resounding success**. Will your pipeline withstand cosmic rays , meteor showers, and human errors? **Good luck, DevOps Astronaut!** 
