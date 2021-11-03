package org.apache.hop.pipeline.transforms.rsbulkloader;

import org.apache.hop.core.variables.IVariables;
import org.apache.hop.pipeline.PipelineMeta;
import org.apache.hop.pipeline.transforms.pgbulkloader.PGBulkLoaderDialog;
import org.eclipse.swt.widgets.Shell;

public class RSBulkLoaderDialog extends PGBulkLoaderDialog {

    public RSBulkLoaderDialog(Shell parent, IVariables variables, Object in, PipelineMeta pipelineMeta, String sname) {
        super(parent, variables, in, pipelineMeta, sname);
    }
}
