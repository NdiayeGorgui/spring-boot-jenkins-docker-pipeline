pipeline {
    agent any 
    stages {
        stage('Git clone') { 
            steps {
             git 'https://github.com/NdiayeGorgui/spring-boot-jenkins-docker-pipeline.git'
            }
        }
        stage('Create docker image') { 
            steps {
             bat 'docker build -t gorgui/docker-jenkins-integration-sample:latest .'
            }
        }
        
    }
}
