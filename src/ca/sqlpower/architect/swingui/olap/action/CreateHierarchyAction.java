/*
 * Copyright (c) 2008, SQL Power Group Inc.
 *
 * This file is part of Power*Architect.
 *
 * Power*Architect is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * Power*Architect is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>. 
 */

package ca.sqlpower.architect.swingui.olap.action;

import ca.sqlpower.architect.olap.MondrianModel.Hierarchy;
import ca.sqlpower.architect.swingui.ArchitectSwingSession;
import ca.sqlpower.architect.swingui.PlayPen;
import ca.sqlpower.architect.swingui.olap.DimensionPane;
import ca.sqlpower.architect.swingui.olap.HierarchyEditPanel;
import ca.sqlpower.swingui.DataEntryPanel;

/**
 * Action for adding a hierarchy to the selected dimension.
 */
public class CreateHierarchyAction extends CreateOLAPChildAction<Hierarchy> {

    public CreateHierarchyAction(ArchitectSwingSession session, PlayPen olapPlayPen) {
        super(session, olapPlayPen, "Hierarchy", DimensionPane.class, "Dimension", 'h');
    }

    @Override
    protected Hierarchy createChildInstance() {
        Hierarchy h = new Hierarchy();
        h.setName("New Hierarchy");
        return h;
    }

    @Override
    protected DataEntryPanel createDataEntryPanel(Hierarchy model) {
        return new HierarchyEditPanel(model);
    }
    
}