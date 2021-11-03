package org.apache.hop.pipeline.transforms.rsbulkloader;

import org.apache.hop.pipeline.Pipeline;
import org.apache.hop.pipeline.PipelineMeta;
import org.apache.hop.pipeline.transform.TransformMeta;
import org.apache.hop.pipeline.transforms.pgbulkloader.PGBulkLoader;

public class RSBulkLoader extends PGBulkLoader {

    public RSBulkLoader(TransformMeta transformMeta, RSBulkLoaderMeta meta, RSBulkLoaderData data, int copyNr, PipelineMeta pipelineMeta, Pipeline pipeline) {
        super(transformMeta, meta, data, copyNr, pipelineMeta, pipeline);
    }
}
