/* Copyright 2013-2015 www.snakerflow.com.
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
package org.snaker.engine.entity.var;

/**
 * 字符变量类型
 * @author yuqs
 * @since 3.0
 */
public class StringType implements VariableType {
  private static final long serialVersionUID = 1L;

  public String getTypeName() {
    return "string";
  }

  public Object getValue(ValueFields valueFields) {
    return valueFields.getTextValue();
  }

  public void setValue(Object value, ValueFields valueFields) {
    valueFields.setTextValue((String) value);
  }

  public boolean isAbleToStore(Object value) {
    if (value==null) {
      return true;
    }
    return String.class.isAssignableFrom(value.getClass());
  }
}
