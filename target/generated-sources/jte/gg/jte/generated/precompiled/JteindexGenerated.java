package gg.jte.generated.precompiled;
public final class JteindexGenerated {
	public static final String JTE_NAME = "index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,3,3,7,7,8,8,8,10,10,11,11,11,12,12,15,15,18,18,18,21,31,31,0,0,0,0};
	private static final gg.jte.runtime.BinaryContent BINARY_CONTENT = gg.jte.runtime.BinaryContent.load(JteindexGenerated.class, "JteindexGenerated.bin", 1,5,55,36,36,21,18,24,45,3);
	private static final byte[] TEXT_PART_BINARY_0 = BINARY_CONTENT.get(0);
	private static final byte[] TEXT_PART_BINARY_1 = BINARY_CONTENT.get(1);
	private static final byte[] TEXT_PART_BINARY_2 = BINARY_CONTENT.get(2);
	private static final byte[] TEXT_PART_BINARY_3 = BINARY_CONTENT.get(3);
	private static final byte[] TEXT_PART_BINARY_4 = BINARY_CONTENT.get(4);
	private static final byte[] TEXT_PART_BINARY_5 = BINARY_CONTENT.get(5);
	private static final byte[] TEXT_PART_BINARY_6 = BINARY_CONTENT.get(6);
	private static final byte[] TEXT_PART_BINARY_7 = BINARY_CONTENT.get(7);
	private static final byte[] TEXT_PART_BINARY_8 = BINARY_CONTENT.get(8);
	private static final byte[] TEXT_PART_BINARY_9 = BINARY_CONTENT.get(9);
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.List<String> items) {
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_0);
		gg.jte.generated.precompiled.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_1);
				if (items.isEmpty()) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_2);
				} else {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_3);
					jteOutput.setContext("p", null);
					jteOutput.writeUserContent(items.size());
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_4);
					for (String item : items) {
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_5);
						jteOutput.setContext("li", null);
						jteOutput.writeUserContent(item);
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_6);
					}
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_7);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_8);
			}
		}, null);
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_9);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		java.util.List<String> items = (java.util.List<String>)params.get("items");
		render(jteOutput, jteHtmlInterceptor, items);
	}
}
