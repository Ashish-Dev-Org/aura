/*
 * Copyright (C) 2013 salesforce.com, inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.auraframework.integration.test;

import junit.framework.TestSuite;
import org.auraframework.AuraConfiguration;
import org.auraframework.test.ComponentJSTestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.AllTests;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

/**
 * Run this here so we can query all namespaces and have all services available for injection.
 */
@RunWith(AllTests.class)
@ContextConfiguration(classes = {AuraConfiguration.class})
@TestExecutionListeners(listeners = {DependencyInjectionTestExecutionListener.class})
public class ComponentJSUITest extends ComponentJSTestSuite {
    public static TestSuite suite() throws Exception {
        return ComponentJSTestSuite.suite();
    }
}