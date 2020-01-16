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

def buildActions =['<strong>Execution Summary</strong>']
buildActions = buildActions << "<strong>Source IP :</strong>" + "10.1.2.2"
buildActions = buildActions << "<strong>Destination IP :</strong>" + "10.4.5.7"
pipeline_common.setBuildDescription(buildActions.join('<br />'))

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
   def OSDistribution=sh (script: "sshpass -p 123456 ssh -o UserKnownHostsFile=/dev/null -o StrictHostKeyChecking=no -p 8080 sudhir@$172.17.238.182 cat /etc/os-release | grep -w 'ID=' | cut -d '=' -f2 | tr -d '\"' ",returnStdout: true)
	//OSVersion=sh (script: "sshpass -p ${env.TARGET_MACHINE_PWD} ssh -o UserKnownHostsFile=/dev/null -o StrictHostKeyChecking=no -p ${sshPort} root@${env.TARGET_MACHINE} cat /etc/os-release | grep -w 'VERSION_ID=' | cut -d '=' -f2 | tr -d '\"' ",returnStdout: true)
   echo "${OSDistribution}"
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
