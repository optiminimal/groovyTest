def gitUrl = 'git://github.com/jenkinsci/job-dsl-plugin.git'

job('Job-DSL-Plugin') {
    scm {
        git(gitUrl)
    }
    steps {
    }
}
