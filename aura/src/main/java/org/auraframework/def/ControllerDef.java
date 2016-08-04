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
package org.auraframework.def;

import java.util.Map;

import org.auraframework.instance.ValueProvider;

/**
 * Controller definitions are part of a component definition, providing metadata
 * from a controller that the component definition needs to know like what
 * actions and types of data are exposed.
 */
public interface ControllerDef extends ValueProvider, RemotableDefinition {
    /**
     * Get the descriptor for this def.
     */
    @Override
    DefDescriptor<ControllerDef> getDescriptor();

    /**
     * Get the map of actions by name in this controller.
     *
     * @return the map of actions, never null.
     */
    Map<String, ? extends ActionDef> getActionDefs();

    /**
     * Get an action def by name.
     *
     * @param name the name of the action to fetch
     * @return the action def, or null if none.
     */
    ActionDef getSubDefinition(String name);
}
