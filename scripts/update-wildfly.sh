#!/bin/bash

# develop server port-offset=10000 on my system then use 19990

cd ~/github/javaee7-gradle-wildfly

~/appserver/wildfly-9.0.1.Final/bin/jboss-cli.sh --controller=localhost:9990 --connect --command='deploy --force build/libs/javaee7-gradle-wildfly-1.0.0-SNAPSHOT.war'

~/appserver/wildfly-9.0.1.Final/bin/jboss-cli.sh --controller=localhost:9990 --connect --command='/:reload'