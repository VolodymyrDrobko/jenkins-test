pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo "build tests using SUITE: ${env.suite}"
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
  environment {
    suite = 'test'
  }
}