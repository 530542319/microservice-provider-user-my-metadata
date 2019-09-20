pipeline {
    agent any
        environment {
            IMAGE_NAME = 'msProvider'
            TAG_NAME = 'latest'
        }
        tools {
            maven 'Maven 3.3.9'
            jdk 'jdk8'
        }
        stages {
            stage ('Initialize') {
                steps {
                    sh '''
                        echo "PATH = ${PATH}"
                        echo "M2_HOME = ${M2_HOME}"
                    '''
                }
            }

            stage ('Build') {
                steps {
                    sh 'mvn package'
                    sh 'docker build -t ${IMAGE_NAME}:${TAG_NAME} .'
                    //sh 'mvn -B -DskipTests spring-boot:run'
                }
            }
        }
}