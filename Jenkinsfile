pipeline {
    agent any
        environment {
            IMAGE_NAME = 'msprovider'
            TAG_NAME = 'latest'
            APP_NAME = 'msprovider'
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
                    sh 'docker run -d --name ${APP_NAME} -p 8000:8000 ${IMAGE_NAME}:${TAG_NAME}'
                    //sh 'mvn -B -DskipTests spring-boot:run'
                }
            }
        }
}