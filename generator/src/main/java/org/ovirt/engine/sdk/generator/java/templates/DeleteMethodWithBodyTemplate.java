//
// Copyright (c) 2012 Red Hat, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//           http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

package org.ovirt.engine.sdk.generator.java.templates;

import java.util.List;

import org.ovirt.engine.sdk.generator.java.documentation.DocsGen;
import org.ovirt.engine.sdk.generator.java.ParameterData;
import org.ovirt.engine.sdk.generator.java.utils.LinkUtils;
import org.ovirt.engine.sdk.generator.java.utils.MethodUtils;
import org.ovirt.engine.sdk.entities.DetailedLink;
import org.ovirt.engine.sdk.generator.java.utils.StringUtils;

public class DeleteMethodWithBodyTemplate extends AbstractOverloadableTemplate {
    private String evaluate(List<ParameterData> parameters, String deleteBody, String docParams) {
        // Generate the code that populates the list of URL parameters to send tot the server:
        String urlBuilderCode = getUrlBuilderCode(parameters);
        String headerBuilderCode = getHeaderBuilderCode(parameters);

        // Format the parameter list, adding a comma to separate from the action parameter if needed:
        String paramList = MethodUtils.formatParameters(parameters);
        if (!paramList.isEmpty()) {
            paramList = ", " + paramList;
        }

        // Generate the method:
        set("deleteBody", deleteBody);
        set("deleteBodyLowerCase", deleteBody.toLowerCase());
        set("docParams", docParams);
        set("paramList", paramList);
        set("headersToBuild", headerBuilderCode);
        set("urlParamsToBuild", urlBuilderCode);
        return evaluate();
    }

    public String evaluate(String className, DetailedLink dl) {
        StringBuilder buffer = new StringBuilder();

        String docParams = DocsGen.generateBodyParams(dl);

        // Get the list of parameters:
        List<ParameterData> parameters = LinkUtils.getParameters(dl);

        // Reorder the parameters declarations for backwards compatibility:
        parameters = MethodUtils.reorderParameters(className, "delete", parameters);

        // Generate a version of the method for each prefix of the list of parameter declarations, including the
        // empty prefix and the complete list:
        for (int i = 0; i <= parameters.size(); i++) {
            List<ParameterData> prefix = parameters.subList(0, i);
            buffer.append(
                evaluate(
                    prefix,
                    dl.getRequest().getBody().getType(),
                    StringUtils.combine(docParams, DocsGen.generateParameters(prefix))
                )
            );
        }

        return buffer.toString();
    }
}
