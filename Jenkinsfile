pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn test'
                sh 'mvn spring-boot:run'
            }
        }
    }
}