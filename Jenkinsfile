 node{

   stage('SCM Checkout'){

     git 'https://github.com/Priyank-Singh/SampleSpringBoot.git'

   }

   stage('Compile-Package'){

     

     def mvnHome = tool name: 'Apache Maven 3.6.3', type: 'maven'

    bat "${mvnHome}/bin/mvn"

  }

 }