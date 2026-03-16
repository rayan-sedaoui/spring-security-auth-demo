
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

## Aperçu de l'application

<img width="329" height="269" alt="Image" src="https://github.com/user-attachments/assets/571fb8de-972d-41f8-8620-6c3f253fdffd" />

<img width="368" height="179" alt="Image" src="https://github.com/user-attachments/assets/74a26f74-9bed-4b7b-98ec-d5d65c5420e9" />

<img width="368" height="140" alt="Image" src="https://github.com/user-attachments/assets/5b922ed8-8e52-4c92-8514-b197b6320cf4" />


## Architecture de  l'application

<img width="279" height="485" alt="Image" src="https://github.com/user-attachments/assets/f1a11300-943f-4850-ba9f-c395a5cd38e4" />

## Test de SpringSecurityDemoApplication

https://github.com/user-attachments/assets/1d92417a-df4f-44e6-a1a7-48781ea479e5

## 📦 Installation
1. Clone le projet : `git clone https://github.com/rayan-sedaoui/spring-security-auth-demo.git`
2. Importe le projet dans ton IDE (IntelliJ IDEA conseillé).
3. Lance la classe `SpringSecurityDemoApplication`.
4. Accède à l'application via `http://localhost:8081`.

