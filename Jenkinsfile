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
             bat 'docker build -t gorgui/spring-boot-jenkins-docker-pipeline:latest .'
            }
        }
         stage('Push docker image') { 
            steps {
             bat 'docker push gorgui/spring-boot-jenkins-docker-pipeline'
            }
        }
         stage('Deploy to kubernetes') { 
            steps {
             bat 'kubectl apply -f deploymentservice.yaml'
            }
        }
    }
}
