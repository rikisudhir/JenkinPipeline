pipeline

properties([parameters([choice(choices: ['addition', 'subtraction', 'multiplication', 'deletion', '', ' '], description: '', name: 'function'), string(defaultValue: '', description: '', name: '', trim: false)])])

{

agent any


stages

{

stage('Starting')

{

steps

{

echo "Starting the project "

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