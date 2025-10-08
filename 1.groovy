node {
    stage("Checkout SCM") {
        git branch: 'main', url: 'https://github.com/LikeNo1Else/flask-app-build.git'
    }
    stage("Check") {
        sh "ls"
    }
}