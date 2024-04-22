pipeline {
  agent any
  stages {
    stage('build'){
      steps {
        sh 'docker build -t node-image .'
      }
    }
    stage('run'){
      steps{
        sh 'docker run -d -p 5000:3000 node-image'
      }
    }
    stage('final'){
      steps{
        sh 'docker ps'
      }
    }
  }

}