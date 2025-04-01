package gg.jte.generated.precompiled;
import edu.ifba.hello.dto.UserDTO;
import java.util.List;
import edu.ifba.hello.dto.ErrorResponse;
public final class JteuserformGenerated {
	public static final String JTE_NAME = "user-form.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,7,7,7,7,11,11,11,11,11,11,11,11,11,14,14,14,14,14,14,14,14,14,16,22,22,25,25,26,26,26,27,27,27,28,28,31,31,33,33,33,33,33,4,5,5,5,5};
	private static final gg.jte.runtime.BinaryContent BINARY_CONTENT = gg.jte.runtime.BinaryContent.load(JteuserformGenerated.class, "JteuserformGenerated.bin", 1,124,8,1,88,8,1,7,54,11,22,52,25,8,2);
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
	private static final byte[] TEXT_PART_BINARY_10 = BINARY_CONTENT.get(10);
	private static final byte[] TEXT_PART_BINARY_11 = BINARY_CONTENT.get(11);
	private static final byte[] TEXT_PART_BINARY_12 = BINARY_CONTENT.get(12);
	private static final byte[] TEXT_PART_BINARY_13 = BINARY_CONTENT.get(13);
	private static final byte[] TEXT_PART_BINARY_14 = BINARY_CONTENT.get(14);
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UserDTO user, List<ErrorResponse> errors) {
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_0);
		gg.jte.generated.precompiled.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_1);
				var __jte_html_attribute_0 = user.getName();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_2);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_3);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_4);
				var __jte_html_attribute_1 = user.getEmail();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_5);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_1);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_6);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_7);
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_8);
				if (errors != null) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_9);
					for (ErrorResponse e : errors) {
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_10);
						jteOutput.setContext("b", null);
						jteOutput.writeUserContent(e.getField());
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_11);
						jteOutput.setContext("span", null);
						jteOutput.writeUserContent(e.getMessage());
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_12);
					}
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_13);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_14);
			}
		}, null);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UserDTO user = (UserDTO)params.getOrDefault("user", new UserDTO());
		List<ErrorResponse> errors = (List<ErrorResponse>)params.getOrDefault("errors", null);
		render(jteOutput, jteHtmlInterceptor, user, errors);
	}
}
