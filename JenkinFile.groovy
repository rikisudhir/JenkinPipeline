#!/usr/bin/env groovy

def awesomeVersion = env.name
def name

pipeline

{

agent any



stages

{

stage('Starting')

{

steps
 {

echo "Starting the project "
 echo "${env.name}"
 echo "${awesomeVersion}"
 def name =1
 echo "${name}"
 
 


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
