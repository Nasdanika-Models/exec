package org.nasdanika.models.exec.processors;

import org.nasdanika.common.Context;
import org.nasdanika.exec.ExecPackage;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessorFactory;

@EPackageNodeProcessorFactory(nsURI = ExecPackage.eNS_URI)
public class ExecEcoreGenProcessorsFactory {

	private Context context;
	
//	@Factory
//	public final AccessLevelProcessorsFactory accessLevelFactory;

	
	public ExecEcoreGenProcessorsFactory(Context context) {
//		accessLevelProcessorsFactory = new AccessLevelProcessorsFactory(context);
	}
	
//	/**
//	 * Test of different ways to configure action prototype.
//	 * @param config
//	 * @param prototypeProvider
//	 * @param progressMonitor
//	 * @return
//	 */
//	@EPackageNodeProcessorFactory(
//			label = "Trum",
//			//actionPrototypeRef = "test-package.yml",
//			actionPrototype = """
//                    app-action:
//                        text: Param
//                        icon: fas fa-user					
//					
//					
//					""",
//			icon = "fas fa-users",
//			description = "My description",
//			documentation =  """
//				# Look at this!
//				
//				```drawio-resource
//				aws.drawio
//				```
//						
//				"""
//	)
//	public EPackageNodeProcessor createEPackageProcessor(
//			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
//			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
//			BiConsumer<Label, ProgressMonitor> labelConfigurator,
//			ProgressMonitor progressMonitor) {		
//		return new EPackageNodeProcessor(config, context, prototypeProvider) {
//			
//			@Override
//			protected void configureLabel(EObject eObject, Label label, ProgressMonitor progressMonitor) {
//				super.configureLabel(eObject, label, progressMonitor);
//				if (labelConfigurator != null) {
//					labelConfigurator.accept(label, progressMonitor);
//				}
//			}
//			
//		};
//	}	

}
