package com.github.biancode.jeeseven.base;

import java.io.File;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.jboss.shrinkwrap.resolver.api.maven.repository.MavenRemoteRepositories;
import org.jboss.shrinkwrap.resolver.api.maven.repository.MavenRemoteRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.biancode.jeeseven.ejb.TestEJB;

@RunWith(Arquillian.class)
public class TestCDI
{

  Logger log = LoggerFactory.getLogger(TestCDI.class);

  @Inject
  private TestEJB testEjb;

  @Deployment
  public static WebArchive createDeployment()
  {

    String repoHttp = "http://artifacts.ao-devnet/java-repos/";

    MavenRemoteRepository repo;
    repo = MavenRemoteRepositories.createRemoteRepository("java-repos", repoHttp, "default");

    File[] dependencies = Maven.configureResolver().
        withRemoteRepo(repo).
        resolve("org.slf4j:slf4j-simple:1.7.7", "javax:javaee-api:7.0").
        withoutTransitivity().
        asFile();

    WebArchive war = ShrinkWrap.
        create(WebArchive.class, "testcdi.war").
        addClass(TestCDI.class).addClass(TestEJB.class).
        addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");

    war.addAsLibraries(dependencies);

    return war;
  }

  @Test
  public void testCDI() throws Exception
  {

    String hello = testEjb.helloWorld();
    log.info(hello);
  }
}
