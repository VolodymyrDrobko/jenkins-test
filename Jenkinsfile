pipeline {
  agent any
          environment {
              suite = "test"
          }
  stages {
    stage('Build') {
      steps {
        echo "build tests using SUITE: ${suite}"
      }
    }

    stage('Test') {
      steps {
        echo "test stage"
      }
    }

    stage('Report') {
      steps {
        echo "Report stage"
      }
    }

  }
}