package gg.jte.generated.precompiled;
public final class JteuserformGenerated {
	public static final String JTE_NAME = "user-form.jte";
	public static final int[] JTE_LINE_INFO = {22,22,22,22,22,22,22,22,22,22,22,22,22};
	private static final gg.jte.runtime.BinaryContent BINARY_CONTENT = gg.jte.runtime.BinaryContent.load(JteuserformGenerated.class, "JteuserformGenerated.bin", 500);
	private static final byte[] TEXT_PART_BINARY_0 = BINARY_CONTENT.get(0);
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_0);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
