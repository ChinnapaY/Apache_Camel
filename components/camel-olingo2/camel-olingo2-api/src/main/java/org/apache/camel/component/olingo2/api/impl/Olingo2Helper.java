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
package org.apache.camel.component.olingo2.api.impl;

import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.entity.ContentType;

/**
 * Helper
 */
public final class Olingo2Helper {

    private Olingo2Helper() {
    }

    /**
     * Gets the content type header in a safe way
     */
    public static ContentType getContentTypeHeader(HttpResponse response) {
        if (response.containsHeader(HttpHeaders.CONTENT_TYPE)) {
            return ContentType.parse(response.getFirstHeader(HttpHeaders.CONTENT_TYPE).getValue());
        } else {
            return null;
        }
    }

}
