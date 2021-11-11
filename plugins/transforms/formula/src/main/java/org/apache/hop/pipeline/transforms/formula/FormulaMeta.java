package org.apache.hop.pipeline.transforms.formula;

import org.apache.hop.core.annotations.Transform;
import org.apache.hop.pipeline.Pipeline;
import org.apache.hop.pipeline.PipelineMeta;
import org.apache.hop.pipeline.transform.BaseTransformMeta;
import org.apache.hop.pipeline.transform.ITransform;
import org.apache.hop.pipeline.transform.ITransformMeta;
import org.apache.hop.pipeline.transform.TransformMeta;

@Transform(
        id = "Formula",
        image = "FRM.svg",
        name = "i18n::Formula.name",
        description = "i18n::Formula.description",
        categoryDescription = "i18n:org.apache.hop.pipeline.transform:BaseTransform.Category.Scripting",
        keywords = "i18n::Formula.keywords",
        documentationUrl = "/pipeline/transforms/formula.html")
public class FormulaMeta extends BaseTransformMeta
        implements ITransformMeta<Formula, FormulaData> {
    private static final Class<?> PKG = Formula.class; // For Translator

    @Override
    public ITransform createTransform(TransformMeta transformMeta, FormulaData data, int copyNr, PipelineMeta pipelineMeta, Pipeline pipeline) {
        return null;//TODO
    }

    @Override
    public FormulaData getTransformData() {
        return null;//TODO
    }
}
