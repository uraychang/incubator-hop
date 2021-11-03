package org.apache.hop.pipeline.transforms.rsbulkloader;

import org.apache.hop.core.IProvidesDatabaseConnectionInformation;
import org.apache.hop.core.annotations.Transform;
import org.apache.hop.pipeline.transform.ITransformMeta;
import org.apache.hop.pipeline.transforms.pgbulkloader.PGBulkLoaderMeta;

@Transform(
        id = "RSBulkLoader",
        image = "PGBulkLoader.svg",
        description = "i18n::RSBulkLoader.Description",
        name = "i18n::RSBulkLoader.Name",
        categoryDescription = "i18n:org.apache.hop.pipeline.transform:BaseTransform.Category.Bulk",
        keywords = "i18n::RSBulkLoader.keyword",
        documentationUrl = "/pipeline/transforms/redshiftbulkloader.html")
public class RSBulkLoaderMeta extends PGBulkLoaderMeta  {


}
