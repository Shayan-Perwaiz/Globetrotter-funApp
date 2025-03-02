# 🌍 Globetrotter Challenge

Welcome to the **Globetrotter Challenge** – a fun and interactive web app where users guess famous travel destinations based on cryptic clues! 🌎✈️

## 🚀 Features
- **Random Travel Clues:** Get random hints about famous destinations.
- **Multiple-Choice Answers:** Select the right destination from options.
- **Instant Feedback:** 🎉 Confetti for correct answers, 😢 sad animation for incorrect ones.
- **Score Tracking:** Keep track of your correct and incorrect guesses.
- **Challenge a Friend:** Invite your friends to compete!
- **Fully Backend-Powered:** Data is stored and retrieved from the backend to prevent cheating.

##  Tech Stack
- **Backend:** Java, Spring Boot, Spring Data JPA, Hibernate, MySQL
- **Frontend:** HTML, CSS, JavaScript (Vanilla JS)
- **Security:** Spring Security, JWT Authentication
- **Database:** MySQL (Hosted on Railway)
- **Deployment:** Hosted on **Vercel / Netlify** (Frontend) & **Railway** (Backend)




#### **Set Up MySQL Database**
1. Ensure MySQL is installed and running.
2. Update `application.properties` with your MySQL credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/globaltrotter
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   ```




### **4️⃣ Deploy to Vercel / Netlify (Frontend)**
```sh
vercel deploy
# OR
netlify deploy
```

### **5️⃣ Deploy to Railway (Backend)**
```sh
railway up
```

## 📜 API Endpoints
### **1️⃣ Destination API**
| Method | Endpoint | Description |
|--------|---------|-------------|
| `GET` | `/api/destination/random` | Get a random destination |
| `POST` | `/api/destination/guess?destinationId=1&guess=Paris` | Submit a guess |

### **2️⃣ User API (Challenge a Friend Feature)**
| Method | Endpoint | Description |
|--------|---------|-------------|
| `POST` | `/api/user/register` | Register a new user |
| `GET` | `/api/user/{username}/score` | Get user score |

## 🌐 Hosted Link
🔗 **Frontend:** [Live on Vercel](https://your-vercel-link.com)  
🔗 **Backend:** [Live on Railway](https://your-railway-backend-link.com)

---
## 👥 Contributors
- **[Shayan Perwaiz](https://github.com/Shayan-Perwaiz )**

Happy coding! 🎉

