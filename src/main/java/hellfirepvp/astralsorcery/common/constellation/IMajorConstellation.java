/*******************************************************************************
 * HellFirePvP / Astral Sorcery 2018
 *
 * All rights reserved.
 * The source code is available on github: https://github.com/HellFirePvP/AstralSorcery
 * For further details, see the License file there.
 ******************************************************************************/

package hellfirepvp.astralsorcery.common.constellation;

import hellfirepvp.astralsorcery.common.data.research.PlayerProgress;

/**
 * This class is part of the Astral Sorcery Mod
 * The complete source code for this mod can be found on github.
 * Class: IMajorConstellation
 * Created by HellFirePvP
 * Date: 16.11.2016 / 23:08
 */
public interface IMajorConstellation extends IWeakConstellation {

    @Override
    default boolean canDiscover(PlayerProgress progress) {
        return true;
    }

}
