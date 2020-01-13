#!/usr/bin/env groovy

def awesomeVersion = env.name
def a =''
def b=''

pipeline

{

agent any



stages

{

stage('Starting')

{

steps
 {
  script{
echo "Starting the project "
 echo "${env.name}"
 echo "${awesomeVersion}"
 a = "persistent"
 echo "${a}"
 b= env.name
 echo "${b}"
  }
 
 
  


 }


}

stage('Addition')

{

steps{

echo 'doing addition'

}


}

stage('Substration')

{

steps{

echo 'doing substration'

}


}


stage('Multiplication')

{

steps{

echo 'doing multiplication'

}


}

stage('Division ')

{


steps{

echo 'Doing Division'

}


}




}


}
