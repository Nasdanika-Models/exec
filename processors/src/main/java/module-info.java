module org.nasdanika.models.exec.processors {
		
	requires transitive org.nasdanika.exec;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.exec.processors;
	opens org.nasdanika.models.exec.processors; // For loading resources
	
}
