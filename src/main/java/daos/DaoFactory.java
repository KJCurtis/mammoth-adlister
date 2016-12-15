/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package daos;

public class DaoFactory {
    public static Users userDao() {
        //return new ArrayListUsers();
        //return new EmptyUsers();
        return new VeryPositiveUsers();
    }
}
