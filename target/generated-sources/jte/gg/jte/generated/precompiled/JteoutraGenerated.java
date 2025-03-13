package gg.jte.generated.precompiled;
public final class JteoutraGenerated {
	public static final String JTE_NAME = "outra.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,0,0,0,2,2,3,3,5,5,5,8,18,18,0,0,0,0};
	private static final gg.jte.runtime.BinaryContent BINARY_CONTENT = gg.jte.runtime.BinaryContent.load(JteoutraGenerated.class, "JteoutraGenerated.bin", 1,20,3);
	private static final byte[] TEXT_PART_BINARY_0 = BINARY_CONTENT.get(0);
	private static final byte[] TEXT_PART_BINARY_1 = BINARY_CONTENT.get(1);
	private static final byte[] TEXT_PART_BINARY_2 = BINARY_CONTENT.get(2);
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, edu.ifba.hello.dto.Page page) {
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_0);
		gg.jte.generated.precompiled.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_1);
			}
		}, page);
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_2);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		edu.ifba.hello.dto.Page page = (edu.ifba.hello.dto.Page)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
