/**
 * Copyright (C) 2012 https://github.com/tenderowls/haxemojos
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
package com.yelbota.plugins.nd.utils;

import org.apache.maven.plugin.logging.Log;

import java.io.File;
import java.io.IOException;

/**
 * @author Aleksey Fomkin
 */
public interface UnpackMethod {

    public class UnpackMethodException extends Exception {

        public UnpackMethodException(String message) {
            super(message);
        }

        public UnpackMethodException(String message, Throwable exception) {
            super(message, exception);
        }
    }

    void unpack(File file, File directory) throws IOException, UnpackMethodException;

    void unpack(File file, File directory, Log log) throws IOException, UnpackMethodException;
}
