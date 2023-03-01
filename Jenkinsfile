pipeline {
  agent any
        environment {
          pomHome = "C:\\Users\\Volodymyr_Drobko\\IdeaProjects\\jenkins-test\\pom.xml"
          CREDENTIALS = credentials('credentials')
          def suite = input message: 'Enter suite', parameters: [string(name: 'suite', defaultValue: 'test')]
        }
        parameters {
        password(name: 'Password', defaultValue: CREDENTIALS_PSW, "Enter password")
        }

  stages {
    stage('Build') {
    agent any

      steps {
        bat "mvn clean -f ${env.pomHome}"
        echo "mvn clean using SUITE: ${env.suite}"
      }
    }

    stage('Test') {
     agent any
      steps {
        bat "mvn test -Dsuite=${env.suite} -f ${env.pomHome}"
        echo "test stage"
      }
    }

    stage('Report') {
     agent any
      steps {
        echo "Report stage"
      }
    }

  }
}