/*
 * Copyright 2010 Les Hazlewood
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * under the License.
 */

//
// This script is executed by Grails during application upgrade ('grails upgrade'
// command). This script is a Gant script so you can use all special variables
// provided by Gant (such as 'baseDir' which points on project base dir). You can
// use 'ant' to access a global instance of AntBuilder
//
// For example you can create directory under project tree:
//
//    ant.mkdir(dir:"${basedir}/grails-app/jobs")
//

if (!(new File("${basedir}/grails-app/conf/VaadinConfig.groovy")).exists()) {
    ant.copy(file: "${pluginBasedir}/src/samples/_VaadinConfig.groovy",
            tofile: "${basedir}/grails-app/conf/VaadinConfig.groovy")
}

ant.mkdir(dir: "${basedir}/grails-app/vaadin")
