pipeline {
  agent any
  stages {
    stage('Build') {
        environment {
            suite = "test"
        }
      steps {
        echo 'build stage - ${suite}'
      }
    }

    stage('Test') {
      steps {
        echo 'test stage'
      }
    }

    stage('Report') {
      steps {
        echo 'Report stage'
      }
    }

  }
}