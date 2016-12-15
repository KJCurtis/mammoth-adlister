/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package daos;

import models.User;

public class EmptyUsers implements Users {
    @Override
    public User withUsername(String username) {
        return null;
    }
}
