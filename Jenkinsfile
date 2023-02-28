pipeline {
  agent none
        environment {
          userName = "vxd102"
          suite
          password
          pomHome = "C:\\Users\\Volodymyr_Drobko\\IdeaProjects\\jenkins-test\\pom.xml"
        }
  stages {
    stage('Build') {
    agent any
    input {
    message "Select suite"
    parameters {
            string(defaultValue: 'regression', name: 'suite')
          }
    message "Input password"
              parameters {
                      string(defaultValue: 'password', name: 'password')
                    }
    }

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