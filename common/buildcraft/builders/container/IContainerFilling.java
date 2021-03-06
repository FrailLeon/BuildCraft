/*
 * Copyright (c) 2017 SpaceToad and the BuildCraft team
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. If a copy of the MPL was not
 * distributed with this file, You can obtain one at https://mozilla.org/MPL/2.0/
 */

package buildcraft.builders.container;

import java.util.List;

import buildcraft.builders.filling.IParameter;

public interface IContainerFilling {
    boolean isInverted();

    void setInverted(boolean value);

    List<IParameter> getParameters();

    void setParameters(List<IParameter> value);

    boolean isCanExcavate();

    void setCanExcavate(boolean value);
}
