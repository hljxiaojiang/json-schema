/*
 * Copyright (C) 2011 Everit Kft. (http://www.everit.org)
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
package org.everit.json.schema;

import org.json.JSONWriter;

/**
 * A schema not specifying any restrictions, ie. accepting any values.
 */
public class EmptySchema extends Schema {

  public static final EmptySchema INSTANCE = new EmptySchema(builder());

  /**
   * Builder class for {@link EmptySchema}.
   */
  public static class Builder extends Schema.Builder<EmptySchema> {

    @Override
    public EmptySchema build() {
      return INSTANCE;
    }

  }

  public static Builder builder() {
    return new Builder();
  }

  public EmptySchema(final Builder builder) {
    super(builder);
  }

  @Override
  public void validate(final Object subject) {
    // always passing
  }

  @Override
  void describeTo(final JSONWriter writer) {
    writer.object();
    writer.endObject();
  }

}
