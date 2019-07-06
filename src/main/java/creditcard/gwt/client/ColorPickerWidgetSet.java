/* 
 * Copyright 2009 IT Mill Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package creditcard.gwt.client;

import creditcard.gwt.client.ui.VColorPicker;
import com.vaadin.terminal.gwt.client.DefaultWidgetSet;
import com.vaadin.terminal.gwt.client.Paintable;
import com.vaadin.terminal.gwt.client.UIDL;

public class ColorPickerWidgetSet extends DefaultWidgetSet {
    /** Resolves UIDL tag name to widget class. */
    @Override
    protected Class<?> resolveWidgetType(UIDL uidl) {
        final String tag = uidl.getTag();
        if ("colorpicker".equals(tag)) {
            return VColorPicker.class;
        }

        // Let the DefaultWidgetSet handle resolution of default widgets
        return super.resolveWidgetType(uidl);
    }

    /** Creates a widget instance according to its class object. */
    @Override
    public Paintable createWidget(UIDL uidl) {
        final Class<?> type = resolveWidgetType(uidl);
        if (VColorPicker.class == type) {
            return new VColorPicker();
        }

        // Let the DefaultWidgetSet handle creation of default widgets
        return super.createWidget(uidl);
    }
}
