pipeline{
    agent any
    stages{
        stage("Git Checkout"){
            steps{
               git credentialsId: 'af14a470-bdb8-4c7d-9e09-0540f5009f05', url: 'https://github.com/roshanjsrpar/spring-jenkins-deployment'
            }
        }

      stage("Test"){
           steps{
               bat "mvn test";
            }
        }
      stage("Package"){
           steps{
               bat "mvn clean package";
            }
        }

      stage("Docker Build"){
           steps{
               bat "docker build -t spring-jenkins-deployment:latest .";
            }
        }

      stage("Deploy"){
           steps{
               bat '''
                set KUBECONFIG=C:\\Users\\Shruti Kumari\\.kube\\config
                kubectl apply -f deployment.yaml
                kubectl apply -f service.yaml
                '''
            }
        }
    }
}
