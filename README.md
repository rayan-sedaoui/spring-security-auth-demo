
# Spring Security Auth Demo

Une application web sécurisée développée avec **Spring Boot** et **Spring Security**. Ce projet a pour but de démontrer une gestion des utilisateurs et des accès basée sur les rôles (RBAC).

## 🚀 Fonctionnalités
- **Authentification personnalisée** : Page de connexion (`/login`) avec un design sur mesure.
- **Gestion des rôles** : 
    - `ADMIN` : Accès total aux ressources, incluant l'espace administrateur.
    - `USER` : Accès limité à l'espace utilisateur.
- **Sécurité** : Utilisation de `BCryptPasswordEncoder` pour le hachage sécurisé des mots de passe.
- **Architecture** : Système d'authentification "In-Memory" pour une démonstration rapide et efficace.

## 🛠 Technologies utilisées
- Java 17
- Spring Boot 3.x
- Spring Security
- Thymeleaf (pour les interfaces HTML)

## 🔑 Identifiants de test
Tu peux te connecter avec les comptes suivants :

| Rôle | Nom d'utilisateur | Mot de passe |
| :--- | :--- | :--- |
| **Admin** | `admin` | `1234` |
| **Utilisateur** | `user` | `1111` |

## 📦 Installation
1. Clone le projet : `git clone https://github.com/rayan-sedaoui/spring-security-auth-demo.git`
2. Importe le projet dans ton IDE (IntelliJ IDEA conseillé).
3. Lance la classe `SpringSecurityDemoApplication`.
4. Accède à l'application via `http://localhost:8081`.

