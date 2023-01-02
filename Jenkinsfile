 node{

   stage('SCM Checkout'){

     git 'https://github.com/abhisheknegi941/javaprojects'

   }

   stage('Compile-Package'){

     // Get maven home path

     def mvnHome = tool name: 'Apache Maven 3.6.3', type: 'maven'

    bat "${mvnHome}/bin/mvn package"

  }

 }