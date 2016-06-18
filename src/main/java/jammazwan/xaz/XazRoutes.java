package jammazwan.xaz;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class XazRoutes extends RouteBuilder {

	@Autowired
	private XazBean xazBean;

	@Override
	public void configure() throws Exception {
		from("file://../jammazwan.shared/src/main/resources/data/txt/?noop=true&fileName=transforms.txt").transform()
				.method(xazBean).to("file://./?fileName=sortedTransforms.txt");
	}
}
