module org.nasdanika.models.exec.processors {
		
	requires transitive org.nasdanika.exec;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.exec.processors;
	opens org.nasdanika.models.exec.processors; // For loading resources

	exports org.nasdanika.models.exec.processors.content;
	opens org.nasdanika.models.exec.processors.content; // For loading resources

	exports org.nasdanika.models.exec.processors.resources;
	opens org.nasdanika.models.exec.processors.resources; // For loading resources
	
}
