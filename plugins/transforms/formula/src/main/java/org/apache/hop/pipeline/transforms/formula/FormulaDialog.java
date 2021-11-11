package org.apache.hop.pipeline.transforms.formula;

import org.apache.hop.core.variables.IVariables;
import org.apache.hop.pipeline.PipelineMeta;
import org.apache.hop.pipeline.transform.BaseTransformMeta;
import org.apache.hop.pipeline.transform.ITransformDialog;
import org.apache.hop.pipeline.transform.ITransformMeta;
import org.apache.hop.ui.pipeline.transform.BaseTransformDialog;
import org.eclipse.swt.widgets.Shell;

public class FormulaDialog extends BaseTransformDialog implements ITransformDialog {
    private static final Class<?> PKG = FormulaDialog.class; // For Translator

    public FormulaDialog(Shell parent, IVariables variables, ITransformMeta baseTransformMeta, PipelineMeta pipelineMeta, String transformName) {
        super(parent, variables, baseTransformMeta, pipelineMeta, transformName);
    }

    //TODO
    @Override
    public String open() {
        return null;
    }
}
