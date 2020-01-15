#!/usr/bin/env groovy

//Load Jenkins pipeline common library
library 'pipeline_common'

def function_name = env.function
def firstnumber =env.number1.toInteger()
def secondnumber =env.number2.toInteger()
def result =''
JENKINS_NODE = 'master'


node( JENKINS_NODE ) { timestamps {
   SANDBOX=pwd()
   echo "${SANDBOX}"
}
                     }

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
   echo "${function_name}"  
   echo "${firstnumber}"
   echo "${secondnumber}"
   echo "${SANDBOX}"

  }
  }
}

stage('Doing calulcation')

{

steps{
 script{
echo 'doing the calculation based on input '
  
  if (function_name=='addition'){
    result = pipeline_common.addition(firstnumber,secondnumber)
   echo "${result}"
  }else if (function_name=='substraction'){
    result = pipeline_common.substraction(firstnumber,secondnumber)
    echo "${result}"
  }else if (function_name=='multiplication'){
    result = pipeline_common.multiplication(firstnumber,secondnumber)
    echo "${result}"
  }else if (function_name=='division')
    result = pipeline_common.multiplication(firstnumber,secondnumber)
    echo "${result}"
   }

}


}



stage('Ending ')

{


steps{

echo 'ending the pipe line'

}


}




}


}
