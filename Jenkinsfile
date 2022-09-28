pipeline {
    agent any
    tools {
        maven 'M3'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn clean package'
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }
        stage('Test') {
            steps {
                echo 'Testing if Jazzy is smart'
                sh 'mvn clean test'
                junit '**/target/*.xml'

            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}