package gg.jte.generated.precompiled.layout;
public final class JtemainGenerated {
	public static final String JTE_NAME = "layout/main.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,0,0,0,8,8,8,8,18,18,18,28,28,28,0,1,1,1,1};
	private static final gg.jte.runtime.BinaryContent BINARY_CONTENT = gg.jte.runtime.BinaryContent.load(JtemainGenerated.class, "JtemainGenerated.bin", 154,149,93);
	private static final byte[] TEXT_PART_BINARY_0 = BINARY_CONTENT.get(0);
	private static final byte[] TEXT_PART_BINARY_1 = BINARY_CONTENT.get(1);
	private static final byte[] TEXT_PART_BINARY_2 = BINARY_CONTENT.get(2);
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, gg.jte.Content content, edu.ifba.hello.dto.Page page) {
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_0);
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(page == null ? "Página Inícial" : page.title());
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_1);
		jteOutput.setContext("main", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_2);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		gg.jte.Content content = (gg.jte.Content)params.get("content");
		edu.ifba.hello.dto.Page page = (edu.ifba.hello.dto.Page)params.getOrDefault("page", null);
		render(jteOutput, jteHtmlInterceptor, content, page);
	}
}
