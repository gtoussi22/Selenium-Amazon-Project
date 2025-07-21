📋 Description
Projet d'automatisation de tests pour le site Amazon.fr utilisant Selenium WebDriver avec Java. Ce projet implémente le pattern Page Object Model pour une architecture de tests maintenable et scalable.
🚀 Technologies Utilisées

Java 17 - Langage de programmation
Selenium WebDriver 4.15.0 - Automatisation des navigateurs web
Maven 3.9.10 - Gestion des dépendances et build
JUnit 5 - Framework de tests unitaires
TestNG - Framework de tests avancé
WebDriverManager - Gestion automatique des drivers de navigateurs
Chrome WebDriver - Driver pour navigateur Chrome

🏗️ Architecture du Projet
src/
├── test/
│   └── java/
│       ├── amazoneExoPerso/
│       │   └── AmazoneExoPerso.java        # Classe principale de tests
│       └── pageObjectsAmazoneModel/
│           ├── IdentiAmazonePage.java      # Page d'identification
│           ├── IdentiAmazonePage1.java     # Page mot de passe
│           ├── LoginAmazonePage.java       # Page de connexion
│           └── SearchText.java             # Page de recherche
├── pom.xml                                 # Configuration Maven
└── README.md                               # Documentation du projet
✨ Fonctionnalités Testées
🔐 Tests d'Authentification

test001_logInUser : Vérification de l'accès à la page de connexion
test002_IndentiInUser : Test de saisie de l'email utilisateur
test003_IndentiInUser1 : Test de saisie du mot de passe

🔍 Tests de Recherche

test004_searchTextbox : Test de fonctionnalité de recherche de produits
