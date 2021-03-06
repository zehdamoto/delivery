package com.manzoli.delivery;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.config.Neo4jConfiguration;

/**
 * Configuration to initialize the Neo4J repositories
 *  
 * @author josemanzoli
 * 
 */
@Configuration
@EnableNeo4jRepositories(basePackages = "com.manzoli.delivery")
public class Neo4jConfig extends Neo4jConfiguration{


	public Neo4jConfig() {
        setBasePackage("com.manzoli.delivery");
    }

    @Bean
    GraphDatabaseService graphDatabaseService() {
        return new GraphDatabaseFactory().newEmbeddedDatabase("accessingdataneo4j.db");
    }
	
}
