# Gestion des Utilisateurs et Rôles - Spring Boot

## Description du projet

Ce projet consiste en une application web conçue pour gérer les utilisateurs et leurs rôles au sein d'un système, en utilisant le framework **Spring Boot**. L'application permet d’effectuer diverses opérations telles que la création, la mise à jour, la suppression et la consultation des utilisateurs et des rôles qui leur sont associés.

Elle est pensée pour être utilisée comme une base solide pour développer des applications nécessitant une gestion avancée des utilisateurs avec des rôles personnalisables, tout en étant connectée à une base de données relationnelle.

## Technologies utilisées

L'application est développée en utilisant plusieurs technologies et outils modernes, notamment :

- **Spring Boot** : Le framework principal utilisé pour simplifier la gestion des dépendances et la configuration de l'application.
- **Spring Data JPA** : Pour l'accès et la gestion des données via la base de données.
- **Spring Security** : Pour assurer la gestion sécurisée des utilisateurs et des rôles.
- **H2 Database** (ou une autre base de données au choix) : Une base de données relationnelle légère utilisée pour le développement et les tests.
- **Docker** (facultatif) : Si vous souhaitez exécuter l'application dans un conteneur Docker, il est possible de l'utiliser pour une isolation et une gestion simplifiée.
- **Lombok** : Un outil qui permet de réduire le code répétitif comme les getters, setters et autres méthodes utilitaires.
- **Maven** : Utilisé pour gérer les dépendances du projet et automatiser le cycle de vie du développement.

## Instructions d’installation et d'exécution

### Prérequis

Avant de commencer, assurez-vous que votre machine dispose des éléments suivants :

- **Java JDK 11+** : Spring Boot nécessite Java 11 ou une version plus récente pour fonctionner correctement.
- **Maven** : Utilisé pour télécharger et gérer les dépendances du projet.
- **Docker** (facultatif) : Si vous souhaitez utiliser Docker pour exécuter l’application dans un conteneur.

### 1. Clonez le projet

Commencez par cloner le projet depuis GitHub avec la commande suivante dans votre terminal ou Git Bash :

```bash
git clone https://github.com/skandar1999/SpringBoot--GestionUtilisateursRr-les.git
