  pipeline{
	agent any 
	stages{
		stage('Desplegando artefacto'){
				environment {
					MAVEN_HOME = '/usr/share/maven'
				}
			steps{
					echo 'Iniciando despliegue'
				
				rtMavenDeployer (
					id: 'INSERTION_SORT',
					serverId: 'artifactory',
					releaseRepo: 'isp2',
					snapshotRepo: 'isp2',
				)
				rtMavenRun (
					pom: 'pom.xml',
					goals: 'install',
					deployerId: 'INSERTION_SORT',
				)
					echo 'Finalizando Despliegue'
				
			
			}
		}
		
	}
}		
