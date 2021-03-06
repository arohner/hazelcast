/*
 * Copyright (c) 2008-2012, Hazel Bilisim Ltd. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.config;

import java.util.EventListener;

public class ListenerConfig {

    protected String className = null;

    protected EventListener implementation = null;

    public ListenerConfig() {
        super();
    }

    public ListenerConfig(String className) {
        super();
        this.className = className;
    }

    public ListenerConfig(EventListener implementation) {
        super();
        this.implementation = implementation;
    }

    public String getClassName() {
        return className;
    }

    public ListenerConfig setClassName(String className) {
        this.className = className;
        return this;
    }

    public Object getImplementation() {
        return implementation;
    }

    public ListenerConfig setImplementation(EventListener implementation) {
        this.implementation = implementation;
        return this;
    }

    public boolean isIncludeValue() {
        return true;
    }

    public boolean isLocal() {
        return false;
    }

    @Override
    public String toString() {
        return "ListenerConfig [className=" + className + ", implementation=" + implementation + ", includeValue="
                + isIncludeValue() + ", local=" + isLocal() + "]";
    }
}
