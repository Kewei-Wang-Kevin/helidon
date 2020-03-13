/*
 * Copyright (c) 2020 Oracle and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * CDI integration for the <a
 * href="https://github.com/brettwooldridge/HikariCP/blob/HikariCP-2.7.8/README.md#-hikaricpits-fasterhikari-hikal%C4%93-origin-japanese-light-ray"
 * target="_parent">Hikari connection pool</a>.
 *
 * @see
 * io.helidon.integrations.datasource.hikaricp.cdi.HikariCPBackedDataSourceExtension
 */
module io.helidon.integrations.datasource.hikaricp.cdi {
    requires cdi.api;
    requires javax.inject;
    requires java.sql;
    requires java.annotation;
    requires microprofile.config.api;
    requires io.helidon.service.configuration.microprofile.config;
    requires io.helidon.integrations.datasource.cdi;
    requires io.helidon.service.configuration.hikaricp;
    requires com.zaxxer.hikari;

    exports io.helidon.integrations.datasource.hikaricp.cdi;
    exports io.helidon.integrations.datasource.hikaricp.cdi.config;
}
