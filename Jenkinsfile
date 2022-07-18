pipeline {
    agent any 
    stages {
        stage('Git clone') { 
            steps {
             git 'https://github.com/NdiayeGorgui/spring-boot-jenkins-docker-pipeline.git'
            }
        }
         stage('Maven Build') { 
            steps {
            bat 'mvn package'
            }
        }
        stage('Create docker image') { 
            steps {
             sh 'docker build -t gorgui/spring-boot-jenkins-docker-pipeline:latest .'
            }
        }
         stage('Push docker image') { 
            steps {
             sh 'docker push gorgui/spring-boot-jenkins-docker-pipeline'
            }
        }
         stage('Deploy to kubernetes') { 
            steps {
             sh'deploymentservice.yaml'
            }
        }
    }
}
