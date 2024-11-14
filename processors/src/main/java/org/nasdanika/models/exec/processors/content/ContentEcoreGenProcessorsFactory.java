package org.nasdanika.models.exec.processors.content;

import java.util.function.BiConsumer;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Reflector.Factory;
import org.nasdanika.exec.content.ContentPackage;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessorFactory;

@EPackageNodeProcessorFactory(nsURI = ContentPackage.eNS_URI)
public class ContentEcoreGenProcessorsFactory {

	private Context context;
	
	@Factory
	public final MarkdownProcessorFactory markdownProcessorFactory;
	
	public ContentEcoreGenProcessorsFactory(Context context) {
		this.context = context; 
		markdownProcessorFactory = new MarkdownProcessorFactory(context);
	}
	
	
	@EPackageNodeProcessorFactory(
			label = "Content",
			description = "Content model elements",
			actionPrototype = """
            app-action:
              content:
                content-markdown:
                  source:
                    content-resource:
                      location: package-summary.md
			"""
	)
	public EPackageNodeProcessor createEPackageProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EPackageNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}	

}
