


pipeline

echo "${env.name}"

{

agent any

echo "${env.name}"

stages

{

stage('Starting')

{

steps

{

echo "Starting the project "
  echo "${env.name}"

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
