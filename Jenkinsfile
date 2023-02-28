pipeline {
  agent none
        environment {
          userName = "vxd102"
          def password = input message: 'Enter suite', parameters: [password(name: 'password')]
          def suite = input message: 'Enter suite', parameters: [string(name: 'suite', defaultValue: 'test')]
          pomHome = "C:\\Users\\Volodymyr_Drobko\\IdeaProjects\\jenkins-test\\pom.xml"
        }

  stages {
    stage('Build') {
    agent any

      steps {
        bat "mvn clean -f ${pomHome}"
        echo "mvn clean using SUITE: ${env.suite}"
      }
    }

    stage('Test') {
     agent any
      steps {
        bat "mvn test -Dsuite=${env.suite} -f ${pomHome}"
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