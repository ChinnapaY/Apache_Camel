/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * Camel Api Route test generated by camel-component-util-maven-plugin
 * Generated on: Wed Jul 09 19:57:11 PDT 2014
 */
package org.apache.camel.component.linkedin;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.builder.RouteBuilder;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Test class for {@link org.apache.camel.component.linkedin.api.JobsResource} APIs.
 */
public class JobsResourceIntegrationTest extends AbstractLinkedInTestSupport {

    private static final Logger LOG = LoggerFactory.getLogger(JobsResourceIntegrationTest.class);
    private static final String PATH_PREFIX = "jobs";

    // TODO provide parameter values for addJob
    @Ignore
    @Test
    public void testAddJob() throws Exception {
        // using org.apache.camel.component.linkedin.api.model.Job message body for single parameter "job"
        requestBody("direct://ADDJOB", null);
    }

    // TODO provide parameter values for editJob
    @Ignore
    @Test
    public void testEditJob() throws Exception {
        final Map<String, Object> headers = new HashMap<>();
        headers.put("CamelLinkedIn.partner_job_id", 0L);
        // parameter type is org.apache.camel.component.linkedin.api.model.Job
        headers.put("CamelLinkedIn.job", null);

        requestBodyAndHeaders("direct://EDITJOB", null, headers);
    }

    // TODO provide parameter values for getJob
    @Ignore
    @Test
    public void testGetJob() throws Exception {
        final Map<String, Object> headers = new HashMap<>();
        headers.put("CamelLinkedIn.job_id", 0L);
        // parameter type is String
        headers.put("CamelLinkedIn.fields", null);

        final org.apache.camel.component.linkedin.api.model.Job result = requestBodyAndHeaders("direct://GETJOB", null, headers);

        assertNotNull("getJob result", result);
        LOG.debug("getJob: " + result);
    }

    // TODO provide parameter values for removeJob
    @Ignore
    @Test
    public void testRemoveJob() throws Exception {
        // using long message body for single parameter "partner_job_id"
        requestBody("direct://REMOVEJOB", 0L);
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            public void configure() {
                // test route for addJob
                from("direct://ADDJOB")
                    .to("linkedin://" + PATH_PREFIX + "/addJob?inBody=job");

                // test route for editJob
                from("direct://EDITJOB")
                    .to("linkedin://" + PATH_PREFIX + "/editJob");

                // test route for getJob
                from("direct://GETJOB")
                    .to("linkedin://" + PATH_PREFIX + "/getJob");

                // test route for removeJob
                from("direct://REMOVEJOB")
                    .to("linkedin://" + PATH_PREFIX + "/removeJob?inBody=partner_job_id");

            }
        };
    }
}
