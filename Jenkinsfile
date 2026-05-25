pipeline {

    agent any

    tools {
        maven 'maven'
    }

    stages {

        stage('Code Checkout') {
            steps {
                git 'https://github.com/anshadmtmt-ship-it/calculator.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn compile'
            }
        }

        stage('Unit Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
