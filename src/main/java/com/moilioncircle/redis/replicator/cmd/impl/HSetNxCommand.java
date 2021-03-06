/*
 * Copyright 2016 leon chen
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

package com.moilioncircle.redis.replicator.cmd.impl;

import com.moilioncircle.redis.replicator.cmd.Command;

/**
 * @author Leon Chen
 * @since 2.1.0
 */
public class HSetNxCommand implements Command {

    private static final long serialVersionUID = 1L;

    private String key;
    private String field;
    private String value;
    private byte[] rawKey;
    private byte[] rawField;
    private byte[] rawValue;

    public HSetNxCommand() {
    }

    public HSetNxCommand(String key, String field, String value) {
        this(key, field, value, null, null, null);
    }

    public HSetNxCommand(String key, String field, String value, byte[] rawKey, byte[] rawField, byte[] rawValue) {
        this.key = key;
        this.field = field;
        this.value = value;
        this.rawKey = rawKey;
        this.rawField = rawField;
        this.rawValue = rawValue;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public byte[] getRawKey() {
        return rawKey;
    }

    public void setRawKey(byte[] rawKey) {
        this.rawKey = rawKey;
    }

    public byte[] getRawField() {
        return rawField;
    }

    public void setRawField(byte[] rawField) {
        this.rawField = rawField;
    }

    public byte[] getRawValue() {
        return rawValue;
    }

    public void setRawValue(byte[] rawValue) {
        this.rawValue = rawValue;
    }

    @Override
    public String toString() {
        return "HSetNxCommand{" +
                "key='" + key + '\'' +
                ", field='" + field + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
