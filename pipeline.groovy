// pipeline {
//   agent any
//   stages {
//     stage('build'){
//       steps {
//         sh 'docker build -t node-image .'
//       }
//     }
//     stage('run'){
//       steps{
//         sh 'docker run -d -p 5000:3000 node-image'
//       }
//     }
//     stage('final'){
//       steps{
//         sh 'docker ps'
//       }
//     }
//   }

// }


pipeline {
    agent any
    stages {
        stage('Docker Build') {
            steps {
                sh 'docker build -t node-image .'
            }
        }
        stage('Docker Run') {
            steps {
                sh 'docker run -d -p 5000:3000 node-image'
            }
        }
        stage('Final') {
            steps {
                sh 'docker ps'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying application...'
            }
        }
    }
}