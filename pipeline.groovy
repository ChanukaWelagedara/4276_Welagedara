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
        stage('Initialize') {
            steps {
                echo 'Initializing...'
            }
        }
        stage('Build') {
            steps {
                script {
                    docker.build('node-image')
                }
            }
        }
        stage('Run') {
            steps {
                script {
                    docker.run('-d -p 5000:3000 --name my-node-server node-image')
                }
            }
        }
        stage('Test') {
            steps {
                sh 'echo "Running tests..."'
                // Add your test commands here
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo "Deploying..."'
                // Add deployment commands if applicable
            }
        }
        stage('Finalize') {
            steps {
                sh 'docker ps'
            }
        }
    }
}
